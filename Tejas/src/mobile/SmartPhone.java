package mobile;

public class SmartPhone extends MobilePhone{
	@Override
    void makeCall(){
		System.out.println("This call is from Smart Phone");
	}
	
	void sendMessage() {
		System.out.println("This Message is from Smart Phone");
	}
	
	

}
