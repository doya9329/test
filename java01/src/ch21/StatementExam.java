package ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class StatementExam {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver"; //oracle class driver 이름
		String url="jdbc:oracle:thin:@localhost/xe"; //oracle 연결 문자열
		String id="java"; //아이디
		String pwd="java1234"; //비번
		Connection conn=null;
		Statement stmt=null; //완성된 sql 명령어를 실행시킬 경우 사용
		PreparedStatement pstmt=null; // ? 파라미터를 사용할 수 있는 객체
		try {
			Class.forName(driver); //드라이버 로딩
			conn=DriverManager.getConnection(url, id, pwd); //오라클에 접속
			stmt=conn.createStatement(); //sql 실행 객체를 만들고
			long start=System.currentTimeMillis(); //현재 시각 저장
			for(int i=1; i<=10000; i++) {
				String str="data"+i;
				String sql="insert into test values ("+i+",'"+str+"')"; 
				stmt.executeUpdate(sql); //레코드 추가
			}
			long end=System.currentTimeMillis(); 
			System.out.println("작업수행시간:"+(end-start));
			
			start=System.currentTimeMillis();
			String sql="insert into test values (?,?)"; // 직접 값을 적지 않고 파라미터(?) 작성
			pstmt=conn.prepareStatement(sql);
			for(int i=10001; i<=20000; i++) {
				String str="data"+i;
				pstmt.setInt(1, i); // ? 위치에 값을 입력
				pstmt.setString(2, str);
				pstmt.executeUpdate();
			}
			end=System.currentTimeMillis();
			System.out.println("작업수행시간:"+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
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
