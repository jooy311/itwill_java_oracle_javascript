package site.itwill.util;

//Generic : �ʵ��� �ڷ����� Ŭ����(�������̽�) ��� ������ �ĺ��ڸ� �̿��Ͽ� �ڷ��� ��� ����� �� �ִ�.
//=> ������ �ڷ���
//==>Ŭ���� or �������̽��� ������ ��, < > ��ȣ�� �̿��Ͽ� ���׸� Ÿ��(�ĺ���)�� �����Ѵ�
//=> ,�� �̿��Ͽ� ���� ���� �����ϴ�.
//=> ���׸� Ÿ���� �ĺ��ڴ� �빮�ڷ� �ۼ��ؾ���(����)
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
