package snack;

/**
 * 오레오(Oreo) 쿠키가 
 * 여러개 들어가있는 박스
 * @author 304
 *
 */

public class OreoBox {

	// TODO Oreo 를 여러개 저장할 수 있는
	// Oreo[] oreos 를 멤버 변수로 갖도록 선언
	Oreo[] oreos;
	
	// TODO 생성자 기본, 매개변수 중복정의
	OreoBox(){
		oreos = new Oreo[0];
	}
	OreoBox(Oreo[] oreos) {
		this.oreos = oreos;
	}
	
	// TODO 오레오 박스에
	// 오레오 쿠키를 1개씩 추가, 삭제, 수정, 꺼내(get)거나
	public void add(Oreo oreo) {
		// 현재 oreos 보다 길이가 1큰 배열을 새로 만든다.
		// newOreos
		Oreo[] newOreos = new Oreo[oreos.length + 1];	
		// oreos 의 모든 책 내용을 새로 생성한 1칸 큰 배열에
		// 앞쪽부터 복사
		for (int idx = 0; idx < oreos.length; idx++) {
			newOreos[idx] = oreos[idx];
		}
			
		// 매개변수로 넘겨진 oreo 은 마지막 새로 생긴 칸에 저장
		newOreos[newOreos.length - 1] = oreo;
				
		// 이 클래스의 oreos 멤버변수에 새로만든 newOreos 저장
		this.oreos = newOreos;
	}

	public void remove(Oreo oreo) {
		// oreo 객체의 sequence 가 같으면 같은 책으로 판단해서
		// 삭제
		// 폐기 안하고 남는 오레오를 유지할 새 배열
		Oreo[] newOreos;

		// 1. 폐기할 오레오가 위치하는 인덱스를 찾기
		int index = findOreoIndex(oreo);

		// 2. 폐기할 오레오의 인덱스가 -1보다 크면
		// 폐기할 오레오가 있다는 의미로 판단하고 삭제로직 진입
		if (index > -1) {
			// 3. 폐기 안할 오레오를 유지할
			// 새 배열을 지금 배열 크기 - 1 크기로 생성
			newOreos = new Oreo[oreos.length - 1];

			// 5. 폐기할 인덱스가 배열 끝일 때
			// 폐기할 오레오 인덱스 앞쪽까지만 새 배열에 복사
			if (index < oreos.length - 1) {
				// 4번
				// (1) 삭제할 오레오 앞쪽의 오레오 정보는 같은 인덱스로 복사
				for (int idx = 0; idx < index; idx++) {
					newOreos[idx] = oreos[idx];
				}
				// (2) 삭제할 오레오 뒤쪽의 남는 오레오 정보는 현재인덱스 -1 으로 복사하기
				for (int idx = index; idx < newOreos.length; idx++) {
					newOreos[idx] = oreos[idx + 1];
				}
			} else {
				// 5번
				for (int idx = 0; idx < oreos.length - 1; idx++) {
					newOreos[idx] = oreos[idx];
				}
			}

			// 6. 남는 오레오가 복사된 새 배열을
			// this.oreos 에 새로 저장
			this.oreos = newOreos;
		}
	}
	
	public void set(Oreo oreo) {
		// 수정할 oreo 이 oreos 배열
		// 몇번째 인덱스에 있는지 찾는다.
		int index = findOreoIndex(oreo);

		if (index > -1) {
			oreos[index] = oreo;
		}
	}
	
	public Oreo get(Oreo oreo) {
		// 입력된 book의 sequence 값과
		// 내부 배열에 저장된 책들중 일치하는 sequence 를 가진
		// 책 1권의 정보를 리턴
		return findOreo(oreo);
	}
	/**
	 * 매개변수 전달된 오레오 정보와
	 * 일치하는 일련번호를 가진 오레오(오레오 배열 : oreos 에 있는)을
	 * 찾아서 배열에 안에 들어있는 오레오를 리턴
	 * @param oreo
	 * @return
	 */
	private Oreo findOreo(Oreo oreo) {
		Oreo findOreo = null;
		for (int idx = 0; idx < oreos.length; idx++) {
			if (oreos[idx].getSequence() == oreo.getSequence()) {
				// 같은 책 찾았다.
				findOreo = oreos[idx];
				break;
			}
		}
		return findOreo;
	}
	/**
	 * 
	 * @param oreo
	 * @return
	 */
	private int findOreoIndex(Oreo oreo) {
		int index = -1;
		for (int idx = 0; idx < oreos.length; idx++) {
			if (oreos[idx].getSequence() == oreo.getSequence()) {
				// 같은 책 찾았다.
				index = idx;
				break;
			}
		}
		return index;
	}
	public Oreo[] getAllOreos() {
		return this.oreos;
	}
}