package Set;

import java.util.HashSet;

public class Student {
	
	int studentId ;
	String name;
	HashSet<String>cources;
	
	Student(int studentId,String name){
	  this.studentId=studentId;
	  this.name=name;
	  //initialize HashSet
	  this.cources= new HashSet<String>();
	}
	
	public void addCources(String cource) {
		cources.add(cource);
	}
	
	@Override
	public String toString() {
		return  "Name:"+this.name+"ID:"+this.studentId+"Coureces:"+this.cources;
	}
	
	@Override
	public int hashCode(){
		return studentId*7;
	}
	
	@Override
	public boolean equals(Object o){
		return false;
	}

}
