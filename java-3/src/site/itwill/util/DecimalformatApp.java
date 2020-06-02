package site.itwill.util;

import java.text.DecimalFormat;

//10�������� ���������� �����ϱ����� Ŭ����
public class DecimalformatApp {
	public static void main(String[] args) {
		
		//���Ϲ���  : #(����)<-�������� ǥ��, 0(����)<-0���� ǥ��
		DecimalFormat df = new DecimalFormat("###,###,##0");
				
		int number = 1000000000;
		
		System.out.println("�ݾ� = "+ number + " ��");
		
		//DecimalFormat.format(long number) : ���޹��� �������� DecimalFormat
		//�ν��Ͻ��� ����� ���������� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => �������� ������ �ڸ����� �ʰ��ص� ���� ��� 
		
		System.out.println("�ݾ� = "+df.format(number)+"��");
		
		//DecimalFormat.getInstance() : �⺻ ���������� ������ 
		//DecimalFormat �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println("�ݾ� = "+DecimalFormat.getInstance().format(number)+" ��");
		System.out.println("�ݾ� = "+DecimalFormat.getCurrencyInstance().format(number));
	}
}
