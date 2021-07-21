package ch21;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	//mysql 접속
	public static Connection dbConn() {
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
	//oracle 접속
	public static Connection oraConn() {
		Connection conn=null;
		try {
			FileInputStream fis=new FileInputStream("c:/work/oracle.prop"); //프로퍼티 파일의 경로
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
}
