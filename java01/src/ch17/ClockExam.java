package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClockExam extends JFrame implements Runnable {

	private JPanel contentPane;
	private JLabel lblTime;
	//추가
	private Calendar cal;
	private String str;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockExam frame = new ClockExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClockExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnClose = new JButton("종료");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnClose, BorderLayout.NORTH);
		
		lblTime = new JLabel("");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setForeground(Color.BLUE);
		lblTime.setFont(new Font("굴림", Font.PLAIN, 20));
		contentPane.add(lblTime, BorderLayout.CENTER);
		
		Thread t=new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		while(true) { //무한반복
			cal=Calendar.getInstance(); //캘린더 인스턴스 생성
			// 시,분,초 출력형식 설정
			str=String.format("%02d:%02d:%02d,%03d", 
					cal.get(Calendar.HOUR_OF_DAY),
					cal.get(Calendar.MINUTE),
					cal.get(Calendar.SECOND),
					cal.get(Calendar.MILLISECOND));
			// 레이블에 시각 출력
			lblTime.setText(str);
			try {
				Thread.sleep(100); //1초간 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

















