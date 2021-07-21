package ch16;

public class Priority extends Thread {
	public Priority(String name) {
		super(name); //상위클래스의 생성자 호출
//		setName(name); //스레드의 이름을 지정
	}
	@Override
	public void run() {
		for(int i=1; i<=5000; i++) { 
			System.out.println(
				Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) {
		Priority e1=new Priority("thread1");
		Priority e2=new Priority("thread2");
		//스레드의 우선순위를 지정할 수 있음
		// 최소 1 ~ 최대 10 ,기본값은 5 
		e2.setPriority(Thread.MAX_PRIORITY); //최대 우선순위
		e1.setPriority(Thread.MIN_PRIORITY); //최소 우선순위
		e1.start();
		e2.start();
	}
}
