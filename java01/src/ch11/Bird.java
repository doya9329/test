package ch11;

public class Bird implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("bird 이륙");
	}

	@Override
	public void fly() {
		System.out.println("bird 비행");
	}

	@Override
	public void land() {
		System.out.println("bird 착륙");
	}

}
