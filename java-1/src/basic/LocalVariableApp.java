package basic;
//�ڹٴ� ����������°� ��. ��. ����
public class LocalVariableApp {
	int num; //�ʵ庯��(Ŭ������ ���)
	//�ڹٴ� ������ Ŭ���� �ȿ� �ۼ��� ���־����
	//����� �� ���ο����� ����� ������
	//����� ���� ����� ��� ���������� �ڵ��Ҹ��
	public static void main(String[] args) {
		//�������� : �޼ҵ� �Ǵ� ����� �����ο��� ����� ����
		int num1 =100;
		
		{
			//���� ��
			int num2 = 200; //�굵 ��������
			System.out.println("-----���Ǻ� ����-----");
			System.out.println("num1 = " + num1);
			System.out.println("num2 = " + num2);
		}
		System.out.println("-----���Ǻ� �ܺ�-----");
		System.out.println("num1 = " + num1);
		int num2 = 300;
		//���Ǻ� ����� num2������ �ڵ� �Ҹ�Ǿ� ���Ұ���
		System.out.println("num2 = " + num2);
		
	}
}
