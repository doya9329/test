package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class ButtonEventExam extends JFrame {

	private JPanel contentPane;
	private JButton btnRed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonEventExam frame = new ButtonEventExam();
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
	public ButtonEventExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnRed = new JButton("Red");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.red);
			}
		});
		contentPane.add(btnRed);
		
		JButton btnBlue = new JButton("Blue");
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.blue);
			}
		});
		contentPane.add(btnBlue);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.green);
			}
		});
		contentPane.add(btnGreen);
		
		JButton btnYellow = new JButton("Yellow");
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.yellow);
			}
		});
		contentPane.add(btnYellow);
	}

}
