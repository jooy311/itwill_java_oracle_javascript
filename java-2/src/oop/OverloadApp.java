package oop;

public class OverloadApp {
	
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.display(100);
		ol.displayBoolean(false);
		ol.displayString("ȫ�浿");
		ol.display(12.43);
		System.out.println("==============================");
		//�Ű������� ���޵Ǵ� ���� ���� �ٸ� �޼ҵ尡 ȣ���
		//�޼ҵ� �����ε忡 ���� ��������
		// ������ : ���� �̸��� �޼ҵ带 ȣ���ص� ���¿� ���� �ٸ� �޼ҵ尡 ȣ��Ǵ� ���
		//->�޼ҵ� �����ε�, �޼ҵ� �������̵� (�������̵尡 �� �߿�-��Ӱ� ������ ����)
		ol.display(200);
		ol.displayBoolean(false);
		ol.displayString("�Ӳ���");
		System.out.println("==============================");
		
	}
}
