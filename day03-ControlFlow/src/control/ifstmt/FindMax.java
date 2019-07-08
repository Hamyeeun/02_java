package control.ifstmt;

import java.util.Scanner;

/**
 * 두 정수 중 큰 값을 가려내는 클래스
 * 두 정수는 Scanner로 입력받는다.
 * 
 * @author Administrator
 *
 */
public class FindMax {

	public static void main(String[] args) {
		// 1. 변수 선언
		int a;
		int b;
		int max = 0;
		
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하시오(spacebar로 분리) : ");
		
		a = scan.nextInt();
		b = scan.nextInt();
		

		// 3. 사용
		if(a > b) {
			max = a;
			System.out.printf("입력된 두 값 a = %d, b = %d 중 큰 값은 %d%n",a ,b ,max );
		}
		if(b > a) {
			max = b;
			System.out.printf("입력된 두 값 a = %d, b = %d 중 큰 값은 %d%n",a ,b ,max );
		}
		if(a == b) {
			System.out.printf("입력된 두 값 a = %d, b = %d는 동일한 값입니다.",a ,b );
		}
		
	}
}
