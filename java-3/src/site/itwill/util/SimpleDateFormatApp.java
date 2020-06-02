package site.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Date인스턴스 관련 기능을 제공하는 메소드
public class SimpleDateFormatApp {
	public static void main(String[] args) {
		Date now = new Date();
		
		//SimpleDateFormat(String Pattern) : Date인스턴스에 저장된 날짜와 시간정보에 대한 패턴정보를 저장하는 인스턴스를 생성하는 
		//생성자 이다.
		//패턴정보(패턴문자로 구현된 문자열) : 패턴문자를 이용하여 구현된 문자열
		//패턴 문자 : y(year) M(month) d(date) H(24Hour) h(12hour) m(minute) s(second) E(요일) 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		
		//SimpleDateFormat.format(Date date) : date인스턴스를 전달받아 simpleDate인스턴스에 저장된 패턴의 문자열로 변환하여 반환하는 메소드
		String date = sdf.format(now);
		System.out.println(date);
		
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(now));
	
		
		String want = "2000-01-01 00:00:00";
		//parse(String str); : SimpleFormat인스턴스와 동일한 패턴의 문자열을 전달받아 date인스턴스로 변환하여 반환
		//=>패턴에 맞지 않은 문자열을 전달할 경우 ParseException을 일으킨다
		try {
			Date wantDate = sdf.parse(want);
			System.out.println("wantDate = " + wantDate);
		} catch (ParseException e) {
			e.getMessage();
		}
		
		
	}
}
