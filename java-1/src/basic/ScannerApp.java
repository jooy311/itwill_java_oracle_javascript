package basic;

import java.util.Scanner;

public class ScannerApp {
	public static void main(String[] args) {
		//Scanner Ŭ���� : �Է���ġ�κ���(Ű����, ���ϵ�) ���� �Է¹޴� �޼ҵ尡 ����� Ŭ������
		//Scanner ��ü ���� : Ű����κ��� ���� �Է¹ޱ� ���� ��ü�� ����
		Scanner sc = new Scanner(System.in);//��ĳ�ʷ� �Է¹��� ������ ������ �����ϰڴٴ� �ǹ�
		
		System.out.print("�̸��Է����ּ��� : ");
		//Ű����� �Է¹��� ���ڿ��� ������ ����
		//sc.nextLine() : �Է°��� ���ڿ��� �Է¹޾� ��ȯ�ϴ� �޼ҵ�
		//�Է°��� ���� ��� �����尡 �Ͻ�����
		//���� �Է��� �� ���͸� �Է��ؾ߸� �����尡 ������
		System.out.println();
		String str = sc.nextLine();
		System.out.print("�¾ �⵵ �Է� : ");
		//ī���� �Է°��� �������� �ƴ� ��� ����(Exception)
		int birth = sc.nextInt();
		
		System.out.println("�̸� : " + str);
		System.out.println("�¾ �⵵ : " +birth);
		
		sc.close();//��ĳ�� ��ü�� �����ϴ� �޼ҵ�(��Ȯ�ϰ� ���ϸ� ��ü�� �������ִ� ��Ʈ���� ����)
		//��, Ű���尡 ���̻� �Է¹��� ���ϰ� �ϴ� ��ɹ�
		//������ ��쿡�� �����־�� ��
	}
}
