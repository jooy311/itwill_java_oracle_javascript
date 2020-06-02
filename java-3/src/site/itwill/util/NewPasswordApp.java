package site.itwill.util;

import java.util.Random;
import java.util.UUID;

//���ο� ��й�ȣ�� �߱��Ͽ� ����ϴ� ���α׷�
public class NewPasswordApp {
	
	//���ο� ��й�ȣ�� �߱��Ͽ� ��ȯ�ϴ� �޼ҵ�
	public static String newPasswordOne() {
		Random rd = new Random();
		
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUPWSYZ";
		String newpwd = "";
		for(int i = 0; i<10 ; i++) {
			newpwd += str.charAt(rd.nextInt(str.length()));
		}
		return newpwd;
		
	}
	
	public static String newPasswordTwo() {
		//UUIDŬ���� : �������� ������ ���õ� ����� ����
		//UUID.randomUUID() : �������� ����� UUID �ν��Ͻ��� �����Ͽ� ��ȯ
		//=>������ : 36���� ���ڿ� ���ĺ�(�ҹ���) , '-'����(4��)�� ������ ������
		//UUID.toString() : UUID�ν��Ͻ��� ����� �������� ���ڿ��� ��ȯ
		return UUID.randomUUID().toString().replace("-", "").substring(0,10).toUpperCase();
	}
	
	public static void main(String[] args) {
		System.out.println("�ӽú�й�ȣ = " + newPasswordTwo());
	}
}
