package realization;

public interface Printable {
	void print();
	
	//JDK 1.8이상에서는 인터페이스에 명령을 작성 가능한 기본 메소드 선언
	//=>메소드 선언시 default키우드를 이용하여 선언
	//기본메소드(default) : 인터페이스를 상속받은 자식클래스에 
	//=>오버라이드 선언하지 않아도 되는 메소드
	//오버라이드 선언하지 않은 경우 기본메소드가 선언된다.
	default void scan() {
		System.out.println("[에러] 스캔기능을 제공하지 않습니다.");
	}
}
