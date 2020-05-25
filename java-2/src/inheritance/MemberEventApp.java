package inheritance;

public class MemberEventApp {
	public static void main(String[] args) {
		//자식클래스의 생성자를 이용하여 인스턴스를 생성할 경우 부모클래스가 먼저 호출되어 짐
		//생성자가 먼저 호출되어 부모 인스턴스 생성후 자식 인스턴스 생성됨
		//->자식 인스턴스가 부모 인스턴스를 상속받아 참조 가능
		MemberEvent m = new MemberEvent();
		m.setId("adbb");
		m.setName("홍길동");
		m.setEmail("abc@naver.com");
		m.display();
		System.out.println("===========================");
		
		MemberEvent mm = new MemberEvent("xxx123", "임꺽정", "xxx123@naver.com");
		mm.display();
		System.out.println("===========================");
		
	}
}
