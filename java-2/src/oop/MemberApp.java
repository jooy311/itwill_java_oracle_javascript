package oop;

public class MemberApp {
	public static void main(String[] args) {
		Member m = new Member(); //뒤에 Member는 기본 생성자~~//멤버클래스의 필드가 메모리에 할당된다
		//인스턴스 필드에는 기본값이 자동저장
		
		System.out.println("이름 >> " + m.getName());
		System.out.println("아이디 >> " + m.getId());
		System.out.println("이름 >> " + m.getEmail());
		System.out.println("==========================================");
		
		m.setId("jooy11");
		m.setEmail("jooy311@naver.com");
		m.setName("이주영");
		
		m.display();
		System.out.println("==========================================");
		
		//인스턴스 생성시 생성자 매개벼수를 이용하여 필드에 저장된 값을 전달한다
		Member m2 = new Member("bbb", "홍길동", "이매일");	
		m2.display();
		
		System.out.println("==========================================");
		Member m3 = new Member("dfdf", "leejooyoun g");
		m3.display();
		System.out.println("==========================================");
		
				
	}
}
