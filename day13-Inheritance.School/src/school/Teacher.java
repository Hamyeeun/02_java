package school;

public class Teacher extends Person {
	// 멤버변수 선언
	private String subject;
	
	// 생성자
	// (1) 기본생성자
	public Teacher() {
		
	}
	
	// (2) 매개변수를 받는 생성자
	public Teacher(String subject) {
		this.subject = subject;
	}
	
	public Teacher(String id, String name, int age, String subject){
		super(id, name, age);
		this.subject = subject;
	}

	// 메소드
	@Override
	public String toString() {
		String teacherStr = String.format(", 과목:%s", subject);
		return String.format("과목[%s%s]", super.toString(), teacherStr);
	}
	
	// 접근자, 수정자
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
