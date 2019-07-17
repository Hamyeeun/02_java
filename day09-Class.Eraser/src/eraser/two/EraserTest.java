package eraser.two;
/**
 * 지우개를 만들고
 * 사용해보는 클래스
 * @author Administrator
 *
 */
public class EraserTest {

	public static void main(String[] args) {
		// 1. 선언 : 칠판 지우개 객체 참조 변수
		Eraser leftEraser;
		Eraser rightEraser;
		
		// 2. 초기화
		leftEraser = new Eraser();
		rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색");
		
		// 3. 사용
		// (1)두 지우개 초기상태 출력
		System.out.println("(초기상태)==========================================\n");
		
		leftEraser.print();
		rightEraser.print();
		
		System.out.println("\n(오른쪽 지우개 한겹제거)================================\n");
		
		// (2) 오른쪽 지우개 한겹 제거
		rightEraser.peel();
		
		System.out.println("\n(두 지우개 상태)=======================================\n");
		
		// (3) 두 지우개 상태 출력
		leftEraser.print();
		rightEraser.print();
		
		System.out.println("\n(두 지우개 한겹씩 제거)=================================\n");
		
		// (4) 왼쪽, 오른쪽 지우개 한겹 제거
		leftEraser.peel();
		rightEraser.peel();
		
		System.out.println("\n(왼쪽지우개로 칠판 지우기)================================\n");
		
		// (5) 왼쪽 지우개로 칠판 지우기
		leftEraser.eraser();
		
		System.out.println("\n(두 지우개 상태 출력)====================================\n");
		
		// (6) 두 지우개 상태 출력
		leftEraser.print();
		rightEraser.print();
		
	}

}
