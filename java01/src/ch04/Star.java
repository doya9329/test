package ch04;

public class Star {
	public static void main(String[] args) {
		//nested loop 중첩 반복문
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) { 
				//줄바꿈을 하지 않음
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		System.out.println();
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
