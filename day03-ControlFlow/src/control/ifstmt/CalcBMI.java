package control.ifstmt;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */
public class CalcBMI {

	public static void main(String[] args) {
		// 1. 선언
		double weight, hight;
		String bmi1;
		double bmi2;
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("당신의 몸무게와 키를 입력하세요(spacebar로 분리) : ");
		weight = scan.nextDouble();
		hight = scan.nextDouble();
		bmi2 = weight / ((hight * hight)/10000);
		
		// 3. 사용
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
		System.out.printf("당신의 체중은 %f 이고, 키는 %f입니다.%n 당신의 BMI은 %f입니다.(%s 입니다.)%n ", weight, hight, bmi2, bmi1);
	}

}
