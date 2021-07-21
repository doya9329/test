package ch21;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class SQLInsertTest {
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
		Connection conn = null; // java.sql.Connection
		PreparedStatement pstmt = null;
		try {
			Class.forName(driver); // jdk 1.6부터 생략 가능
			conn = DriverManager.getConnection(url, id, password);
			String title = "c언어";
			String publisher = "금성출판사";
			String year = "2017";
			int price = 45000;
			String sql = 
"insert into books (title,publisher,year,price) values (?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title); //첫번째 ? 자리에 title 대입
			pstmt.setString(2, publisher);
			pstmt.setString(3, year);
			pstmt.setInt(4, price);
			pstmt.executeUpdate(); // insert query 실행
			System.out.println("추가되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
