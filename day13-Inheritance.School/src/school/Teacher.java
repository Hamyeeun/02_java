package school;

public class Teacher extends Person {
	// 멤버변수 선언
	private String subject;
	
	// 생성자
	Teacher(String id, String name, int age){
		super(id, name, age);
	}
	
	Teacher(String id, String name, int age, String subject){
		super(id, name, age);
		this.subject = subject;
	}
	
	// 접근자, 수정자
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	// 메소드
	@Override
	public String toString() {
		return subject + super.toString();
	}
	
}
