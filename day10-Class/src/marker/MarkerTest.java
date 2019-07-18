package marker;

public class MarkerTest {

	public static void main(String[] args) {
		// 1. 선언: 2개의 마커
		Marker red;
		Marker blue;
		Marker green;
		Marker black;

		// 2. 초기화
		red = new Marker("빨간색", true, true);
		blue = new Marker("파란색", false, false);
		green = new Marker("회색", true, false);
		black =  new Marker("검정색", true, false);
		// 3. 사용
		
		// 두개의 마커 상태 출력
		System.out.println("\n사용 전 두 마커의 상태 출력================================\n");
		red.print();
		blue.print();
		green.print();
		black .print();

		// 빨간색, 파란색마커 사용
		System.out.println("\n사용====================================================\n");
		red.use();
		blue.use();
		green.use();
		black.use();		
		// 사용 후 두개의 마커 상태 출력
		System.out.println("\n사용 후 두 마커의 상태 출력================================\n");
		red.print();
		blue.print();
		green.print();
		black .print();
		
	}

}
