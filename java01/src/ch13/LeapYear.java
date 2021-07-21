package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("연도를 입력하세요:");
		//키보드로 입력한 내용을 정수로 변환하여 변수에 저장
		int year=scan.nextInt();
		//Calendar 클래스를 확장한 클래스
		GregorianCalendar cal=new GregorianCalendar();
		//윤년이면 true, 평년이면 false
		if(cal.isLeapYear(year)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
	}
}
