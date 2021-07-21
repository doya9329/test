package ch21.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberList {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver"; //오라클 드라이버 클래스
		// jdbc:DBMS이름@호스트:포트/데이터베이스
		String url="jdbc:oracle:thin:@localhost:1521/xe"; //연결문자열
		String id="java"; //아이디
		String pwd="java1234"; //비번
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//Class.forName(driver); //드라이버 로딩(생략가능)
			conn=DriverManager.getConnection(url,id,pwd); //오라클 서버에 접속
			String sql="select * from member";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("아이디\t비번\t이름");
			while(rs.next()) { //1개의 레코드를 읽음, 내용이 있으면 true, 없으면 false
				String userid=rs.getString("userid"); //  get자료형("필드명")
				String passwd=rs.getString("passwd");
				String name=rs.getString("name");
				System.out.println(userid+"\t"+passwd+"\t"+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			// 참조변수가 rs가 가리키는 내용이 null이 아니면 close()
				if(rs!=null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
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










