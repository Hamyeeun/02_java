package control.loop;

/**
 * while 문을 이용하여 1 ~ 100 사이의 홀수의 합을 구하는 클래스
 * 
 * @author Administrator
 *
 */
public class SumOfOdds {

	public static void main(String[] args) {
		// 1. 선, 2. 초기화
		int num = 1;
		int sum = 0;

		// 3. 사용 : while 문 사용
		while (num <= 100) {
//			sum += num;
//			num += 2;
			if (num % 2 != 0) {
				sum += num;
			}
			num++;
		}

		// 4. 출력
		System.out.printf("1부터 100 사이의 홀수의 합은 %d 입니다.%n", sum);
	}

}
