package television2;

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
	
	
	public void draw() {
		System.out.println("channel : " + channel);
	}

}
