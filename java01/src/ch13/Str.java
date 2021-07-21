package ch13;

public class Str {
	public static void main(String[] args) {
		//String str=new String("Java");
		String str="Java";
		System.out.println(str);
		System.out.println(str.toUpperCase()); //대문자로 변환
		System.out.println(str.toLowerCase()); //소문자로 변환
		System.out.println("변경후:"+str);
		//스트링의 원본은 바뀌지 않음
		str=str.toLowerCase();  //새로운 문자열이 만들어짐
		System.out.println(str);
		
		str=""; //빈문자열
		str=null; //가리키는 내용이 없을 때
		System.out.println(str);
		
		//str.toUpperCase();
		
		char ch='\0'; //null character
		System.out.println((int)ch);
		ch=' '; //space
		System.out.println((int)ch);
	}
}












