package ch04;

public class Continue {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			//5의 배수이면 출력하지 않고 다음 단계 진행
			if(i%5==0) continue;
			//if(i%5==0) break;
			System.out.println(i); 
		}
	}
}
