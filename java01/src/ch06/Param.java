package ch06;

public class Param {
	static int plus(int a, int b) { //매개변수의 자료형, 개수가 맞아야 함
		return a+b; //method를 호출한 곳으로 값을 리턴 
	}
	static int minus(int a, int b) {
		return a-b;
	}
	static int multi(int a, int b) {
		return a*b;
	}
	static int divide(int a, int b) {
		return a/b;
	}	
	public static void main(String[] args) {
		int n;
		n=plus(10,20); //method를 호출하고 결과값을 받아서 n에 저장
		System.out.println(n);
		System.out.println(plus(10,20));
//		n=minus(10,20);
//		System.out.println(n);
//		n=multi(10,20);
//		System.out.println(n);
//		n=divide(10,20);
//		System.out.println(n);
	}
}
