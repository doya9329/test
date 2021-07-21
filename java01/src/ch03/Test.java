package ch03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//키보드 입력을 위하여 Scanner 클래스의 인스턴스 기능 생성
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int a=sc.nextInt(); //정수 입력
		// a를 2로 나눈 나머지가 0이면 짝수, 아니면 홀수
//		String b= a%2 == 0 ? "짝수" : "홀수";
//		System.out.println(b);
		if(a%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}






