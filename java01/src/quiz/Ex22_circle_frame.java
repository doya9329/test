package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Ex22_circle_frame extends JFrame {

	private JPanel contentPane;
	private JTextField tfR;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex22_circle_frame frame = new Ex22_circle_frame();
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
	public Ex22_circle_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("반지름");
		lblNewLabel.setBounds(36, 41, 57, 15);
		contentPane.add(lblNewLabel);

		lblResult = new JLabel("");
		lblResult.setForeground(Color.BLUE);
		lblResult.setFont(new Font("굴림", Font.BOLD, 16));
		lblResult.setBounds(37, 130, 204, 111);
		contentPane.add(lblResult);

		JButton button1 = new JButton("계산");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//빈값이 아니면
				if (!tfR.getText().equals("")) {
					//형식 검사 try ~ catch
					try {
						double r = Double.parseDouble(tfR.getText());
						double a = 2 * Math.PI * r; // 둘레
						double b = Math.PI * r * r; // 넓이
						String txt = "<html>반지름:" + r + 
"<br>둘레:" + String.format("%.2f", a) + "<br>넓이:"
+ String.format("%.2f", b) + "</html>";
						lblResult.setText(txt);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(
Ex22_circle_frame.this, "숫자만 입력하세요.");
					}
				}else { //빈값일 경우
					
				}
			}
		});
		button1.setBounds(36, 85, 97, 23);
		contentPane.add(button1);

		tfR = new JTextField();
		tfR.setBounds(129, 38, 116, 21);
		contentPane.add(tfR);
		tfR.setColumns(10);
	}

}
