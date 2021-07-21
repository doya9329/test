package ch06;

public class Recursive {
	//재귀호출을 사용하는 방법
	static long fact1(int n) {
		//함수 안에서 자기 자신을 호출함
		return n==1 ? 1 : n * fact1(n-1);
	}
	//일반적인 방법
	static long fact2(int n) {
		long result=1;
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(fact1(25));
		System.out.println(fact2(3)); // 3 x 2 x 1 = 6
	}
}

