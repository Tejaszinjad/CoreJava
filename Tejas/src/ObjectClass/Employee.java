package ObjectClass;
//ToString
public class Employee {
	
	double sal;
	int id;
	String name;
	
	Employee( double sal, int id,String name){
		this.sal=sal;
		this.id=id;
		this.name=name;
	}
		@Override 
		public String toString() {
			return "Name:"+this.name+" Id:"+ this.id +" Sal:" +this.sal;
		}
		public static void main(String[] args) {
			Employee e = new Employee(30000, 07,"Tejas");
			System.out.println(e);
		}
	}

