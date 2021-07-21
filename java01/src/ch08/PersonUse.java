package ch08;

public class PersonUse {
	public static void main(String[] args) {
		Person p1=new Person(); //인스턴스 생성 후 매개변수가 없는 생성자가 호출됨
		p1.showInfo();
		
		Person p2=new Person("김상범"); //매개변수가 1개인 생성자 호출
		p2.showInfo();

		Person p3=new Person("박찬호",169); //매개변수가 2개인 생성자 호출
		p3.showInfo();

		Person p4=new Person("박지성",180,90); //매개변수가 3개인 생성자 호출
		p4.showInfo();
	}
}
