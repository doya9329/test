package quiz;

import java.util.ArrayList;
import java.util.List;
public class Ex17_ListPoint {
	public static void main(String[] args) {
		List<Point> list=new ArrayList<Point>(); 
		Point p1=new Point("김철수",90,80,70); 
		Point p2=new Point("김희수",90,88,77); 
		Point p3=new Point("박철수",99,83,72); 
		list.add(p1); 
		list.add(p2);
		list.add(p3);
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<list.size(); i++) { 
			Point p=list.get(i);
			p.calc();
			p.print();
		}
	}
}


