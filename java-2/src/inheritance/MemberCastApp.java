package inheritance;

//상속시 참조변수와 인스턴스와 관계
public class MemberCastApp {
	public static void main(String[] args) {
		//부모클래스 참조변수=new 부모클래스();
		// => 부모 인스턴스를 생성하여 참조변수에 부모 인스턴스 정보 저장 : 가능
		Member member1=new Member();
		
		//참조변수를 이용하여 부모 인스턴스의 메소드 호출
		member1.setId("aaa");
		member1.setName("홍길동");
		
		member1.display();
		System.out.println("=======================================");
		//자식클래스 참조변수=new 자식클래스();
		// => 부모 인스턴스와 자식 인스턴스를 생성하여 참조변수에 자식 인스턴스 정보 저장 : 가능
		MemberEvent member2=new MemberEvent();
		
		//참조변수를 이용하여 자식 인스턴스의 메소드 호출
		// => 자식 인스턴스는 부모 인스턴스를 참조 가능하므로 참조변수로 부모 인스턴스의 메소드 호출
		member2.setId("bbb");
		member2.setName("임꺽정");
		member2.setEmail("bbb@daum.net");
		
		member2.display();
		System.out.println("=======================================");
		//자식클래스 참조변수=new 부모클래스();
		// => 에러발생 : 부모 인스턴스를 생성하여 참조변수에 존재하지
		//    않는 자식 인스턴스 정보 저장
		//MemberEvent member3=new Member();
		System.out.println("=======================================");
		//부모클래스 참조변수=new 자식클래스();
		// => 부모 인스턴스와 자식 인스턴스를 생성하여 참조변수에 부모 인스턴스 정보 저장 : 가능
		Member member4=new MemberEvent();
		
		//참조변수를 이용하여 부모 인스턴스의 메소드 호출
		// => 기본적으로 자식 인스턴스의 메소드 호출 불가능
		member4.setId("ccc");
		member4.setName("전우치");
		
		//객체 형변환을 이용하면 참조변수를 이용해 자식 인스턴스 메소드 호출 가능
		
		//명시적 객체 형변환(강제 형변환) : 참조변수의 자료형을 자식클래스로
		//일시적으로 변경하면 참조변수에 자식 인스턴스 정보가 자동으로 저장
		//형식) (자식클래스)참조변수 => Cast 연산자 이용
		/*
		MemberEvent temp=(MemberEvent)member4;
		temp.setEmail("bbb@daum.net");
		*/
		((MemberEvent)member4).setEmail("bbb@daum.net");
		
		//묵시적 객체 형변환(자동 형변환) : 자식클래스에 오버라이드 선언된
		//메소드는 부모클래스의 메소드 대신 자식클래스의 메소드가 호출
		// => 참조변수의 자료형이 자동으로 부모클래스로 변경되어 자식 인스턴스 정보 저장
		member4.display();
		System.out.println("=======================================");
	}
}












