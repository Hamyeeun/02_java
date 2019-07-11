package array.basic;
/**
 * 자바 1.5 버전부터 지원되는
 * 향상된 for 반복문의 기능
 * -----------------------------
 * 데이터 구조와 함께 사용한다.
 * 
 * 데이터 구조 : 1. 배열 (Array)
 * 				 2. 리스트 (list)
 * 				 3. 맵 (Map)
 * 				 4. 셋 (Set)
 * ------------------------------
 * 
 * @author Administrator
 *
 */
public class ForEachTest {

	public static void main(String[] args) {
		// 1. 배열의 선언(과 동시에 값을 넣으면서 2. 초기화)
		int[] numbers = { 1, 2, 3, 4, 5 }; // length : 5 (0 ~ 4)
		int sum = 0;

		// 3. foreach 구문으로 배열 값 출력
		// for (원소의타입 변수이름 : 자료구조(==배열)){
		// 문장들...;
		// }
		for (int num : numbers) {
			sum += num;
			System.out.println("num=" + num);
		}

		// 합산 출력
		System.out.println("\nsum=" + sum);

		System.out.println("\n초기화 값을 100 ~ 500(100단위) 으로 변환 후 출력============================================\n");
		// 5. 새 값 저장
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = (idx + 1) * 100;
		}

		// 6. foreach 구문으로 출력
		for (int num : numbers) {
			System.out.println("num : " + num);
		}

	}

}
