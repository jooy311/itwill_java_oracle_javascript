package enumerate;

//Ŭ����(�������̽�)���� ����ʵ带 ������ ����� ����
// => ����ʵ带 �̿��Ͽ� ������(��ǥ��)���� ����ϱ� ������
// => ����ʵ尡 �ǹ��ִ� ���ڿ��� ǥ���ϱ� ������
// => ����ʵ尡 ����� Ŭ����(�������̽�)�� ���ǹ�
//JDK 1.5������ Ŭ����(�������̽�)�� ����ʵ� ������ �����ϱ� ���� ������(Enum Type) �߰�
public class InterfaceApp {
	public static void main(String[] args) {
		//����ʵ� ��� - �ʵ尪 ���
		System.out.println("���� = "+InterfaceOne.INSERT);
		System.out.println("���� = "+InterfaceOne.UPDATE);
		System.out.println("���� = "+InterfaceOne.DELETE);
		System.out.println("�˻� = "+InterfaceOne.SELECT);
		System.out.println("=======================================");
		System.out.println("���� = "+InterfaceTwo.ADD);
		System.out.println("���� = "+InterfaceTwo.MODIFY);
		System.out.println("���� = "+InterfaceTwo.REMOVE);
		System.out.println("�˻� = "+InterfaceTwo.SEARCH);
		System.out.println("=======================================");
		//����ʵ�� ������ �ڷ����� ������ �ʵ尪 ���� ����
		int choice=InterfaceOne.INSERT;
		System.out.println("���� = "+choice);
		System.out.println("=======================================");
		//case Ű���忡 �� ��� ����ʵ� ��� ����
		switch (choice) {
		case InterfaceOne.INSERT:
			System.out.println("# �л������� �����մϴ�.");
			break;
		case InterfaceOne.UPDATE:
			System.out.println("# �л������� �����մϴ�.");
			break;
		case InterfaceOne.DELETE:
			System.out.println("# �л������� �����մϴ�.");
			break;
		case InterfaceOne.SELECT:
			System.out.println("# �л������� �˻��մϴ�.");
			break;
		}
		System.out.println("=======================================");
	}
}







