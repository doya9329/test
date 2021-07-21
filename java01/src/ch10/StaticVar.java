package ch10;

public class StaticVar {
	static int a=10; //static
	int b=20; //non-static , 사용하려면 인스턴스 만들고
	
	public static void main(String[] args) { //static method
		System.out.println(a);
		//System.out.println(b); //에러 발생
		
		StaticVar s=new StaticVar();
		System.out.println(s.b); 
	}
}
