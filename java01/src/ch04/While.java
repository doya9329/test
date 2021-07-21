package ch04;

public class While {
	public static void main(String[] args) {
		int i=1; 
//		while(i<=10) { //조건식이 true일동안 반복 처리
////			System.out.println(i);
////			i++; //조건 변경
//			System.out.println(i++); //출력 후 i증가
//		}
		while(true) {
			System.out.println(i);
			i++;
			if(i>10) break; //조건을 만족하면 반복문 종료 
		}
	}
}
