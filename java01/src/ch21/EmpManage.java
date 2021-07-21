package ch21;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpManage {
	private EmpDAO dao=null;
	public EmpManage() { //생성자가 호출되면서
		dao=new EmpDAO(); //dao 인스턴스가 생성됨
	}
	void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 사번:");
		int empno=scan.nextInt();
		int result=dao.deleteEmp(empno);
		if(result==1) { //삭제된 레코드수가 1이면
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("사번을 확인하세요.");
		}
	}
	void list() {
		List<EmpDTO> items=dao.listEmp();
		System.out.println("사번이름입사일자급여");
		for(EmpDTO dto : items) {
			System.out.print(dto.getEmpno()+"\t");
			System.out.print(dto.getEname()+"\t");
			System.out.print(dto.getHiredate()+"\t");
			System.out.print(dto.getSal()+"\n");
		}
	}
	void insert() {
		Scanner scan=new Scanner(System.in);
		System.out.println("사번:");
		int empno=scan.nextInt();
		System.out.println("이름:");
		String ename=scan.next();
		System.out.println("입사일자:");
		String hiredate=scan.next();
		System.out.println("급여:");
		int sal=scan.nextInt();
		//Date.valueOf(문자열) 문자열을 날짜 형식으로 변환
		EmpDTO dto=
				new EmpDTO(empno,ename,Date.valueOf(hiredate),sal);
		dao.insertEmp(dto);
		System.out.println("저장되었습니다.");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		EmpManage emp=new EmpManage();
		while(true) {
			System.out.println("메뉴(1.목록, 2.추가, 3.삭제, 0.종료)");
			int code=scan.nextInt();
			switch(code) {
			case 0: System.exit(0); break;
			case 1: emp.list(); break;
			case 2: emp.insert(); break;
			case 3: emp.delete(); break;
			}
		}
	}
}
