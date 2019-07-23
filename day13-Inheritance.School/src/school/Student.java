package school;
/**
 * 학교 시스템에서
 * 학생의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * @author Administrator
 *
 */
public class Student extends Person {
	
	// 멤버변수 선언
	/** 학생의 전공을 저장하는 멤버변수 */
	private String major;
	
	// 생성자 중복정의
	// (1)기본생성자
	public Student() {
		
	}
	
	// (2) 매개변수 받는 생성자
	/**
	 * Student 만의 필드인 major를 초기화하는 생성자
	 * @param major
	 */
	Student(String major){
		this.major = major;
	}
	
	/**
	 * Person 클래스에서 물려받은 필드 (id, name, age)를 초기화하는 필드, major도 초기화 
	 * @param id
	 * @param name
	 * @param age
	 * @param major
	 */
	Student(String id, String name, int age, String major){
		super(id, name, age);
		// this(major); // 불가능
		// super(), this()는 생성자 선언 첫줄에 한번만 등장 가능
		// super()도 사용하고 this()도 사용할 순 없음
		this.major = major;
	}
	
	// 메소드
	// (1) toString() 재정의 : 학생에 맞도록
	@Override
	public String toString() {
		String stdStr = String.format(", 전공:%s", major);
		return String.format("학생정보[%s%s]", super.toString(), stdStr);
	}

	// 접근자, 수정자
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
}
