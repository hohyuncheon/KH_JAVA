package kh.java.inherit.shape;

/*필드
* points: Point[4]  0번지-leftTop, 1번지-rightTop, 2번지-rightBottom, 3번지-leftBottom 
* width : int
* height : int
* 
* 
생성자
* 기본생성자
* 파라미터생성자 : Point[] points, int width, int height

다음 메소드를 오버라이딩할 것.
* draw()메소드: 
* getArea()메소드 
* toString 메소드
 */

public class Rectangle extends Shape {

	Point[] point = new Point[4];
	private int width;// 너비
	private int height;// 높이

	// 기본생성자
	public Rectangle() {
		super();
	}

	// 파라미터생성자
	public Rectangle(Point[] point, int width, int height) {
		super();
		this.point = point;
		this.width = width;
		this.height = height;
	}

	// getter setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setPoint(Point[] point) {
		this.point = point;
	}

	public Point[] getPoint() {
		return point;
	}

	@Override
	public void draw() {
		System.out.print("네 꼭지점이 ");
		for (int i = 0; i < point.length; i++) {
			System.out.print(point[i].toString());
			System.out.print(point.length -1 == i? "":",");
		}
		System.out.println("이고, 너비가" + width + "높이가" + height + "인 사각형을 그린다");

	}

	@Override
	public double getArea() {
		return (double) width * height;

	}

	@Override
	public String toString() {

		String temp = "Points=[";

		// for each 문
		for (Point p : point) {
			if (p != null) {
				temp += p.toString();
			}
		}

//		for (int i = 0; i < point.length; i++) {
//			temp += point[i].toString();
//		}
		temp += "], width" + width + ", height= " + height;
		return temp;

	}

}
