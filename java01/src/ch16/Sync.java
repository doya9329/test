package ch16;

public class Sync {
	public static void main(String[] args) {
		//Thread를 상속한 ATM 클래스의 인스턴스 생성
		ATM atm=new ATM();
		//스레드의 이름 지정
		Thread mom=new Thread(atm, "mom");
		Thread son=new Thread(atm, "son");
		//main thread 외의 새로운 thread 할당 요청
		// 새로운 thread를 할당받은 후 run method 실행
		mom.start();
		son.start();
	}
}
