package array.multi;
import java.util.Scanner;
/**
 * 3명의 양궁선수의 1 ~ 9차시까지 점수를 배열에 입력하고 
 * 전체 합산 점수가 가장 높은 선수의 인덱스 점수를 출력하라
 * @author juvi9
 * 
 */
public class ArcheryScore {

	public static void main(String[] args) {
		// 1. 선언 , 2. 초기화
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0;
		int winner = 0;
		int input = 0;

		// 3. 각 선수의 점수를 입력받아 배열에 저장
		System.out.println("양궁 선수 점수 입력");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.printf("%d 번째 선수%n", idx + 1);
			for (int idn = 0; idn < score[idx].length; idn++) {
				System.out.printf("%d 차시 점수 : ",idn + 1);
				input = scan.nextInt();
				score[idx][idn] = input;
				sum[idx] += input;
			}
			if (sum[idx] > max) {
				max = sum[idx];
				winner = idx;
			}
		}


		System.out.println("우승 선수 :");
		System.out.printf("%d 번째 선수 (총 점수 : %d)", winner + 1, max);
//		System.out.println("score : " + score[winner]);
	}

}