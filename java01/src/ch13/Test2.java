package ch13;

public class Test2 {
	public static void main(String[] args) {
		String birth="19900101";
		String year=birth.substring(0,4);
		String month=birth.substring(4,6);
		String date=birth.substring(6);
		System.out.println(year+"년 "+month+"월 "+date+"일");
		int age=2021-Integer.parseInt(year);
		//int age=2021-year;
		System.out.println("나이:"+age+"세");
	}
}
