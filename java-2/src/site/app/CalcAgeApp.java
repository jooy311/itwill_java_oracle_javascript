package site.app;

import java.util.Date;
import java.util.Scanner;

//키보드로 이름과 태어난 년도를 입력받아 이름과 나이를 계산하여 출력하는 클래스
//=> 이름입력 >> 홍길동
// 태어난년도 입력 >> 2000
// [결과]홍길동님의 나이는 21살입니다.
public class CalcAgeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력 >> ");
		String name = sc.nextLine();
		
		System.out.print("태어난 년도 입력 >> ");
		int birthYear = sc.nextInt();
		
		//java.util.Date클래스로 인스턴스 생성
		//java.util.Date <- 날짜와 시간정보를 저장하기 위한 클래스
		// new Date() -> 실행플랫폼의 현재 날짜와 시간정보를 저장한 인스턴스
		Date now = new Date();
		//Date.toString() : Date인스턴스에 저장된 날짜와 시간정보를 문자열로 반환
		//Date인스턴스가 저장된 참조변수를 출력할 경우 메소드 호출
//		System.out.println(now);
		
		//Date.getYear() : Date인스턴스에 저장된 정보 중 현재 년도를 반환받아 저장(+1900을 해주어야함)
		//Date.getYear() : Date인스턴스에 년도를 반환하는 메소드
		//@deprecated 어노테이션이 적용된 메소드
		//@deprecated : 메소드 호출하는 권장하지 않도록 설정하는 어노테이션
		//@SuppressWarnings("경고") : 해당 속성값으로 설정된 경고를 제거하는 어노테이션 
		//=>다른 속성이 없는 경우 속성값만 설정가능
		@SuppressWarnings("deprecation")
		int currentYear = now.getYear()+1900;
		
		int age = (currentYear - birthYear +1);
		System.out.println("[결과] " + name + "님의 나이는 " + age + " 살 입니다.");
		sc.close();
	}
}
