package basic;

public class VariableApp {
	public static void main(String[] args) {
		int su;//������ ��������
		su = 100;//������ �������� ����
		
		System.out.print("���� : ");//������ ���
		System.out.println(su);//������ ���
		//int su;//������ �������� �缱���� ���
		su = 200;
		System.out.print("���氪 : ");//�������� ���ŵǰ� ���ο� ������ �����
		System.out.println(su);//�������� ���ŵǰ� ���ο� ������ �����
		System.out.println("=================");//�������� ���ŵǰ� ���ο� ������ �����
		int num = 100;
		System.out.println("num = " +num);//�������� ���ŵǰ� ���ο� ������ �����
		System.out.println("=================");//�������� ���ŵǰ� ���ο� ������ �����
		System.out.println(2+0+2+0+"���� ������Դϴ�.");//�������� ���ŵǰ� ���ο� ������ �����
		System.out.println(""+2+0+2+0+"���� ������Դϴ�.");//�������� ���ŵǰ� ���ο� ������ �����
		//������ �ڷ����� ������ ,��ȣ�� �̿��Ͽ� ���� ���� ������
		int num1 = 100,num2 = 200;
		
		System.out.println("���� ��� = " + num1 + num2);
		System.out.println("���� ��� = " + (num1 + num2));
		System.out.println("���� ��� = " + num1 * num2);
		System.out.println("���� ��� = " + (num1 * num2));//����ӵ��� �� ������
		System.out.println("=================");
		int kor = 88; int eng = 90;
		int total = kor + eng;
		System.out.println("���� �հ� = " + total);//����ӵ��� �� ������
		int number = 0;
		System.out.println("number = " + number);//������ ���� ����Ǿ� ���� ���� ��쿡�� ����
	
	}
}
