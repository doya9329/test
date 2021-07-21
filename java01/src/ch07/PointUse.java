package ch07;

public class PointUse {
	public static void main(String[] args) {
		// 클래스의 인스턴스를 만들고 참조변수에 시작주소값을 전달
		Point p1=new Point();
		p1.setName("김철수"); //참조변수.method() 
		p1.setKor(90);
		p1.setEng(100);
		p1.setMat(80);
		p1.print();
		
		Point p2=new Point();
		p2.input("박철수", 80, 99, 95);
		p2.print();
	}
}
