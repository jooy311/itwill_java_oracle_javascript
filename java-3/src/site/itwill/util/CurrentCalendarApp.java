package site.itwill.util;

import java.util.Calendar;

//���� ����� ���� �޷��� ����ϴ� ���α׷�
public class CurrentCalendarApp {
	public static void main(String[] args) {
		
		//�ν��Ͻ��� ����� ���� �� ���� 1�� ����
		
		Calendar cal = Calendar.getInstance();
	
		//set() : �ν��Ͻ��� ����� ��¥�� �ð����� �� ���ϴ� ����ʵ��� ���� �����ϴ� �޼ҵ�
		cal.set(Calendar.DATE,1);
		
		cal.set(2020,5,1);
		
		//Calendar �ν��Ͻ��� ����� ��¥�� ���� ���ϰ��� ��ȯ�޾� ����
		int week = cal.get(Calendar.DAY_OF_WEEK);//1: �Ͽ���
		
		System.out.println("        " + cal.get(Calendar.YEAR) + "�� " + (cal.get(Calendar.MONTH)+1) + "�� ");
		System.out.println("============================");
		System.out.println(" ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");
		
		//1�Ͽ� ���� ���������� ���� ���
		for(int i = 1; i<week; i++) {
			System.out.print("    ");
		}
		
		//1�Ϻ��� ���������� ������ �ϱ��� ���
		//�Ͽ��� ���ʹ� ���ο� �ٷ� �ٲپ� ���
		//getActualMaximum : Calendar�ν��Ͻ���
		//����� ��¥�� �ð����� �� ���ϴ� ����ʵ��� �ִ밪�� ��ȯ
		for(int i=1; i<=cal.getActualMaximum(Calendar.DATE); i++) {
			if(i <=9) {
				System.out.print("   " + i);
				
			}
			else {
				System.out.print("  " +i);
				
			}
			week++;
			
			if(week% 7 == 1) {
				System.out.println();
			}
		}
		
	
		System.out.println();
		System.out.println("============================");
	}
}
