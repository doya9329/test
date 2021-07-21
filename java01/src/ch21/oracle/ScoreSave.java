package ch21.oracle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreSave extends JFrame {

	private JPanel contentPane;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMat;

	private ScoreList parent; //ScoreList 프레임을 가리키는 변수 

	/**
	 * Create the frame.
	 */
	public ScoreSave(ScoreList parent) {
		this.parent=parent;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 239, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("학번");
		lbl1.setBounds(12, 41, 57, 15);
		contentPane.add(lbl1);
		
		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(81, 38, 116, 21);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);
		
		JLabel lbl2 = new JLabel("이름");
		lbl2.setBounds(12, 79, 57, 15);
		contentPane.add(lbl2);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(81, 76, 116, 21);
		contentPane.add(tfName);
		
		JLabel lbl3 = new JLabel("국어");
		lbl3.setBounds(12, 114, 57, 15);
		contentPane.add(lbl3);
		
		tfKor = new JTextField();
		tfKor.setColumns(10);
		tfKor.setBounds(81, 111, 116, 21);
		contentPane.add(tfKor);
		
		JLabel lbl4 = new JLabel("영어");
		lbl4.setBounds(12, 150, 57, 15);
		contentPane.add(lbl4);
		
		tfEng = new JTextField();
		tfEng.setColumns(10);
		tfEng.setBounds(81, 147, 116, 21);
		contentPane.add(tfEng);
		
		JLabel lbl5 = new JLabel("수학");
		lbl5.setBounds(12, 185, 57, 15);
		contentPane.add(lbl5);
		
		tfMat = new JTextField();
		tfMat.setColumns(10);
		tfMat.setBounds(81, 182, 116, 21);
		contentPane.add(tfMat);
		
		JButton btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScoreDAO dao=new ScoreDAO(); //dao 인스턴스를 만들고
				//텍스트필드에 입력된 값을 읽은 후
				String student_no=tfStudentNo.getText();
				String name=tfName.getText();
				int kor=Integer.parseInt(tfKor.getText());
				int eng=Integer.parseInt(tfEng.getText());
				int mat=Integer.parseInt(tfMat.getText());
				//레코드 저장
				dao.insertScore(new ScoreDTO(student_no,name,kor,eng,mat));
				//안내메시지 출력
				JOptionPane.showMessageDialog(ScoreSave.this, "추가되었습니다.");
				//ScoreList의 refreshTable method 호출
				parent.refreshTable(); //JTable 갱신
				dispose(); //프로그램 전체 종료가 아닌 현재 프레임만 종료시킴
			}
		});
		btnSave.setBounds(83, 240, 97, 23);
		contentPane.add(btnSave);
	}
}













