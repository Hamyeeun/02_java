package book;
/**
 * 책 1권의 정보를 담는 클래스
 * ----------------------
 * 일련번호  : sequence  : int
 * ISBN   : isbn      : String
 * 제목        : title     : String
 * 저자        : author    : String
 * 출판사     : company   : String
 * 페이지 수 : totalPage : int
 * 가격        : price     : int
 * 재고수량  : quantity  : int
 * -----------------------
 * 생성자 중복정의
 * (기본생성자 명시, 매개변수 생성자 중복정의)
 * -----------------------
 * 메소드 :
 * -- 기능 메소드
 * void print()         : 책의 정보를 출력하는 메소드
 * void buy(int amount) : amount 만큼 책의 재고를 늘리는 메소드
 * void sell(int amount): amount 만큼 책의 재고를 줄이는 메소드
 * 
 * -- 각 필드를 설정하는 메소드
 * -- 자바 빈즈(Java beans) 규격에 의한 접근자/수정자 메소드
 * -- getter/setter
 * 
 * getter 작성시 메소드 이름 규격
 *  ==> get으로 시작 멤버변수 필드의 첫글자를 대문자로 조합
 *  	매개변수는 없음
 *  	리턴타입이 해당 멤버변수 필드의 타입과 맞춤
 * 예) sequence 필드의 getter 는 다음의 규격을 갖는다.
 * int getSequence(){
 *     return this.sequence;
 * }
 * 
 * setter 작성시 메소드 이름 규격
 *  ==> set으로 시작하고 멤버변수 필드의 첫글자를 대문자로 조합
 *  	매개변수는 해당 멤버변수 필드와 같은 타입과 변수로 받는다.
 *  	리턴값 없이 작성
 *  void setSequence(int sequence){
 *  	this.sequence = sequence;
 *  }
 *  
 *  만약 멤버변수 필드가 boolean 타입이라면 getter의 이름은
 *  get으로 시작하지 않고 is로 시작한다.
 * @author Administrator
 *
 */
public class Book {
	int sequence;
	String isbn;
	String title;
	String author;
	String company;
	int totalPage;
	int price;
	int quantity;
	
	/** 기본 생성자 */
	Book(){
		
	}

	Book(int sequence){
		this();
		this.sequence = sequence;
	}
	
	Book(int sequence, String isbn){
		this(sequence);
		//this.isbn = isbn;
		setIbsn(isbn); // setter 이용해서 할 수 있음.
	}
	
	Book(int sequence, String isbn, String title){
		this(sequence, isbn);
		this.title = title;
	}
	
	Book(int sequence, String isbn, String title, String author){
		this(sequence, isbn, title);
		this.author = author;
	}
	
	Book(int sequence, String isbn, String title, String author, String company){
		this(sequence, isbn, title, author);
		this.company = company;
	}
	
	Book(int sequence, String isbn, String title, String author, String company, int totalPage){
		this(sequence, isbn, title, author, company);
		this.totalPage = totalPage;
	}
	
	Book(int sequence, String isbn, String title, String author, String company, int totalPage, int price){
		this(sequence, isbn, title, author, company, totalPage);
		this.price = price;
	}
	
	Book(int sequence, String isbn, String title, String author, String company, int totalPage, int price, int quantity){
		this(sequence, isbn, title, author, company, totalPage, price);
		this.quantity = quantity;
	}
	// sequence 멤버 변수의 getter
	public int getSequence() {
		return sequence;
	}
	
	// sequence 의 setter
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	// isbn멤버변수 필드에 대한 getter
	public String getIsbn() {
		return isbn;
	}
	
	// isbn멤버변수 필드에 대한 setter
	public void setIbsn(String isbn) {
		this.isbn = isbn;
	}
	// title멤버 변수 필드에 대한 gettter
	public String getTitle() {
		return title;
	}
	// title 멤버 변수 필드에 대한 setter
	public void setTitle(String title) {
		this.title = title;
	}
	// author 멤버 변수 필드에 대한 getter
	public String getAuthor() {
		return author;
	}
	// author 멤버 변수 필드에 대한 setter
	public void setAuthor(String author) {
		this.author = author;
	}
	// company 멤버 변수 필드에 대한 getter
	public String getCompany() {
		return company;
	}
	// company 멤버 변수 필드에 대한 setter
	public void setCompany(String company) {
		this.company = company;
	}
	// totalPage 멤버변수 필드에 대한 getter
	public int getTotalPage() {
		return totalPage;
	}
	// totalPage 멤버변수 필드에 대한 setter
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	// price 멤버변수 필드에 대한 getter
	public int price() {
		return price;
	}
	// price 멤버변수 필드에 대한 setter
	public void setPrice(int price) {
		this.price = price;
	}
	// quantity 멤버변수 필드에 대한 getter
	public int getQuantity() {
		return quantity;
	}
	// quantity 멤버변수 필드에 대한 setter
	public void setQuentity(int quantity) {
		this.quantity = quantity;
	}
	
	
	/**
	 * void print() : 책의 정보를 출력하는 메소드
	 */
	public void print() {
		System.out.printf("일련번호 : %d, ISBN : %s, 책 제목: %s, 저자: %s, 출판사: %s, 페이지 수 : %d, 가격: %d, 재고수량: %d%n"
				, sequence, isbn, title, author, company, totalPage, price, quantity);
	}
	
	/**
	 * void buy(int amount) : amount 만큼 책의 재고를 늘리는 메소드
	 * @param amount
	 */
	public void buy(int amount) {
		this.quantity += amount;
		System.out.printf("책의 재고는 %d 입니다.", quantity);
	}
	/**
	 * void sell(int amount): amount 만큼 책의 재고를 줄이는 메소드
	 * @param amount
	 */
	public void sell(int amount) {
		this.quantity -= amount;
		System.out.printf("책의 재고는 %d 입니다.", quantity);
	}
	
}