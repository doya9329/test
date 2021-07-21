package ch21;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Property2 {
	public static void main(String[] args) throws Exception {
		//db접속정보가 저장된 db.prop 파일을 읽을 수 있는 스트림 생성
		FileInputStream fis = new FileInputStream("c:/work/db.prop");
		Properties prop = new Properties();
		// key=value
		prop.load(fis); // db.prop 내용을 읽어서 key,value 구조로 변환
		String driver = prop.getProperty("driver"); // getProperty("변수명")
		String url = prop.getProperty("url");
		String id = prop.getProperty("id");
		String password = prop.getProperty("password");
		
		Connection conn = null; // 접속
		Statement stmt = null; // sql 명령어 실행
		ResultSet rs = null; // 결과셋, 레코드셋
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			// db에 접속
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("mysql 연결 성공");
			String sql = "select * from books";
			stmt = conn.createStatement(); // sql 실행 객체 생성
			rs = stmt.executeQuery(sql); // sql 실행, 레코드셋의 시작번지=>rs
			System.out.println("도서코드\t도서이름");
			while (rs.next()) { // 결과셋.next() 다음 레코드가 존재하면 true
				int book_id = rs.getInt("book_id"); // 정수형 필드
				String title = rs.getString("title"); // 문자열 필드
				System.out.println(book_id + "\t" + title);
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
