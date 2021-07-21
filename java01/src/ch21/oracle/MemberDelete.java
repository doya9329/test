package ch21.oracle;

import java.util.Scanner;

public class MemberDelete {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 아이디를 입력하세요:");
		String userid=scan.next(); //문자열 입력
		MemberDAO dao=new MemberDAO();
		int rows=dao.memberDelete(userid);
		//int rows=MemberDAO.memberDelete(userid); 
		if(rows>0) { //삭제된 레코드수가 0보다 크면
			System.out.println("삭제되었습니다.");
		}
	}
}
