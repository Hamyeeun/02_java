package practice.methods;

import java.util.Scanner;

/**
 * 메소드 작성 실습 클래스
 * 
 * @author HannaC
 *
 */
public class VarietyMethods {
	
	/**
	 * 화면에 hello, world! 를 출력하는 메소드
	 */
	public void sayHello() {
		System.out.println("hello, world!");
	}
	
	/**
	 * 매개변수로 
	 * 유명인(명사) 의 이름을 입력(name) 받고
	 * 그 사람이 한 유명한 문구(maxim)를 입력 받아
	 * 
	 * OOO(이)가 말하길 "....." 라고 하였다.
	 * 라는 문장을 출력하는 메소드
	 * maxims 를 정의하라
	 */
	public void maxims(String name, String maxim) {
		System.out.printf("%s (이)가 말하길%n"
				         + "\"%s\" 라고 하였다.%n"
				          , name, maxim);
	}

	
	/**
	 * 입력된 화씨온도를 섭씨온도로 변환하여 
	 * 변환된 섭씨온도를 리턴하는 메소드
	 * fahToCel 을 디자인
	 * 
	 * 변환 공식 : 5 / 9 * (F - 32)
	 * 
	 * @param fah : double : 변환할 화씨 온도 값
	 * @return 변환된 섭씨 온도 값
	 */
	public double fahToCel(double fah) {
		return 5.0 / 9.0 * (fah - 32);
	}
	
	
	// =========================================================
	/**
	 * 어떤 사람의 이름, 생년, 출생월을 매개변수로 입력받아
	 * 
	 * OOO는 XXXX년 XX월 생입니다.
	 * 
	 * 라는 문장으로 출력하는  
	 * birthYearMonth 라는 메소드를 정의하시오. 
	 * @param name : String
	 * @param year : int
	 * @param month : int
	 */
	public void birthYearMonth(String name, int year, int month) {
		System.out.printf("%s는 %d년 %d월 생입니다.%n",name, year, month);
	}

	
	
	/**
	 * 출력할 단의 숫자를 입력받아
	 * 해당 단의 구구단을 출력하는 메소드
	 * 
	 * 출력의 첫 줄에 X 단 이라는 제목을 출력
	 * 
	 * printNineNineTable 을 디자인
	 * @param stage : int
	 */
	public void printNineNineTable(int stage) {
		System.out.println("출력하고 싶은 단을 입력해 주세요 :");
		//Scanner scan = new Scanner(System.in);
		//stage = scan.nextInt();
		System.out.printf("%d단%n",stage);
		for (int idx = 1; idx < 10; idx++) {
			System.out.printf("%d x %d = %d%n", stage, idx, stage * idx);
		}
	}
	
	
	/**
	 * 출력할 단의 숫자를 가지고 있는 int 배열을 
	 * 매개변수로 입력받아
	 * 입력된 배열의 원소인 각 숫자에 대해
	 * 구구단을 출력하는 메소드
	 * printNineNineTableArray 를 정의하시오.
	 * @param stages : int[] 배열
	 */
	public void printNineNineTableArray(int[] stage) {
		
	}
	
	
	/**
	 * 키(cm), 몸무게(kg)을 매개변수로 입력받아
	 * BMI 지수를 계산하여 비만도 판정 결과를 리턴하는 메소드
	 * calcBmi 를 정의하시오
	 * 
	 *   몸무게(kg) / 키(m)의 제곱
	 *    
	 *   15.0미만               병적인 저체중
	 *   15.0이상 18.5미만      저체중
	 *   18.5이상 23.0미만      정상
	 *   23.0이상 27.5이하      과체중
	 *   27.5초과 40.0이하      비만
	 *   40.0초과               병적인 비만
	 * 
	 * @param height : double
	 * @param weight : double
	 * @return String 비만도 판정 결과 문자열
	 */
	
	/**
	 * 입력된 두 정수 중에서 작은 수를 찾아 리턴하는 메소드
	 * min 을 정의하시오
	 * @param input1
	 * @param input2
	 * @return int 둘 중 작은 정수
	 */

	
	/**
	 * 입력된 두 정수 중에서 큰 수를 찾아 리턴하는 메소드
	 * max 를 정의하시오
	 * @param input1 : int
	 * @param input2 : int
	 * @return int 둘 중 큰 정수
	 */

	
	/**
	 * 정수가 저장된 int 배열을 매개변수로 입력받아
	 * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드
	 * sumOfArray 를 디자인
	 * @param numbers : int[] (int 배열)
	 * @return int[] 배열의 각 원소의 합
	 */
	
	
	
	/**
	 * 정수가 저장된 int 배열을 매개변수로 입력받아
	 * 그 배열의 각 원소들의 평균을 구하여 리턴하는 메소드
	 * avgOfArray 를 디자인
	 * @param numbers : int[] (int 배열)
	 * @return int[] 배열의 각 원소의 평균 
	 */
	
	
	
	
	/**
	 * char 타입의 연산자와 두 개의 정수를 
	 * 매개변수로 입력받아
	 * 
	 * 입력된 연산자가 '+' 일 때만
	 * 두 정수의 합을 구하여 덧셈의 결과를 
	 * 
	 * 출력하는 메소드 adder 를 디자인
	 * 출력 형태 예) 10 + 20 = 30
	 * @param op : char
	 * @param x : int
	 * @param y : int
	 */	



}