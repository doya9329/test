package ch04;

public class While2 {
	public static void main(String[] args) {
		int i=1;
		int num=10;
		int sum=0; //합계
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println("합계:"+sum);
	}
}
