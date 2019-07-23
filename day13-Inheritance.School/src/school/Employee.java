package school;

public class Employee extends Person {
	// 멤버변수 선언
	private String dept;
	
	// 생성자 중복정의
	// (1) 기본생성자
	public Employee() {
		
	}
	
	public Employee(String dept) {
		this.dept = dept;
	}
	 
	public Employee(String id, String name, int age, String dept){
		 super(id, name, age);
		 this.dept = dept;
	}
	
	// 메소드 재정의
	@Override
	public String toString() {
		String empStr = String.format(", 부서:%s", dept);
		return String.format("부서정보 [%s%s]", super.toString(), empStr);
	}

	// 접근자, 수정자
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
}
