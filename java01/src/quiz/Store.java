package quiz;

public class Store {
	private String code;
	private String name;
	private String product;
	private int price;
	private int amount;
	private int money;
	private int fee;
	public Store(String code, String name, String product, int price, 
			int amount) {
		this.code = code;
		this.name = name;
		this.product = product;
		this.price = price;
		this.amount = amount;
		money=price*amount; //금액
		fee=(int)(money*0.001); //수수료
	}
	@Override
	public String toString() {
		return code + "\t" + name + "\t" + product + "\t" + price + "\t"
				+ amount + "\t" + money + "\t" + fee;
	}
}

