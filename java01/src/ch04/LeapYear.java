package ch04;

public class LeapYear {
	public static void main(String[] args) {
		for(int year=1900; year<=2025; year++) {
			//4의 배수이고 100의 배수가 아닌 연도
			//또는 400의 배수인 연도
			if(year%4==0 && year%100 != 0 || year%400==0) {
				System.out.println(year+"==>윤년");
			}else {
				System.out.println(year+"==>평년");
			} 
		}
	}
}
