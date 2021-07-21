package ch06;

public class Abs {
	public static void main(String[] args) {
		int a=-5;
		System.out.println("a:"+a);
		System.out.println("절대값:"+abs(a));
		a=5;
		System.out.println("a:"+a);
		System.out.println("절대값:"+abs(a));
		
		a=-10;
		//Math 클래스에서 제공하는 절대값 계산 함수
		System.out.println(Math.abs(a));
	}
	// ( 매개변수 ) 파라미터, 인수
	static int abs(int n) {
		// 조건 ? true : false
		return n>=0 ? n : -n;
	}
}
