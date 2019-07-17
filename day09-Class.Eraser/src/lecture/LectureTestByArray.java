package lecture;
/**
 * 2개의 지우개와 4개의 마커를 
 * 배열을 사용하여 사용 / 관리 하는 테스트 클래스
 * ---------------------------------------
 * 1. 마커(Marker) 배열 markers 를 선언
 *    지우개(Eraser) 배열 erasers 를 선언
 *    
 * 2. markers 는 길이 4로 생성
 *    erasers 는 길이 2로 생성
 *    
 *  markers[0] ~ markers[3] : 순서대로 red, green, blue, black 마커를 저장
 *  
 *  erasers[0] ~ erasers[1] : 에는 순서대로 leftEraser, rightEraser 를 저장
 *  
 *  3. foreach 를 사용하여
 *  (1) 모든 마커를 한번씩 사용(use())
 *  (2) 모든 지우개를 한번씩 사용(erase())
 *  (3) 모든 지우개를 한번씩 벗겨내기(peel())
 *  (4) 모든 지우개의 상태 출력
 *  (5) 모든 마커의 상태 출력
 * @author Administrator
 *
 */
public class LectureTestByArray {

	public static void main(String[] args) {
		// 선언
		Marker[] markers = new Marker[4];
		Eraser[] erasers = new Eraser[2];


		// 마커 클래스 초기화
		markers[0] = new Marker("red", true, true);
		markers[1] = new Marker("green", true, false);
		markers[2] = new Marker("blue", true, true);
		markers[3] = new Marker("black", false, false);
		
		// 지우개 클래스 초기화
		erasers[0] = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "왼쪽");
		erasers[1] = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "오른쪽");
		
		// 마커 사용
		for(Marker mark : markers){
			mark.use();
		}
		// 지우개 사용
		for(Eraser erase : erasers){
			erase.eraser();
		}
		// 지우개 벗겨내디
		for(Eraser peelof : erasers) {
			peelof.peel();
		}
		// 지우개 상태 출력
		for(Eraser status : erasers) {
			status.print();
		}
		// 마커 상태 출력
		for(Marker status : markers) {
			status.print();
		}
	}

}
