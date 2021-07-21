package quiz;
public class Point {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grade;
	public Point(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public void calc() {
		tot=kor+eng+mat;
		avg=tot/3.0;
		if(avg>=90) {
			grade="A";
		}else if(avg>=80) {
			grade="B";
		}else if(avg>=70) {
			grade="C";
		}else if(avg>=60) {
			grade="D";
		}else {
			grade="F";
		}
	}
	public void print() {
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+
tot+"\t"+String.format("%.2f",avg)+"\t"+grade);
	}
}
