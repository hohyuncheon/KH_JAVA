package shape;

public class Triangle extends Shape implements Resize{
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height, String color) {
		super(width, height, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return super.getHeight()*super.getWidth()/2;
	}

	@Override
	public void setResize(int size) {
		super.setHeight(super.getHeight()+size);
	
	}

}
