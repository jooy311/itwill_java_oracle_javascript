package basic;

public class WhileApp {
	public static void main(String[] args) {
		int i =1;
		while(i<=5) {
			System.out.println("Java Programming");
			i++;
		}
		System.out.println("=============================");
		
		int j=1, tot = 0;
		
		do {
			tot += j;
			j++;
		}while(j <=100);
		System.out.println(tot);
		
		System.out.println("=============================");
		
		//a4������ ������ ��� ���� ������ ��� �簢�� ����� 500�� �̻���
		//����� ������ ��� ����� �ϴ�? -> ���������� ���� ������, while�ϴ°� ����
		int cnt = 0;//���� Ƚ���� �����ϱ� ���� ����
		int a4 = 1;
		while( a4 <=500) {
			a4 *=2;
			cnt++;
		}
		System.out.println(cnt + "�� ������ " + a4 + "���� �簢���� �������");
		
		System.out.println("=============================");
		
		//x������ �������� �հ谡 300�̻��� �Ƿ��� x�� ������ ����϶�
		int sum = 0; int x = 0;
		while(sum < 300) {
			x++;
			sum += x;
		}
		System.out.println("�հ谡 300�̻� �Ƿ��� x�� "+ x + "�� �Ǿ�� �մϴ�.");
	}
}
