package control.loop;
/**
 * 구구단 중첩 for loop를 사용해서 출력
 * 곱셈의 결과가 50을 넘으면 중단하도록
 * break; 구문과 for 를 조합하여 테스트
 * ------------------------------------
 * break : 가장 가까운 반복문을 빠져나가는 역할
 * 		   또는 switch 문을 빠져나가는 역할
 * 
 * @author Administrator
 *
 */
public class NineNineBreak {

	public static void main(String[] args) {
		for (int stage = 2; stage < 10; stage++) {

			System.out.printf("%n%d 단%n", stage);

			for (int times = 1; times < 10; times++) {

				if ((stage * times) > 50) {
					break;
				}

				System.out.printf("%d x %d = %2d%n", stage, times, (stage * times));
			}
		}

		System.out.println("==========================================");
		System.out.println("=== 레이블과 함께 쓰는 break ===");

		OUT: for (int stage = 2; stage < 10; stage++) {

			System.out.printf("%n%d 단%n", stage);

			IN: for (int times = 1; times < 10; times++) {

				if ((stage * times) > 50) {
					break OUT;
				}

				System.out.printf("%d x %d = %2d%n", stage, times, (stage * times));
			}
		}

	}
}