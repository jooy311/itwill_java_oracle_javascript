package site.itwill.util;

//Generic : 필드의 자료형을 클래스(인터페이스) 대신 임의의 식별자를 이용하여 자료형 대신 사용할 수 있다.
//=> 미지정 자료형
//==>클래스 or 인터페이스를 선언할 때, < > 기호를 이용하여 제네릭 타입(식별자)을 선언한다
//=> ,를 이용하여 나열 선언도 가능하다.
//=> 제네릭 타입의 식별자는 대문자로 작성해야함(권장)
public class Generic<T> {
	private T field;
	
	public Generic() {
		// TODO Auto-generated constructor stub
	}

	public Generic(T field) {
		super();
		this.field = field;
	}

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}
	
	
	
}
