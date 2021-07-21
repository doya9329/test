package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleExam {
	public static void main(String[] args) {
		int num=50;
		Scanner scan=null;
		//try절 내부에 여러개의 예외가 발생할 경우
		//Exception 클래스는 최상위예외클래스이므로 마지막 부분에 작성해야 함
		try {
			System.out.println("숫자를 입력하세요:");
			scan=new Scanner(System.in);
			int value=scan.nextInt();
			System.out.println(num/value);
		} catch (ArithmeticException e) {
			System.out.println("분모에 0이 올 수 없습니다.");
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력할 수 있습니다.");
		} catch(Exception e) {
			System.out.println("기타 예외 발생");
		}
		System.out.println("종료");
	}
}





