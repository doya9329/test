package ch07;

public class PersonUse {
	public static void main(String[] args) {
		//Person 클래스의 인스턴스를 만들고
		//참조변수 p가 인스턴스의 시작주소를 가리킴
		Person p=new Person();
		System.out.println(p);
		//p가 가리키는 주소의 name변수에 입력
		//p.name="김철수";
		p.setName("김철수");
		//p.age=200;
		p.setAge(200);
		p.height=185; 
		//System.out.println(p.name);
		System.out.println(
				p.getName());
		//System.out.println(p.age);
		System.out.println(
				p.getAge());
		System.out.println(p.height);
	}
}
