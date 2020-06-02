package inheritance;

//회원정보(아이디,이름)를 저장하기 위한 클래스
public class Member {
	private String id;
	private String name;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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
	
	//자식클래스에서 오버라이드 선언된 메소드는 숨겨진 메소드(Hide Method)로 처리
	public void display() {
		System.out.println("아이디 = "+id);
		System.out.println("이름 = "+name);
	}
}







