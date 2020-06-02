package inheritance;

//이벤트 관련 회원정보(아이디,이름,이메일)를 저장하기 위한 클래스
// => 회원정보를 저장하는 클래스(Member)를 상속받아 작성하는 것을 권장
//extends 키워드를 이용하여 기존 클래스(부모클래스)를 상속받아 새로운 클래스(자식클래스) 작성
// => 상속을 이용하여 자식클래스는 부모클래스의 필드와 메소드 접근 가능 - 상속성(Inheritance)
// => 단일상속만 가능 - 다중상속 불가능
public class MemberEvent extends Member {
	/*
	//부모클래스를 상속받아 사용하므로 미선언 
	private String id;
	private String name;
	*/
	private String email;
	
	//super : 자식클래스의 메소드에 부모 인스턴스의 정보를 전달받아 저장하기 위한 키워드(참조변수)
	// => 자식클래스의 생성자에서 부모클래스의 생성자를 호출하기 위한 사용
	// => 자식클래스에서 오버라이드 선언하여 숨겨진 부모클래스의 메소드 호출할 경우 사용
	public MemberEvent() {
		//자식클래스의 생성자에서 부모클래스의 기본생성자 호출
		// => 부모클래스의 기본생성자를 호출하고자 할 경우 생략 가능
		// => 부모클래스의 기본생성자가 없거나 은닉화된 경우 에러 발생
		// => 생성자 호출하는 명령전에 다른 명령이 존재할 경우 에러 발생
		//super();
	}

	/*
	public MemberEvent(String id, String name, String email) {
		super();
		//this.id = id;
		setId(id);
		//this.name = name;
		setName(name);
		this.email = email;
	}
	*/
	
	//[Alt]+[Shift]+[S] >> [O] >> 부모클래스의 생성자 선택 >> 필드 선택 >> Generate
	public MemberEvent(String id, String name, String email) {
		super(id, name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//오버라이드(Override) : 부모클래스의 메소드를 자식클래스에서 재선언하는 기능
	// => 부모클래스의 메소드와 같은 형태의 머릿부로 자식클래스에서 선언
	// => 부모클래스의 메소드는 숨겨지고 자식클래스의 메소드만 사용
	/*
	public void display() {
		//System.out.println("아이디 = "+id);
		System.out.println("아이디 = "+getId());
		//System.out.println("이름 = "+name);
		System.out.println("이름 = "+getName());
		System.out.println("이메일 = "+email);
	}
	*/

	//이클립스를 이용하여 부모클래스의 메소드를 오버라이드 선언하는 방법
	// => 부모클래스 메소드명 입력 >> [Ctrl]+[Space] >> Override 선택 >> 엔터
	//@Override : 오버라이드 메소드를 표현하기 위한 어노테이션(Annotation)
	// => 오버라이드 작성 규칙을 위반할 경우 에러 발생
	@Override
	public void display() {
		//super 키워드를 이용하여 부모클래스의 숨겨진 메소드를 직접 호출
		super.display();
		System.out.println("이메일 = "+email);
	}
}











