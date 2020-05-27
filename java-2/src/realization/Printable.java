package realization;

public interface Printable {
	void print();
	
	//JDK 1.8�̻󿡼��� �������̽��� ����� �ۼ� ������ �⺻ �޼ҵ� ����
	//=>�޼ҵ� ����� defaultŰ��带 �̿��Ͽ� ����
	//�⺻�޼ҵ�(default) : �������̽��� ��ӹ��� �ڽ�Ŭ������ 
	//=>�������̵� �������� �ʾƵ� �Ǵ� �޼ҵ�
	//�������̵� �������� ���� ��� �⺻�޼ҵ尡 ����ȴ�.
	default void scan() {
		System.out.println("[����] ��ĵ����� �������� �ʽ��ϴ�.");
	}
}
