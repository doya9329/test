package ch13;
//모든 클래스에는 Object 클래스가 포함되어 있음
public class Obj {
	
	@Override
	public String toString() {
		return "현재 클래스";
	}
	
	public static void main(String[] args) {
		Obj e1=new Obj();
		System.out.println(e1.getClass()); //클래스의 정보
		System.out.println(e1); //toString()이 호출됨
		System.out.println(e1.toString()); //인스턴스의 해쉬코드 
	}
}
