package ch03;

import java.util.Scanner;

public class Test4 {
	// 실수형으로 입력 nextDouble()
	
	//입력: 체중, 신장
	//bmi 계산:체중(kg)/ 키(m)의 제곱 
	//bmi의 값이 18.5 미만이면 저체중, 18.5~22.9 정상
	//  23.0 ~ 24.9 과체중, 25.0 이상 비만으로 처리한다.
	
	//1.변수 선언  체중 double, 신장 double, bmi double, 결과 String
	//2.입력 처리
	//3.계산(bmi,판정) , 계산한 값을 변수에 저장
	//4.출력
	public static void main(String[] args) {
		//1.변수 선언
		double 체중;
		double 신장;
		double bmi;
		String 결과="기타";
		//2.입력
		Scanner sc=new Scanner(System.in);
		System.out.print("체중:");
		체중=sc.nextDouble();
		System.out.print("신장:");
		신장=sc.nextDouble() / 100;
		//3.계산
		bmi=체중 / (신장*신장);
		if(bmi<18.5) {
			결과="저체중";
		}else if(bmi>=18.5 && bmi<=22.9) {
			결과="정상";
		}else if(bmi>=23 && bmi<=24.9) {
			결과="과체중";
		}else if(bmi>=25) {
			결과="비만";
		}
		//4.출력
		System.out.println("bmi:"+ String.format("%.2f", bmi)) ;
		System.out.println("결과:"+결과);
	}
}











