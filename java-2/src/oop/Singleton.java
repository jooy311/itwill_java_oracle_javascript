package oop;

//싱글톤 디자인 패턴을 적용하여 작성한 클래스 - 싱글톤 클래스
// => 프로그램에 인스턴스를 하나만 제공하기 위한 클래스
public class Singleton {
	//현재 클래스의 인스턴스 정보를 저장하기 위한 참조필드 선언 - 시스템 필드로 선언
	//시스템 필드 : 클래스 내부에서만 사용될 값을 저장하기 위한 필드
	// => Getter & Setter 메소드 미선언
	// => 필드의 이름은 _로 시작되도록 선언하는 것을 권장
	//private static Singleton _instance=new Singleton();
	private static Singleton _instance;
	
	//정적영역(Static Block) : 클래스가 메모리에 로딩된 후 자동 실행될 명령을 작성하는 영역
	// => 정적영역의 명령은 프로그램에서 단 한번만 실행
	static {
		_instance=new Singleton();
	}
	
	//생성자를 은닉화 처리 - 인스턴스 생성 불가
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	//시스템 필드에 저장된 인스턴스 정보를 반환하는 메소드 
	public static Singleton getInstance() {
		return _instance;
	}
	
	public void display() {
		System.out.println("Singleton 클래스의 display() 메소드 호출");
	}
}
