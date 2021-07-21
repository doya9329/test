package ch12;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Frame을 상속받음
public class InnerExam extends Frame {
	public InnerExam() { // 생성자
		super("내부 클래스 테스트"); // 상위클래스의 생성자 호출
		setSize(300, 400); // 화면 사이즈
		setVisible(true); // 화면 표시
	}

	public static void main(String[] args) {
		// 인스턴스 생성
		InnerExam e = new InnerExam();
		e.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}











