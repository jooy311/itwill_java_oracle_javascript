package example;

import java.util.Scanner;

//��ǻ�ͷκ��� ������ ���������� Ű����� �Է��Ͽ� ���ߴ� ���α׷��� �ۼ��ϼ���.
// => 1~100 ������ ���������� ���� �޵��� �ۼ�
// => ������ ���� �� �ִ� ��ȸ�� 10���� �����ǵ��� �ۼ�
// => Ű���� �Է°��� 1~100 ������ �ƴ� ��� ���Է�(ok)

// => ������ �Է°��� ������ ��� �Է�Ƚ�� ��� �� ���α׷� ����
// => ������ �Է°��� �ٸ� ��� "ū�� �Է�" �Ǵ� "������ �Է�" ������ �޼��� ���
// => ������ 10�� �ȿ� ������ ���� ��� ���� ���
public class UpAndDownExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int cnt; //������ ���� �� �ִ� ��ȸ�� ���� ���� ����
		System.out.println("[GAME] ���ڸ� �����ּ���! ��ȸ�� 10�� �Դϴ�.");
		int computer = (int) (Math.random() * 100);
		// System.out.println(computer);

		for (int i = 1; i <= 10; i++) {
			int user;
			while (true) {
					System.out.println("[�Է�] 1~100������ ������ �Է��� �ּ���");
					user = sc.nextInt();// ����ڰ� �Է��� ������ �޴´�
			
				if (user <= 100 && user >= 1) {
					break;// ����� �Է��� ���
				}
				System.out.println("[����] ������ ������ϴ�. �ٽ� �Է��� �ּ���!");
			} //
			if (computer == user) { // ������ ������
				System.out.println("[����] " + i + " �� ���� ������ ���߼̽��ϴ�.");
				break;
			} else if (computer > user) {
				System.out.println("[��Ʈ] ���� �� ū ���� �������");

			} else if (computer < user) {
				System.out.println("[��Ʈ] ���� �� ���� ���� �������");
			}

		} // for��

		System.out.println("[����] �־��� ��ȸ 10���� ��� ����ϼ̱� ������ ����˴ϴ�.");
	}
}
