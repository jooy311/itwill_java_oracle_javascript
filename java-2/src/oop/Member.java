package oop;

//회원정보를 저장하기 위한 클래스
//아이디.이름.이메일
//아이디: 고유값

//무언가를 저장하는 클래스 : VO(Value Object) - web에서는 자바빈이라고 함!

//이런 구성을 가지고 있는 클래스는 자주 쓰이고, VO클래스 라고 함


//this : 메소드에 숨겨져 있는 매개변수(참조변수)
// -> 메소드를 호출한 인스턴스 정보를 자동으로 전달받아 저장함
//-> 메소드에서 인스턴스의 필드를 명확히 하기 위함

//this키워드를 사용하는 이유
//1.메소드의 매개변수와 필드의 이름이 같은 경우 this.키워드를 사용함
//2.생성자에서 다른 생성자를 호출하여 초기화 작업을 할 떼 사용
//3.메소드에서 호출한 인스턴스를 표현하기 위해 사용됨(이벤트 처리프로그램, 다중스레드 프로그램)
public class Member {
	//필드
	private String id = "No Id";//처음에 걍 초기화시킴 ->필드에 적용을 시키면 기본값이 되어 버리는것.
	//그래서 값이 안들어가면 기본값이 출력이됨(자바에서만 가능함)
	//왜? 자바는 프로토타입이기때문->	클래스가메모리에 먼저 저장을 하기 때문임 
	//★클래스가 먼저 로드된다음 객체가 로드됨★
	private String name = "No Name";
	private String email = "No email";
	
	//Constructor생성자 선언
	//생성자가 선언 안된경우 : 내부적으로 기본 생성자가 제공됨	
	
	//생성ㅈ를 하나라도 선언하면 기본 생성자는 제공되지 않음
	//기본생성자란? 매개변수가 없는 생성자 - 메소드도없기 떄문에 그냥 객체 생성을 목적으로 함
	//일반적으로 초기화 작업을 미리 구현한다
	//선언하지 않을경우 상속문제가 발생할 수 있으므로 선언하는것을 권장
	//기본생성자 자동 완성기능 : ctrl + space
	public Member() {
		//this를 이용하여 다른 생성자를 호출할 수 도 있다
		//다른 생성자를 호출하는 명령전에 다른 명령이 존재하면 안된다
		//하지만 별로 쓸일이 없음
		this("","","");
	}
	
	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	//매개 변수가 존재하는 생성자를 선언
	public Member(String id) {
		//this.id = id;
		this(id, "No Name", "NoEmail");
	}
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	//메소드 선언
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
	
	//필드값을 출력하는 메소드  >> 필드값 확인 (VO클래스 안에들어가는 내용은 아님)
	public void display(){
		System.out.println("아이디 >> " + id);
		System.out.println("이름 >> " + name);
		System.out.println("이메일 >> " + email);
	}
	
	
}
