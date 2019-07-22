package school;

public class Employee extends Person {
	// 멤버변수 선언
	private String dept;
	
	// 생성자 중복정의
	 Employee(String id, String name, int age){
		 super(id, name, age);
	 }
	 
	Employee(String id, String name, int age, String dept){
		 super(id, name, age);
		 this.dept = dept;
	}
	
	// 접근자, 수정자
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	// 메소드 재정의
	@Override
	public String toString() {
		return dept + super.toString();
	}
}
