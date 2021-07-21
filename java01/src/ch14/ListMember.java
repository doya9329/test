package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		List<Member> list=new ArrayList<Member>(); // Member 자료형을 저장하는 리스트
		Member m1=new Member(); // Member 클래스의 인스턴스를 만들고
		m1.setName("김철수"); //자료 입력
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-999-8888");
		m1.setEmail("kim@naver.com");
		Member m2=new Member();
		m2.setName("박철수");
		m2.setUserid("park");
		m2.setPasswd("1234");
		m2.setTel("02-999-7777");
		m2.setEmail("park@naver.com");
		Member m3=new Member();
		m3.setName("이철수");
		m3.setUserid("lee");
		m3.setPasswd("1234");
		m3.setTel("02-999-5555");
		m3.setEmail("lee@naver.com");
		list.add(m1); //리스트에 Member 인스턴스 추가
		list.add(m2);
		list.add(m3);
		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");
		for(int i=0; i<list.size(); i++) { // 리스트.size() 리스트의 자료 개수
			Member m=list.get(i); // i번째 자료를 꺼내어 Member 참조변수에 전달
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"
				+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
	}
}


