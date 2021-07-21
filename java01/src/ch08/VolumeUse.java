package ch08;

public class VolumeUse {
	public static void main(String[] args) {
		Volume vol=new Volume(10,20,30);
		System.out.println("면적:"+vol.getArea()); //상위클래스의 method 호출
		System.out.println("부피:"+vol.getVolume());
	}
}
