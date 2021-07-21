package ch05;

public class StringArray {
	public static void main(String[] args) {
		//스트링 배열
		//String[] str= {"java","jsp","android","html"};
		String[] str=new String[5]; //스트링 4개 배열
		str[0]="java";
		str[1]="jsp";
		str[2]="android";
		str[3]="html";
		str[4]="javascript";
		System.out.println("데이터의 개수:"+str.length);
		// 배열참조변수.length  데이터의 개수
		// 배열참조변수[인덱스]  
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		// 확장 for문    개별값 : 집합
		for(String ss : str) {
			System.out.println(ss);
		}
	}
}






