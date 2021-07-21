package quiz;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Ex27_AddressManage {
	private AddressDAO dao=null;
	public Ex27_AddressManage() { //생성자가 호출되면서
		dao=new AddressDAO(); //dao 인스턴스가 생성됨
	}
	void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 아이디:");
		String userid=scan.next();
		int result=dao.delete(userid);
		if(result==1) { //삭제된 레코드수가 1이면
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("사번을 확인하세요.");
		}
	}
	void list() {
		List<AddressDTO> items=dao.list();
		System.out.println("아이디\t이름\t주소\t전화\t이메일");
		for(AddressDTO dto : items) {
			System.out.print(dto.getUserid()+"\t");
			System.out.print(dto.getName()+"\t");
			System.out.print(dto.getAddress()+"\t");
			System.out.print(dto.getTel()+"\t");
			System.out.print(dto.getEmail()+"\n");
		}
	}
	void insert() {
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디:");
		String userid=scan.next();
		System.out.println("이름:");
		String name=scan.next();
		System.out.println("주소:");
		String address=scan.next();
		System.out.println("전화:");
		String tel=scan.next();
		System.out.println("이메일:");
		String email=scan.next();		
		//Date.valueOf(문자열) 문자열을 날짜 형식으로 변환
		AddressDTO dto=new AddressDTO(userid,name,address,tel,email);
		dao.insert(dto);
		System.out.println("저장되었습니다.");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Ex27_AddressManage obj=new Ex27_AddressManage();
		while(true) {
			System.out.println("메뉴(1.목록, 2.추가, 3.삭제, 0.종료)");
			int code=scan.nextInt();
			switch(code) {
			case 0: System.exit(0); break;
			case 1: obj.list(); break;
			case 2: obj.insert(); break;
			case 3: obj.delete(); break;
			}
		}
	}
}
