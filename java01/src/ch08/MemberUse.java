package ch08;

public class MemberUse {
	public static void main(String[] args) {
		
		Member m1=new Member(); //인스턴스를 만든 후
		m1.input("김철수", "kim", 200000); // 입력함수를 통해 값을 전달하는 방법
		m1.setGrade();
		m1.print();
		
		//인스턴스를 만든 직후에 곧바로 값을 전달하는 방법
		Member m2=new Member("박철수","park",100000);
		m2.input("박철수", "park", 500000); // 입력함수를 통해 값을 전달하는 방법
		m2.setGrade();
		m2.print();
	}
}
