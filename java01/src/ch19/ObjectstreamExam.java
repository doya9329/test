package ch19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectstreamExam {
	public static void main(String[] args) {
		FileOutputStream fos=null; //파일 출력을 위한 객체
		ObjectOutputStream oos=null; //Object를 출력하기 위한 객체
		// MemberDTO 인스턴스를 만들고
		MemberDTO m1=new MemberDTO("kim",30,"911231-1234567","1234");
		MemberDTO m2=new MemberDTO("park",31,"921231-1234567","1234");
		MemberDTO m3=new MemberDTO("song",32,"931231-1234567","1234");
		try {
			//파일 출력을 위한 스트림 생성
			fos=new FileOutputStream("c:/work/object.dat");
			//Object를 출력하기 위한 객체 생성
			oos=new ObjectOutputStream(fos);
			//인스턴스의 내용이 파일로 저장됨
			oos.writeObject(m1);
			oos.writeObject(m2);
			oos.writeObject(m3);
			System.out.println("객체를 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //예외 발생 여부에 관계없이 항상 실행되는 코드
			try {
				if(fos!=null) fos.close(); // null이 아니면 close 처리
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(oos!=null) oos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			//파일의 내용을 읽기 위한 객체
			fis=new FileInputStream("c:/work/object.dat");
			//파일에 저장된 내용을 메모리에 복원하기 위한 객체
			ois=new ObjectInputStream(fis);
			// object.dat 파일에 저장된 MemberDTO 인스턴스를 복원
			MemberDTO dto1=(MemberDTO)ois.readObject();
			MemberDTO dto2=(MemberDTO)ois.readObject();
			MemberDTO dto3=(MemberDTO)ois.readObject();
			System.out.println(dto1);
			System.out.println(dto2);
			System.out.println(dto3);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(ois!=null) ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}
	}
}

