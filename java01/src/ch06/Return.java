package ch06;

public class Return {
	// 정수값을 리턴하는 method
	// method이름(매개변수) method를 호출하면서 전달하는 값을 받는 변수
	static int sum(int a) {
		int result=0;
		for(int i=0; i<=a; i++) {
			result=result + i;
		}
		return result; //method를 호출한 곳으로 값을 리턴
	}
	public static void main(String[] args) {
		int n=sum(50); //method를 호출하고 실행결과를 받아서 저장
		System.out.println(n);
		n=sum(100);
		System.out.println(n);
	}
}
