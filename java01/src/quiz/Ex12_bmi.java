package quiz;

import java.util.Scanner;

public class Ex12_bmi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("신장:");
		double height=sc.nextDouble();
		System.out.println("체중:");
		double weight=sc.nextDouble();
		
		Bmi b=new Bmi(height/100, weight);
		b.calc();
		b.print();
	}
}

