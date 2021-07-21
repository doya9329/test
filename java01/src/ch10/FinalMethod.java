package ch10;

class Test {
	private int num = 100;
//final method : 오버라이드가 금지된 method
	public final void print() {
		System.out.println(num);
	}
}

public class FinalMethod extends Test {
	// 오버라이드 override, method 재정의
//	@Override
//	public void print() {
//		System.out.println("하위클래스의 method");
//	}
	public static void main(String[] args) {
		FinalMethod f = new FinalMethod();
		f.print();
	}
}
