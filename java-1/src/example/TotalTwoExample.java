package example;

import java.util.Scanner;

//Ű����� ������ ��� �Է¹޾� �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��, �Էµ� ������ 0�� ��� �Է��� �����Ͽ� �հ� ���
//ex) ���� �Է�[0:����] >> 10
//    ���� �Է�[0:����] >> 20
//    ���� �Է�[0:����] >> 30
//    ���� �Է�[0:����] >> 0
//    [���]�հ� = 90
public class TotalTwoExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("���� �Է�[0 : ����] >> ");
			int tmp = sc.nextInt();
			if(tmp == 0) {
				break;
			}else {
				sum += tmp;
			}
		}
		
		System.out.println("[���] �հ� = " + sum);
	}
}






