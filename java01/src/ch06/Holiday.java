package ch06;

import java.util.Scanner;

public class Holiday {
	// member variable, property 속성
	static int y; //static 변수, 전역변수(클래스 전체)
	static void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("근속연수:");
		y=scan.nextInt(); //키보드로 입력한 값을 정수로 처리
	}
	static int holiday(int year) {
		int day=0; //지역변수 local variable
		if(year<=5) {
			day=10;
		}else if(year<=10) {
			day=15;
		}else {
			day=20;
		}
		return day;
	}
	public static void main(String[] args) {
		input(); 
		int n=holiday(y);
		System.out.println("휴가일수:"+n);
	}
}
