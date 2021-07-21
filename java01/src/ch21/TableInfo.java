package ch21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class TableInfo {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ResultSetMetaData meta=null; //레코드셋의 메타 데이터를 조회하는 기능
		try {
			conn=DB.dbConn();
			String sql="select * from score";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			meta=rs.getMetaData(); //메타 데이터 조회
			int cols=meta.getColumnCount(); //필드 개수
			System.out.println("필드명\t자료형\tnull허용여부");
			for(int i=1; i<=cols; i++) {
				String colName=meta.getColumnName(i); //필드명
				String colType=meta.getColumnTypeName(i); //자료형
				int isNull=meta.isNullable(i); //null 허용 여부
				System.out.println(colName+"\t"+colType+"\t"+isNull);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
