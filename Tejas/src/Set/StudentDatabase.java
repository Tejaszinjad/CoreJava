package Set;

import java.util.HashSet;

public class StudentDatabase {
	
	public static void main(String[] args) {
		HashSet<Student>studentData = new HashSet<Student>();
		
		Student s = new Student(101,"Tejas");
		studentData.add(s);
		
		s.addCources("Java");
		s.addCources("HTML");
		s.addCources("SQL");
		s.addCources("WebTech");
		
		Student s1 = new Student(102,"vishant");
		studentData.add(s1);
		s1.addCources("Python");
		s1.addCources("HTML");
		s1.addCources("SQL");
		s1.addCources("WebTech");
		for(Student data:studentData) {
			System.out.println(data);
		}
	}

}
