package ch21;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	public int deleteEmp(int empno) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from emp where empno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, empno); //? 위치에 사번 입력
			result=pstmt.executeUpdate(); //레코드가 삭제됨, 삭제된 레코드수가 저장됨
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
		return result; //삭제된 레코드수 리턴
	}
	public void insertEmp(EmpDTO dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="insert into emp values (?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno()); //1번 ? 위치에 사번 입력
			pstmt.setString(2, dto.getEname());
			pstmt.setDate(3, dto.getHiredate());
			pstmt.setInt(4, dto.getSal());
			pstmt.executeUpdate(); //레코드가 추가됨
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
	}	
	public List<EmpDTO> listEmp(){
		List<EmpDTO> items=new ArrayList<>(); //리스트를 만들고
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn(); //mysql에 접속
			String sql="select * from emp";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery(); //레코드셋의 시작번지값을 rs에 전달
			while(rs.next()) { //레코드 1개를 읽음
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				Date hiredate=rs.getDate("hiredate");
				int sal=rs.getInt("sal");
				EmpDTO dto=new EmpDTO(empno,ename,hiredate,sal);
				items.add(dto); //리스트에 dto 추가
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
		return items; //리스트를 리턴함
	}
}













