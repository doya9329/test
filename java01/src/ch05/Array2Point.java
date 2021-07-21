package ch05;

public class Array2Point {
	public static void main(String[] args) {
		//2차원 배열
		int[][] point= {
				//0  1  2  3 4
				{80,90,100,0,0}, //0행
				{70,60,95,0,0},  //1행
				{88,77,66,0,0},  //2행
				{99,89,95,0,0},  //3행
				{100,60,50,0,0}  //4행
		};
		for(int i=0; i<5; i++) {
			//총점 계산
			point[i][3]=point[i][0]+point[i][1]+point[i][2];
			point[i][4]=point[i][3] / 3; //평균 계산
		}
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) { 
			System.out.println(point[i][0]+"\t"+point[i][1]+"\t"+
					point[i][2]+"\t"+point[i][3]+"\t"+point[i][4]);
		}
	}
}
