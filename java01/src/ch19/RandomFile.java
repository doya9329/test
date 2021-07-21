package ch19;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		//복잡한 형태의 문자열 연산을 빠르게 처리할 수 있도록 지원하는 클래스
		StringBuilder output=new StringBuilder();
		String str=null;
		try {
			//rw : read + write
			RandomAccessFile file
				=new RandomAccessFile("c:/work/test.txt","rw");
			file.seek(29); //파일 포인터 이동
			file.write("추가한 문자열".getBytes()); //문자열을 바이트배열로 변환
			file.seek(0);
			//파일포인터가 파일의 사이즈보다 작으면
			while(file.getFilePointer() < file.length()) {
				output.append(file.getFilePointer()+":"); //스트링빌더 내용 추가
				str=file.readLine(); //한 라인을 읽음
				// 바이트배열을 스트링형식으로 변환  8859_1 서유럽언어 형식
				str=new String(str.getBytes("8859_1"),"utf-8");
				output.append(str+"\n");
			}
			file.close(); //파일참조변수가 가리키는 리소스 정리
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(output);
	}
}
