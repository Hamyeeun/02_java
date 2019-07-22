package school;

public abstract class Person {
	// 1. 멤버변수 선언
	private String id;
	private String name;
	private int age;
	
	// 2. 생성자
	public Person() {
		
	}
	
	public Person(String id) {
		this();
		this.id = id;
	}
	
	public Person(String id, String name) {
		this(id);
		this.name = name;
	}
	
	public Person(String id, String name, int age) {
		this(id, name);
		this.age = age;
	}
	
	// 3. 접근자, 수정자
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 4. 메소드 선언
	public void print() {
		System.out.printf("아이디 : %s, 이름 : %s, 나이 : %d%n", id, name, age);
	}
	
	@Override
	public String toString() {
		return String.format("id : %s, name : %s, age : %d", id, name, age);
	}
}
