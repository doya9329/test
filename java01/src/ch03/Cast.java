package ch03;

public class Cast {
	public static void main(String[] args) {
		float f=1.6f; //실수+f  4바이트로 저장
		System.out.println(f);
		
		f=100;
		System.out.println(f);
		
		f=100.5f;
		int i=(int)f; // float => int로 변환 , 강제형변환
		System.out.println(i);
		i=300;
		byte b=(byte)i; // byte의 범위 -128~127
		System.out.println(b);
	}
}
