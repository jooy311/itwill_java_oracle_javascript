package site.itwill.lang;

//Wrapper class : �ڹ� �⺻ �ڷ��� ��� ����ϱ� ���� Ŭ������
//=>Byte, Short, integer, long, float, double, boolean, character
public class WrapperApp {
	public static void main(String[] args) {
//		int num = 100, num2 = 200;
//		int num3 = num + num2;
//		System.out.println("�հ� = " + num3);
		
		//Integer : �������� �����ϱ� ���� Ŭ����
//		Integer num1 = new Integer(100);
//		Integer num2 = new Integer("200");//���������� ���������� �����
//		Integer num3 = Integer.valueOf(num1.intValue() + num2.intValue());
//		System.out.println("�հ� = " + num3.intValue());
//		
		
		//JDK 1.5 ���� ����ڽ�, �����ڽ� ����� �߰���
		//=> autoBoxing ? �ڵ����� boxȭ ��Ű�� �� : �ڵ����� ���� Wrapper �ν��Ͻ���, �ڵ����� ��ȯ�ϴ� ���
		//=> autoUnBoxing ? �ڵ����� unboxȭ �ϴ°� : Wrapper�ν��Ͻ��� �⺻ �ڷ��� ������ �ڵ����� ��ȯ�ϴ� ���
		Integer num1 = 100; //�����ڷ� �ʱ�ȭ ���� �ʾƵ� �˾Ƽ� ó����
		Integer num2 = 200;
		Integer num3 = num1 + num2; //unboxing
		System.out.println("�հ� = " + num3);
		System.out.println("============================================");
		
		Integer number = 50;
		
		System.out.println("number(10) = " +number);//10���� ���
		System.out.println("number(8) = " + Integer.toOctalString(number)); //16����
		System.out.println("number(16) = " + Integer.toHexString(number));
		System.out.println("number(2) = " + Integer.toBinaryString(number));
		String s1 = "100", s2 = "200";
		System.out.println("�հ� = " + (s1+s2)); //���ڿ� ����
		
		//Integer.parseInt(String str) : ���޹��� ���ڿ��� ���������� ��ȯ�Ͽ� ��ȯ�Ѵ�.
		//=> ���޹��� ���ڿ��� ���������� ��ȯ���� ���� ��� NumberFomatException�߻�
		System.out.println("�հ� = " + (Integer.parseInt(s1)+ Integer.parseInt(s2)));
		
		System.out.println("============================================");
		
		
		
		
		
	}
}
