package Enumerate;

public class EnumApp {
	public static void main(String[] args) {
		//����ʵ� ���
		//=>�ʵ尪�� ���������� ��뵵 ������
		//�ʵ尪 ��� �ǹ��ִ� ���ڿ��� ��µ�
		System.out.println("���� = " + EnumOne.INSERT);
		System.out.println("���� = " + EnumOne.DELETE);
		System.out.println("���� = " + EnumOne.UPDATE);
		System.out.println("�˻� = " + EnumOne.SELECT);

		System.out.println("���� = " + EnumTwo.ADD);
		System.out.println("���� = " + EnumTwo.MODIFY);
		System.out.println("���� = " + EnumTwo.REMOVE);
		System.out.println("�˻� = " + EnumTwo.SEARCH);
		
		//����ʵ�� ���� �ڷ����� ������ ����Ұ����ϴ�.
		//=>����ʵ�� enum Ÿ������ ������ �������� ������ �����ϴ�.
		//=>enum Ÿ����ü�� ������ �����ϱ� ���� �ڷ������� ����
		//=>���������� ����� ����ʵ常 ������ ���尡���ϴ�.
		//int choice = EnumOne.DELETE;
		EnumOne choice = EnumOne.INSERT;
		
		switch(choice) {//������ EnumOne�� ������ �����Ƿ� EnumOne�� �������� ����
		case INSERT :
			System.out.println("#�л������� �����մϴ�.");
			break;
		case DELETE :
			System.out.println("#�л������� �����մϴ�.");
			break;
		case UPDATE :
			System.out.println("#�л������� �����մϴ�.");
			break;
		}
	}
}
