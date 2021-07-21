package ch06;

public class Salary {
	static String[] name= {"park","kim","lee","choi","hong"};
	static int[] salary= {2800,3000,2500,2000,3500};
	static int[] bonus=new int[5];
	static int[] total=new int[5];
	static int[] tax=new int[5];
	static int[] pay=new int[5];
	static int pay_tot;
	static void calc() { //계산함수
		for(int i=0; i<name.length; i++) {
			bonus[i]=(int)(salary[i]*0.3); //보너스, 정수형으로 변환
			total[i]=salary[i] + bonus[i]; //총액
			tax[i]=(int)(total[i]*0.03); //세액
			pay[i]=total[i]-tax[i]; //실수령액
			pay_tot=pay_tot + pay[i]; //실수령액 합산
		}
	}
	static void print() { //출력함수
		System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
		for(int i=0; i<name.length; i++) { 
			System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]+"\t"
					+total[i]+"\t"+tax[i]+"\t"+pay[i]);
		}
	}
	public static void main(String[] args) {
//		calc(); //함수호출
//		print();
		for(int i=0; i<name.length; i++) {
			bonus[i]=(int)(salary[i]*0.3); //보너스, 정수형으로 변환
			total[i]=salary[i] + bonus[i]; //총액
			tax[i]=(int)(total[i]*0.03); //세액
			pay[i]=total[i]-tax[i]; //실수령액
			pay_tot=pay_tot + pay[i]; //실수령액 합산
		}
		
		System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
		for(int i=0; i<name.length; i++) { 
			System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]+"\t"
					+total[i]+"\t"+tax[i]+"\t"+pay[i]);
		}
	}
}













