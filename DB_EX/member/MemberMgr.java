package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberMgr {
	
	private DBConnectionMgr pool;
	
	public MemberMgr() {
		try {
			pool = DBConnectionMgr.getInstance();
//			Connection con = pool.getConnection();
//			System.out.println("성공");
		} catch (Exception e) {
//			System.out.println("실패");
			e.printStackTrace();
		}
	}//MemberMgr
	
	// 우편번호 검색, Generic : Vector에서 저장하는 타입의 지정
	public Vector<ZipcodeBean> zipcodeRead(String area3) {
		// DB연동에 필요한 변수 선언
		// DB연동은 공식이 있음
		// java.sql 패키지 클래스
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select일떄는 필요
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			// DB연결 객체 
			// DBConnectionMgr 생성 -> 다수의 Connection 만들어짐
			// 필요한 곳에 빌려주고 반납받는 기법 : Pooling 기법
			con = pool.getConnection(); // 빌려옴(pool 기법)
			sql = "SELECT * FROM tblzipcode WHERE AREA3 LIKE ?";
			// sql문을 매개변수로 pstmt객체를 return
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + area3 + "%"); // 1이 sql문에 ? 순서를 뜻함 // '%area3%' 출력
			rs = pstmt.executeQuery(); // 실제 sql문 실행
			while(rs.next()) { // table 맨 왼쪽 위에 커서가 존재하는데 거기서 다음 줄의 존재 유무(true,false) 
//				String str = rs.getString(1) + "\t";
//				str += rs.getString(2) + "\t";
//				str += rs.getString(3) + "\t";
//				str += rs.getString(4);
//				System.out.println(str);
				
				ZipcodeBean bean = new ZipcodeBean();
				bean.setZipcode(rs.getString("zipcode"));
				bean.setArea1(rs.getString("area1"));
				bean.setArea2(rs.getString("area2"));
				bean.setArea3(rs.getString("area3").trim());
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	// 가입(데이터입력)
	public boolean insert(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection(); // pool에서 connection 빌려옴
			sql = "insert tblMember(name, phone, team, address)values(?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			// ? setting
			pstmt.setString(1, bean.getName()); // 첫번째 ?에 데이터 삽입
			pstmt.setString(2, bean.getPhone()); // 두번째 ?에 데이터 삽입
			pstmt.setString(3, bean.getTeam()); // 세번째 ?에 데이터 삽입
			pstmt.setString(4, bean.getAddress()); // 네번째 ?에 데이터 삽입
			// 실행
			int cnt = pstmt.executeUpdate(); // return 값은 적용된 레코드 갯수 -> 성공 : 1, 실패 : 0
			if (cnt == 1) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	// 리스트
	public Vector<MemberBean> list() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select일떄는 필요
		String sql = null;
		Vector<MemberBean> vlist = new Vector<MemberBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblMember"; // sql에서는 select*from tblMember 붙여도 실행가능
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 실행
			while(rs.next()) {
				MemberBean bean = 
						new MemberBean(rs.getInt("id"), rs.getString("name"), 
										rs.getString("phone"), rs.getString("address"), 
											rs.getString("Team"));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	// 한명의 회원정보
	public  MemberBean select(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select일떄는 필요
		String sql = null;
		MemberBean bean = new MemberBean();
		try {
			con = pool.getConnection();
			sql = "select * from tblMember where id = ?"; // sql에서는 select*from tblMember 붙여도 실행가능
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id); // id 는 int
			rs = pstmt.executeQuery(); // 실행
			while(rs.next()) {
				bean.setId(id);
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("phohe"));
				bean.setTeam(rs.getString("Team"));
				bean.setAddress(rs.getString("address"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
	// 수정
	public boolean update(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection(); // pool에서 connection 빌려옴
			sql = "update tblMember set name = ?, team = ?, phone = ?, address = ? where id = ?";
			pstmt = con.prepareStatement(sql);
			// ? setting
			pstmt.setString(1, bean.getName()); // 첫번째 ?에 데이터 삽입
			pstmt.setString(2, bean.getTeam()); // 두번째 ?에 데이터 삽입
			pstmt.setString(3, bean.getPhone()); // 세번째 ?에 데이터 삽입
			pstmt.setString(4, bean.getAddress()); // 네번째 ?에 데이터 삽입
			pstmt.setInt(5, bean.getId());
			// 실행
			int cnt = pstmt.executeUpdate(); // return 값은 적용된 레코드 갯수 -> 성공 : 1, 실패 : 0
			if (cnt == 1) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	// 삭제
	public boolean delete(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection(); // pool에서 connection 빌려옴
			sql = "delete from tblMember where id = ?";
			pstmt = con.prepareStatement(sql);
			// ? setting
			pstmt.setInt(1, id);
			// 실행
			int cnt = pstmt.executeUpdate(); // return 값은 적용된 레코드 갯수 -> 성공 : 1, 실패 : 0
			if (cnt == 1) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	// team list
	public Vector<String> listTeam() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select일떄는 필요
		String sql = null;
		Vector<String> vlist = new Vector<String>();
		try {
			con = pool.getConnection();
			sql = "select distinct team from tblMember"; // sql에서는 select*from tblMember 붙여도 실행가능
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 실행
			while(rs.next()) {
				vlist.addElement(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	
	
//	public static void main(String[] args) {
//		MemberMgr mgr = new MemberMgr();
//		MemberBean bean = new MemberBean(0, "홍길순", "010-6666-1394", "부산시", "배우");
//		System.out.println(mgr.insert(bean));
//	}
}
