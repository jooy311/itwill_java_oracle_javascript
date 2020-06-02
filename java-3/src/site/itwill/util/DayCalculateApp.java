package site.itwill.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출력하는 프로그램
//생년월일을 입력받는다 -> 2000-01-01 >> 2020 - 05-29일
//	[결과] 태어난지 1일 지났습니다.
// 	주의 : 형식에 맞지 않은 생년월일이 입력될 경우 에러메세지를 출력후 프로그램 종료
public class DayCalculateApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calendar now = Calendar.getInstance();
		Calendar person = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//sdf.applyPattern("yyyy-MM-dd");
		
		
		Date birthday = null;

		long days = 0;

		System.out.print("본인의 생일을 입력해 주세요 >> ");
		
		String str = sc.nextLine();
		
		try {
			birthday = sdf.parse(str);
		}
		catch (ParseException e) {
			System.out.println("[error] 형식에 맞지 않습니다.");
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
			System.out.println("형식에 맞게 입력해 주세요");
			System.exit(0);;
		}

		String[] arr = str.split("-");

		String year = arr[0];
		if(year.length() <4) {
			System.out.println("형식에 맞게 입력해 주세요");
			System.exit(0);;
		}
		String month = arr[1];
		if(month.length() < 2) {
			System.out.println("형식에 맞게 입력해 주세요");
			System.exit(0);;
		}
		String date = arr[2];
		if(date.length() <2) {
			System.out.println("형식에 맞게 입력해 주세요");
			System.exit(0);;
		}*/

		//person.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date));

		//days = (now.getTimeInMillis() - person.getTimeInMillis()) / (24 * 60 * 60 * 1000);

		System.out.println("[결과] 태어난지 " + days + " 일 지났습니다.");

	}
}
