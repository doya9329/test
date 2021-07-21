package ch19;

import java.io.IOException;

public class InputStreamExam {
	public static void main(String[] args) {
		int var=0;
		System.out.println("내용을 입력하세요:");
		try { //입출력은 반드시 예외처리를 해야 함
			var=System.in.read(); //1byte 읽음
			while(var != 13) { // 엔터키의 문자코드 13번
				System.out.println((char)var); //정수형을 문자형으로 형변환
				var=System.in.read(); //1byte 읽음
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
