package shape;

public class Rectangle extends Shape implements Resize{
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String color) {
		super(width, height, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return super.getHeight()*super.getWidth();
	}

	@Override
	public void setResize(int size) {
		super.setWidth(super.getWidth()+size);
		
	}

}
