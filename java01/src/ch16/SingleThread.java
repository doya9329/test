package ch16;
//single thread: 프로세스에서 실행되는 작업단위가 1개인 경우 
//순차적으로 실행됨
public class SingleThread {
	static void print() {
		//현재 실행중인 스레드(작업단위)의 이름
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		print();
		print();
	}
}	
