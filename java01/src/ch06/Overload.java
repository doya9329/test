package ch06;

public class Overload {
	//동일한 기능의 함수이고 자료형만 다를 경우
	//같은 함수 이름을 중복해서 사용할 수 있음
	//단, 자료형은 달라야 함
	//overload : over+load 같은 클래스 안에서 함수 이름이 중복된 경우 
	static void print(int a) {
		System.out.println(a);
	}
	static void print(double a) {
		System.out.println(a);
	}
	static void print(String a) {
		System.out.println(a);
	}
	static void print(boolean a) {
		System.out.println(a);
	}
//	static void print(Object a) {
//		System.out.println(a);
//	}	
	public static void main(String[] args) {
		print(10);
		print(10.5);
		print("hello");
		print(true);
	}
}





