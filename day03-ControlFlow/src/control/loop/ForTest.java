package control.loop;
/**
 * 1. 50 ~ 0 까지 짝수만 역순으로 출력
 *    (1) continue 없이
 *    (2) continue 사용
 * -----------------------------------------
 * 2. 1 ~ 10 까지 제곱표를 출력
 *    1 x 1 = 	1 
 *    2 x 2 = 	4
 *    ...
 *    10 x 10 = 100
 * @author Administrator
 *
 */
public class ForTest {

	public static void main(String[] args) {
		// 1번 문제
		System.out.println("(1-1)번==================================================================");
		for (int idx = 50; idx > 0; idx--) {
			if(idx % 2 != 0) {
				;
			}else {
				System.out.printf("50 ~ 0 까지 짝수만 출력 : %d%n", idx);
			}
		}
		
		System.out.println("(1-2)번==================================================================");
		
		for (int idx = 50; idx > 0; idx--) {
			if(idx % 2 != 0) {
				continue;
			}
				System.out.printf("50 ~ 0 까지 짝수만 출력 : %d%n", idx);
		}
		
		System.out.println("(2)번==================================================================");
		// 2번 문제
		
		System.out.println("1 ~ 10 까지의 제곱표");

		for(int stage = 1; stage <= 10; stage++) {
			for(int table = stage; table <= stage; table++) {
				System.out.printf("%2d x %2d =%4d\n", stage, table, (stage * table));
			}
		}
	}

}
