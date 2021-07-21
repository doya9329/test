package ch05;

public class ArraySum {
	public static void main(String[] args) {
		double[] num= {10.5,20.3,30,40,50,60,70,80};
		double sum=0;
		//배열참조변수.length 데이터의 개수
		for(int i=0; i<num.length; i++) {
			sum = sum + num[i]; //합계 누적
		}
		System.out.println("합계:"+sum);
	}
	
}
