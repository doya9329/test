package ch07;
// public
// protected
// default : 같은 패키지(디렉토리)에서 사용 가능
// private : 클래스 내부에서만 사용 가능

//클래스 코드 작성 => 인스턴스
// new 클래스이름

public class Person {
	private String name;
	private int age;
	double height;
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=100 || age<0) {
			System.out.println(
"잘못된 입력입니다.");
		}else {
			this.age=age;
		}
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}
	
}














