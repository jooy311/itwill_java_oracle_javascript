package basic;

public class PrimitiveApp {
	public static void main(String[] args) {
		System.out.println("<<������>>");
		//��¸޼ҵ带 �̿��� ��� 10���� ���������� ���
		System.out.println("������(10����)" + 100);
		System.out.println("������(8����)" + 0100);
		System.out.println("������(16����)" + 0x100);
				
		System.out.println("������(4Byte)" + 2147483647);
		//4����Ʈ�� ǥ���� �� ���� �������� ����� ��� ����
		//System.out.println("������(4Byte)" + 2147483648);
		//4����Ʈ�� ǥ���� �� ���� �������� long���� ǥ���ϸ� ��
		System.out.println("������(8Byte)" + 2147483648L);//�ҹ��� l�� ����
		
		byte a1 = 127;//����Ʈ�� 1����Ʈ -128~127������ ǥ������
		short a2 = 32767;//��Ʈ�� 2����Ʈ -32768~32767
		int a3 = 2147483647;
		long a4 = 2147483648L;//21���� ������ long���� �ϴ°� ���� ����ӵ��� �ٸ�
		
		System.out.println("a1 = " + a1);//�ҹ��� l�� ����
		System.out.println("a2 = " + a2);//�ҹ��� l�� ����
		System.out.println("a3 = " + a3);//�ҹ��� l�� ����
		System.out.println("a4 = " + a4);//�ҹ��� l�� ����
		
		//int a5 = 100L; ������ �ս� ���ɼ��� ���� ���� �߻�
		long a5 = 100;
		System.out.println("a5 = " + a5);//�ҹ��� l�� ����
		System.out.println("==============");//�ҹ��� l�� ����

		System.out.println("<<�Ǽ���>>");
		System.out.println("�Ǽ���(8byte)" + 1.23);
		System.out.println("�Ǽ���(4byte)" + 1.23F);
		//���� �۰ų� ū �Ǽ� ���� ������������ ǥ��
		System.out.println("�Ǽ���(8byte)" + 1.23E9);
		System.out.println("�Ǽ���(8byte)" + 0.000000000123);
		
		float b1 = 1.23456789F;//F�� �� �ٿ��־�� ��
		//�������� ǥ�� ���� : �Ҽ��� 7�ڸ�
		double b2 = 1.23456789;//�������� ǥ������ : �Ҽ��� 15�ڸ�
					
		System.out.println("<<������>>");
		System.out.println("���ڰ� = " + " 'A' ");
		System.out.println("���ڰ� = " + " '��' ");
		System.out.println("���ڰ� = " + " '\' ");
		
		char c1 = 'A';//���ڰ��� ��ӵ� ���������� ����
		char c2 = 65;
		char c3 = 'a' -32;
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		System.out.println("<<����>>");
		System.out.println("���� = " + false);
		System.out.println("���� = " + true);
		
		boolean d1 = false;
		boolean d2 = 20 > 10;
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("<<���ڿ�>>");
		System.out.println("���ڿ� = " + "ȫ�浿");
		System.out.println("\"���ѹα�����\"" + "ȫ�浿");
		
		String s1 = "JAVa";
		//String 
		
	}

}
