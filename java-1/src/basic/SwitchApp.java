package basic;

public class SwitchApp {
	public static void main(String[] args) {
		int ch = 1;

		switch (ch) {
		case 1:
			System.out.println("�������� �̵��մϴ�");
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");

		}
		System.out.println("============================");

		ch = 3;
		switch (ch) {
		case 1:
			System.out.println("�������� �̵��մϴ�");
			break;
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
			break;
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");
			break;
		default:
			System.out.println("������ �̵��մϴ�.");// ������ ����Ǵ� ���

		}
		System.out.println("============================");

		// ������ ���� ������ ���
		int jumsu = 100;
		if (jumsu >= 0 && jumsu <= 100) {
			char grade;
			switch (jumsu / 10) {
			case 10:
				grade = 'A';
				break;
			case 9:
				grade = 'B';
			case 8:
				grade = 'C';
			case 7:
				grade = 'D';
			default:
				grade = 'F';

			}
			System.out.println(grade);
		}

		String kor = "��";
		String eng = "";
		switch (kor) {
		case "�ϳ�":
			eng = "One";
			break;
		case "��":
			eng = "Two";
			break;
		case "��":
			eng = "Three";
			break;
		case "��":
			eng = "Four";
			break;
		}
		System.out.println(kor + " " + eng);

	}
}
