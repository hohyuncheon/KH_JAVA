package Login.model.vo;

import java.io.Serializable;

//serializable 객체입출력스트림에 사용하려면 사용.
public class Login implements Serializable{
	
	private String id;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + "]";
	}
	
	
	

}
