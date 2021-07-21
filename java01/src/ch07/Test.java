package ch07;
// javac.exe Test.java => Test.class
// java.exe  Test
public class Test {
	
	int n; //인스턴스 변수, 프로퍼티 변수, 멤버변수
	Test(int n) { // 생성자 - 인스턴스가 생성될 때 자동으로 호출되는 method
		this.n=n;
		System.out.println("n:"+n); 
	}
	
	public static void main(String[] args) {
		//n=10;
		
		Test t=new Test(100);
		t.n=10;
		System.out.println(t.n);
	}
}
