package array.multi;

import java.util.Scanner;

/**
 * 야구 구단의 1 ~ 5선발 선수의 방어률을 입력하고 
 * 그 중, 가장 방어율이 낮은 최고의 투수를 찾는 클래스
 * 
 * @author Administrator
 *
 */
public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] era = new double[3][5];
		double min = 10.0;
		double score;
		int people = 0;
		int team = 0;

		// 각 팀별로 각 투수의 방어률 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어률 입력");

		for (int idx = 0; idx < era.length; idx++) {

			for (int idn = 0; idn < era[idx].length; idn++) {

				System.out.println((idx + 1) + "번째 팀" + (idn + 1) + "번째 선수의 방어률은 : ");

				score = scan.nextDouble();

				if (score < min) {

					min = score;

					people = (idn + 1);
					team = (idx + 1);
				}
			}

		}
		System.out.printf("%n%d 번째 팀의 %d 번째 선수의 방어율이 %2.1f로 %n가장 낮은 방어율을 가진 최고의 피쳐이다.%n%n", team, people, min);
	}

}
