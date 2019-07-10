package control.loop;

public class WhileTest {

	public static void main(String[] args) {
		
		// 1번 문제
		System.out.println("(1)번===========================================================");

		int idx = 50;

		while (idx > 0) {

			if (idx % 2 == 0) {

				System.out.printf("50 ~ 0 까지 짝수만 출력 : %d%n", idx);

			}

			idx--;
		}

		// 2번 문제
		System.out.println("(2)번============================================================");

		System.out.println("1 ~ 10 까지의 제곱표");

		int stage = 1;
		int table = stage;

		while (stage <= 10) {

			while (table <= stage) {

				System.out.printf("%2d x %2d =%4d\n", stage, table, (stage * table));

				table++;

			}

			stage++;

		}
	}

}
