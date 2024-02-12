package hasARelation;

import java.security.DomainCombiner;

public class Employee {
	
	String name;
	int id;
	int salary;
	
	Employee(){
		System.out.println("object without initialization");
	}
	
	Employee(String name,int id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	void empDetails() {
		if(this.id==0) {
			System.out.println("Your id is not registered");
		}
		else {
			System.out.println("Name: " +this.name );
			System.out.println("ID:" +this.id);
			System.out.println("Salary:" + this.salary);
			}
	}
	
	void empDetails(int id) {
		if(this.id==id) {
			System.out.println("Name: " +this.name );
			System.out.println("ID:" +this.id);
			System.out.println("Salary:" + this.salary);
		}
		else if(this.id==0) {
			System.out.println("Your id is not registered");
		}
		else {
			System.out.println("Invalid Id");
		}
	}
		
		public static void main(String[] args) {
			Employee e1=new Employee();
			Employee e2=new Employee("Tejas",07,50000);
			
			e1.empDetails();
			
		}
	}



