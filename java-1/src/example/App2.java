package example;

public class App2 {
	public static void main(String[] args) {
		// 245678�ʸ� �Ͻú��� �������� ��ȯ�Ͽ� ����ϼ���.
		int cho = 245678;

		int sec = cho % 60;
		int sec_tmp = cho / 60;
		int min = sec_tmp % 60;
		int min_tmp = sec_tmp / 60;
		int hour = min_tmp % 24;
		int hour_tmp = min_tmp / 24;
		int day = hour_tmp % 24;

		System.out.println(cho + "�� >> " + day + " ��  " + hour + " �ð�  " + min + " ��  " + sec + " �� ");
		System.out.println("===================================");

		// �Ѵ��� ������ 1�� 5õ���� ����⸦ 20�� ������ ��� �����ؾߵ� �ݾ��� ����Ͽ� ����ϼ���.
		// ��, 15�� �̻� ������ ��� 1��� 25% �������� �����Ͽ� ����ϼ���.
		double one_cost = 150_000_000;
		int how_many = 20;

		if (how_many >= 15) {
			one_cost = one_cost * 0.75;
			System.out.print(how_many + " ���� ����⸦ ������ ��� 1��� 25%�� ������ �޾� ");
		} else {
			System.out.print(how_many + " ���� ����⸦ ������ ��� ");
		}
		long result = (long) (one_cost * how_many);
		System.out.println(result + "�� �� �����Ͻø� �˴ϴ�. ");
		System.out.println("===================================");
	}
}