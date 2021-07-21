package quiz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex25_point_file {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
new InputStreamReader(new FileInputStream("c:/work/data.txt")));
		List<MyPoint> items = new ArrayList<>();
		while (true) {
			String str = br.readLine(); //파일에서 한 라인을 읽음
			if (str == null)
				break; //내용이 없으면 반복문 종료
			String[] arr = str.split(","); // 구분자를 기준으로 나눔
			String name = arr[0]; 
			int kor = Integer.parseInt(arr[1]);
			int eng = Integer.parseInt(arr[2]);
			int mat = Integer.parseInt(arr[3]);
			MyPoint p = new MyPoint(name, kor, eng, mat);
			p.setTot(p.getKor() + p.getEng() + p.getMat());
			p.setAvg(p.getTot() / 3.0);
			items.add(p); //리스트에 추가
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < items.size(); i++) {
			MyPoint p = items.get(i); //i번째 자료 조회
			System.out.println(p.getName() + "\t" + p.getKor() + "\t" + p.getEng() + "\t" 
			  + p.getMat() + "\t" + p.getTot() + "\t" + p.getAvg());
		}
	}
}


