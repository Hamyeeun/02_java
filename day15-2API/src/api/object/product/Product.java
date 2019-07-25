package api.object.product;
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
	/** 제품 코드 */
	private String pcode;
	/** 제품 명 */
	private String pname;
	/** 제품 가격 */
	private int price;
	/** 재고 수량 */
	private int quantity;
	
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
	
	/* ----------------------------------------------------------------
	 * 캡슐화를 적용하여 멤버변수 필드의 가시성이
	 * private으로 조정이 되면 다른 모든 클래스에서 
	 * 접근이 불가능해짐
	 * 따라서 숨겨진 필드에 접근할 수 있는 전용 메소드 쌍을
	 * 정의해야 한다. ==> 접근자/수정자 메소드
	 * ==============================================================
	 * 접근자 메소드 : getter
	 * --------------------------------------------------------------
	 * 1. get 으로 시작
	 * 2. get 뒤에 오는 이름은 접근하려는 멤버변수 이름의
	 *    첫글자만 대문자로 하는 낙타표기법(camel-notation) 적용
	 * 3. 메소드 매개변수는 없어야 한다.
	 * 4. 메소드 리턴타입은 접근하려는 멤버변수의 타입과 맞춘다.
	 * 5. 멤버변수 타입이 boolean 인 경우
	 *    get이 아닌 is 로 시작하도록 작성
	 * 6. getXx(), isXxx() 형태로 정의
	 * ===============================================================
	 * 수정자 메소드 : setter
	 * ---------------------------------------------------------------
	 * 1. set으로 시작
	 * 2. set 뒤에 오는 이름은 수정하려는 멤버변수 이름의
	 *    첫 글자만 대문자로 시작하는 낙타표기법 적용
	 * 3. 메소드 매개변수는 수정하려는 멤버변수 타입과 맞추고
	 *    보통 수정하려는 멤버변수 이름과 같게 설정
	 * 4. 리턴타입은 void 로 한다.
	 * 5. 보통 안쪽의 로직은
	 *    this.멤버변수 = 매개변수; 로 작성
	 * ===============================================================
	 * ---------------------------------------------------------------
	 */
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
	/**
	 * toString() 메소드정의
	 * 
	 */
	@Override
	public String toString(){
		return String.format("제품 코드 : %s, 제품 명 : %s, 가격: %d, 재고량 : %d", pcode, pname, price, quantity);
	}

	// alt + shft + s (hashCode(),equals() 자동 생성 가능 단축키)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pcode == null) ? 0 : pcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (pcode == null) {
			if (other.pcode != null)
				return false;
		} else if (!pcode.equals(other.pcode))
			return false;
		return true;
	}
	
	
//	// equals() : 객체 내용 비교 메소드 작성
//	// ==> pcode 가 같으면 동일 객체로 판단
//	@Override
//	public boolean equals(Object object) {
//		// 1. 동일비교 연산 결과 저장할 변수 선언
//		// 2. 기본 false로 초기화
//		boolean isEqual = false;
//		
//		// 3. 사용 : 동일한 객체인지 판단
//		// (1) 매개변수로 넘겨진 object 가 Product 타입인지 검사
//		if(object instanceof Product) {
//			// (2) 비교대상인 this 객체와
//			//     매개변수의 object 의 pcode 필드값을 비교
//			Product product = (Product)object;
//			
//			if(this.pcode.equals(product.pcode)) {
//				isEqual = true;
//			}
//		}
//		return isEqual;
//	}
//	
//	@Override
//	public int hashCode() {
//		/*--------------------------------------------------
//		 * hash 알고리즘 : 입력이 동일하면 출력도 동일함을
//		 *                 보장하는 수학 알고리즘
//		 * ==> 출력이 다르면 입력이 다르다는 결론을 보장한다.
//		 * -------------------------------------------------
//		 * 1. 비교하려는 필드가 참조형이면 그 클래스가
//		 *    재정의해둔 hashCode() 를 호출해서 비교
//		 *
//		 * 2. 비교하려는 필드가 기본형이면
//		 *    기본형 데이터를 참조형으로 변경하려는 포장 클래스
//		 *    객체로 변환 후에 hashCode() 를 적용
//		 * 
//		 * 3. 비교하려는 필드가 1개 이상이면
//		 *    1,2를 각 필드의 타입에 맞추어 적용하고
//		 *    모든 필드의 결과를 XOR(^) 연산의 결과를 통과 시켜
//		 *    그 결과를 리턴한다
//		 * -------------------------------------------------
//		 */
//		
//		// pcode만 비교
//		return this.pcode.hashCode();
//		// 만약 모든 필드 비교
////		return pcode.hashCode()^
////				pname.hashCode()^
////				new Integer(price).hashCode()^
////				new Integer(quantity).hashCode();
//	}
	
	
	
}
