package ch21.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import ch21.DB;

public class ScoreDAO {
	public int deleteScore(String student_no) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DB.oraConn();
			String sql = "delete from score where student_no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student_no); // ?에 학번 입력
			result = pstmt.executeUpdate(); //레코드 삭제
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
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
		return result; //삭제된 행수 리턴
	}
	public int updateScore(ScoreDTO dto) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DB.oraConn();
			String sql = "update score set name=?,kor=?,eng=?,mat=? "
					+ "where student_no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getKor());
			pstmt.setInt(3, dto.getEng());
			pstmt.setInt(4, dto.getMat());
			pstmt.setString(5, dto.getStudent_no());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
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
		return result;
	}
	public int insertScore(ScoreDTO dto) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DB.oraConn();
			String sql = "insert into score values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getStudent_no());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
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
		return result;
	}
	public Vector listScore() {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.oraConn();
			String sql="select student_no,name,kor,eng,mat,"
					+ "(kor+eng+mat) tot, ((kor+eng+mat)/3.0) avg from score";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row=new Vector(); //레코드 1개를 저장하기 위한 벡터
				String student_no=rs.getString("student_no");
				String name=rs.getString("name");
				int kor=rs.getInt("kor");
				int eng=rs.getInt("eng");
				int mat=rs.getInt("mat");
				int tot=rs.getInt("tot");
				double avg=rs.getDouble("avg");
				//벡터에 필드 추가
				row.add(student_no);
				row.add(name);
				row.add(kor);
				row.add(eng);
				row.add(mat);
				row.add(tot);
				row.add(avg);
				items.add(row); //2차원 벡터에 레코드 추가
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
		return items;
	}
}
























