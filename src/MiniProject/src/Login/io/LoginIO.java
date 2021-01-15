package Login.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import Login.model.vo.Login;

public class LoginIO {

	public static void insertId(Login id) {
		
			File f = new File("userList.txt");
			
		try {
			
			
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
			oos.writeObject(id);//?
			
		} catch (Exception e) {
			
			
			
		}
		
	}
	

	

}
