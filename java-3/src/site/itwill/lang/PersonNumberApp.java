package site.itwill.lang;

import java.util.Scanner;

//Ű����� �ֹε�Ϲ�ȣ�� �Է¹޾� ���������, ������ �����Ͽ� ����ϴ� ���α׷�
// �Է� : �ֹε�Ϲ�ȣ�� 14�ڸ�, 7��° ��ġ�� - ���ڰ� �����ؾ��� ->��ȿ�� �˻��ؾ���
//=> �߸��� ������ �ֹι�ȣ�� �Էµ� ���, �����޼��� ��� ��, ���Է� �޵��� �Ѵ�.
//950311-2111111
//����, �������
public class PersonNumberApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�� ��ȣ�� �Է��� �ּ���( - �� �ݵ�� �����Ͽ� �ֽñ� �ٶ��ϴ�.)");

		while (true) {
			String per_num = sc.nextLine();

			if (per_num.length() == 14 && per_num.indexOf("-") == 6) {

				// -----------------��� �м�------------------

				String tmp = per_num.substring(7, 8);
				String gender = "";

				if (Integer.parseInt(tmp) == 1 || Integer.parseInt(tmp) == 3) {
					gender = "����";
					// System.out.println("[���] ������ �����Դϴ�.");
				} else if (Integer.parseInt(tmp) == 2 || Integer.parseInt(tmp) == 4) {
					gender = "����";
					// System.out.println("[���] ������ �����Դϴ�.");

				}

				String old;

				if (tmp.equals("1") || tmp.equals("2")) {
					old = "19" + per_num.substring(0, 2);
				} else {
					old = "20" + per_num.substring(0, 2);
				}

				System.out.println(
						"[���] " + per_num.substring(0, 2) + " �� ������ " + (2020 - Integer.parseInt(old) + 1) + "�� �Դϴ�.");
				System.out.println("[���] ������ " + per_num.substring(3, 4) + " �� " + per_num.substring(4, 6) + " �� �Դϴ�.");
				System.out.println("[���] ������ " + gender + "�Դϴ�.");

				break;
			}

			if (per_num.length() > 14) {
				System.out.println("���̰� 14�ڸ����� ��ϴ�.. �ٽ� �Է��� �ּ���");

			} else if (per_num.length() > 6 && per_num.indexOf("-") != 6) {
				System.out.println("�ٽ� �Է��� �ּ��� - �� �����Ͽ� �Է��� �ּ���.");

			} else if (per_num.length() < 14) {
				System.out.println("���̰� �ʹ� ª���ϴ�. �ٽ� �Է��� �ּ���");
			}
		}

	}
}
