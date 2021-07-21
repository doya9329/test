package ch17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardExam extends JFrame {
	CardLayout card;
	Container con; //다른 컴포넌트를 담을 수 있는 그릇 역할을 하는 컴포넌트
	public CardExam() {
		con=getContentPane(); //프레임의 컨텐츠 영역
		card=new CardLayout();
		setLayout(card); //카드레이아웃으로 변경
		JPanel[] pan=new JPanel[5];	 //JPanel 객체 배열
		//색상배열
		Color[] color= {Color.red, Color.yellow, Color.green, 
				Color.blue, Color.cyan};
		for(int i=0; i<pan.length; i++) {
			pan[i]=new JPanel(); // 패널을 만들고
			pan[i].setBackground(color[i]); //패널의 배경색상 설정
			add("card"+i, pan[i]); // add(카드의 이름, 추가할 내용)
			pan[i].addMouseListener(new MouseAdapter() { //마우스 이벤트 기능 추가
				@Override
				public void mouseClicked(MouseEvent e) {
					card.previous(con);
					//card.next(con); //마우스를 클릭하면 다음 카드로 넘어감
				}
			});
		}
		setSize(300,300); //화면 사이즈 설정
		setVisible(true); //프레임을 화면에 표시
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 닫기 버튼 동작 설정
	}
	public static void main(String[] args) {
		new CardExam(); //현재 클래스의 인스턴스를 만들고 생성자가 자동으로 호출됨 
	}
}












