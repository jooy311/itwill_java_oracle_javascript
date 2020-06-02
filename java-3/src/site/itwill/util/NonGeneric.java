package site.itwill.util;

//필드의 자료형 따라 클래스를 여러개 만드는 경우도 있다.
//해결) 필드의 자료형을 Object 클래스로 선언하여 모든 인스턴스 저장
public class NonGeneric {
	private Object field;
	
	public NonGeneric() {
		// TODO Auto-generated constructor stub
	}

	public NonGeneric(Object field) {
		super();
		this.field = field;
	}

	public Object getField() {
		return field;
	}

	public void setField(Object field) {
		this.field = field;
	}
	
	
	
}
