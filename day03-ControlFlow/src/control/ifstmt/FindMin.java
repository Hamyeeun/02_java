package control.ifstmt;

import java.util.Scanner;

/**
 * 두 정수 중 작은 값을 가려내는 클래스
 * 두 정수는 Scanner로 입력받는다.
 * @author Administrator
 *
 */
public class FindMin {

	public static void main(String[] args) {
		// 1. 변수 선언 : 입력받을 변수, 작은값을 저장할 변수
		int x;
		int y;
		int min = 0;
		
		Scanner scan; // ctrl + shift + o
		
		// 2. 초기화
		scan = new Scanner(System.in);
		
		// 입력을 알리는 안내 메시지
		
		System.out.println("두 정수를 입력하세요(spacebar로 분리) : ");
		// 스캐너 사용한 정수 입력(초기화)
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 3. 사용 : 입력된 두 값을 비교(if)
		if(x < y) { 
			min = x;
		}
		
		if(y < x) {
			min = y;	
		}
		
		System.out.printf("입력된 두 값 x = %d, y = %d 중 작은 값은 %d입니다 %n",x ,y ,min);
		}
		
}

