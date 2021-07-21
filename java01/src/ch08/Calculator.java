package ch08;

public class Calculator {
	private int left;
	private int right;
//클래스 이름과 같고 리턴타입이 없는 특별한 형태의 method 	
	public Calculator(){ //기본생성자
		System.out.println("생성자 호출");
	}
	public Calculator(int left, int right){
		System.out.println("매개변수가 있는 생성자 호출");
		this.left=left;
		this.right=right;
	}	
	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() { System.out.println(left+right); }
	public void avg() { System.out.println( (left+right)/2 ); }
}
