package basic;

public class IfApp {
	public static void main(String[] args) {
		int su = 40;
		// ������ 50�̻��ΰ�츸 ���
		if (su > 50) {
			System.out.println("su = " + su);
		}
		System.out.println("===================================");

		// ������ 60�� �̻��� ��� �հݸ޼����� ��� , �̸��� ���� ���� �޼������
		int score = 80;
		
		if (score >= 60) {
			System.out.println("������ 60�� �̻��̹Ƿ� �հ��Դϴ�.");
		} else {
			System.out.println("������ 60�� �̸��̹Ƿ� ���հ��Դϴ�.");
		}
		System.out.println("===================================");
		
		int num = 9;
		//�������� Ȧ���� ¦���� �����Ͽ� ���
		if(num % 3 == 0) {
			System.out.println("Ȧ���Դϴ�.");
		}else {
			System.out.println("¦���Դϴ�.");
		}
		System.out.println("===================================");
		
		
		char ch = 'O';
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("���빮�� �Դϴ�.");
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("���ҹ��� �Դϴ�.");
		}else {
			System.out.println("�����ڰ� �ƴմϴ�.");		
			}
		System.out.println("===================================");
		
		int jumsu = 85;
		// �������� 0~100������ ��ȿ�� �������� �˻��Ͽ� ���
		//��ȿ���� �Էµ� ��� ������ ����Ͽ� ���
		if(jumsu >= 0 && jumsu <=100) {
			//System.out.println("[���] �������� ���� �ԷµǾ����ϴ�.");
			//������ ���� ������ ����Ͽ� ���
			//100~90 a , 80~90 : b, 10������ f����
			char grade;
			
			if(jumsu >= 90) grade = 'A';
			else if(jumsu >= 80) grade = 'B';
			else if(jumsu >= 70) grade = 'C';
			else if(jumsu >= 60) grade = 'D';
			else grade = 'F';
			
			System.out.println("[���] " +jumsu +"�� >> " + grade + "����");
		
		}else {
			System.out.println("[���] ������ ��� ���� �ԷµǾ����ϴ�.");
						
		}
		System.out.println("===================================");
		
		int choice = 4;
		//������� ������ ���� �����ϴ� ����� �ۼ��� ��� �ʱ�ȭ �߻�����
		//��� ������ ����������� ���� �����Ƿ�
		//���������� ���� �����Ͽ� ���� �����Ѵ�
		//->���� �����ϴ� ���� �����, �ʱⰪ�� �������ִ°��� ���� ����
		//�������� ���� 0, ������ false, �������� null
		String name = "";
		if(choice == 1) {
			name = "ȫ�浿";
		}else if(choice == 2) {
			name = "�Ӳ���";
		}//else name = "�Ѹ�";
		
		System.out.println("[���] ����� ������ ����� " + name + "�Դϴ�.");
		System.out.println("===================================");
		
		boolean flag = false;
		
		if(flag == true) System.out.println("[���]");
		
		
		
	}
}
