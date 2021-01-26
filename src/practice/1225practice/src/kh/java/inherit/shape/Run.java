package kh.java.inherit.shape;


/*
실행클래스)
Point[] points = {new Point(0,0), new Point(200,0), new Point(200,100), new Point(0,100)};
Rectangle rect = new Rectangle(points, 200, 100);
rect.draw();
System.out.println("사각형의 너비는 "+rect.getArea()+"입니다.");
System.out.println(rect);

출력결과)
네 꼭지점이 (0, 0), (200, 0), (200, 100), (0, 100)이고, 너비가 200, 높이가 100인 사각형을 그린다.
사각형의 너비는 20000.0입니다.
points=[(0, 0), (200, 0), (0, 100), (200, 100)], width=200, height=100  

 * 
 */
public class Run {
	public static void main(String[] args) {
		
		
		
	Point[] points = {new Point(0,0), new Point(200,0), new Point(200,100), new Point(0,100)};
	Rectangle rect = new Rectangle(points, 200, 100);
	
	//points[0] = new Point(0,0); 위에거 나눠서 작성한 코드.
	
	
	rect.draw();
	
	System.out.println("사각형의 너비는 "+rect.getArea()+"입니다.");
	System.out.println(rect);

	}
}
