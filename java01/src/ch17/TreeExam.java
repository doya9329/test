package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;

public class TreeExam extends JFrame {

	private JPanel contentPane;
	//추가
	//Object 배열
	private Object[] obj= {"프로그램","시스템","디자인"};
	//벡터 - List의 초기버전
	private Vector<Vector> node1=new Vector<Vector>() {
		// 해시코드 대신 문자열을 출력하기 위하여 오버라이드
		@Override
		public String toString() { 
			return "Lesson";
		}
	};
	private Vector<String> node2=new Vector<String>() {
		@Override
		public String toString() {
			return "Java";
		}
	};
	private Vector<String> node3=new Vector<String>() {
		@Override
		public String toString() {
			return "XML";
		}
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreeExam frame = new TreeExam();
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
	public TreeExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		node1.add(node2); //node1 하위에 node2 벡터 추가
		node1.add(node3); //node1 하위에 node3 벡터 추가 
		node2.add("C++"); //node2 벡터에 스트링 추가
		node2.add("Java");
		node2.add("JSP"); 
		node3.add("XSLT"); //node3 벡터에 스트링 추가
		node3.add("DOM");
		obj[0]=node1; // node1을 root node로 지정 
		JTree tree = new JTree(obj); //트리에 벡터를 입력
		tree.setRootVisible(true); //root node를 출력하는 옵션
		scrollPane.setViewportView(tree);
	}

}












