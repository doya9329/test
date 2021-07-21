package ch21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class ScoreDAO {
	public int deleteScore(String student_no) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from score where student_no=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, student_no);
			result=pstmt.executeUpdate();
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
		return result;
	}
	public int updateScore(ScoreDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql=
"update score set name=?,kor=?,eng=?,mat=?,tot=?,avg=? "
+ "where student_no=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getKor());
			pstmt.setInt(3, dto.getEng());
			pstmt.setInt(4, dto.getMat());
			pstmt.setInt(5, dto.getTot());
			pstmt.setDouble(6, dto.getAvg());
			pstmt.setString(7, dto.getStudent_no());
			result=pstmt.executeUpdate();
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
		return result;
	}
	public int insertScore(ScoreDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql=
					"insert into score values (?,?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getStudent_no());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());
			pstmt.setInt(6, dto.getTot());
			pstmt.setDouble(7, dto.getAvg());
			result=pstmt.executeUpdate();
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
		return result;
	}	
	
	public Vector listScore() {
		Vector items=new Vector(); //벡터 생성
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn(); //db접속
			String sql="select * from score"; //sql 명령어
			pstmt=conn.prepareStatement(sql); //sql 명령어를 실행시키는 객체 생성
			rs=pstmt.executeQuery(); //sql 명령어를 실행시키고 결과셋의 시작번지값 리턴
			while(rs.next()) { //1개의 레코드를 읽음
				Vector row=new Vector(); //1개의 레코드를 저장할 벡터 생성
				row.add(rs.getString("student_no")); //벡터에 필드를 추가
				row.add(rs.getString("name"));
				row.add(rs.getInt("kor"));
				row.add(rs.getInt("eng"));
				row.add(rs.getInt("mat"));
				row.add(rs.getInt("tot"));
				row.add(rs.getDouble("avg"));
				items.add(row); //레코드가 벡터에 저장됨
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
	public Vector searchScore(String name) {
		Vector items=new Vector(); //벡터 생성
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn(); //db접속
			String sql="select * from score where name like ?"; //sql 명령어
			pstmt=conn.prepareStatement(sql); //sql 명령어를 실행시키는 객체 생성
			pstmt.setString(1, "%"+name+"%");
			rs=pstmt.executeQuery(); //sql 명령어를 실행시키고 결과셋의 시작번지값 리턴
			while(rs.next()) { //1개의 레코드를 읽음
				Vector row=new Vector(); //1개의 레코드를 저장할 벡터 생성
				row.add(rs.getString("student_no")); //벡터에 필드를 추가
				row.add(rs.getString("name"));
				row.add(rs.getInt("kor"));
				row.add(rs.getInt("eng"));
				row.add(rs.getInt("mat"));
				row.add(rs.getInt("tot"));
				row.add(rs.getDouble("avg"));
				items.add(row); //레코드가 벡터에 저장됨
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
