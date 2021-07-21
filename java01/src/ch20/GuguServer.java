package ch20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.StringBufferInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class GuguServer implements Runnable {
	private ServerSocket serverSocket; // 서비스 제공용 소켓
	private Socket socket; // 데이터 통신용 소켓
	private DataInputStream dis; // 클라이언트의 메시지를 읽기 위한 스트림
	private DataOutputStream dos; // 클라이언트에 메시지를 보내기 위한 스트림

	public GuguServer() { // 생성자
		try {
			serverSocket = new ServerSocket(9999); // 서버소켓 생성, 서비스 시작
			System.out.println("구구단 서비스가 시작되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				socket = serverSocket.accept(); // 클라이언트가 접속하면 허가,소켓 생성
				InetAddress ip = socket.getInetAddress();// 클라이언트의 ip 주소
				System.out.println("클라이언트의 ip 주소:" + ip);
				// 데이터 입출력을 위한 스트림 생성
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				// 멀티스레드 지원을 위하여 백그라운드 스레드를 만들고
				Thread th = new Thread(this);
				th.start(); // 스레드 시작 요청, run method가 실행됨
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) { // 프로그램이 시작되면
		new GuguServer(); // 현재 클래스의 인스턴스를 만들고 생성자가 호출됨
	}

	@Override
	public void run() {
		System.out.println("현재 실행 중인 스레드의 이름:" + Thread.currentThread().getName());
		try {
			while (true) {
				if (socket.isConnected()) {
					int dan = dis.readInt(); // 클라이언트에서 보낸 숫자값
					System.out.println("클라이언트에서 요청한 값:" + dan);
					StringBuilder sb = new StringBuilder();
					for (int i = 1; i <= 9; i++) {
						sb.append(dan + "x" + i + "=" + dan * i + "\r\n"); // 스트링빌더에 결과 누적
					}
					dos.writeUTF(sb.toString()); // 클라이언트에 utf-8 형식으로 전송
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
