package practice.methods;
/**
 * Variety Methods를 테스트하는 클래스
 * @author juvi9
 *
 */
public class PracticeMethods {

	public static void main(String[] args) {
		// 1. 메소드 정의 클래스 VarietyMethods 의
		// 변수 선언
		VarietyMethods methods;

		// 2. 초기화
		methods = new VarietyMethods();

		// 3. 사용
		methods.sayHello();
		methods.maxims("홍길동", "호부호형을 못하니..");
		methods.maxims("소크라테스", "Know Yourself");
		methods.maxims("피터사간", "모든 사람은" + "두 종류의 고통 중에서 선택해야 한다." + "훈련하는 고통이나 후회하는 고통");

		double cel = methods.fhaToCel(100.0);
		System.out.println("cel="+cel);
		
		// 1. birthYearMonth를 테스트
		VarietyMethods mhd = new VarietyMethods();
		mhd.birthYearMonth("함예은", 1998, 03);

		// 2. printNineNineTable 테스트
		VarietyMethods nineninetable = new VarietyMethods();
		nineninetable.printNineNineTable(12);

		// 3. printNineNineTableArray 테스트
		
		// 8.avgOfArray 테스트
		// 1. 매개변수로 넘길 배열 생성
		int[] ages = {12, 15, 10, 18, 17};
		
		// 2. 테스트할 메소드 call 하며 1의 배열을 전달
		double avgOfAges = methods.avgOfArray(ages);
		
		//3. 평균이 저장된 변수를 출력
		System.out.printf("avgOfAges=%3.1f%n",avgOfAges);

	}

}
