package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a=10;
		Object obj=new Object(); 
		obj=20;//Object 자료형은 모든 자료형을 받을 수 있음(다형성)
		obj="hello";
		obj=200.7;
		a=(int)obj; // 형변환
		System.out.println(a); 
		//Object 배열
		Object[] obj2= {100, 100.5, true, "hello", 'A'};
		for(Object o : obj2) {
			System.out.println(o);
		}
	}
}
