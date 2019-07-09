package control.swtchstmt;

import java.util.Scanner;

/**
 * 입력된 정수에 대한 학점을 계산
 * switch 구문을 이용
 * ------------------------------------------------------------------
 * A : 90점 이상 
 * B : 80 ~ 89점 
 * C : 60 ~ 79점 
 * D : 40 ~ 59점 
 * F : 이하 나머지 
 * -------------------------------------------------------------------
 * printf 로 출력
 * @author Administrator
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;
		// 스캐너 선언 및 초기화
		Scanner scan = new Scanner(System.in);
		System.out.println("0 ~ 100 사이의 점수를 입력 : ");
		
		// 2. 초기화
		score = scan.nextInt();
		
		// 3. 사용
		switch(score / 10) {
		case 10: case 9:
			grade = 'A';
			System.out.printf("입력받은 점수 %d 의 등급은 %c 입니다.", score, grade);
			break;
		case 8:
			grade = 'B';
			System.out.printf("입력받은 점수 %d 의 등급은 %c 입니다.", score, grade);
			break;
		case 7: case 6:
			grade = 'C';
			System.out.printf("입력받은 점수 %d 의 등급은 %c 입니다.", score, grade);
			break;
		case 5: case 4:
			grade = 'D';
			System.out.printf("입력받은 점수 %d 의 등급은 %c 입니다.", score, grade);
			break;
		case 3: case 2: case 1:
			grade = 'F';
			System.out.printf("입력받은 점수 %d 의 등급은 %c 입니다.", score, grade);
			break;
			default:
				System.out.println("점수를 잘못 입력하셨습니다.");
		}
	}

}
