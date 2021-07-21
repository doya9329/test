package ch03;

public class Condition {
	public static void main(String[] args) {
		int num=5;
		// 조건 ? 참 : 거짓
		System.out.println(num>=0 ? num : -num);
		
		if(num>=0) { //조건식이 참이면
			System.out.println(num);
		}else { //거짓이면
			System.out.println(-num);
		}
	}
}
