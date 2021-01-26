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
    	return "{"+this.name + this.age+"}";
    }
    
    
    @Override
    public boolean equals(Object obj) {
    	if(!(obj instanceof Person)) {
    		return false;
    	}
    	if(this.name==((Person)obj).name && this.age==((Person)obj).age) {
    		return true;
    	}
    	return false;
    }
    
}