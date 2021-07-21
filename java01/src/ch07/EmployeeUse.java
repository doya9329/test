package ch07;

import java.util.Scanner;

public class EmployeeUse {
	public static void main(String[] args) {
		Employee e1=new Employee(); //인스턴스를 만들고
		// method 호출
		e1.input("김철수", "관리부", "과장", 300); //입력
		e1.calc(); //계산
		//e1.print(); //출력
		System.out.println(e1); //F3 소스코드 보기
		
		Employee e2=new Employee("박철수","경리팀","부장",400);
		e2.calc();
		System.out.println(e2);
	}
}
