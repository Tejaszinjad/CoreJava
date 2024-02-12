package ObjectClass;

import java.util.Objects;

//hashcode()
public class Student {
	
	int age;
	int id;
	String name;
	
	Student( int age, int id,String name){
		this.age=age;
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.age);
		
	}
	public static void main(String[] args) {
		Student s = new Student(23,07,"Tejas");
		Student s1 = new Student(23,07,"Tejas");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}
	

}
