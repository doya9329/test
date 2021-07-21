package ch19;

import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderExam {
	public static void main(String[] args) {
		int var=0;
		// InputStreamReader 문자 단위로 읽는 클래스
		Reader input=new InputStreamReader(System.in);
		System.out.println("입력하세요:");
		while(true) { //무한반복
			try {
				var=input.read(); //1개의 문자를 읽음
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(var == 13) break; //문자코드가 13번이면 종료
			System.out.println((char)var+":"+var); //문자와 문자코드 출력
		}
	}
}
