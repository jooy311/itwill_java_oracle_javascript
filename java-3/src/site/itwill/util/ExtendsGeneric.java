package site.itwill.util;

//���׸��� ���޵Ǵ� Ŭ������ �����ϱ� ���� extendsŰ���带 ����Ѵ�.
//=>���׸��� ���޵Ǵ� Ŭ������ �θ�Ŭ������ �̿��Ͽ� ������ �� �ִ�.
public class ExtendsGeneric<T extends Number> {// numberŬ������ ��ӹ޴°͸� ���ް����ϴٴ� ��.
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
