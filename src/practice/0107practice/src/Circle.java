public class Circle {
	
	private int radius;//반지름

	public Circle() {
		super();
	}
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "반지름은 : " + radius;
	}
	
	@Override
	public boolean equals(Object ob) {
		
		//타입검사
		if(!(ob instanceof Circle)) {
			return false;

		//형변환
		}
		if(this.radius ==((Circle)ob).radius) {
			return true;
		}
		else
			return false;
	}
	

	
//	@Override
//	public boolean equals(Object o) {
//		
//		if(o instanceof Circle) {
//			
//			if(this.radius==((Circle)o).radius) {
//				return true;
//			}else {
//				return false;
//			}
//		}else
//		return false;
//	}

}
