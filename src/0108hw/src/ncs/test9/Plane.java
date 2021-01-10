package ncs.test9;

public abstract class Plane {
	private String planeName;
	private int size;

	public Plane() {
		super();
	}

	public Plane(String planeName, int size) {
		super();
		this.planeName = planeName;
		this.size = size;
	}

	public void refuel(int fuel) {// 주유
		size += fuel;
	}

	public abstract void flight(int distance);// 운항

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size -= size;
	}

}
