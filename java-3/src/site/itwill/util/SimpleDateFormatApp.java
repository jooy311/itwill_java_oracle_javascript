package site.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Date�ν��Ͻ� ���� ����� �����ϴ� �޼ҵ�
public class SimpleDateFormatApp {
	public static void main(String[] args) {
		Date now = new Date();
		
		//SimpleDateFormat(String Pattern) : Date�ν��Ͻ��� ����� ��¥�� �ð������� ���� ���������� �����ϴ� �ν��Ͻ��� �����ϴ� 
		//������ �̴�.
		//��������(���Ϲ��ڷ� ������ ���ڿ�) : ���Ϲ��ڸ� �̿��Ͽ� ������ ���ڿ�
		//���� ���� : y(year) M(month) d(date) H(24Hour) h(12hour) m(minute) s(second) E(����) 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
		
		//SimpleDateFormat.format(Date date) : date�ν��Ͻ��� ���޹޾� simpleDate�ν��Ͻ��� ����� ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		String date = sdf.format(now);
		System.out.println(date);
		
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(now));
	
		
		String want = "2000-01-01 00:00:00";
		//parse(String str); : SimpleFormat�ν��Ͻ��� ������ ������ ���ڿ��� ���޹޾� date�ν��Ͻ��� ��ȯ�Ͽ� ��ȯ
		//=>���Ͽ� ���� ���� ���ڿ��� ������ ��� ParseException�� ����Ų��
		try {
			Date wantDate = sdf.parse(want);
			System.out.println("wantDate = " + wantDate);
		} catch (ParseException e) {
			e.getMessage();
		}
		
		
	}
}
