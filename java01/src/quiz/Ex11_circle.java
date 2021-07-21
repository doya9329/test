package quiz;

import java.util.Scanner;

public class Ex11_circle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("반지름을 입력하세요:");
		double r=sc.nextDouble();
		Circle c=new Circle(r);
		c.calc();
		c.print();
	}
}
