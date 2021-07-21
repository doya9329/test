package quiz;
//파일에 저장된 숫자들의 합계를 계산하여 화면에 출력
//
//input.txt
//10
//20
//30
//40
//50
//
//합계:150 (콘솔에 출력)
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex24_sum_file {
	public static void main(String[] args) {
		BufferedReader reader = null;
		String file = "c:/work/input.txt"; //데이터 파일
		int sum = 0;
		try {
			// 버퍼를 이용한 입력 객체
			reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(file)));
			while (true) {
				String str = reader.readLine(); //한 라인을 읽음
				if (str == null)
					break;
				int num = Integer.parseInt(str); //스트링을 숫자로 변환
				sum = sum + num; //합산
			}
			System.out.println("합계:" + sum);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
