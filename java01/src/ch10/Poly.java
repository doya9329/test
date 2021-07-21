package ch10;

class AA{
	int a=10;
	public void print() {
		System.out.println(a);
	}
}
class BB extends AA { //AA를 상속한 BB 클래스
	int a=20;
	@Override
	public void print() { //오버라이드
		System.out.println(a);
	}
}
public class Poly {
	public static void main(String[] args) {
		BB b=new BB(); //좌변과 우변의 자료형이 같음
		b.print(); // BB의 method가 호출됨
		AA aa=new BB(); //좌변과 우변의 자료형이 다름(좌변이 상위클래스)
		System.out.println(aa.a); //변수는 상위클래스의 멤버
		aa.print(); //method는 하위클래스가 호출됨
	}
}














