package example;

import java.util.Scanner;

//Ű����� ������ �Է¹޾� 1~9 ������ ������ ���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��, �Էµ� ������ 2~9 ������ ������ ����ϸ� ���� ���� ������ �Է��� ��� �޼��� ��� �� ���Է�
//ex) �� �Է�[2~9] >> 7
//    7 * 1 = 7
//    7 * 2 = 14
//    ...
//    7 * 9 = 63
public class GugudanExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		while (true) {
			System.out.print("���� �Է��� �ּ���[2~9�������� ����] >> ");
			dan = sc.nextInt();// �Է¹޴´�
			if (dan <= 9 && dan >= 2) {
				break;// ����� �Է��Ѱ��
			}
			System.out.println("[����] ������ ������ϴ�. �ٽ� �Է��� �ּ���!");

		}

		for (int j = 1; j <= 9; j++) {
			System.out.println(dan + " * " + j + " = " + dan * j);
		}

	}
}
