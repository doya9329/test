package ch05;

public class Array2 {
	public static void main(String[] args) {
		// 배열첨자가 2개=>2차원 배열
		// 3행 3열
//		int[][] num= {
//				//0 1  2
//				{10,20,30}, //0행 
//				{40,50,60}, //1행
//				{70,80,90}  //2행
//		};
		int[][] num=new int[3][3];
		num[0][0]=10; //0행 0열에 10을 입력
		num[0][1]=10; //0행 1열에 20을 입력
		num[0][2]=10; //0행 2열에 30을 입력
		num[1][0]=10; //1행 0열에 40을 입력
		num[1][1]=10; //1행 1열에 50을 입력
		num[1][2]=10; //1행 2열에 60을 입력
		num[2][0]=10; //2행 0열에 70을 입력
		num[2][1]=10; //2행 1열에 80을 입력
		num[2][2]=10; //2행 2열에 90을 입력
		
		
		System.out.println(num[0][0]); //0행 0열
		System.out.println(num[2][1]); //2행 1열
		for(int i=0; i<3; i++) { //0~2행
			for(int j=0; j<3; j++) { //0~2열
				// 배열참조변수[행의인덱스][열의인덱스] 
				System.out.println(num[i][j]);
			}
		}
	}
}