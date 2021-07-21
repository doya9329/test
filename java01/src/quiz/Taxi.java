package quiz;

public class Taxi {
	private int cost;
	private int km;
	
	public Taxi(int km) {
		this.km=km;
	}
	public void calc() {
		int m = km * 1000;
		if (m <= 2000) { // 기본요금
			cost = 3000;
		} else { // 기본요금 초과
			int temp = m - 2000; // 초과 거리
			cost = 3000 + (int) ((temp / 140.0) * 150);
		}
	}
	public void print() {
		System.out.println(
				"운행거리:"+km+",요금:"+String.format("%,d", cost));
	}
}
