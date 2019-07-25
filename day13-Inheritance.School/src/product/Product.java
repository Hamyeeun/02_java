package product;
/**
 * 전자제품을 판매하는 매장에서
 * 관리하는 대상인 "제품"을  정의하는 클래스
 * --------------------------------
 * 멤버변수(private, protected 붙이지 x)
 * 제품번호 : pcode    : String : <== "P001"
 * 제품 명   : pname    : String : <== "삼성 지펠..."
 * 가격       : price    : int    : 진짜 그 제품의 가격
 * 재고수량 : quantity : int
 * --------------------------------------------
 * 생성자(public 으로 선언)
 * 기본생성자, 매개변수 받는 생성자 필드 1씩 늘려가며
 * this, this() 사용
 * --------------------------------------------
 * 메소드(public 으로 선언)
 * print() : void
 *    => 제품의 상태를 출력
 * toString() : String
 *    => 이 제품을 대표하는 문자열을 리턴
 *    => String.format() 으로 문자열 생성후 리턴
 * discount(double percentage) : int
 *    => 입력된 퍼센트 만큼 할인돈 가격을 리턴
 *    
 * sell(int amount) : void
 *    => 매장에서 판매(출고)되어
 *    => 재고수량(quantity)이 amount 만큼 줄어들도록 반영
 *    => 재고수량이 0보다 작아질 수 없도록 제한
 *    => 판매하려는 수량(amount)가 재고보다 클 수 없도록 처리
 *    
 * buy(int amount) : void
 *    => 매장에 입고되어 재고수량(quantity)이
 *    => amount 만큼 늘어나도록 반영 
 * ===================================================
 * 작성시 주의할 것
 * 
 * 각 필드를 선언할 때, 필드에 대한 설명을 문서주석으로 남기시오
 * 
 * 각 생성자 선언할 때, 문서주석 달 것
 * 
 * 각 메소드 선언할 때, 메소드 설명을 문서 주석으로 달 것
 * 
 * 테스트는 아직 작성하지 말것
 *     
 * @author Administrator
 *
 */
public class Product {
	
	// 1. 멤버변수 선언
	/** 제품번호 */
	String pcode;
	/** 제품 명 */
	String pname;
	/** 제품 가격 */
	int price;
	/** 제품 재고 수량 */
	int quantity;
	
	// 2. 생성자
	/**
	 * 기본 생성자
	 */
	public Product(){
		
	}
	
	/**
	 * Product 클래스의 pcode 멤버변수만 초기화
	 * @param pcode
	 */
	public Product(String pcode) {
		this();
		this.pcode = pcode;
	}
	
	/**
	 * Product 클래스의 pcode, pname을 초기화
	 * @param pcode
	 * @param pname
	 */
	public Product(String pcode, String pname) {
		this(pcode);
		this.pname = pname;
	}
	
	/**
	 * Product 클래스의 pcode, pname, price 초기화
	 * @param pcode
	 * @param pname
	 * @param price
	 */
	public Product(String pcode, String pname, int price) {
		this(pcode, pname);
		this.price = price;
	}
	
	/**
	 * Product 클래스의 모든 멤버 변수를 초기화
	 * @param pcode
	 * @param pname
	 * @param price
	 * @param quantity
	 */
	public Product(String pcode, String pname, int price, int quantity) {
		this(pcode, pname, price);
		this.quantity = quantity;
	}
	
	// 3. 메소드
	/**
	 * toString() 메소드정의
	 * 
	 */
	@Override
	public String toString(){
		return String.format("제품 코드 : %s, 제품 명 : %s, 가격: %d, 재고량 : %d", pcode, pname, price, quantity);
	}
	
	/**
	 * 이 제품의 모든 정보를 프린트하는 메소드이다.
	 */
	public void print() {
		System.out.println(this);
	}
	
	/**
	 * discount(double percentage) : int
	 *    => 입력된 퍼센트 만큼 할인돈 가격을 리턴
	 * @param percentage
	 * @return
	 */
	public int discount(double percentage) {
		return price - (int)((double)price * percentage);
	}
	
	/**
	 * sell(int amount) : void
	 *    => 매장에서 판매(출고)되어
	 *    => 재고수량(quantity)이 amount 만큼 줄어들도록 반영
	 *    => 재고수량이 0보다 작아질 수 없도록 제한
	 * @param amount
	 */
	public void sell(int amount) {
		if (quantity >= amount) {
			quantity -= amount;
			System.out.printf("남은 재고수량 : %d%n", quantity);
		}else {		
			System.out.println("재고수량이 없습니다.\n");
		}
	}
	
	/**
	 * buy(int amount) : void
	 *    => 매장에 입고되어 재고수량(quantity)이
	 *    => amount 만큼 늘어나도록 반영 
	 * @param amount
	 */
	public void buy(int amount) {
		quantity += amount;
		System.out.printf("남은 재고수량 : %d%n", quantity);
	}
	
	// 4. 접근자, 수정자
	/**
	 * pcode의 접근자
	 * @return
	 */
	public String getPcode() {
		return pcode;
	}
	
	/**
	 * pcode의 수정자
	 * @param pcode
	 */
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	
	/**
	 * pname의 접근자
	 * @return
	 */
	public String getPname() {
		return pname;
	}
	
	/**
	 * pname의 수정자
	 * @param pname
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	/**
	 * price의 접근자
	 * @return
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * price의 수정자
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * quantity의 접근자
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * quantity의 수정자
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
