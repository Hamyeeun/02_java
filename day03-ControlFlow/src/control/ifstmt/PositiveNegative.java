package control.ifstmt;

import java.util.Scanner;

/**
 * 하나의 정수를 입력받아서
 * 음수인지, 양수인지 판단하는 클래스
 * 
 * 단, 여기서는 0에대한 판단은 하지 않는다.
 * 
 * 입력받을 별수 input을 선언하여 Scanner 로 입력받고
 * if ~ else 구문으로 부호를 판별한 후
 * 판별 결과를 저장하는 변수 String result 에 저장하여
 * "입략값 100 은(는) 양수 입니다."
 * "입력값 -1은(는) 음수입니다."라는 문장을 출력하시오
 * @author Administrator
 *
 */
public class PositiveNegative {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		String result;
		Scanner scan; // import 필요 ctrl + shift + o
		
		// 2. 초기화
		
		scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하시오(space bar 로 분리)\n(단, 0에 대한 판단은 지원하지 않습니다) : ");
		input = scan.nextInt();
		
		// 3. 사용
		
		if(input<0) {
			result = "음수";
		}else {
			result = "양수";	
		}
		System.out.printf("입력값 %d은(는) %s 입니다.%n",input, result);
	}

}
