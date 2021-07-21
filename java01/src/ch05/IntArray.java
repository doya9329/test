package ch05;

public class IntArray {
	public static void main(String[] args) {
		//자료형[] 변수;  배열참조변수
		//배열의 시작주소값을 가리킴
		//int[] num= {10,20,30,40,50,60,70,80};
		// new 자료형[개수]
		int[] num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		System.out.println(num);
//		for(int i=0; i<num.length; i++) {
//			//배열[인덱스] 배열의 데이터 조회 
//			System.out.println(num[i]);
//		}
		//확장 for문   개별값 : 집합
		for(int n : num) {
			System.out.println(n);
		}
	}
}







