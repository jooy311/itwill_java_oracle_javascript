package site.app;

import java.util.Date;
import java.util.Scanner;

//Ű����� �̸��� �¾ �⵵�� �Է¹޾� �̸��� ���̸� ����Ͽ� ����ϴ� Ŭ����
//=> �̸��Է� >> ȫ�浿
// �¾�⵵ �Է� >> 2000
// [���]ȫ�浿���� ���̴� 21���Դϴ�.
public class CalcAgeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��Է� >> ");
		String name = sc.nextLine();
		
		System.out.print("�¾ �⵵ �Է� >> ");
		int birthYear = sc.nextInt();
		
		//java.util.DateŬ������ �ν��Ͻ� ����
		//java.util.Date <- ��¥�� �ð������� �����ϱ� ���� Ŭ����
		// new Date() -> �����÷����� ���� ��¥�� �ð������� ������ �ν��Ͻ�
		Date now = new Date();
		//Date.toString() : Date�ν��Ͻ��� ����� ��¥�� �ð������� ���ڿ��� ��ȯ
		//Date�ν��Ͻ��� ����� ���������� ����� ��� �޼ҵ� ȣ��
//		System.out.println(now);
		
		//Date.getYear() : Date�ν��Ͻ��� ����� ���� �� ���� �⵵�� ��ȯ�޾� ����(+1900�� ���־����)
		//Date.getYear() : Date�ν��Ͻ��� �⵵�� ��ȯ�ϴ� �޼ҵ�
		//@deprecated ������̼��� ����� �޼ҵ�
		//@deprecated : �޼ҵ� ȣ���ϴ� �������� �ʵ��� �����ϴ� ������̼�
		//@SuppressWarnings("���") : �ش� �Ӽ������� ������ ��� �����ϴ� ������̼� 
		//=>�ٸ� �Ӽ��� ���� ��� �Ӽ����� ��������
		@SuppressWarnings("deprecation")
		int currentYear = now.getYear()+1900;
		
		int age = (currentYear - birthYear +1);
		System.out.println("[���] " + name + "���� ���̴� " + age + " �� �Դϴ�.");
		sc.close();
	}
}
