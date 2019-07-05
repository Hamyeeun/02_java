package operator.binary;
/**
 * <, >, <=, >=, ==, !=
 * 
 * 두 변수의 값을 비교하는
 * 비교연산자를 테스트하는 클래스
 * 
 * 관계 연산의 결과는 boolean 타입으로 얻어짐.
 * 
 * @author Administrator
 *
 */
public class RelationalTest {

	public static void main(String[] args) {
		// 1. 선언 , 2. 초기화
		int a = 1;
		int b = -5;
		
		// 비교 연산자 사용
		System.out.println("등가비교 연산자");
		System.out.println("-----------------------------");
		
		System.out.printf("(%d == %d) : %b%n", a, b, (a == b));
		System.out.printf("(%d != %d) : %b%n", a, b, (a != b));
		
		System.out.println("-----------------------------");
		System.out.println("대소비교 연산자");
		System.out.println("-----------------------------");
		
		System.out.printf("(%d > %d) : %b%n", a, b, (a > b));
		System.out.printf("(%d < %d) : %b%n", a, b, (a < b));
		System.out.printf("(%d >= %d) : %b%n", a, b, (a >= b));
		System.out.printf("(%d <= %d) : %b%n", a, b, (a <= b));
		
		// 이클립스 IDE 의 단축키
		// Ctrl + d : 커서가 있는 행 전체 삭제
		// Alt + shift + a : 세로줄 편집 기능 토글
		// Alt + up/down : 행 전체 상하 이동
		// Ctrl + shift + L : 단축키 모음 안내창 오픈
		// Ctrl + F6 : 열려있는 파일 사이에 이동
		

	}

}
