package example;

public class ForExample {
	public static void main(String[] args) {
		// ���� �̸��� ȭ�鿡 7�� ����ϼ���.
		// ex) ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿
		for (int i = 1; i <= 7; i++)
			System.out.print("���ֿ� ");
		System.out.println();
		System.out.println("============================================");

		// 1~10 ������ ���� �� ¦���� ȭ�鿡 ����ϼ���.
		// ex) 2 4 6 8 10
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("============================================");

		// 1~100 ������ �������� 3�� ��� �հ�� 5�� ��� �հ踦 ����Ͽ�
		// 3�� ��� �հ迡�� 5�� ��� �հ踦 �� ����� ����Ͽ� ����ϼ���.
		// ex) ��� = 633
		int sum = 0;
		int ans = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				ans += i;
			}
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(ans - sum);

		System.out.println("============================================");

		// ������ �� 7���� ȭ�鿡 ����ϼ���.
		// ex) 7 * 1 = 7
		// 7 * 2 = 14
		// ...
		// 7 * 8 = 56
		// 7 * 9 = 63
		for (int i = 7; i <= 7; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);

			}
		}

		System.out.println("============================================");

		// 5!�� ������� ����Ͽ� ����ϼ���.(5! = 5 * 4 * 3 * 2 * 1)
		// ex) 5! = 120
		int res = 1;
		for (int i = 5; i > 0; i--) {
			res *= i;
		}
		System.out.println(res);

		System.out.println("============================================");

		// �� ������ ����� ������ ������ �������� ȭ�鿡 ����ϼ���.
		// ��, �� �ٿ� �������� 7���� ��µǵ��� �ۼ��ϼ���.
		// ex) 
		// 36 37 38 39 40 41 42
		// 43 44 45 46 47 48 49
		// 50 51 52 53 54 55 56
		// 57
		int begin = 36, end = 55;
		int cnt=0;
		for(int i= begin; i<=end; i++) {
			System.out.print(i + "\t");
			cnt++;
			if(cnt==7) {
				System.out.println();
				cnt = 0;
			}
		}
		System.out.println();
/*
		for(int i=1; i<=4; i++) {
			for(int j = 1; j<=7; j++) {
				System.out.print(begin++ + "\t");
				if(begin > end) break;
			}
			System.out.println();
			
		}*/
		
		System.out.println("============================================");

	}
}