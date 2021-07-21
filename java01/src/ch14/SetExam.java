package ch14;

import java.util.Iterator;
import java.util.TreeSet;

public class SetExam {
	public static void main(String[] args) {
		//HashSet<String> hs=new HashSet<>(); //해시셋 생성
		TreeSet<String> hs=new TreeSet<>(); //트리셋 - 자동정렬
		hs.add("포도"); //해시셋에 자료 추가
		hs.add("사과");
		hs.add("배");
		hs.add("딸기");
		hs.add("사과"); //중복된 자료는 저장되지 않음
		System.out.println(hs);
		//순서대로 출력되지 않음
		for(String str : hs) {
			System.out.println(str);
		}
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
	}
}
