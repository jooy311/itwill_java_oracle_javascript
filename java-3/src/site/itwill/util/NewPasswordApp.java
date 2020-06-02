package site.itwill.util;

import java.util.Random;
import java.util.UUID;

//새로운 비밀번호를 발급하여 출력하는 프로그램
public class NewPasswordApp {
	
	//새로운 비밀번호를 발급하여 반환하는 메소드
	public static String newPasswordOne() {
		Random rd = new Random();
		
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUPWSYZ";
		String newpwd = "";
		for(int i = 0; i<10 ; i++) {
			newpwd += str.charAt(rd.nextInt(str.length()));
		}
		return newpwd;
		
	}
	
	public static String newPasswordTwo() {
		//UUID클래스 : 범용적인 고유값 관련된 기능을 제공
		//UUID.randomUUID() : 고유값이 저장된 UUID 인스턴스를 생성하여 반환
		//=>고유값 : 36개의 숫자와 알파벳(소문자) , '-'문자(4개)로 구성된 고유값
		//UUID.toString() : UUID인스턴스에 저장된 고유값을 문자열로 반환
		return UUID.randomUUID().toString().replace("-", "").substring(0,10).toUpperCase();
	}
	
	public static void main(String[] args) {
		System.out.println("임시비밀번호 = " + newPasswordTwo());
	}
}
