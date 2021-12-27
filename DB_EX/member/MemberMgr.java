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
		ResultSet rs = null;
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
			while(rs.next()) {
				String str = rs.getString(1) + "\t";
				str += rs.getString(2) + "\t";
				str += rs.getString(3) + "\t";
				str += rs.getString(4);
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	public static void main(String[] args) {
		MemberMgr mgr = new MemberMgr();
		mgr.zipcodeRead("강남대로");
		
	}
}
