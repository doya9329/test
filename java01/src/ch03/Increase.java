package ch03;

public class Increase {
	public static void main(String[] args) {
		int i=5;
		int j=0;
		j=i--; // 대입을 먼저 하고 값을 1증가시킴
		//j=i+1;
		//System.out.println((int)',');
		System.out.println(i+","+j);
		i=5;
		j=--i; // 증가를 먼저 시키고 나중에 대입
		System.out.println(i+","+j);
	}
}
