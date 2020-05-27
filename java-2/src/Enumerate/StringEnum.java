package Enumerate;

public enum StringEnum {
	//생성자를 선언한 경우 상수필드 선언시 초기값을 전달해야만 상수필드가 생성됨.
	INSERT("insert"), UPDATE("update"), DELETE("delete"), SELECT("select"); //내부적으로는 자동으로 0,1,2,3이 들어감
	
	//상수필드에 원하는 자료형 또는 값을 저장하기위해 필드를 선언
	//private final 필드로 선언해 주어야함
	//상수필드에 원하는 값을 저장하기 위해 반드시 생성자를 선언
	private final String value;
	
	//상수필드에 초기값을 전달하여 저장하기 위한 생성자 선언
	//생성자는 반드시 private접근지정자를 이용하여 은닉화 선언해야함
	//매개변수에 전달된 값을 필드에 저장하면 상수필드값으로 초기화됨
	
	private StringEnum(String value) {
		this.value = value;
	}

	//상수필드의 값을 확인하기 위해 만든 메소드
	public String getValue() {
		return value;
	}
	
	
	
	
}
