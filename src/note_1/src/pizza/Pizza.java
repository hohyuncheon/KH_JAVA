package pizza;

public class Pizza {
	
	String brand;
	int diameter;
	int price;
	
	
	
	public Pizza() {
		super();
	}
	
	public Pizza(String brand, int diameter, int price) {
		super();
		this.brand = brand;
		this.diameter = diameter;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void draw() {
		System.out.println("브랜드는 : " +getBrand() + " 지름은 : " + getDiameter() + " 가격은 : " + getPrice()+"원 " );
		
	}
	
	
	

	
}
