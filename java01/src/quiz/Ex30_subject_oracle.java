package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ch21.DB;

public class Ex30_subject_oracle {
//	public static void main(String[] args){
//		Connection conn = null; // 접속
//		Statement stmt = null; // sql 명령어 실행
//		ResultSet rs = null; // 결과셋, 레코드셋
//		try {
//			conn = DB.oraConn();
//			String sql = "select * from subject";
//			stmt = conn.createStatement(); // sql 실행 객체 생성
//			rs = stmt.executeQuery(sql); // sql 실행, 레코드셋의 시작번지=>rs
//			System.out.println("과목코드\t과목명\t사번\t학점");
//			while (rs.next()) { // 결과셋.next() 다음 레코드가 존재하면 true
//				String subject_code = rs.getString("subject_code"); 
//				String subject_name = rs.getString("subject_name"); 
//				int profno = rs.getInt("profno"); 
//				int point = rs.getInt("point"); 
//				System.out.println(subject_code + "\t" + subject_name+ "\t" + profno+ "\t" 
//						+ point);
//			}			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally { // rs -> stmt -> conn 순으로 닫음(오픈한 역순으로)
//			try {
//				if (rs != null)
//					rs.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//			try {
//				if (stmt != null)
//					stmt.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//			try {
//				if (conn != null)
//					conn.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//	}	

	public static void main(String[] args) throws Exception {
		Connection conn = null; // 접속
		Statement stmt = null; // sql 명령어 실행
		ResultSet rs = null; // 결과셋, 레코드셋
		conn = DB.oraConn();
		String sql = "select * from subject";
		stmt = conn.createStatement(); // sql 실행 객체 생성
		rs = stmt.executeQuery(sql); // sql 실행, 레코드셋의 시작번지=>rs
		System.out.println("과목코드\t과목명\t사번\t학점");
		while (rs.next()) { // 결과셋.next() 다음 레코드가 존재하면 true
			String subject_code = rs.getString("subject_code");
			String subject_name = rs.getString("subject_name");
			int profno = rs.getInt("profno");
			int point = rs.getInt("point");
			System.out.println(subject_code + "\t" + subject_name + "\t" + profno + "\t" + point);
		}
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
	}
}
