package ch07;

public class Employee {
	//속성(property) 
	private String name;
	private String part;
	private String position;
	private int basic;
	private int bonus;
	private int total;
	private int tax;
	private int salary;
	//동작(method)
//	public void input(String name, String part, String position,int basic) {
//		this.name=name;
//		this.part=part;
//		this.position=position;
//		this.basic=basic;
//	}
	public Employee() {}
	public Employee(String name, String part, String position,int basic) {
		this.name=name;
		this.part=part;
		this.position=position;
		this.basic=basic;
	}
	
	public void input(String n, String pa, String po,int b) {
		name=n;
		part=pa;
		position=po;
		basic=b;
	}	
	public void calc() {
		bonus=basic*3;
		total=basic+bonus;
		// (자료형)값
		tax=(int)(total * 0.033);
		salary=total-tax;
	}
	public void print() {  
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실수령액");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"
				+bonus+"\t"+total+"\t"+tax+"\t"+salary);
	}
	@Override //어노테이션
	public String toString() {
		return name+"\t"+part+"\t"+position+"\t"+basic+"\t"
				+bonus+"\t"+total+"\t"+tax+"\t"+salary;
	}
}











