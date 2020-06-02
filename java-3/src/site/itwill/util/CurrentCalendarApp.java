package site.itwill.util;

import java.util.Calendar;

//현재 년원에 대한 달려을 출력하는 프로그램
public class CurrentCalendarApp {
	public static void main(String[] args) {
		
		//인스턴스에 저장된 정보 중 일을 1로 변경
		
		Calendar cal = Calendar.getInstance();
	
		//set() : 인스턴스에 저장된 날짜와 시간정보 중 원하는 상수필드의 값을 변경하는 메소드
		cal.set(Calendar.DATE,1);
		
		cal.set(2020,5,1);
		
		//Calendar 인스턴스에 저장된 날짜에 대한 요일값을 반환받아 저장
		int week = cal.get(Calendar.DAY_OF_WEEK);//1: 일요일
		
		System.out.println("        " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+1) + "월 ");
		System.out.println("============================");
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("============================");
		
		//1일에 대한 요일전까지 공백 출력
		for(int i = 1; i<week; i++) {
			System.out.print("    ");
		}
		
		//1일부터 마지막월에 마지막 일까지 출력
		//일요일 부터는 새로운 줄로 바꾸어 출력
		//getActualMaximum : Calendar인스턴스에
		//저장된 날짜와 시간정보 중 원하는 상수필드의 최대값을 반환
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
