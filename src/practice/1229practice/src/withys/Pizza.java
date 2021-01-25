package withys;

public class Pizza {

	
	private String brand;
	private int di;
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getDi() {
		return di;
	}
	public void setDi(int di) {
		this.di = di;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Pizza() {
		super();
	}
	public Pizza(String brand, int di, int price) {
		super();
		this.brand = brand;
		this.di = di;
		this.price = price;
	}
	
//	public void draw() {
//		System.out.println("brand : " + brand + "  지름 : " + di + "  가격 : " + price);
//		
//	}
	
	@Override
	public String toString() {
		return "brand : " + brand + "  지름 : " + di + "  가격 : " + price;
	}
	
	
	
	
}
