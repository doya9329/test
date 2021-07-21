package ch13;

import java.util.Arrays;

public class ArrSort {
	public static void main(String[] args) {
		int[] num= {50,40,70,90,120,-20};
		System.out.println("정렬 전");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println(); //줄바꿈
		//Arrays.sort(num); 
		int temp=0; //임시변수
		//정렬 코드
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				//if(num[i] > num[j]) { //더 크면
				if(num[i] < num[j]) { //더 작으면
					temp=num[i]; //임시변수에 백업
					num[i]=num[j]; //자리 바꿈
					num[j]=temp;
				}
			}
		}
		System.out.println("정렬 후");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
