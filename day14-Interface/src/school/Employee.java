package school;
/**
 * 학교 시스템에서 교직원 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * ----------------------------------------
 * dept : String : 소속부서 이름
 * ----------------------------------------
 * @author Administrator
 *
 */
public class Employee extends Person implements Attendance{
	
	// 멤버변수 선언
	/** 직원의 소속부서 이름 */
	private String dept;
	
	// 생성자 중복정의
	// (1) 기본생성자
	/**
	 * 기본 생성자
	 */
	public Employee() {
		
	}
	
	/**
	 * Employee 만의 필드 dept 를 초기화하는 생성자
	 * @param dept : String : 부서명
	 */
	public Employee(String dept) {
		this.dept = dept;
	}
	 
	/**
	 * Person에서 물려받은 필드 (id, name, age)와
	 * Employee 만의 필드 dept를 모두 초기화하는 생성자
	 * @param id
	 * @param name
	 * @param age
	 * @param dept
	 */
	public Employee(String id, String name, int age, String dept){
		 super(id, name, age);
		 this.dept = dept;
	}
	
	// 메소드 재정의
	// (1) toString() 재정의 
	@Override
	public String toString() {
		String empStr = String.format(", 부서:%s", dept);
//		return "직원정보[" + super.toString() + empStr + "]";
		return String.format("직원정보 [%s%s]", super.toString(), empStr);
	}

	// 접근자, 수정자
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String attend() {
		// 직원[아이디]이(가) 출석하였습니다.
		return String.format("직원[%s]이(가) %s에 출근하였습니다.", getId(), getDept());
	}
}
