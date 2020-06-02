package oop;

//this : 메소드에 숨겨져 있는 매개변수(참조변수)
// => 메소드를 호출한 인스턴스 정보를 자동으로 전달받아 저장
// => 메소드에서 인스턴스의 필드를 명확히 구분하기 위한 제공되는 키워드
// => this 키워드를 사용하지 않아도 자동으로 인식되어 처리 

//this 키워드를 사용하는 이유
//1.메소드의 매개변수와 필드의 이름이 같은 경우 this 키워드를 사용하여 필드 표현
//2.생성자에서 다른 생성자를 호출하여 초기화 작업을 실행하고자 할 경우 this 키워드 사용
//3.메소드에서 호출한 인스턴스를 표현하기 위한 사용 >> 이벤트 처리, 다중 스레드 등

//회원정보(아이디, 이름, 이메일)를 저장하기 위한 클래스 : VO(Value Object) 클래스
public class Member {
	//필드(Field) 선언
	// => 인스턴스 생성시 필드에 저장되는 기본값 변경 가능
	private String id="NoId";
	private String name="NoName";
	private String email="NoEmail";

	//생성자(Constructor) 선언
	// => 생성자를 선언하지 않은 경우 내부적으로 기본 생성자가 제공
	// => 생성자를 하나라도 선언하면 기본 생성자 미제공
	//기본 생성자(Default Constructor) : 매개변수가 없는 생성자
	// => 일반적으로 초기화 작업 미구현
	// => 선언하지 않을 경우 클래스 상속 문제가 발생할 수 있으므로 선언하는 것을 권장
	//기본 생성자 자동 완성 : [Ctrl]+[Space] >> Constructor 선택 >> 엔터
	public Member() {
		// TODO Auto-generated constructor stub
		/*
		id="NoId";
		name="NoName";
		email="NoEmail";
		*/
		
		//this 키워드를 이용하여 다른 생성자 호출
		// => 다른 생성자를 호출하는 명령 전에 다른 명령이 존재할 경우 에러 발생
		// => public Member(String id, String name, String email) 호출
		//this("NoId","NoName","NoEmail");
	}
	
	//매개변수가 존재하는 생성자 선언
	// => 인스턴스 생성시 매개변수에 전달받은 값으로 필드값 저장 - 초기화 작업
	//생성자 자동 완성 : [Alt]+[Shift]+[S] >> [O] >> 필드 선택 >> Generate
	public Member(String id) {
		this.id=id;
		
		/*
		this.id=id;
		name="NoName";
		email="NoEmail";
		*/

		//this(id, "NoName", "NoEmail");
	}
	
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
		
		/*
		this.id=id;
		this.name=name;
		email="NoEmail";
		*/
		
		//this(id, name, "NoEmail");
	}
	
	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	//메소드(Method) 선언
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//필드값을 출력하는 메소드 >> 필드값 확인
	public void display() {
		//System.out.println("아이디 = "+this.id);
		System.out.println("아이디 = "+id);
		System.out.println("이름 = "+name);
		System.out.println("이메일 = "+email);
	}
}









