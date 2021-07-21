package ch13;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String name1="kim";
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요:");
		String name2=sc.next();
		// == 주소 비교
		System.out.println(name1==name2);
		System.out.println(name1);
		System.out.println(name2);
		// A.equals(B) 내용 비교 
		System.out.println(name1.equals(name2));
		
	}
}
