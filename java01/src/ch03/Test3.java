package ch03;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		// 문자 입력 => 대문자, 소문자 검사
		// A~Z 65~90, a~z 97~122
		Scanner sc=new Scanner(System.in);
		System.out.println("문자를 입력하세요:");
		String a=sc.next();
		// hello
		char c=a.charAt(0); //첫번째 문자
		System.out.println("코드:"+(int)c);
		if( c>='A' && c<='Z') {
			System.out.println("대문자");
		}else if( c>='a' && c<='z') {
			System.out.println("소문자");
		}else { //나머지 모든 경우
			System.out.println("기타문자");
		}
	}
}	






