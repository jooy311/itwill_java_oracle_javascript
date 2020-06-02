package site.itwill.util;

import java.util.Random;

//난수 관련 기능을 제공하는 클래스
public class RandomApp {
	public static void main(String[] args) {
		//Random(seed) : seed값을 전달하여 랜덤 인스턴스를 생성하는 생성자이다.
		//=> seed :불규칙한 난수가 발생되도록 설정하는 long타입의 정수 변수
		//=> seed값은 System.currentTimeMillis()메소드의 반환값을 사용한다.
		//=> currentTimeMillis : 시스템의 타임스탬프를 사용하여 현재 시간을 반환해주는 메소드
		//=> 타임스탬프 : 1970년 1/1기준으로 초당 1씩 증가
		//=> 자바에서는 ms단위로 1씩 증가되는 long타입의 정수값을 이용한다.
		
		//Random 클래스의 기본생성자는 시드값을 자동으로 제공하여 인스턴스 생성
		Random rd = new Random();
		
		for(int i = 1; i <=5; i++) {
			//rd.nextInt(int bound) : 0~까지의 난수가 발생한다.
			System.out.println(i + " 번째 난수 = " + rd.nextInt(100));
		}
	}
}
