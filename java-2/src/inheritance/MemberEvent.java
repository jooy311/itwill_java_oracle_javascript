package inheritance;

//이벤트 관련 회원정보(아이디, 이름, 이메일)를 저장하기 위한 클래스
//=>이미 Member클래스에 (아이디, 이름)이 저장되어 있기 때문에 
//=>기존클래스를 재사용할 수 있으면 상속을 받는게 나음
//=>extends 키워드를 이용하여 기존 클래스를 상속받아 새로운 클래스를 작성
//=>상속을 이용하여 자식클래스는 부모클래스의 필드와 메소드에 접근가능
//=>단일상속만 가능(다중상속 절대 불가)
public class MemberEvent extends Member {
	/*
	 * private String id; private String name;
	 */
	private String email;

	// super : 자식 클래스의 메소드에서 부모 인스턴스의 정보를 전달받아 저장하기 위한 참조변수다
	// 자식클래스의 생성자에서 부모클래스의 생서자를 호출하기 위한 키워드
	public MemberEvent() {
		// TODO Auto-generated constructor stub
		// 자식클래스의 생성자에서 부모클래스의 기본생성자를 호출하는 명령
		// 부모클래스의 기본생성자를 호출하려고 할 경우 생략가능
		// => 만약 부모클래스의 기본생성자가 없다면 기본상속이 불가능하므로 error생김
		// 즉, 부모클래스에서 반드시 기본생성자를 만들어주어야 한다.
		// 생성자를 호출하는 명령전에 다른 명령이 존재할 경우 error
		// super();가 생략되어 있다.
	}
//alt + shift + s >> O >> 부모클래스의 생성자 선택 (이걸 하지 않으면 그냥 super()로 호출)>> 필드선택

	public MemberEvent(String id, String name, String email) {
		super(id, name);// super에 매개변수로 아예 초기화 해서 보내면
		// 굳이 밑에서 setId사용 안해도됨
		// this.id = id;
		setId(id);// super.setId()로 굳이 하지 않아도 자동으로 찾아간다.

		// this.name = name;
		setName(name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * public void display() { System.out.println("id = " + getId());
	 * System.out.println("name = " + getName()); System.out.println("email = " +
	 * email);
	 * 
	 * }
	 */

	// 메소드 오버라이딩 : 부모클래스의 메소드를ㄹ 자식클래스에서 재선언하는 것
	// 부모클래스의 메소드와 같은 형태의 머릿부를 동일하게 선언하여 작성
	// => 부모클래스의 메소드는 숨겨지게 되고, 자식클래스의 메소드만 사용가능해진다

	// 이클립스를 이용하여 부모클래스의 메소드를 오버라이드 선언하는 방법
	// =>부모클래스의 메소드명 입력 >> ctrl + space
	// @Overide : (@뒤에 있는 것을 어노테이션이라고 함) 오버라이드 메소드를 표현하기 위한 annotation
	// =>오버라이드 작성규칙을 위반할 경우, error
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display(); // this로 하면 자기자신을 계속호출하는 것이므로 무한루프걸림
	}
}
