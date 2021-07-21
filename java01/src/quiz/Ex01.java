package quiz;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름:"); // print() 출력 println() 출력+줄바꿈
		String name=sc.next(); //문자열 입력
		System.out.print("출생연도:");
		int year=sc.nextInt(); //숫자 입력
		int age=2021-year;
		System.out.println(name+"님의 나이는 만 "+age+"세입니다.");
		String result=year % 2 == 0 ? "비대상" : "대상";
		System.out.println("올해 건강검진 "+result+"입니다.");
	}
}


