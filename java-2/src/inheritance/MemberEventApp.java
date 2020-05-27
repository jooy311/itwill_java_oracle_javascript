package inheritance;

public class MemberEventApp {
	public static void main(String[] args) {
		//자식클래스의 생성자를 이용하여 인스턴스를 생성할 경우 부모클래스의 
		//생성자가 먼저 호출되어 부모 인스턴스 생성 후 자식 인스턴스 생성
		// => 자식 인스턴스가 부모 인스턴스를 상속받아 참조 가능
		MemberEvent member1=new MemberEvent();
		
		member1.setId("abc123");
		member1.setName("홍길동");
		member1.setEmail("abc@daum.net");
		
		member1.display();
		System.out.println("=======================================");
		MemberEvent member2
			=new MemberEvent("xyz789", "임꺽정", "xyz@naver.com");
		member2.display();
		System.out.println("=======================================");
				
	}
}





