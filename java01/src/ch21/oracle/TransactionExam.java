package ch21.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;

import ch21.DB;

public class TransactionExam {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		boolean success=false;
		try {
			conn=DB.oraConn();
			conn.setAutoCommit(false); //수동 커밋으로 설정
			String sql="insert into emp_copy (empno,ename,sal) values (?,?,?)";
			pstmt=conn.prepareStatement(sql);
			long start=System.currentTimeMillis(); //현재 시각
			for(int i=1; i<=99; i++) {
				pstmt.setInt(1, i*100);
				pstmt.setString(2, "kim"+i);
				pstmt.setInt(3, 4500);
				//pstmt.executeUpdate();
				pstmt.addBatch(); //배치 작업 추가
			}
			pstmt.executeBatch(); //배치 작업 실행
			success=true;
			long end=System.currentTimeMillis();
			System.out.println("작업수행시간:"+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(success) {
					System.out.println("커밋 완료");
					conn.commit(); //레코드 변경 사항이 확정됨
				}else {
					System.out.println("롤백");
					conn.rollback(); //변경 사항이 취소됨
				}
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
