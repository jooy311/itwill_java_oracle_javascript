package example;

public class VariableExample {
	public static void main(String[] args) {
		//������ ���̰�7�̰� ������ ���̰� 10�� �簢���� ������ ���
		//�簢���� ���̸� ����Ͽ� ����ϼ���~
		int a = 7;
		int b = 10;
		int ans = a * b;
		System.out.println("�簢���� ���� : "+ ans);
		System.out.println("======================================");
		
		//���̰� 9�̰� �غ��� ���̰� 7�� �ﰢ���� ���̸� ����Ͽ���
		int h = 9;
		int w = 7;
		double result = (double)(h*w)/2;
		System.out.println("�ﰢ���� ���� : "+result);
		System.out.println("======================================");
		
		//10���� ��ü �����԰� 759Ű���ΰ�� ��� �����Ը� ���Ͽ���
		int weight = 759;
		int cnt = 10;
		double ave = (double)weight/cnt;
		System.out.println("��� ������ : " + ave);
		System.out.println("======================================");
		
		//�̸��� ȫ�浿�� �л��� �������� 89��, ���� 93��, ���� 95���� �������
		//������ ����� ����Ͽ� �̸�, ����, ����� ���
		//�� ����� �Ҽ��� ���ڸ� ���� ����ϰ� �������� ����
		int kor = 89, eng = 93, math = 95;
		int total = kor + eng + math;
		float avee = (float)total/3;
		String name = "ȫ�浿";
		System.out.print(name + " ���� : " + total + ", ��� : ");
		System.out.println((int)(avee * 10)/10.0);
		
	}
}
