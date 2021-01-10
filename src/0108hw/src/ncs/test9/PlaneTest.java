package ncs.test9;

public class PlaneTest {
	public static void main(String args[]) {
		// Airplane 과 Cargoplane 객체 생성
		// 생성된 객체의 정보 출력
		// Airplane 과 Cargoplane 객체에 100 씩 운항
		// 100 운항 후 객체 정보 출력
		// Airplane 과 Cargoplane 객체에 200 씩 주유
		// 200 주유 후 객체 정보 출력

		Airplane a = new Airplane("L747", 1000);
		Cargoplane b = new Cargoplane("C40", 1000);
		
		System.out.println("Plane fuelSize ");
		System.out.println("--------------");
		
		System.out.print(a.getPlaneName()+"    "+a.getSize());
		System.out.println();
		System.out.print(b.getPlaneName()+"     "+b.getSize());
		System.out.println();
		System.out.println();
		System.out.println("100운항");
		
		a.flight(100);
		b.flight(100);
		System.out.println();
		System.out.println("Plane fuelSize ");
		System.out.println("--------------");
		System.out.print(a.getPlaneName()+"    "+a.getSize());
		System.out.println();
		System.out.print(b.getPlaneName()+"     "+b.getSize());
		System.out.println();
		System.out.println();
		System.out.println("200주유");
		a.refuel(200);
		b.refuel(200);
		System.out.println();
		System.out.println("Plane fuelSize ");
		System.out.println("--------------");
		System.out.print(a.getPlaneName()+"    "+a.getSize());
		System.out.println();
		System.out.print(b.getPlaneName()+"     "+b.getSize());
	}
}