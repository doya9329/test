package ch11;

public class FlyUse {
	public static void main(String[] args) {
		Bird bird=new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
//좌변과 우변의 자료형이 다르면 좌변이 상위
		Flyer bird2=new Bird();
		bird2.takeOff();
		bird2.fly();
		bird2.land();
		
		Airplane air=new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		
		Flyer air2=new Airplane();
		air2.takeOff();
		air2.fly();
		air2.land();
	}
}
