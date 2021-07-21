package ch12;

public class InnerClass {
	static int x=10; //static 변수
	class Inner{ //내부 클래스
		int getX() {
			return x;  //외부 클래스의 멤버 사용 가능
		}
	}
	public static void main(String[] args) {
		System.out.println(x);
		InnerClass e=new InnerClass();
		//내부클래스도 클래스이므로 인스턴스를 만들어야 함
		InnerClass.Inner in=e.new Inner();
		System.out.println(in.getX()); 
	}
}
