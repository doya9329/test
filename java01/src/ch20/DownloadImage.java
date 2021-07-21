package ch20;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {
		String website="https://t1.daumcdn.net/b2/creative/126646/47256489f867ae6b94639b587cf0af00.jpg";
		System.out.println("이미지를 다운로드합니다.");
		URL url=new URL(website); //url 객체 생성
		byte[] buffer=new byte[2048]; //버퍼로 사용할 바이트배열 선언
		//try(인스턴스) try절이 끝나면 인스턴스가 자동으로 소멸됨
		try(InputStream in=url.openStream();  
				OutputStream out=new FileOutputStream("c:/work/test.jpg")) {
			int length=0;
			// 스트림을 통해 읽은 내용을 버퍼에 저장하고 바이트수가 -1이 아니면
			while((length = in.read(buffer)) != -1) {
				System.out.println(length+"바이트 읽음");
				out.write(buffer, 0, length); //출력스트림을 통해 내컴퓨터 파일에 저장
			}
			System.out.println("다운로드 완료...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
