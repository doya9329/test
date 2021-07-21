package ch05;

import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		int[] num = new int[5]; // 5개의 데이터를 가지는 정수 배열
		int sum = 0; // 합계를 저장할 변수
		Scanner scan = new Scanner(System.in); // 키보드 입력기능\
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 숫자:");
			num[i] = scan.nextInt(); // 키보드로 정수 입력
// 0을 입력하면 종료
			if (num[i] == 0)
				break;
			sum = sum + num[i];
		}
		System.out.println("합계:" + sum);
	}
}
