package enumerate;

public interface InterfaceOne {
	//상수필드(Constant Field) 선언 - public static final 생략 가능
	// => 상수필드 : 값 대신 사용하기 위한 필드
	// => 클래스에서 선언 가능하지만 보다 쉬운 선언을 위해 인터페이스 활용
	int INSERT=1, UPDATE=2, DELETE=3, SELECT=4;
}
