package basic;

import java.util.Scanner;

public class MenuApp {
	public static void main(String[] args) {
		// Ű����� �޴��� �ϳ��� �Է¹޾� ���ø޴��� ���� ����� �����ϴ� ���α׷��� �ۼ��ϱ�
		// ->���α׷� ���� �޴��� �����ϱ� ������ ����ڿ��� ���ϴ� ����� ��� �����Ѵ�
		// ���ø޴��� �������� ���� ��� �����޼��� ��� �� ���Է�

		Scanner sc = new Scanner(System.in);

		while (true) {
			// �޴� ���
			System.out.println();
			System.out.println("1. �л� ���� �Է� >> ");
			System.out.println("2. �л� ���� ���� >> ");
			System.out.println("3. �л� ���� ���� >> ");
			System.out.println("4. �л� ���� �˻� >> ");
			System.out.println("5. ���α׷� ����>> ");

			System.out.println("[����] �޴��� 1~5 �߿��� ����ּ��� >> ");
			int ch = sc.nextInt();
			
			if(ch <1 || ch >5) {
				System.out.println("[Error] ������ �޴��� �������� �ʽ��ϴ�.");
				continue;
			}
			
			if (ch == 5) {
				System.out.println("[����] ���α׷��� ����˴ϴ�.");
				break;
			}

			switch (ch) {
			case 1:
				System.out.println("[ó�� ���] �л������� �����Ͽ����ϴ�.");
				break;
			case 2:
				System.out.println("[ó�� ���] �л������� �����Ͽ����ϴ�.");
				break;
			case 3:
				System.out.println("[ó�� ���] �л������� �����Ͽ����ϴ�.");
				break;
			case 4:
				System.out.println("[ó�� ���] �л������� �˻��Ͽ����ϴ�.");
				break;

			}

		}
		sc.close();

	}
}
