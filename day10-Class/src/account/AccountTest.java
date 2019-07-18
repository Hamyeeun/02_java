package account;
/**
 * 계좌(Account 타입) 클래스의
 * 인스턴스(객체, 실체)를 생성하고
 * 
 * 이 때, 중복정의된 생성자를 사용해서
 * 실체화를 진행하며
 * 그렇게 생성된 객체에 테스트하는 클래스
 * @author Administrator
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		// 1. 선언
		Account myAccount;
		Account yourAccount;
		Account hisAccount;
		// 2. 초기화
		// (1) 계좌번호가 자동 부여되는 생성자로 초기화
		myAccount = new Account(1000);
		// (2) 매개변수를 받는 중복정의된 생성자로 초기화
		yourAccount = new Account(10000);
		
		hisAccount = new Account(30000);
		// 3. 사용
		//(1) 계좌 생성되자마자 초기 상태 출력
		System.out.println("계좌 생성되자마자 초기 상태");
		myAccount.print();
		yourAccount.print();
		hisAccount.print();
		
		System.out.println("=========================");
		
		// (2) 입금 : 1000원 : 두계좌 모두
		System.out.println("입금 : 1000원");
		myAccount.deposit(1000);
		yourAccount.deposit(1000);
		hisAccount.deposit(1000);
		
		System.out.println("=========================");
		
		// (3) 출력 : 두계좌 모두
		System.out.println("조회");
		myAccount.print();
		yourAccount.print();
		hisAccount.print();
		
		System.out.println("=========================");
		
		// (4) 입금 : 5000원
		System.out.println("입금 : 5000원");
		myAccount.deposit(5000);
		yourAccount.deposit(5000);
		hisAccount.deposit(5000);
		
		System.out.println("=========================");
		
		// (5) 출력 : 두계좌 모두
		System.out.println("조회");
		myAccount.print();
		yourAccount.print();
		hisAccount.print();
		
		System.out.println("=========================");
		
		// (6) 출금 : 4000원
		System.out.println("출금 : 4000원");
		String result1 = myAccount.withdraw(4000);
		String result2 = yourAccount.withdraw(4000);
		String result3 = hisAccount.withdraw(4000);
		System.out.printf("myAccount잔액:%s%n", result1);
		System.out.printf("yourAccount잔액:%s%n", result2);
		System.out.printf("hisAccount잔액:%s%n", result3);
		
		System.out.println("=========================");
		
		// (7) 출력 : 두계좌 모두
		System.out.println("조회");
		myAccount.print();
		yourAccount.print();
		hisAccount.print();
	}

}
