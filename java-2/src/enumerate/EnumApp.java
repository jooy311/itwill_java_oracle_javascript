package enumerate;

public class EnumApp {
	public static void main(String[] args) {
		//����ʵ� ��� - �ʵ�� ���
		// => ����ʵ带 �̿��Ͽ� ������(��ǥ��)���� ��� ����
		// => ����ʵ��� �� ��� �ǹ� �ִ� ���ڿ��� ǥ��
		System.out.println("���� = "+EnumOne.INSERT);
		System.out.println("���� = "+EnumOne.UPDATE);
		System.out.println("���� = "+EnumOne.DELETE);
		System.out.println("�˻� = "+EnumOne.SELECT);
		System.out.println("=======================================");
		System.out.println("���� = "+EnumTwo.ADD);
		System.out.println("���� = "+EnumTwo.MODIFY);
		System.out.println("���� = "+EnumTwo.REMOVE);
		System.out.println("�˻� = "+EnumTwo.SEARCH);
		System.out.println("=======================================");
		//����ʵ�� ���� �ڷ����� ������ ���� �Ұ���
		// => ����ʵ�� ������(Enum Type)���� ������ �������� ���� ����
		//int choice=EnumOne.INSERT;
		
		//�������� ������ �����ϱ� ���� �ڷ������� ���
		// => ���������� ����� ����ʵ常 ������ ���� ����
		EnumOne choice=EnumOne.INSERT;
		System.out.println("=======================================");
		//switch ������ ������ ������ �������� ����ʵ常 �� ���
		switch (choice) {
		case INSERT:
			System.out.println("# �л������� �����մϴ�.");
			break;
		case UPDATE:
			System.out.println("# �л������� �����մϴ�.");
			break;
		case DELETE:
			System.out.println("# �л������� �����մϴ�.");
			break;
		case SELECT:
			System.out.println("# �л������� �˻��մϴ�.");
			break;
		}
		System.out.println("=======================================");
	}
}







