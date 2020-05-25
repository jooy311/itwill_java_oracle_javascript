package inheritance;

public class MemberApp {
	public static void main(String[] args) {
		
		Member m = new Member();//기본생성자를 가지고 만든 인스턴스
		
		m.setId("aaa");
		m.setName("홍길동");
		m.display();
		System.out.println("==================================");
		
		Member mm = new Member("ad4545","임꺽정");
		mm.display();
		System.out.println("==================================");
	}
}
