package ncs.test9;

public class Airplane extends Plane {

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int size) {
		super(planeName, size);
	}

	@Override
	public void flight(int distance) {
		setSize(distance * 3);

	}

}
