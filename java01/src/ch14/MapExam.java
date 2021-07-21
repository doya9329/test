package ch14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapExam {
	public static void main(String[] args) {
		String[] nation= {"한국","일본","중국","미국"};
		String[] city= {"서울","동경","북경","워싱턴"};
		//HashMap<key자료형,value자료형>
		HashMap<String,String> map=new HashMap<String,String>();
		for(int i=0; i<city.length; i++) {
			map.put(nation[i], city[i]); // put(key,value) 맵에 자료 추가
		}
		//반복 처리를 지원하는 클래스 , map.keySet() 맵의 키집합
		Iterator<String> iterator=map.keySet().iterator();
		while(iterator.hasNext()) { //다음 요소가 있으면
			String key=iterator.next(); //다음 요소를 읽어서 변환
			System.out.print("key="+key);
			System.out.println(",value="+map.get(key));
		}
		for(int i=0; i<city.length; i++) {
			System.out.println(nation[i]);
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("나라 이름을 입력하세요:");
		String str=scan.next();
		System.out.println(str+"의 수도는 "+map.get(str));
	}
	
}
