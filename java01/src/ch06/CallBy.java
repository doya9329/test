package ch06;

public class CallBy {
	static void test(int b) {
		System.out.println(b);
	}
	//매개변수의 자료형도 배열참조변수로 작성해야 함 
	static void test2(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
	}
	static void test3(int a,int b,int c,int d,int e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	public static void main(String[] args) {
		int a=10;
		test(a); //call by value , 실제값을 전달
		int[] num= {10,20,30,40,50};
		test3(num[0],num[1],num[2],num[3],num[4]);
		System.out.println(num);
		test2(num); //call by reference , 주소값 전달
	}
}











