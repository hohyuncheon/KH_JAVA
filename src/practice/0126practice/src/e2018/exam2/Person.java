package e2018.exam2;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    

    @Override
    public String toString() {
        return String.format("{\"%s\", %d}", name, age);
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person==false) {
			return false;
		}
		Person p =(Person) obj;
		return Objects.equals(this.age, p.age) && this.name==p.name;
	}




}