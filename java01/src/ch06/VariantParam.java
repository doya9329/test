package ch06;

public class VariantParam {
	// 가변사이즈 매개변수, 매개변수의 개수에 관계없이 배열로 처리됨 
	static void print(String ... n) {
		System.out.println("============");
		for(int i=0; i<n.length; i++) {
			System.out.println("n["+i+"]=\n"+n[i]);
		}
	}
//	static void print(String a) {
//		System.out.println(a);
//	}
//	static void print(String a,String b) {
//		System.out.println(a);
//		System.out.println(b);
//	}
	public static void main(String[] args) {
		print("a");
		print("a","b");
		print("a","b","c");
		print("a","b","c","d");
		// 가변사이즈 매개변수의 사용 예
		// print formatted 형식화된 출력
		// printf(출력형식, 데이터)
		// %d 정수형식, %s 스트링형식 %f 실수형식 %c 문자형식
		
		//  \n 줄바꿈문자
		System.out.printf("%d %s\n\n\n %f\n", 10,"hello", 20.5);
		System.out.printf("%d %s\n", 10,"hello");
		System.out.printf("%d\n", 10);
	}
}















