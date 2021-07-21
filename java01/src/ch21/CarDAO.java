package ch21;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CarDAO {
	public Connection dbConn() {
		Connection conn=null;
		try {
			FileInputStream fis=new FileInputStream("c:/work/db.prop"); //프로퍼티 파일의 경로
			Properties prop=new Properties();
			prop.load(fis); //프로퍼티 파일의 내용을 읽어서 key,value 구조로 저장
			String url=prop.getProperty("url"); //key값이 url인 변수의 value
			String id=prop.getProperty("id");
			String password=prop.getProperty("password");
			conn=DriverManager.getConnection(url,id,password); //db에 접속
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn; //db 접속 정보를 리턴함
	}
	public int deleteCar(String license_number) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dbConn(); //db접속
			//delete from 테이블 where 조건절
			String sql="delete from car where license_number=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, license_number); //?자리에 입력될 값 지정
			result=pstmt.executeUpdate(); //레코드 삭제, 삭제된 레코드수가 result에 전달
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
	public void insertCar(CarDTO dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dbConn(); //db접속
			String sql="insert into car values (?,?,?,?,?)"; // ? 5개
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getLicense_number()); // 1번 ?
			pstmt.setString(2, dto.getCompany()); //2번 ?
			pstmt.setString(3, dto.getType());
			pstmt.setInt(4, dto.getYear());
			pstmt.setInt(5, dto.getEfficiency());
			pstmt.executeUpdate(); //레코드 추가
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
	public List<CarDTO> listCar(){
		List<CarDTO> items=new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=dbConn(); //db 접속
			String sql="select * from car";
			pstmt=conn.prepareStatement(sql); //sql 명령어를 실행시키는 객체 생성
			rs=pstmt.executeQuery(); //sql을 실행하고 결과셋의 시작번지값을 rs에 전달
			while(rs.next()) { //1개의 레코드를 읽음, 내용이 있으면 true, 없으면 false
				String license_number=rs.getString("license_number"); //필드명과 자료형 확인
				String company=rs.getString("company");
				String type=rs.getString("type");
				int year=rs.getInt("year");
				int efficiency=rs.getInt("efficiency");
				//리스트에 dto를 추가
				CarDTO dto=
						new CarDTO(license_number,company,type,year,efficiency);
				items.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //마지막으로 실행되는 코드
			try {
				if(rs!=null) rs.close(); // rs 참조변수가 가리키는 리소스를 정리함
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
		return items; // list 참조변수 리턴
	}
}






