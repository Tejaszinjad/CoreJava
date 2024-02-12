package interface2;

public class ImageMessage implements Message {
	@Override
    public void sendMessage() {
		System.out.println("Send Image Message..");
	}
	@Override
    public void receiveMessage() {
    	System.out.println("Receive Image Message..");
	}

}
