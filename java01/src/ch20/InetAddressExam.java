package ch20;

import java.net.InetAddress;

public class InetAddressExam {
	public static void main(String[] args) {
		try {
			//ip 주소를 조회하는 클래스
			InetAddress address=InetAddress.getByName("daum.net");
			System.out.println(address); //호스트이름과 ip주소
			System.out.println(address.getHostName()); //호스트이름
			System.out.println(address.getHostAddress()); //ip주소
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
