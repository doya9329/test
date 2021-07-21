package ch16;

public class ATM extends Thread { //Thread를 상속받은 클래스
	private long depositMoney=100000; //잔액
	//multi thread로 처리되는 영역
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			withDraw(10000);
		}
	}
	//synchronized method는 multi thread의 임계영역
	//  동시작업이 제한된 영역 
	public synchronized void withDraw(int money) {
		if(depositMoney > 0) {
			depositMoney = depositMoney - money;
			System.out.println(
Thread.currentThread().getName()+"-잔액:"+depositMoney);
		}else {
			System.out.println(
				Thread.currentThread().getName()+"-잔액이 없습니다.");
		}
	}
}
