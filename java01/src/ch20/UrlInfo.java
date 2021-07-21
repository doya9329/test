package ch20;

import java.net.URL;

public class UrlInfo {
	public static void main(String[] args) {
		try {
			//url의 정보를 분석하는 클래스
			URL url=new URL("ftp://news.naver.com:8080/main/read.nhn?mode=LPOD&mid=sec&oid=001&aid=0012309414&isYeonhapFlash=Y&rc=N");
			System.out.println("프로토콜:"+url.getProtocol());
			System.out.println("포트번호:"+url.getPort());
			System.out.println("호스트:"+url.getHost());
			System.out.println("파일:"+url.getFile());
			System.out.println("기타정보:"+url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
