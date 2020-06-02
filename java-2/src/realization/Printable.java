package realization;

public interface Printable {
	void print();
	
	//JDK 1.8 �̻󿡼��� �������̽��� ����� �ۼ��� �� �ִ� �⺻ �޼ҵ� ���� ����
	// => default Ű���带 �̿��Ͽ� �޼ҵ� ����
	//�⺻ �޼ҵ�(Default Method) : �������̽��� ��ӹ��� �ڽ�Ŭ��������
	//�������̵� �������� �ʾƵ� �Ǵ� �޼ҵ�
	// => �������̵� �������� ���� ��� �⺻ �޼ҵ� ȣ��
	default void scan() {
		System.out.println("[����]��ĵ ����� �������� �ʽ��ϴ�.");
	}
}
