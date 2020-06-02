package site.itwill.util;

import java.text.DecimalFormat;

//10진수관련 패턴정보를 저장하기위한 클래스
public class DecimalformatApp {
	public static void main(String[] args) {
		
		//패턴문자  : #(숫자)<-공백으로 표현, 0(숫자)<-0으로 표현
		DecimalFormat df = new DecimalFormat("###,###,##0");
				
		int number = 1000000000;
		
		System.out.println("금액 = "+ number + " 원");
		
		//DecimalFormat.format(long number) : 전달받은 정수값을 DecimalFormat
		//인스턴스에 저장된 패턴정보의 문자열로 변환하여 반환하는 메소드
		// => 정수값이 패턴의 자릿수를 초과해도 정상 출력 
		
		System.out.println("금액 = "+df.format(number)+"원");
		
		//DecimalFormat.getInstance() : 기본 패턴정보를 저장한 
		//DecimalFormat 인스턴스를 반환하는 메소드
		System.out.println("금액 = "+DecimalFormat.getInstance().format(number)+" 원");
		System.out.println("금액 = "+DecimalFormat.getCurrencyInstance().format(number));
	}
}
