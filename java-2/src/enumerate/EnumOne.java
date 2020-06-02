package enumerate;

//나열형(Enum Type) : 상수필드를 선언하기 위한 자료형
public enum EnumOne {
	//상수필드 선언 - public static final int 생략 가능
	// => 상수필드에 0부터 1씩 증가되는 정수값이 자동 저장
	INSERT, UPDATE, DELETE, SELECT;
}
