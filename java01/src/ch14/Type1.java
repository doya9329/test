package ch14;

public class Type1 {
	String value;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public static void main(String[] args) {
		Type1 t=new Type1();
		t.setValue("hello");
		System.out.println(t.getValue());
	}
}
