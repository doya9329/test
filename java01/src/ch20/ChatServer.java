package ch20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = null; //서버소켓 객체
		try {
			serverSocket=new ServerSocket(5555); //서비스 제공을 위한 서버소켓 생성
			System.out.println("서비스가 시작되었습니다.");
		} catch (Exception e) {
			System.out.println("서비스를 시작할 수 없습니다.");
			System.exit(1); //비정상적 종료
		}
		Socket clientSocket=null; //클라이언트와의 데이터 통신을 위한 소켓
		try {
			clientSocket=serverSocket.accept();  //클라이언트가 접속하면 접속을 허가하고 소켓 생성
			System.out.println(
"클라이언트의 ip 주소:"+clientSocket.getInetAddress().getHostAddress());
		} catch (Exception e) {
			System.out.println("서버에 접속할 수 없습니다.");
			System.exit(1);
		}
		//데이터 입출력을 위한 스트림 생성
		PrintWriter writer
			=new PrintWriter(clientSocket.getOutputStream(),true);
		BufferedReader reader=
				new BufferedReader(new InputStreamReader(
						clientSocket.getInputStream()));
		String receive="";
		String send="Welcome!!!";
		writer.println(send); //클라이언트에 메시지 보내기
		Scanner sc=new Scanner(System.in);
		while(true) {
			receive=reader.readLine(); //클라이언트에서 보낸 메시지 수신
			if(receive==null || receive.equals("quit")) break; //반복문 종료 조건
			System.out.println("[클라이언트] "+receive);
			System.out.println("입력하세요(종료:quit):");
			send=sc.nextLine(); //키보드로 입력받은 후
			writer.println(send); //클라이언트에게 보내기
			if(send.equals("quit")) break; 
		}
		//리소스 정리
		sc.close();
		writer.close();
		reader.close();
	}
}
