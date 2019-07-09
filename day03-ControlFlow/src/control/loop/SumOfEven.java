package control.loop;

public class SumOfEven {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int num = 0;
		int sum = 0;

		// 3. 사용 : while 문 사용
		while (num <= 100) {
//			sum += num;
//			num += 2;

			if (num % 2 == 0) {
				sum += num;
			}
			num++;
		}

		// 4. 출력
		System.out.printf("1부터 100 사이의 짝수의 합은 %d 입니다.%n", sum);
	}

}
