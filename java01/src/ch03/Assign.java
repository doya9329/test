package ch03;

public class Assign {
	public static void main(String[] args) {
		int a=3,  b=5;
//		int a=3;
//		int b=5;
		a += 3; //a와 3을 더한 후 다시 a에 대입
		System.out.println(a);
		b /= 5; //b를 5로 나눈 몫을 다시 b에 대입
		System.out.println(b);
	}
}
