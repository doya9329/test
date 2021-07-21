package ch13;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
//자동 import : Ctrl Shift O		
		Random r=new Random(); // random seed 
		System.out.println(r.nextInt()); //정수 난수
		System.out.println(r.nextInt(10)); // 0~9
		System.out.println(r.nextInt(10)+1); // 1~10
		System.out.println(Math.random()); //0.0~1.0미만
		int num=(int)(Math.random() * 100);
		System.out.println(num);
		String[] items= {"TV","냉장고","세탁기","에어컨"};
		System.out.println(items[r.nextInt(4)]);
	}
}	
