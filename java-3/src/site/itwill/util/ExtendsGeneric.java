package site.itwill.util;

//제네릭에 전달되는 클래스를 제한하기 위해 extends키워드를 사용한다.
//=>제네릭에 전달되는 클래스의 부모클래스를 이용하여 제한할 수 있다.
public class ExtendsGeneric<T extends Number> {// number클래스를 상속받는것만 전달가능하다는 뜻.
	private T field;

	public ExtendsGeneric() {
		// TODO Auto-generated constructor stub
	}

	public ExtendsGeneric(T field) {
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
