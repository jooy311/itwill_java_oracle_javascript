package site.itwill.access;

//private ���������� : Ŭ���� ���ο����� ���� ����(����ȭ) - �ʵ�, �޼ҵ�
// => �ٸ� Ŭ���������� ���� �Ұ���
public class PrivateMember {
	private int num;
	
	@SuppressWarnings("unused")
	private void display() {
		System.out.println("num = "+num);
	}
}
