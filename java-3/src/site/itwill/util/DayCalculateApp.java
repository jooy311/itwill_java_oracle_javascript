package site.itwill.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//Ű����� ��������� �Է¹޾� ���ñ��� ��ƿ� ��¥(��)�� ����Ͽ� ����ϴ� ���α׷�
//��������� �Է¹޴´� -> 2000-01-01 >> 2020 - 05-29��
//	[���] �¾�� 1�� �������ϴ�.
// 	���� : ���Ŀ� ���� ���� ��������� �Էµ� ��� �����޼����� ����� ���α׷� ����
public class DayCalculateApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calendar now = Calendar.getInstance();
		Calendar person = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//sdf.applyPattern("yyyy-MM-dd");
		
		
		Date birthday = null;

		long days = 0;

		System.out.print("������ ������ �Է��� �ּ��� >> ");
		
		String str = sc.nextLine();
		
		try {
			birthday = sdf.parse(str);
		}
		catch (ParseException e) {
			System.out.println("[error] ���Ŀ� ���� �ʽ��ϴ�.");
		}finally {
			sc.close();
		}
		
		//days = (new Date().getTime() - birthday.getTime()/(24 * 60 * 60 * 1000));
		days = (System.currentTimeMillis()  - birthday.getTime())/(24 * 60 * 60 * 1000);
		
		/*int cnt = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == '-') {
				cnt++;
			}
		}
		if(cnt < 2) {
			System.out.println("���Ŀ� �°� �Է��� �ּ���");
			System.exit(0);;
		}

		String[] arr = str.split("-");

		String year = arr[0];
		if(year.length() <4) {
			System.out.println("���Ŀ� �°� �Է��� �ּ���");
			System.exit(0);;
		}
		String month = arr[1];
		if(month.length() < 2) {
			System.out.println("���Ŀ� �°� �Է��� �ּ���");
			System.exit(0);;
		}
		String date = arr[2];
		if(date.length() <2) {
			System.out.println("���Ŀ� �°� �Է��� �ּ���");
			System.exit(0);;
		}*/

		//person.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date));

		//days = (now.getTimeInMillis() - person.getTimeInMillis()) / (24 * 60 * 60 * 1000);

		System.out.println("[���] �¾�� " + days + " �� �������ϴ�.");

	}
}
