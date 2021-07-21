package ch14;
//제네릭, 일반화
public class Type3<T> {
	T value; //자료형이 미정, 실행할 때 결정됨
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public static void main(String[] args) {
		// 클래스이름<자료형> 
		Type3<String> t=new Type3<String>();
		t.setValue("hello");
		System.out.println(t.getValue()); 
		
		Type3<Integer> t2=new Type3<Integer>();
		t2.setValue(100);
		System.out.println(t2.getValue());
	}

}
