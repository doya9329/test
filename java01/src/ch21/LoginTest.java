package ch21;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class LoginTest extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pwd;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginTest frame = new LoginTest();
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
	public LoginTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(14, 34, 62, 18);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("비밀번호");
		label.setBounds(14, 76, 62, 18);
		contentPane.add(label);
		
		userid = new JTextField();
		userid.setBounds(90, 31, 116, 24);
		contentPane.add(userid);
		userid.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(90, 73, 116, 24);
		contentPane.add(pwd);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//사용자가 입력한 아이디, 비번
				String strUserid = userid.getText();
				// getPassword() => char[]을 스트링으로 변환해야 함
				// String.valueOf( char[] )
				String strPwd = String.valueOf( pwd.getPassword() ); 
				//lblResult.setText("아이디:"+strUserid+",비번:"+strPwd);
				
				Connection conn=null;
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					FileInputStream fis=new FileInputStream("c:/work/db.prop");
					Properties prop=new Properties();
					prop.load(fis);
					String url = prop.getProperty("url");
					String id = prop.getProperty("id");
					String password = prop.getProperty("password");
					conn = DriverManager.getConnection(url,id,password);
//sql 명령어 작성					
					String sql = 
							"select * from member where userid=? and pwd=?";
					System.out.println(sql);
//sql을 실행시키기 위한 객체 생성					
					pstmt = conn.prepareStatement(sql);
// ? 위치에 입력될 값을 매핑함					
					pstmt.setString(1, strUserid); //첫번째 물음표
					pstmt.setString(2, strPwd); //두번째 물음표
// sql을 실행한 결과셋의 시작 번지값을 rs에 전달함					
					rs=pstmt.executeQuery();
					if(rs.next()){ // 다음 레코드가 존재하면 true 아니면 false
						lblResult.setText(rs.getString("name")+"님 환영합니다.");
					}else{
						lblResult.setText("아이디 또는 비밀번호가 틀립니다.");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				
				
			}
		});
		btnLogin.setBounds(89, 119, 105, 27);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setBounds(29, 174, 223, 45);
		contentPane.add(lblResult);
	}
}
