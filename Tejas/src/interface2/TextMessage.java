package interface2;

public class TextMessage implements Message {
	@Override
	public void sendMessage() {
		System.out.println("Send Text Message..");
	}
	@Override
    public void receiveMessage() {
    	System.out.println("Send Text Message..");
	}
    
}
