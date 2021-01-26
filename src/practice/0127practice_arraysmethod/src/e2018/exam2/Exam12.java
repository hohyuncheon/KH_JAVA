package e2018.exam2;

//inner class 문법을 활용하여 Hello 클래스를 다시 구현하라.

class Hello {

	World world;

	// World world = new World();

	public Hello() {
		super();

		world = new World();
	}

	public Hello(World world) {
		this.world = world;
	}

	public void say() {
		System.out.println(world.message);
	}

	class World {
		String message = "안녕하세요";

		public void doSomething() {
			Hello hello = new Hello(this);
			hello.say();
		}
	}
}

public class Exam12 {

	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.world.doSomething();
	}
}