package member;

// Beans는 테이블에 record 단위에 값을 저장하는 객체 덩어리 
// column단위에 값을 넣고 가져가고 하는 기능 끝.
// Beans class명 : 1. table + Bean => ZipcodeBean
public class ZipcodeBean {

	// 2. private 데이터타입 column명
	private String zipcode;
	private String area1;
	private String area2;
	private String area3;
	
	// 3. getter, setter 선언(getZipcode, setZipcode)
	public String getZipcode() {
		return zipcode;
	}
	public String getArea1() {
		return area1;
	}
	public String getArea2() {
		return area2;
	}
	public String getArea3() {
		return area3;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public void setArea1(String area1) {
		this.area1 = area1;
	}
	public void setArea2(String area2) {
		this.area2 = area2;
	}
	public void setArea3(String area3) {
		this.area3 = area3;
	}
	
}
