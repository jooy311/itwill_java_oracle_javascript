package inheritance;

public class MemberCastApp {
	public static void main(String[] args) {
		//1.
		//부모클래스 참조 변수 = new 부모클래스();
		//=>부모 인스턴스를 생성하여 부모 참조 변수에 저장 : 가능
		Member member = new Member();
		
		//참조변수를 이용하여 부모 인스턴스 메소드를 호출할 수 있다
		member.setId("aaa");
		member.setName("honggildong");
		member.display();
		System.out.println("===================================");
		
		//2.
		//자식클래스 참조변수 = new 자식클래스()
		//=>자식 인스턴스를 생성하여 자식 참조변수에 정보를 저장한다.
		MemberEvent mem = new MemberEvent();
		
		//참조변수를 이용하여 자식 인스턴스의 메소드 호출
		//=>자식인스턴스는 부모 인스턴스를 참조가능하므로 참조변수로 부모인스턴스의 메소드 호출 가능
		mem.setId("bbb");
		mem.setName("imgguckjjeong");
		mem.setEmail("bbb@naver.com");
		
		//Member가 아니라, 자기자신 먼저 찾은다음 부모이기 때문에 
		//얘는 MemberEvent에서 호출된다.
		mem.display();
		System.out.println("===================================");

		//3.
		//자식클래스 참조변수 = new 부모클래스();
		//Error : 부모인스턴스를 생성 -> 자식참조변수에 자식인스턴스 정보를 저장하라
		//why? 자식인스턴스가 지금 없음(즉, 존재하지 않는 자식인스턴스의 정보를 저장하라고 했기때문)
		//MemberEvent m = new Member();
		
		//4.
		//부모클래스 참조변수 = new 자식클래스()
		//부모인스턴스와 자식인스턴스를 생성하여 참조변수에 부모 인스턴스의 정보를 저장하라
		//자식의 생성자를 이용하여 인스턴스를 생성하면 -> 부모의 생성자가 호출되서 
		//부모의 인스턴스가 생성되기 때문
		//참조변수는 부모를 참조함 (즉, 부모클래스의 메소드만 호출이 가능해진다)
		//부모는 자식것을 갖다 쓸 수 없음
		Member m = new MemberEvent();
		m.setId("ddd");
		m.setName("jeonwoochi");

		//객체 형변환을 이용하면 참조변수를 이용해, 자식 인스턴스의 메소드의 호출이 가능해짐
		// 1) 자동 형변환 : 
		// 2) 강제 형변환 : 명시적 객체 형변환 => 참조변수의 자료형을 자식클래스로 일시적으로 변경하여
		//					자식인스턴스 정보가 저장되도록 설정이 가능해짐 ->캐스트 연산자 이용
		 
		((MemberEvent) m).setEmail("bbb@naver.com"); // => 부모는 자식것을 갖다 쓰지 못한다. 그렇기 때문에 형변환을 이용
		m.display(); //묵시적 객체 형변환(자동형변환) ->어떻게 가능한가? -> 오버라이딩 덕분
		//오버라이드 선언된 메소드는 부모클래스의 메소드 대신 자식클래스의 메소드가 호출된다
		//부모클래스의 메소드는 숨겨지게 되기 때문
		//참조변수의 자료형이 자동으로 부모클래스로 변경되어 자식인스턴스의 정보가 저장된다
		
		
	}
}
