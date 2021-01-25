package ncs.test3;

public class Product {
	
	private String name;
	private int price;
	private int quantity;
	
	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product() {
		super();
	}
	
	

	public int getTotal() {
		return price*quantity;
	}

	public String information() {
	
		return "이름은 : "+name+" 가격은 : "+ price+" 수량은 : " +quantity + "총 가격은 : "+getTotal();

	}

}
