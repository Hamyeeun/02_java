package control.ifstmt;

import java.util.Scanner;

/**
 * 입력된 세 정수 중 가장 큰 값을 판별하는 클래스 입력값은 int num1, num2, num3; 변수에 저장 가장 큰 값은 max라는
 * 변수에 저장
 * 
 * 중첩 if ~ else if 로 판단 마지막 출력 printf 출력
 * 
 *
 * @author Administrator
 *
 */
public class MaxOfThree {

	public static void main(String[] args) {
		// 1. 선언
		int num1;
		int num2;
		int num3;
		int max;
		Scanner scan;

		// 2. 초기화
		scan = new Scanner(System.in);

		// 정수 입력 안내 prompot
		System.out.println("세 정수를 입력하세요(spacebar로 분리) : ");

		// 입력값 저장
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		// 3. 사용, max값 초기화
		if (num1 > num2) {
			// num1 이 클 때 진입
			if (num1 > num3) {
				// num1 이 클 때 진입
				max = num1;
			} else {
				// num3 이 클 때 진입
				max = num3;
			} // if end
		} else {
			// num2 가 클 때 진입
			if (num2 > num3) {
				// num2 가 클 때 진입
				max = num2;
			} else {
				// num3 이 클 때 진입
				max = num3;
			}
		} // else end
		System.out.printf("입력받은 세 정수 %d, %d, %d 중 " + "가장 큰 값은 %d 입니다.%n", num1, num2, num3, max);
	}

}
