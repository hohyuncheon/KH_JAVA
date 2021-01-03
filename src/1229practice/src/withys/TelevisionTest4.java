package withys;

public class TelevisionTest4 {

	public static void main(String[] args) {
		
		Teslevison4[] t = new Teslevison4[3];

		t[0]= new Teslevison4(7);
		t[1]= new Teslevison4(9);
		t[2]= new Teslevison4(11);
		
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i].getTv());
		}
	}
}
