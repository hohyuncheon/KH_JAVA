import java.util.HashSet;
import java.util.Set;

public class Test4 {
	
	public static void main(String[] args) {
		
		Set<Student> sett = new HashSet<>();
		
		Student s1 = new Student(10, "김윤수");   //001
		Student s2 = new Student(10, "김상훈");   //002
		
		sett.add(s1);
		sett.add(s2);
		
		
		
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    
    
    System.out.println(s1.compareTo(s2));
    System.out.println(sett);
		
	}

}
