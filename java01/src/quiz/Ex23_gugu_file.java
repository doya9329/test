package quiz;
//구구단 계산 결과를 파일에 저장
//[문제] 아래와 같이 구구단 계산 결과를 출력하는 코드를 작성하시오. 
//<처리 조건>
//구구단의 단은 변수에 고정값으로 입력하거나 사용자가 입력한 값으로 처리한다.
//int dan=5;
//<결과 출력>
//5x1 = 5
//5x2 = 10
//5x3 = 15
//5x4 = 20
//5x5 = 25
//5x6 = 30
//5x7 = 35
//5x8 = 40
//5x9 = 45

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex23_gugu_file {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("단을 입력하세요:");
		int dan=scan.nextInt();
		BufferedWriter writer = null;
		String file = "c:/work/gugu.txt"; 
		try {
			writer = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(file)));
			for(int i=1; i<=9; i++) {
				writer.write(dan+"x"+i+"="+dan*i + "\n"); 
			}
			System.out.println("완료되었습니다.");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}






