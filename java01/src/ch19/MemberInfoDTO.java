package ch19;

import java.io.Serializable;
// 객체직렬화를 하기 위해서는 Serializable 인터페이스를 구현해야 함 
public class MemberInfoDTO implements Serializable {
	private String juminNo;
	private String passwd;
	public String getJuminNo() {
		return juminNo;
	}
	public void setJuminNo(String juminNo) {
		this.juminNo = juminNo;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "MemberInfoDTO [juminNo=" + juminNo + ", passwd=" + passwd + "]";
	}
	public MemberInfoDTO(String juminNo, String passwd) {
		this.juminNo = juminNo;
		this.passwd = passwd;
	}
}
