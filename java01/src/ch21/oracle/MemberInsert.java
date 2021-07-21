package ch21.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MemberInsert {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost/xe";
		String id="java";
		String pw="java1234";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,pw);
			Scanner scan=new Scanner(System.in);
			System.out.println("아이디:");
			String userid=scan.next();
			System.out.println("비번:");
			String passwd=scan.next();
			System.out.println("이름:");
			String name=scan.next();
			String sql=
"insert into member (userid,passwd,name) values (?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid); //1번 ?
			pstmt.setString(2, passwd); //2번 ?
			pstmt.setString(3, name); //3번 ?
			pstmt.executeUpdate(); //레코드 추가 
			System.out.println("추가되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}
	}
}	





















