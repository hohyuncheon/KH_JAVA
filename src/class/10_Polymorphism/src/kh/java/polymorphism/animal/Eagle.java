package kh.java.polymorphism.animal;

public class Eagle extends Animal implements Flyable {

	@Override 
	public void attack() {
		System.out.println("이글이글이 부리로 막 쫍니다.");
	}
	
	@Override
	public void fly(String sound) {
		System.out.println("이글이글이 날아갑니다~ " + sound);
	}
	
	
}
