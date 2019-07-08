package operator.binary;
/**
 *  비트 연상을 수행하는 연산자를 테스트
 *  & |, ^ : 비트연산자. 논리 연산자가 아님 주의
 *  		 이항연산자
 *  
 *  ~      : 비트연산자 : 각 비트를  0 -> 1, 1 -> 0으로 변경
 *  		 단항연산자
 *  
 * @author Administrator
 *
 */
public class BitWise {
	public static void main(String[]args) {
		// 1. 변수선언, 2. 초기화
		int a = 0x1f05;
		int b = 0x31a1;
		
		// 3. ptintf 로 16진수 바로 출력
		System.out.printf("%x & %x = %x%n",a ,b ,(a & b));
		System.out.printf("%x | %x = %x%n",a ,b ,(a | b));
		System.out.printf("%x ^ %x = %x%n",a ,b ,(a ^ b));
		System.out.printf("%x = %x%n",a , ~a);
	}
}
