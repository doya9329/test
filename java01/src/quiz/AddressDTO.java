package quiz;

public class AddressDTO {
	private String userid;
	private String name;
	private String address;
	private String tel;
	private String email;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AddressDTO [userid=" + userid + ", name=" + name + ", address=" + address + ", tel=" + tel + ", email="
				+ email + "]";
	}
	public AddressDTO(String userid, String name, String address, String tel, String email) {
		super();
		this.userid = userid;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.email = email;
	}
	
	
}
