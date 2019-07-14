package array.multi;

public class MultiDarray {

	public static void main(String[] args) {
		// 1. 선언
		char[][] stars;

		// 2. 초기화
		stars = new char[6][];

		// 3. 배열에 별 넣기
		for (int idx = 0; idx < stars.length; idx++) {
			stars[idx] = new char[idx + 1];
			for (int ind = 0; ind < stars[idx].length; ind++) {
				stars[idx][ind] = '★';
			}
		}

		// 4. 별 출력 
		for (int idx = 0; idx < stars.length; idx++) {
			for (int ind = 0; ind < stars[idx].length; ind++) {
				System.out.printf("%c", stars[idx][ind]);
			}
			System.out.println();
		}

	}

}