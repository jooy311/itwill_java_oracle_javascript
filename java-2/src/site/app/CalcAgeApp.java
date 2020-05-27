package site.app;

import java.util.Date;
import java.util.Scanner;

//Ű����� �̸��� �¾ �⵵�� �Է¹޾� �̸��� ���̸� ����Ͽ� ����ϴ� ���α׷� �ۼ��ϼ���.
//ex) �̸� �Է� >> ȫ�浿
//    �¾ �⵵ �Է� >> 2000
//    [���]ȫ�浿���� ���̴� 21���Դϴ�.
public class CalcAgeApp {
	public static void main(String[] args) {
		//Ű���� �Է°��� �����ޱ� ���� Scanner �ν��Ͻ� ����
		Scanner scanner=new Scanner(System.in);
		
		//Ű����� �̸��� �¾ �⵵�� �Է¹޾� ����
		System.out.print("�̸� �Է� >> ");
		String name=scanner.nextLine();
		
		System.out.print("�¾ �⵵ �Է� >> ");
		int birthYear=scanner.nextInt();
		
		//java.util.Date Ŭ������ �ν��Ͻ� ����
		// => java.util.Date : ��¥�� �ð������� �����ϱ� ���� Ŭ����
		// => new Date() : ���� �ý���(OS)�� ���� ��¥�� �ð������� ������ Date �ν��Ͻ� ����
		Date now=new Date();
		//Date.toString() : Date �ν��Ͻ��� ����� ��¥�� �ð������� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => Date �ν��Ͻ��� ����� ���������� ����� ��� �޼ҵ� ȣ�� ���� ����  
		//System.out.println("now = "+now);
		
		//Date �ν��Ͻ��� ����� ���� �� ���� �⵵�� ��ȯ�޾� ����
		//Date.getYear() : Date �ν��Ͻ��� �⵵�� ��ȯ�ϴ� �޼ҵ�(1900����� ���۵Ǵ� �⵵��)
		// => @Deprecated ������̼��� ����� �޼ҵ�
		//@Deprecated : �޼ҵ� ȣ���ϴ� ���� �������� �ʵ��� �����ϴ� ������̼�
		// => @Deprecated ������̼��� ����� �޼ҵ带 ȣ���� ��� ��� �߻�
		//@SuppressWarnings(value = "���") : value �Ӽ������� ������ ��� �����ϴ� ������̼�
		// => value�ܿ� �ٸ� �Ӽ��� ���� ��� �Ӽ����� ���� ����
		@SuppressWarnings("deprecation")
		int currentYear=now.getYear()+1900;
		
		//���̸� ����Ͽ� ����
		//int age=2020-birthYear+1;
		int age=currentYear-birthYear+1;
		
		//������
		System.out.println("[���]"+name+"���� ���̴� "+age+"���Դϴ�.");
		
		//Scanner �ν��Ͻ��� �̿��Ͽ� �Է���ġ ����
		scanner.close();
	}
}
