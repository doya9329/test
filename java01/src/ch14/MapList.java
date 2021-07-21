package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<>(); //해시맵 생성
		List<Student> list=new ArrayList<>(); //리스트 생성
		//리스트에 Student 인스턴스 추가
		list.add(new Student("2021001","kim","국사",1,"kim"));
		list.add(new Student("2020001","park","국사",2,"lee"));
		list.add(new Student("2019001","hong","국사",3,"choi"));
		map.put("list", list); //맵에 리스트 저장
		//맵에 저장된 리스트를 읽어서 참조변수에 전달
		List<Student> list2=(ArrayList<Student>)map.get("list");
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t" 
+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
}






