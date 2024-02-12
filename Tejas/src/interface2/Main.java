package interface2;

public class Main {
	
	public static void main(String[] args) {
		Message m1 = new TextMessage(); 
		m1.sendMessage();
		
		Message m2 = new AudioMessage(); 
		m2.receiveMessage();
		
		Message m3 = new ImageMessage(); 
		m3.sendMessage();
		
		
	}

}
