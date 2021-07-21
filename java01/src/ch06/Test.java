package ch06;

//static 정적, 프로그램 시작~끝까지 메모리에 유지
//non-static
//dynamic 동적
// new 자료형 => 동적 메모리 할당, 더이상 사용하지 않으면 자동으로 제거 

public class Test {
	//변수
	int a=10;
	
	//method
	public static void main(String[] args) {
		// 인스턴스, 객체
		// 객체참조변수.변수
		// 객체참조변수.method()
		Test t=new Test();
		System.out.println(t.a); 
	}
}
