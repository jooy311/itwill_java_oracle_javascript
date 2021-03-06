package oop;

public class MamberApp {
	public static void main(String[] args) {
		//기본 생성자를 이용하여 인스턴스 생성
		// => 인스턴스 필드에는 기본값이 자동 저장
		Member member1=new Member();
		
		//Getter 메소드를 호출하여 필드값을 반환받아 출력
		/*
		System.out.println("아이디 = "+member1.getId());
		System.out.println("이름 = "+member1.getName());
		System.out.println("이메일 = "+member1.getEmail());
		*/
		
		member1.display();
		System.out.println("=======================================");
		//Setter 메소드를 호출하여 필드값 변경
		member1.setId("aaa");
		member1.setName("홍길동");
		member1.setEmail("aaa@google.com");
		
		member1.display();
		System.out.println("=======================================");
		//인스턴스 생성시 생성자 매개변수를 이용하여 필드에 저장될 값을 전달하여 초기화
		Member member2=new Member("bbb");
		member2.display();
		System.out.println("=======================================");
		Member member3=new Member("ccc", "임꺽정");
		member3.display();
		System.out.println("=======================================");
		Member member4=new Member("ddd", "전우치", "ddd@daum.net");
		member4.display();
		System.out.println("=======================================");
	}
}





