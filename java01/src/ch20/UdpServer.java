package ch20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class UdpServer {
	public static void main(String[] args) {
		byte[] data=new byte[65508]; //바이트배열
		//데이터수신용 패킷
		DatagramPacket packet=new DatagramPacket(data, data.length);
		try {
			//udp 통신을 위한 포트 개방
			DatagramSocket socket=new DatagramSocket(7777);
			System.out.println("서비스가 시작되었습니다.");
			socket.receive(packet); //클라이언트에서 보낸 데이터 수신 
			System.out.println(
					"클라이언트의 ip 주소:"+packet.getAddress().getHostAddress());
			//패킷 내부의 데이터를 스트링으로 변환
			String receive=new String(packet.getData()); 
			System.out.println("클라이언트의 메시지:"+receive.trim());
			
			System.out.println("응답 메시지:");
			Scanner scan=new Scanner(System.in);
			String msg=scan.next();
			//클라이언트에게 데이터 전송, 스트링.getBytes() 스트링을 바이트배열로 변환
			packet=new DatagramPacket(msg.getBytes(), msg.getBytes().length,
					packet.getAddress(), 8888);
			socket.send(packet);
			socket.close(); //소켓 닫기, 통신 종료
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
