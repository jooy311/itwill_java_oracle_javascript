package site.itwill.access;

//private ���������� : Ŭ�������ο����� ���ٰ����ϴ�
//-> ����ȭ ó���Ҷ� ���� ����
//-> �ʵ�, �޼ҵ忡�� ����Ѵ�.
//=>��, Ŭ���� �ܺο����� ������ �Ұ���
public class PrivateMember {
	private int num;
	
	
	@SuppressWarnings("unused")
	private void display() {
		System.out.println("num = " + num);
	}
}
