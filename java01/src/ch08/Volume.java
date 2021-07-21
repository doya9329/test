package ch08;

// Area 클래스를 상속받은 클래스
// private, 생성자는 상속되지 않음
public class Volume extends Area {
	private int height;
	
	public Volume(int width, int length, int height) {
		//super(width, length); //상위클래스의 생성자를 호출
		this.height=height;
	}
	
	public int getVolume() {
		return width * length * height;
	}
}
