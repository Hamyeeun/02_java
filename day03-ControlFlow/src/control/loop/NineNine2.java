package control.loop;
/**
 * 2단				3단				4단
 * 2 x 1 = 2		3 x 1 = 3		4 x 1 = 4
 * ...				...				...
 * 2 x 9 = 18		3 x 9 = 27		4 x 9 = 36
 * @author Administrator
 *
 */
public class NineNine2 {

	public static void main(String[] args) {

		int stage = 0;
		int times;

		for (stage = 2; stage <= 7; stage += 3) {

			System.out.printf("%n%d 단\t\t%d 단\t\t%d 단%n", stage, stage + 1, stage + 2);

			for (times = 1; times <= 9; times++) {

				System.out.printf("%d x %d = %2d\t%d x %d = %2d\t%d x %d = %2d%n", stage, times, (stage * times),
																				   stage + 1, times, ((stage + 1) * times), 
																				   stage + 2, times, ((stage + 2) * times));

			}
		}
		for (stage = 8; stage <= 9; stage += 3) {

			System.out.printf("%n%d 단\t\t%d 단%n", stage, stage + 1);

			for (times = 1; times <= 9; times++) {

				System.out.printf("%d x %d = %2d\t%d x %d = %2d%n", stage, times, (stage * times), 
																	stage + 1, times, ((stage + 1) * times));

			}

		}

	}

}
