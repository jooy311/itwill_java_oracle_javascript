package Enumerate;

//Ŭ����(�������̽�)���� ����ʵ带 ������ ��� ������
//=>����ʵ�� ���� ��ǥ������ ǥ���ϱ� �������ϴ�.
//=>����ʵ尡 �ǹ��ִ� ���ڿ��� ǥ������ �ʴ´�.
//=>����ʵ尡 ����� Ŭ����(�������̽�) : ���ǹ�
//JDK 1.5 ���� ���� ������ �����ϱ� ���� ������ �ڷ����� �������.
public interface InterfaceApp {
	public static void main(String[] args) {
		// ����ʵ� ��� = �ʵ尪 ���
		System.out.println("����" + InterfaceOne.INSERT);
		System.out.println("����" + InterfaceOne.DELETE);
		System.out.println("����" + InterfaceOne.UPDATE);
		System.out.println("�˻�" + InterfaceOne.SELECT);
		System.out.println("=======================================");
		System.out.println("�˻�" + InterfaceTwo.ADD);
		System.out.println("�˻�" + InterfaceTwo.MODIFY);
		System.out.println("�˻�" + InterfaceTwo.REMOVE);
		System.out.println("�˻�" + InterfaceTwo.SEARCH);
		System.out.println("=======================================");

		// ����ʵ�� ������ �ڷ����� ������ �ʵ尪���� ����
		int choice = InterfaceOne.INSERT;
		System.out.println("���� = " + choice);

		switch (choice) {
		case InterfaceOne.INSERT:
			System.out.println("# �л������� �����մϴ�.");
			break;

		case InterfaceOne.DELETE:
			System.out.println("# �л������� �����մϴ�.");
			break;
		case InterfaceOne.SELECT:
			System.out.println("# �л������� �˻��մϴ�.");
			break;
		case InterfaceOne.UPDATE:
			System.out.println("# �л������� �����մϴ�.");
			break;
	
		
		}

	}
}
