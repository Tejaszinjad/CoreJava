package String;

public class Reverse {
	
	public String reverse(String str) {
		String revStr ="";
		for(int i=str.length()-1; i>=0;i--) {
			revStr=revStr + str.charAt(i);
		}
		return revStr;
	}
	
	public static void main(String[] args) {
		Reverse r= new Reverse();
		System.out.println(r.reverse("java"));
	}

}
