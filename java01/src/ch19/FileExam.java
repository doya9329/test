package ch19;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FileExam extends JFrame {

	private JPanel contentPane;
	private JTextField txtFileName;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileExam frame = new FileExam();
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
	public FileExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("파일이름");
		lblNewLabel.setBounds(12, 44, 57, 15);
		contentPane.add(lblNewLabel);
		
		txtFileName = new JTextField();
		txtFileName.setBounds(83, 41, 116, 21);
		contentPane.add(txtFileName);
		txtFileName.setColumns(10);
		
		JButton btn = new JButton("확인");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//File 파일,디렉토리의 정보를 처리하는 객체
				File file=new File(txtFileName.getText());
				if(!file.exists()) { //파일이 존재하지 않으면
					try {
						file.createNewFile(); //파일을 생성
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				String str="파일이름:"+file.getName()+"\n"
						+"파일크기:"+file.length()+"\n"
						+"상위폴더:"+file.getParent();
				ta.setText(str); //파일의 정보를 ta에 출력시킴
			}
		});
		btn.setBounds(211, 40, 97, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(12, 72, 296, 150);
		contentPane.add(ta);
	}
}
