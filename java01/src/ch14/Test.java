package ch14;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("kim", "김철수"); // put(key,value)
		map.put("park", "박철수");
		map.put("park", "박철호"); //key는 중복되지 않음
		Member m3=new Member();
		m3.setName("이철수");
		m3.setUserid("lee");
		m3.setPasswd("1234");
		m3.setTel("02-999-5555");
		m3.setEmail("lee@naver.com");
		map.put("lee", m3 );
		System.out.println(map.get("kim")); //get(key)
		System.out.println(map.get("park"));
		System.out.println(map.get("lee"));
	}
}
