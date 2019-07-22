package point;
/**
 *  x, y 좌표를 가지고 있는 수학의 점을
 *  테스트하는 클래스
 * @author Administrator
 *
 */
public class PointTest {

	public static void main(String[] args) {
		// 1. 변수선언
		Point p;
		Point q;
		
		// 2. 초기화
		p = new Point(0, 0);
		q = new Point(3, 4);
		
		// 3. 사용
		// (1) 점 p 를 출력
		System.out.println(p);
	
		// (2) 점 q 를 출력
		System.out.println(q);
	
		// (3) 두 점 사이의 거리를 계산
		System.out.printf("두 점사이의 거리 : %5.2f%n", p.distanceFrom(q));
	
	}

}
