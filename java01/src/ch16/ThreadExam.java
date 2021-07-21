package ch16;

public class ThreadExam extends Thread { //Thread를 상속받은 클래스
	public ThreadExam(String name) { //생성자
		super(name); // 상위클래스의 생성자가 호출됨, thread의 이름 설정
	}
	@Override
	public void run() { //멀티스레드로 실행되는 영역의 코드
		for(int i=1; i<=10; i++) {
			//현재 실행 중인 스레드의 이름
			System.out.println(
					Thread.currentThread().getName()+":"+i);
//			try {
//				Thread.sleep(1000); //1초간 멈춤
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	public static void main(String[] args) {
		ThreadExam e1=new ThreadExam("thread1");
		ThreadExam e2=new ThreadExam("thread2");
		ThreadExam e3=new ThreadExam("thread3");
		e1.start(); //새로운 스레드(작업단위) 시작 요청, 내부적인 스케줄러에 의해 실행됨 
		e2.start();
		e3.start();
	}
}













