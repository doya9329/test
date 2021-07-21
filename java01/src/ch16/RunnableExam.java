package ch16;

public class RunnableExam implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(
				Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) {
		//현재 클래스의 인스턴스를 만들고
		RunnableExam e1=new RunnableExam();
		//Thread 클래스의 인스턴스를 만들면서 Runnable이 구현된
		//  인스턴스를 전달함
		Thread t1=new Thread(e1, "thread1");
		Thread t2=new Thread(e1, "thread2");
		//새로운 작업단위를 할당받아 run method가 실행됨
		t1.start(); 
		t2.start();
	}
}
