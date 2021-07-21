package ch10;
//final class : 상속 금지
final class A {
	private int num;
	public void print() {
		System.out.println(num);
	}
}
//class B extends A { //final class는 상속할 수 없음
//}

public class FinalClass {
	public static void main(String[] args) {
		System.out.println(Math.PI);
	}
}
