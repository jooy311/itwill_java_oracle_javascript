package basic;

public class OperatorApp {
	public static void main(String[] args) {
		System.out.println(10+20*3);
		System.out.println((10+20) * 3);
		System.out.println("============");
		int a1 = 10;
		System.out.println("a1 = " + a1);
		System.out.println("-a1 = " + (-a1));

		System.out.println(20>10);
		System.out.println(!(20>10));
		
		int a2 = 10, a3 = 10;
		++a2;//������� �ܵ� ����� ��� �������� ��ġ�� �ƹ��� ������ ���� ����
		--a3;
		System.out.println(a2 +" " + a3);
		System.out.println("============");
		
		int a4 = 10;
		int a5 = 10;
		//������� �ٸ� ��ɰ� ���� ���� ��� �������� ��ġ�� ����Ŀ� ������ ��
		int a6 = ++a4;//++��� ������ ���Կ��� ��ɽ���
		int a7 = a5++;//���Ը�� ���� �� ++��ɽ���
		System.out.println(a4 +" " + a5);
		System.out.println(a6 +" " + a7);
		System.out.println("============");
		
		int b1 = 20;
		int b2 =10;
		System.out.println(b1 % b2);
		System.out.println(b1 * b2);
		System.out.println(b1 - b2);
		System.out.println(b1 + b2);
		System.out.println("============");
		
		System.out.println(20 > 10);
		System.out.println(10 != 20);
		System.out.println(10 == 20);
		System.out.println(10 < 20);
		System.out.println(10 <= 20);
		System.out.println("============");
		
		int c = 20;
		System.out.println(c);
		System.out.println(c >= 10 && c <= 30);
		System.out.println(c < 10 || c > 30);
		System.out.println("============");

		int d = 20;
		int d1 = 10;
		//Ʈ���̸� ?��, false�̸� : ��
		System.out.println(d >d1 ? d :d1);
		
		if(d > d1)
			System.out.println(d);
		else 
			System.out.println(d1);
		
		int e =10;
		System.out.println(e);
		System.out.println(e+=5);
		
		
		
		
	}
}
