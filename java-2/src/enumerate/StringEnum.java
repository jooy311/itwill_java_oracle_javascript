package enumerate;

public enum StringEnum {
	//생성자를 선언한 경우 상수필드 선언시 초기값을 전달해야만 상수필드 생성
	INSERT("Insert"), UPDATE("Update"), DELETE("Delete"), SELECT("Select");
	
	//상수필드에 원하는 자료형 또는 값을 저장하기 위해 필드 선언
	// => private final 필드 선언
	// => 상수필드에 원하는 값을 저장하기 위해 반드시 생성자 선언
	private final String value;
	
	//상수필드에 초기값을 전달하여 저장하기 위한 생성자 선언
	// => 생성자는 반드시 private 접근지정자를 이용하여 은닉화 선언
	// => 매개변수에 전달된 값을 필드에 저장하면 상수필드로 초기화 작업 
	private StringEnum(String value) {
		this.value=value;
	}

	//상수필드의 값을 확인하기 위한 Getter 메소드 선언
	public String getValue() {
		return value;
	}
}





