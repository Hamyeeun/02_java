package book.test;

import book.Book;
import book.BookManager;
import book.BookShelf;
import book.BookStore;

/**
 * 서점에서 할 수 있는 여러 기능들
 * 책 찾기(조)회, 책 수정, 신간 추가, 책 폐기 등의 기능을 테스트
 * @author Administrator
 *
 */
public class BookStoreTest {

	public static void main(String[] args) {
		
		// 1. 매니저에게 전달할 책장안에 들어갈 배열
		Book[] books = new Book[0];
		
		// 2. 배열로 구성되는 책장 만든다.
		BookShelf bookShelf = new BookShelf(books);
		
		// 3. 배열로 구성된 책장을 관리할 매니저를 고용
		BookManager manager = new BookManager(bookShelf);
		
		// 4. 책장을 관리할 매니저와 함께 서점을 오픈
		BookStore kyobo = new BookStore(manager);
		
		// ----------------------------------------
		// 서점에 신간이 도착
		System.out.println("===============서점에 신간 도착==============");
		Book vegetarian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247,10800 ,10);
		Book littlePrince = new Book(2,"9791159039690", "어린왕자(초판본)", "생텍쥐페리", "더스토리", 150, 8820, 5);
		Book noDaap = new Book(3,"9791190182645", "제 인생에 답이 없어요", "선바", "위즈덤하우스", 192, 10800, 3);
		Book dduk = new Book(4,"9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어요", "백세희", "흔", 208, 12420, 2);
		Book ax = new Book(5,"9788956055466", "죽고 싶지만 떡볶이는 먹고 싶어요", "박웅현", "북하우스", 348, 14400, 2);
		
		// 2. 서점에 도착한 신간 입고
		System.out.println("===============서점에 신간 입고==============");
		kyobo.add(vegetarian);
		kyobo.add(littlePrince);
		kyobo.add(noDaap);
		kyobo.add(dduk);
		kyobo.add(ax);
		
		// 3. 입고된 신간들 모두 확인
		System.out.println("===============신간 확인==============");
		Book[] allBooks = kyobo.getAllBooks();
		for(Book book : allBooks) {
			book.print();
		}
		
		// 4. 채식주의자 가격할인:set
		// (1) 가격할인된 채식주의자 책 정보를 새로 생성
		System.out.println("===============채식주의자 변경==============");
		Book vegetarian2 = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247,10000 ,7);
		
		// (2) 변경된 책 정보를 담은 책 객체를 넘겨서 수정 처리
		kyobo.set(vegetarian2);
		
		// 5. 채식주의 가격 할인 적용 결과 확인:get
		// (1) 해당 책의 시퀸스 번호만 알면 조회가능
		// 시퀀스 번호만 들어있는 Book 객체를 생성
		System.out.println("===============채식주의자 변경 확인==============");
		Book seqBook = new Book(1);
		Book findBook = kyobo.get(seqBook);
		findBook.print();
		
		// 6. 책은 도끼다 폐기:remove
		// (1) 폐기할 책 시퀀스 번호만 알면 폐기 가능
		//     시퀀스 번호만 들어있는  Book 객체를 생성
		System.out.println("===============책은 도끼다 삭제==============");
		Book rmBook = new Book(5);
		kyobo.remove(rmBook);
		
		
		// 7. 폐기 확인을 위해 전체 목록 재 조회:getAllBooks
		System.out.println("===============책은 도끼다 삭제 확인==============");
		for (Book book : kyobo.getAllBooks()) {
			book.print();
		}
	}

}
