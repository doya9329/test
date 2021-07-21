package quiz;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Ex28_address_oracle {
	public static void main(String[] args) throws Exception {
		String driver="oracle.jdbc.OracleDriver"; //oracle class driver 이름
		String url="jdbc:oracle:thin:@localhost/xe"; //oracle 연결 문자열
		String id="java"; //아이디
		String password="java1234"; //비번
		
		Connection conn = null; // 접속
		Statement stmt = null; // sql 명령어 실행
		ResultSet rs = null; // 결과셋, 레코드셋
		try {
			conn = DriverManager.getConnection(url, id, password);
			String sql = "select * from address";
			stmt = conn.createStatement(); // sql 실행 객체 생성
			rs = stmt.executeQuery(sql); // sql 실행, 레코드셋의 시작번지=>rs
			System.out.println("아이디\t이름\t주소\t\t전화\t\t이메일");
			while (rs.next()) { // 결과셋.next() 다음 레코드가 존재하면 true
				String userid = rs.getString("userid"); // 정수형 필드
				String name = rs.getString("name"); // 문자열 필드
				String address = rs.getString("address"); // 문자열 필드
				String tel = rs.getString("tel"); // 문자열 필드
				String email = rs.getString("email"); // 문자열 필드
				System.out.println(userid + "\t" + name+ "\t" + address+ "\t" 
						+ tel+ "\t" + email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // rs -> stmt -> conn 순으로 닫음(오픈한 역순으로)
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
