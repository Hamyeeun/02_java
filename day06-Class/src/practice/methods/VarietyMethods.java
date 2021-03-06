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
	public double fhaToCel(double fah) {
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
	// 1번
	public void birthYearMonth(String name, int year, int month) {
		// 생년월일 출력문
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
	// 2번
	public void printNineNineTable(int stage) {
		// 입력 설명문 출력
		System.out.println("출력하고 싶은 단을 입력해 주세요 :");
		// Scanner 사용시
		//Scanner scan = new Scanner(System.in);
		//stage = scan.nextInt();
		//입력받은것이 무슨 단인지 출력
		System.out.printf("%d단%n",stage);
		//입력받은 단에 대한 구구단을 출력
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
	// 3번
//	public void printNineNineTableArray(int[] stage) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("원하는 단을 입력해 주세요");
//		for (int idx = 0; idx < 10; idx++) {
//			
//		}
//	}
	
	
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
	// 4번
	public String calcBmi (double height, double weight) {
		// 필요 변수 추가 선언
		String bmi1;
		double bmi2;
		// Scanner 선언, 초기화
		Scanner scan = new Scanner(System.in);
		// Scanner 입력 안내
		System.out.println("당신의 몸무게와 키를 입력하세요");
		// weight, height ==> Scanner 로 초기화
		weight = scan.nextDouble();
		height = scan.nextDouble();
		// bmi 기준 공식 작성
		bmi2 = weight / ((height * height)/10000);
		// 범위 설정 후 초기화
		if(bmi2 > 40.0) {
			bmi1 = "병적인 비만";
		}else if(bmi2 > 27.5 && bmi2 <= 40.0) {
			bmi1 = "비만";
		}else if(bmi2 >= 23.0 && bmi2 <= 27.5) {
			bmi1 = "과체중";
		}else if(bmi2 >= 18.5 && bmi2 < 23.0) {
			bmi1 = "정상";
		}else if(bmi2 >= 15.0 && bmi2 < 18.5) {
			bmi1 = "저체중";
		}else{
			bmi1 = "병적인 저체중";
		}
		// 리턴값 
		return bmi1;
	}
	
	/**
	 * 입력된 두 정수 중에서 작은 수를 찾아 리턴하는 메소드
	 * min 을 정의하시오
	 * @param input1
	 * @param input2
	 * @return int 둘 중 작은 정수
	 */
	// 5번
	public int min (int input1, int input2) {
		// 최솟값 변수선언
		int small;
		// Scanner 변수 선언
		Scanner scan = new Scanner(System.in);
		// 입력 안내문
		System.out.println("정수 2개를 입력하세요");
		// input1, input2 Scanner로 초기화
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		// 언떤 변수가 작은지 비교
		if (input1 > input2) {
			small = input2;
		}else {
			small = input1;
		}
		// 리턴값 : 작은 값
		return small;
	}
	
	/**
	 * 입력된 두 정수 중에서 큰 수를 찾아 리턴하는 메소드
	 * max 를 정의하시오
	 * @param input1 : int
	 * @param input2 : int
	 * @return int 둘 중 큰 정수
	 */
	// 6번
	public int max (int input1, int input2) {
		// 큰 변수 선언
		int max;
		// Scanner 변수 선언, 초기화
		Scanner scan = new Scanner(System.in);
		// 입력 안내문
		System.out.println("정수 2개를 입력하세요");
		// input1, input2 Scanner로 초기화
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		// 큰 변수 무엇인지 비교 및 max 변수 초기화
		if (input1 > input2) {
			max = input1;
		}else {
			max = input2;
		}
		// 리턴 max값
		return max;
	}

	
	/**
	 * 정수가 저장된 int 배열을 매개변수로 입력받아
	 * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드
	 * sumOfArray 를 디자인
	 * @param numbers : int[] (int 배열)
	 * @return int[] 배열의 각 원소의 합
	 */
	// 7번
//	public int sumOfArray (int[] numbers) {
//		
//	}
	
	
	/**
	 * 정수가 저장된 int 배열을 매개변수로 입력받아
	 * 그 배열의 각 원소들의 평균을 구하여 리턴하는 메소드
	 * avgOfArray 를 디자인
	 * @param numbers : int[] (int 배열)
	 * @return int[] 배열의 각 원소의 평균 
	 */
	// 8번
	public double avgOfArray(int[] numbers) {
		// 1. 배열원소의 총합
		// (1) 총합 변수 선언, 초기화
		int sum = 0;
		// (2) 평균 변수 선언, 초기화
		double average;
		// (3) 배열의 원소의 합을 구함 ==> foreach
		for(int num : numbers) {
			sum+=num;
		}
		// 2. 총함/ 원소의 갯수 ==> 평균
		average = (double)sum /numbers.length;
		return average;
	}
	
	
	
	
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
	// 9번
	public void adder (char op, int x, int y) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하여 값을 구해보세요(plus연산만 가능)");
		op = scan.next().charAt(0);
		switch (op) {
		case '+':
			System.out.printf("%d + %d = %d입니다.", x, y, (x + y));
		}
	}



}