package ch08;

public class Member {
	private String name;
	private String userid;
	private int money;
	private String grade;
	public Member() {} //기본 생성자
	//매개변수가 있는 생성자
	public Member(String name, String userid, int money) {
		this.name=name;
		this.userid=userid;
		this.money=money;
	}
	//입력함수
	public void input(String name, String userid, int money) {
		this.name=name;
		this.userid=userid;
		this.money=money;
	}	
	public void setGrade() { 
		if(money >= 100000) { //금액이 10만원 이상이면
			grade="골드";
		}else { //아니면
			grade="실버";
		}
	}
	public void print() {
		System.out.println("이름\t아이디\t금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+grade);
	}
}
