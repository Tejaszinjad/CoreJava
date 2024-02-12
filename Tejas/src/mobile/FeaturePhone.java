package mobile;

public class FeaturePhone extends MobilePhone{
	@Override
    void makeCall(){
		System.out.println("This call is from Feature Phone");
	}
	
	void sendMessage() {
		System.out.println("This Message is from Feature Phone");
	}

}
