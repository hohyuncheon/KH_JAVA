package kh.java.io.byte_.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectIOTest {

	public static void main(String[] args) {
		ObjectIOTest o = new ObjectIOTest();
//		o.test1();
		o.test2();
	}
	
	public void test2() {
		File f = new File("object/user.ser");
		
		try(
			ObjectInputStream ois = 
				new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(f)
						)
					);
		){
			
//			while(true) {				
//				System.out.println(ois.readObject());
//			}
			
			User[] arr = (User[])ois.readObject();
			for(User u : arr)
				System.out.println(u);
			
		} catch(EOFException e) {	
			
			System.out.println("파일 읽어오기 완료!!!");
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	private void test1() {
		
		File f = new File("object/user.ser");
		
		try(
			ObjectOutputStream oos = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(f)));
		){
			
			User u1 = new User("honggd", "1234", "홍길동", Calendar.getInstance());
			User u2 = new User("sinsa", "1234", "신사임당", Calendar.getInstance());
			User u3 = new User("sejong", "1234", "세종", Calendar.getInstance());
			
//			oos.writeObject(u1);
//			oos.writeObject(u2);
//			oos.writeObject(u3);
			
			//배열로 저장
			User[] arr = {
				u1, u2, u3	
			};
			oos.writeObject(arr);
			System.out.println("객체 쓰기 완료 !!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
