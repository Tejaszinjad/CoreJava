package mobile;

public class BasicPhone extends MobilePhone{
	@Override
    void makeCall(){
		System.out.println("This call is from Basic Phone");
	}
	
	void sendMessage() {
		System.out.println("This Message is from Basic Phone");
	}

}
