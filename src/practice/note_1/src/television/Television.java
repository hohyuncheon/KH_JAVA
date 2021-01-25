package television;

public class Television {
	
	private int channel;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public Television() {
		super();
	}

	
	public Television(int channel) {
		super();
		this.channel = channel;
	}

	
	//tostring 리턴문
	public String toString() {
		return ("channel : " + channel );
	}
	

}
