package snack;
/**
 * Oreo 쿠키가 3 개 들어있는 oreoBox 라는 변수를
 * Oreo 배열 타입으로 선언하고,
 * 
 * oreoBox[0] ~ [2] Oreo 쿠키를 입력
 * 크림의 종류는 바닐라, 초코, 딸기, 말차 중 하나로 입력할 것
 * 
 * foreach를 사용해서
 * oreoBox에서 모든 쿠키의 상태를 출력
 * 
 * for를 사용하여 모든 쿠키의 크림을 바닐라로 변경
 * 
 * foreach 사용해서 모든 쿠키의 크림 변경 상태 확인을 위한 출력
 * @author Administrator
 *
 */
public class OreoTest {

	public static void main(String[] args) {
		// 1. 선언
		// Oreo 배열 선언
		Oreo[] oreoBox;
		
		// 2. 초기화
		// 배열 초기화
		oreoBox = new Oreo[3];
		
		oreoBox[0] = new Oreo("딸기", 5.1, 3.0);
		oreoBox[1] = new Oreo("말차", 5.1, 3.0);
		oreoBox[2] = new Oreo("바닐라", 5.1, 3.0);
		
		// 모든 쿠키의 상태 출력
		for (Oreo status : oreoBox) {
			status.print();
		}
		
		System.out.println("===========크림 변경 후=============");
		
		// 모든 쿠키 바닐라 맛으로 변경
		for(int idx = 0; idx < oreoBox.length; idx++) {
			oreoBox[idx] = new Oreo("바닐라", 5.1, 3.0);
		}
		
		// 맛 변경 후 모든 쿠키의 상태 출력 
		for (Oreo status : oreoBox) {
			status.print();
		}
	}

}
