package quiz;

public class Ex05 {
	public static void main(String[] args) {
		int[] kor= {85,95,98,75,65};
		int[] mat= {90,91,92,93,94}; 
		int[] eng= {70,71,72,73,74};
		int[] tot=new int[5];
		double[] avg=new double[5];
		String[] grade=new String[5];
		for(int i=0; i<kor.length; i++) {
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.0;
			if(avg[i]>=90) { //true이면
				grade[i]="A";
			}else if(avg[i]>=80) { //false이면 다시 검사
				grade[i]="B";
			}else if(avg[i]>=70) {
				grade[i]="C";
			}else if(avg[i]>=60) {
				grade[i]="D";
			}else { //그외의 모든 경우
				grade[i]="F";
			}
		}
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<kor.length; i++) {
			System.out.println(kor[i]+"\t"+eng[i]+"\t"+mat[i]
+"\t"+tot[i]+"\t"+String.format("%.1f",avg[i])+"\t"+grade[i]);
		}
	}
}
