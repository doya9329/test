package ch02;

public class Ex06 {
	public static void main(String[] args) {
		int num1=2147483647; //정수형 4바이트
		System.out.println(num1);
		long num2=1000L; //8바이트 숫자+L
		System.out.println(num2);
		System.out.println(Integer.MIN_VALUE); //최소값
		System.out.println(Integer.MAX_VALUE); //최대값
		System.out.println(Integer.SIZE); //비트
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.SIZE);
	}
}
