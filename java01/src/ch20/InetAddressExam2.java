package ch20;

import java.net.InetAddress;

public class InetAddressExam2 {
	public static void main(String[] args) {
		try {
			//ip주소 배열 리턴
			InetAddress[] address=InetAddress.getAllByName("daum.net");
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (Exception e) { //예외가 발생했을 때 처리할 코드
			// 예외가 발생한 상황의 스택 추적 정보 출력
			e.printStackTrace();
		}
	}
}


