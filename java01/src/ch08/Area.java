package ch08;

public class Area{
	protected int width;
	protected int length;
	public Area() { //기본생성자
	}
	public Area(int width, int length) { //매개변수가 있는 생성자
		this.width = width;
		this.length = length;
	}
	public int getArea(){
		return width*length;
	}
	
}
