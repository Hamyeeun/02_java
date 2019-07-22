package point;
/**
 * 
 * @author Administrator
 *
 */
public class PointTest2 {

	public static void main(String[] args) {
		//Point 배열 선언, 초기화
		Point[] points = {new Point(10,1)
				        , new Point(3, 4)
				        , new NamedPoint("O", 0, 0)};
		
		
		// 사용
		for (Point point : points) {
			System.out.println(point);

			// 위의 실행코드는 아랫쪽의 point.toString()을
			// 호출한 내용과 같다.
//			System.out.println(point.toString());

			// 그러나 단순point 를 출력해도 같은 결과를 받는 이유
			// 1. toString() 메소드는 print() 계열 메소드에서
			//    객체 참조변수를 출력할 때, 자동으로 작동하는
			//    특징을 가지고 있다.
			// 2. toString() 은 Object 에서부터 물려받은 메소드로
			//    모든 서브클레스들이 가지고 있으며
			//    재정의 된 경우에는 해당 인스턴스 타입에 맞추어
			//    부모클래스에 정의된 메소드로 호출을 해도
			//    인스턴스 타입의 재정의된 메소드가 자동으로 응답
			//    => 가상 메소드 호출(virtual method invocation)
		}
		
		// 다음 점과의 거리를 구해서 출력
		for(int idx = 0; idx < points.length - 1; idx++) {
			System.out.printf("두 점, points[%d], points[%d] 사이의 거리: %5.2f%n"
					, idx
					, idx + 1
					, points[idx].distanceFrom(points[idx+1]));
			System.out.printf("두 점 %s, %s 사이의 거리: %5.2f%n"
					, points[idx].toString()
					, points[idx + 1].toString()
					, points[idx].distanceFrom(points[idx+1]));
		}
	}

}
