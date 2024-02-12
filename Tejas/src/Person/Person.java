package Person;

public class Person {
	
	String name;
	String address;
	int age;
	
	Person(String name,String address,int age){
		this.name=name;
		this.address=address;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return this.name+this.address+this.age;
	}
    
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals (Object o) {
		Person p3=(Person)o;
		return this.name.equals(p3.name);
	}
}
