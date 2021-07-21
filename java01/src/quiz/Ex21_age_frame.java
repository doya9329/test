package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Ex21_age_frame extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfYear;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex21_age_frame frame = new Ex21_age_frame();
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
	public Ex21_age_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBounds(36, 41, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("출생연도");
		lblNewLabel_1.setBounds(36, 98, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		lblResult = new JLabel("");
		lblResult.setForeground(Color.BLUE);
		lblResult.setFont(new Font("굴림", Font.BOLD, 16));
		lblResult.setBounds(36, 197, 204, 111);
		contentPane.add(lblResult);
		
		JButton button1 = new JButton("계산");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tfName.getText();
				int year=Integer.parseInt(tfYear.getText());
				int age=2021-year;
				//String txt=name+"님의 나이는 "+age+"세 입니다.";
				String txt="<html>이름:"+name+"<br>출생연도:"+year+"<br>나이:"
						+age+"세</html>";
				lblResult.setText(txt);
			}
		});
		button1.setBounds(35, 152, 97, 23);
		contentPane.add(button1);
		
		tfName = new JTextField();
		tfName.setBounds(129, 38, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfYear = new JTextField();
		tfYear.setBounds(129, 95, 116, 21);
		contentPane.add(tfYear);
		tfYear.setColumns(10);
	}

}
