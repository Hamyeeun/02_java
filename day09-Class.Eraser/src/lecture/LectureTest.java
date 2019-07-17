package lecture;


/**
 * 마커(Marker)와 지우개(Eraser)를 사용하여
 * 마커를 쓰고 
 * 지우개로 지워보는 테스트 클래스
 * @author Administrator
 *
 */
public class LectureTest {

	public static void main(String[] args) {
		// 1. 선언 : 칠판 지우개 객체 참조 변수
		Eraser leftEraser;
		Eraser rightEraser;
	
		// 1. 선언: 2개의 마커
		Marker red;
		Marker blue;
		Marker green;
		Marker black;

		// 2. 초기화
		leftEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "왼쪽");
		rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "오른쪽");
		// 2. 초기화
		red = new Marker("빨간색", true, true);
		blue = new Marker("파란색", false, false);
		green = new Marker("회색", true, false);
		black =  new Marker("검정색", true, false);
		
		// 3. 사용
		// (1) 네 개의 마커를 한번 씩 사용
		red.print();
		red.use();
		red.print();
		
		System.out.println("===================");
		
		blue.use();
		green.use();
		black.use();
			
		// (2) 오른쪽, 왼쪽 지우개로 사용한 내용 지우기
		rightEraser.eraser();
		leftEraser.eraser();
		
		// (3) 오른쪽 지우개 한겹 벗겨내기
		rightEraser.peel();
		
		// (4) 오른쪽, 왼쪽 지우개 상태 출력
		rightEraser.print();
		leftEraser.print();
				
	}

}
