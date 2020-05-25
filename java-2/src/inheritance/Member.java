package inheritance;

//회원정보를 (ID, 이름) 저장하기 위한 클래스
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


	//오버라이드 선언된 메소드는 숨겨진 메소드로 처리된다
	//하이드 메소드라고 한다
	
	public void display() {
		System.out.println("아이디 = " + id);
		System.out.println("이름 = " + name);
		
	}
}
	