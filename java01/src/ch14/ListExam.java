package ch14;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		//Ctrl Shift O
		ArrayList<Object> list=new ArrayList<Object>();
		//모든 자료형을 처리할 수 있음
		list.add("하나"); // 리스트에 자료 추가
		list.add(2);
		list.add(5.2);
		list.add(false);
		list.add(3,4); // add(index, value)
		list.remove(0); // remove(index)
		// 리스트.size() 데이터의 개수
		// 리스트.get(인덱스) 데이터 조회
		System.out.println("데이터의 개수:"+list.size());
		System.out.println("첫번째 데이터:"+list.get(0));
		System.out.println("두번째 데이터:"+list.get(1));
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
			
	}
}	











