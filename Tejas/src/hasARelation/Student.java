package hasARelation;

public class Student {
	
	String name;
	int age;
	int rollno;
	
	Student(){
		System.out.println("object without initialization");
	}
	
	Student(String name, int age, int rollno){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
	}
	
	void studentDetails() {
		if (this.rollno==0){
			System.out.println("Your Data is not registerd ");
		}
		else {
		System.out.println("Name: " +this.name );
		System.out.println("Age:" +this.age);
		System.out.println("Rollno:" + this.rollno);
		}
	}
	
	void studentDetails(int rollno) {
		if(this.rollno==rollno) {
			System.out.println("Name: " +this.name );
			System.out.println("Age:" +this.age);
			System.out.println("Rollno:" + this.rollno);
		}
		else if(this.rollno==0) {
			System.out.println("your Roll no is not registered");
		}
		else {
			System.out.println("your Roll  no is not correct");
		}
	    
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Tejas",23,07);
		s2.studentDetails(07);
	}
}
