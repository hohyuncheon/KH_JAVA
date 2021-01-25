package ncs.test9;

public class Cargoplane extends Plane {

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int size) {
		super(planeName, size);
	}

	@Override
	public void flight(int distance) {
		setSize(distance * 5);
	}

}
