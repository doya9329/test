package quiz;

import java.util.Scanner;

public class Ex16_distance {
	private int x1, x2, y1, y2;
	private double distance; // 거리
	public int getX1() { return x1; }
	public int getX2() { return x2; }
	public int getY1() { return y1; }
	public int getY2() { return y2; }
	public double getDistance(int x1, int y1, int x2, int y2) {
		int x = x2 - x1;
		int y = y2 - y1;
		distance = Math.sqrt(x * x + y * y); //제곱근 계산
		return distance;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("x1:");
		x1 = sc.nextInt();
		System.out.print("y1:");
		y1 = sc.nextInt();
		System.out.print("x2:");
		x2 = sc.nextInt();
		System.out.print("y2:");
		y2 = sc.nextInt();
	}
	public static void main(String[] args) {
		Ex16_distance ex = new Ex16_distance();
		ex.input(); // 좌표값 입력
		double result = ex.getDistance(ex.getX1(), ex.getY1(),ex.getX2(), ex.getY2());
		System.out.println("결과:" + String.format("%7.1f", result));
	}
}
