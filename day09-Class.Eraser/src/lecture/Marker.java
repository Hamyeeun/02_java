package lecture;
/**
 * 마커를 테스트하는 클래스
 * 멤버 변수 : String color
 * 			 boolean isNew
 * 			 boolean isOpened
 * 
 * 생성자 : 4개 this(), this 사용하여!
 * void print() : 상태 출력하는 메소드
 * void use() : 어떤마커를 사용하는지
 * @author Administrator
 *
 */
public class Marker {
	// 1. 멤버변수 선언
	/** 마커의 색상 */
	String color;
	/** 마커가 새것인지 */
	boolean isNew;
	/** 마커의 뚜껑이 열려있는지 */
	boolean isOpened;
	
	// 2. 생성자 선언
	/**
	 * 1. 기본 생성자
	 */
	Marker(){
		
	}
	/**
	 * 2. 컬러만 초기화
	 */
	Marker(String color){
		this();
		this.color = color;
	}
	
	/**
	 * 3. 컬러 ==> this()로 1개초기화한 생성자 호출
	 *    새것인지 ==> 직접 초기화
	 */
	Marker(String color, boolean isNew){
		this(color);
		this.isNew = isNew;
	}
	
	/**
	 * 4. 컬러 ==> this()로 2개초기화한 생성자 호출
	 *    새것인지 ==> this()로 2개초기화한 생성자 호출
	 *    뚜껑이 열려있는지 ==> 직접 초기화
	 */
	Marker(String color, boolean isNew, boolean isOpened){
		this(color, isNew);
		this.isOpened = isOpened;
	}
	
	// 3. 메소드 선언
	/**
	 * 나의 ver.
	 * 마커의 상태 출력
	 */
	public void print() {
		String newOne;
		String openPen;
		if(isNew == true) {
			newOne = "새것";
		}else {
			newOne = "다쓴 상태";
		}
		if(isOpened == true) {
			openPen = "열려있습니다.";
		}else {
			
			openPen = "닫혀있습니다.";
		}
		System.out.printf("마커의 색상은 %s 이고 %s입니다. 뚜껑은 %s%n", color, newOne, openPen);
	}
	
	/**
	 * 나의 ver.
	 * 마커가 사용중인지 출력
	 * 사용하고 있다면 어떤 마커를 사용중인지 출력
	 */
	public void use() {
		String newOne;
		
		if(isNew == true) {
			newOne = "새것";
			System.out.printf("%s 마커를 사용 중 입니다.%n",color, newOne);
		}else {
			newOne = "다쓴 상태";
			System.out.printf("%s인 이 마커는 다쓴 상태이므로 사용 불가입니다.\n",color);

		}
		
		if(isOpened) {
			isOpened = false;
		}
	}
	/**
	 * 강사님 ver.
	 * 마커 사용
	 */
//	public void use() {
//		System.out.printf("%s 색의 마커를 사용하고 있습니다.%n", color);
//	}
	/**
	 * 강사님 ver.
	 * 마커 상태
	 */
//	public void print() {
//		String message = "마커 색상 : %s, %s, %s ";
//		
//		String openStatus;
//		String newStatus;
//		
//		if (isOpened) {
//			openStatus = "뚜껑이 열려 있습니다."; 
//		}else {
//			openStatus = "뚜껑이 닫혀 있습니다.";
//		}
//		
//		if(isNew) {
//			newStatus = "새 마커 입니다.";
//		}else {
//			newStatus = "다 쓴 마커 입니다.";
//		}
//		System.out.printf("%s, %s %s\n",color, openStatus, newStatus);
//	}

}
