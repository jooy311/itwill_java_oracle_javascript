package site.itwill.util;

import java.util.Calendar;

public class CalendarApp {
	public static void main(String[] args) {
		//getInstance() : 시스템에 저장된 날짜와 시간정보를
		// 저장하는 캘린더 인스턴스를 반환하는 메소드
		Calendar now = Calendar.getInstance();
		
		String[] arr = {"일","월","화","수","목","금","토"};
		
		//정보를 문자열로 변환하여 반환하는 메소드
		System.out.println(now);
		
		//get(int field) : 캘린더 인스턴스에 저장된 날자와 시간정보 중 상수필드에 해당하는 정보를 받아올 수 있다.
		String year = now.get(Calendar.YEAR) + "년 ";
		String month = (now.get(Calendar.MONTH)+1) + "월 ";
		String date = now.get(Calendar.DATE) +"일 ";
		String day = (arr[now.get(Calendar.DAY_OF_WEEK)-1]) + "요일 ";
		
		System.out.println(year + month + date + day);
	}

}
