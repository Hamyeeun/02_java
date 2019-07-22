package school;

public class Student extends Person {
	// 멤버변수 선언
	private String major;
	
	// 생성자 중복정의
	Student(String id, String name, int age){
		super(id, name, age);
	}
	
	Student(String id, String name, int age, String major){
		this(id, name, age);
		this.major = major;
	}
	
	// 접근자, 수정자
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	// 메소드
	@Override
	public String toString() {
		return major + super.toString();
	}
}
