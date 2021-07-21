package ch17;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginExam extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pwd;
	//추가
	private Map<String,String> map;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginExam frame = new LoginExam();
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
	public LoginExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		userid = new JTextField();
		userid.setBounds(52, 50, 116, 21);
		contentPane.add(userid);
		userid.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(52, 81, 116, 27);
		contentPane.add(pwd);
		
		map=new HashMap<>();
		map.put("kim", "1234");
		map.put("park", "2222");
		map.put("hong", "3333");
		
		
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//텍스트필드의 내용
				String id=userid.getText();
				//패스워드필드의 내용, 문자배열이므로 스트링으로 변환하는 과정 필요
				String pw=String.valueOf(pwd.getPassword());
				// map.get(key) 아이디에 해당하는 비번 조회
				String strPwd=map.get(id);
				//비전이 null이 아니고 패스워드필드에 입력한 값과 같으면
				if(strPwd!=null && strPwd.equals(pw)) {
					//레이블의 전경색(글자색) 변경
					lblResult.setForeground(Color.blue);
					//레이블의 내용 변경
					lblResult.setText(id+"님 환영합니다.");
				}else { //비번이 틀리면
					lblResult.setForeground(Color.red);
					lblResult.setBackground(Color.yellow); //배경색
					lblResult.setOpaque(true); //배경을 투명하게 설정
					lblResult.setText("로그인 실패...");
				}
			}
		});
		btnLogin.setBounds(51, 118, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setBounds(52, 162, 162, 15);
		contentPane.add(lblResult);
	}
}












