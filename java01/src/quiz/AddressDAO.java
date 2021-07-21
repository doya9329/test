package quiz;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ch21.DB;

public class AddressDAO {
	public int delete(String userid) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from address where userid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid); //? 위치에 사번 입력
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
	public void insert(AddressDTO dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="insert into address values (?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getTel());
			pstmt.setString(5, dto.getEmail());
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
	public List<AddressDTO> list(){
		List<AddressDTO> items=new ArrayList<>(); //리스트를 만들고
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn(); //mysql에 접속
			String sql="select * from address";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery(); //레코드셋의 시작번지값을 rs에 전달
			while(rs.next()) { //레코드 1개를 읽음
				String userid=rs.getString("userid");
				String name=rs.getString("name");
				String address=rs.getString("address");
				String tel=rs.getString("tel");
				String email=rs.getString("email");
				AddressDTO dto=new AddressDTO(userid,name,address,tel,email);
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













