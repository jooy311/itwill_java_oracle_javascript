package site.itwill.util;

import java.util.Calendar;

public class CalendarApp {
	public static void main(String[] args) {
		//getInstance() : �ý��ۿ� ����� ��¥�� �ð�������
		// �����ϴ� Ķ���� �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		Calendar now = Calendar.getInstance();
		
		String[] arr = {"��","��","ȭ","��","��","��","��"};
		
		//������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println(now);
		
		//get(int field) : Ķ���� �ν��Ͻ��� ����� ���ڿ� �ð����� �� ����ʵ忡 �ش��ϴ� ������ �޾ƿ� �� �ִ�.
		String year = now.get(Calendar.YEAR) + "�� ";
		String month = (now.get(Calendar.MONTH)+1) + "�� ";
		String date = now.get(Calendar.DATE) +"�� ";
		String day = (arr[now.get(Calendar.DAY_OF_WEEK)-1]) + "���� ";
		
		System.out.println(year + month + date + day);
	}

}
