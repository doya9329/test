import java.util.Scanner;

public class Test4 {
	static void test() {
		Scanner sc=new Scanner(System.in);
		// java.lang 패키지 => import 안함
		// 같은 디렉토리에 있으면 import 안함
		String a="hello";
		System.out.println(a);
	}
	static int test2() {
		int a=100;
		return a;
	}
	public static void main(String[] args) {
		test();
	}
}
