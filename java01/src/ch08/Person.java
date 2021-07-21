package ch08;

public class Person {
	private String name;
	private int height;
	private int weight;
	public Person() { //기본생성자(매개변수가 없는 생성자)
		this("김철수",150,100); // 같은 클래스의 다른 생성자를 호출할 경우 this() 
	}
	public Person(String name) {
		this(name, 190, 100);
		System.out.println("매개변수가 1개인 생성자");
		
	}
	public Person(String name, int height) {
		this(name, height, 50);
	}
	public Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이름:"+name);
		System.out.println("신장:"+height);
		System.out.println("체중:"+weight);
	}
	
}
