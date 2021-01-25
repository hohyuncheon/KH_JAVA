package ncs.test8;

public class UserTest {

	public static void main(String[] args) {

		user[] u= new user[3];
		u[0] = new user("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		u[1] = new user("user02", "pass02", "이영희", 25, 'F' ,"010-5555-7777");
		u[2] = new user("user03", "pass03", "황진이", 20, 'F' ,"010-9874-5632");

		
		for (int i = 0; i < u.length; i++) {
			System.out.println(u[i]);
		}
			
		//하나하나대입
		user[] copyUsers = new user[u.length];
		
		for(int i=0; i<copyUsers.length; i++) {
			String id,password,name;
			id = u[i].getId();
			password = u[i].getPassword();
			name = u[i].getName();
			int age = u[i].getAge();
			char gender = u[i].getGender();
			String phone = u[i].getPhone();
			copyUsers[i] = new user(id, password, name, age, gender, phone);
		}
		
		//copyusers출력
		for (int i = 0; i < u.length; i++) {
			System.out.println(copyUsers[i]);
		}
		
		
		//equals
		for(int i=0; i<u.length; i++) {
			System.out.println(u[i].equals(copyUsers[i]));
		
		}
	}

}
