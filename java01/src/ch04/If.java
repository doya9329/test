package ch04;

import java.util.Scanner;

//Ctrl+Shift+F 코드정렬
public class If {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//			System.out.println("숫자를 입력하세요:");
//			int a = sc.nextInt();
		for(int i=1; i<=50; i++) {
			if (i % 2 == 0) { // a를 2로 나눈 나머지가 0이면, true
				System.out.println(i + "==>짝수");
			} else { // false
				System.out.println(i + "==>홀수");
			}
		}
	}
}




