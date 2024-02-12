package Person;

public class Main {

	public static void main(String[] args) {
		Person p= new Person("Tejas","Nerul",23);
		Person p1=new Person("Tejas","Nerul",23);
		
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		System.out.println(p.equals(p1));
	}
}
