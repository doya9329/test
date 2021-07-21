package ch19;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Directory extends JFrame {

	private JPanel contentPane;
	private JTextField txtDirectory;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Directory frame = new Directory();
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
	public Directory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("디렉토리");
		panel.add(lblNewLabel);
		
		txtDirectory = new JTextField();
		panel.add(txtDirectory);
		txtDirectory.setColumns(10);
		
		JButton button1 = new JButton("확인");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String directory=txtDirectory.getText();
				File file=new File(directory);
				//디렉토리에 포함된 파일 리스트를 스트링 배열로 저장
				String[] list=file.list();
				//JTextArea의 텍스트를 빈값으로 만들고
				ta.setText("");
				//반복문을 돌리면서 파일 정보를 ta에 추가
				for(int i=0; i<list.length; i++) {
					// File(디렉토리,파일) 디렉토리의 파일 정보
					File f=new File(directory, list[i]);
					// 디렉토리인지 파일인지 판별
					String str=f.isDirectory()?"디렉토리":"파일";
					// ta의 끝에 추가
					ta.append(str+":"+list[i]+"\n");
				}
			}
		});
		panel.add(button1);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
	}

}
