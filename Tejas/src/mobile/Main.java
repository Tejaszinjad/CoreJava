package mobile;

public class Main {
	
	public static void main(String[] args) {
		
		MobilePhone m1 =new SmartPhone();
		m1.sendMessage();
		m1.makeCall();
		MobilePhone m2 =new FeaturePhone();
		m2.sendMessage();
		m2.makeCall();
		MobilePhone m3 =new BasicPhone();
		m3.sendMessage();
		m3.makeCall();
	}

}
