package basic;

public class TypeCastApp {
	public static void main(String[] args) {
		System.out.println("��� = " + (3 +1.5));//�ڷ����� �ٸ� ���� ������ ��� �ڵ� ����ȯ�Ǿ� ����ó�� ��
		System.out.println("��� = " + (95/10));
		System.out.println("��� = " + (95/10.0));
		
		int kor = 95; int eng = 96;
		int tot = kor+eng;
		double ave = tot/2.0;
		System.out.println("���� : " + tot + " ��� : " + ave);
		int num = (int) 12.3;//cast�����ڸ� �̿��Ͽ� �Ǽ����� ���������� ����ȯ
		
		int num1 = 95; int num2 = 10;
		double num3 = num1/num2;
		System.out.println(num3);
		
		//�������� ū ��� _�� �̿��Ͽ� ǥ�� ����
		int num4 = 100_000_000, num5 = 30;
		//�������� �������� ǥ�������� ��� ��� �����Ⱑ �߻�
		long num6 = (long)num4 *num5;
		System.out.println(num6);
		
		double number =1.23456789;
		System.out.println(number);
		//�Ҽ��� ���ڸ������� ��µǵ���
		System.out.println((int)(number * 100)/100.0);
		System.out.println((int)(number * 100)/100.0);
		
	}
}
