package basic;

import java.util.Scanner;

public class InputCheckApp {

	public static void main(String[] args) {
		// Ű����� ������ �Է¹޾� ������ ����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		// ������ 0-100������ �������� �Էµ��� ���� ��� �޼��� ��� �� ���Է��� ���� �� �ֵ��� �Ѵ�
		Scanner sc = new Scanner(System.in);
		
		
		int score ;//�ϴ� ������ ���� ������ �ۿ��� �����Ѵ�
		while (true) {//���� ����
			System.out.print("���� �Է� >> ");
			score = sc.nextInt();
			if (score < 0 || score > 100) {//���� ������ ������ �ȴٸ� ���� �޼��� ���
				System.out.println("[Error : ��������] 0~100������ ������ �Է����ּ���");
			}else {//�����ȿ� ������ break����
				break;
			}
			
		}

		String grade;

		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";

		}

		System.out.println("[���]" + score + "�� " + grade + "����");
	}
}
