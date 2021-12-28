package member;

public class MemberBean {

	private int id;
	private String name;
	private String phone;
	private String address;
	private String team;
	
	public MemberBean() {}

	public MemberBean(int id, String name, String phone, String address, String team) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.team = team;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	
}
