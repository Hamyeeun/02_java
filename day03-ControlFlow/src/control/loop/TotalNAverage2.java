package control.loop;

import java.util.Scanner;

public class TotalNAverage2 {

	public static void main(String[] args) {
		int total = 0;
		int score = 0;
		int count = 0;
		double average;
		
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("점수를 입력(끝내려면 0 입력): ");
		
//		while(score != 0) {
//			total += score;
//			count ++;
//			System.out.println("다음 점수를 입력해 주세요: ");
//			score = scan.nextInt();
//		}
		do {
			total += score;
			score = scan.nextInt();
			count++;
			System.out.println("다음 점수를 입력해 주세요: ");
			
		}while(score != 0);
		
		if(count == 0) {
			System.out.println("입력된 값이 없습니다.");
		}else {
			average = (double)total / count; //입력 라인;
			System.out.printf("총점 : %d%n",total);
			System.out.printf("평균 : %5.2f%n",average);
		}
		
	}

}
