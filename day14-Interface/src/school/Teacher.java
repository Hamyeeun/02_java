package school;
/**
 * 학교시스템에서
 * 과목을 가르치는 선생의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * @author Administrator
 *
 */
public class Teacher extends Person implements Lesson, Attendance {
	// 멤버변수 선언
	private String subject;
	
	// 생성자
	// (1) 기본생성자
	/**
	 * 기본 생성자
	 */
	public Teacher() {
		
	}
	
	// (2) 매개변수를 받는 생성자(생성자 중복정의)
	/**
	 * Teacher 만의 필드인 subject를 초기화하는 생성자
	 * 
	 * @param subject
	 */
	public Teacher(String subject) {
		this.subject = subject;
	}
	
	/**
	 * 전체필드 초기화하는 생성자
	 * -----------------------------------
	 * Person에서 물려받은 필드(id, name, age)를
	 * 부모클래스의 생성자를 빌려서 초기화하고
	 * Teacher 의 필드인 subject 는 직접 초기화
	 * @param id
	 * @param name
	 * @param age
	 * @param subject
	 */
	public Teacher(String id, String name, int age, String subject){
		super(id, name, age);
		this.subject = subject;
	}

	// 메소드
	// (1) toString() 재정의 
	@Override
	public String toString() {
		String tcStr = String.format(", 과목:%s", subject);
//		return "교사 정보[" + super.toString() + tcStr +"]";
		return String.format("과목[%s%s]", super.toString(), tcStr);
	}
	
	// 접근자, 수정자
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String attend() {
		// 교사[아이디]이(가) 출석하였습니다.
		// 라는 문자열 리턴
		return String.format("교사[%s]이(가) %s 에 출근하였습니다.", getId(), getSubject());
	}

	@Override
	public String lesson() {
		// 교사 [아이디] 이(가) 전공[과목명] 수업을 하고 있습니다.
		// 라는 문자열 리턴
		return String.format("교사[%s]이(가) 과목[%s] 수업을 하고 있습니다.", getId(), getSubject());
	}
	
	
}
