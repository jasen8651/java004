package ncs.test04;

public class Product {
	String name;
	int pay;
	int amount;
	
	public Product() {
	
	}

	public Product(String name, int pay, int amount) {
		this.name = name;
		this.pay = pay;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String information() {
		return ("상품명 : "+name+ "\n가격 : "+pay+"\n수량 "+amount +"\n총구매량");
	}
	
}
