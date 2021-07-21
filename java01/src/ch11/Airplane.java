package ch11;

public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("airplane 이륙");
	}

	@Override
	public void fly() {
		System.out.println("airplane 비행");
	}

	@Override
	public void land() {
		System.out.println("airplane 착륙");
	}

}
