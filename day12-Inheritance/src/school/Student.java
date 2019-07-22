package school;

public class Student extends Person {
	private String major;
	
	Student(String id, String name, int age){
		super(id, name, age);
	}
	Student(String id, String name, int age, String major){
		this(id, name, age);
		this.major = major;
	}
}
