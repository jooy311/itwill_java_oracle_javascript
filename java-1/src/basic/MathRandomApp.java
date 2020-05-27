package basic;

public class MathRandomApp {
	public static void main(String[] args) {
		//컴퓨터로부터 난수값을 제공받아 출력하는 프로그램을 작성해라
		//난수 : 불규칙적으로 발생되는 숫자값
		//Math 클래스 : 수학 관련 기능의 메소드가 선언된 클래스
		//Math.random() 0.0보다 크거나 같고 1.0보다 작은 실수난수를 반환하는 메소드
		
		for(int i=1; i<=5; i++) {
			System.out.println(i+" 번째 실수난수 = " +Math.random());
		}
		
		System.out.println("=================================");
	
		//0~99범위의 정수난수를 제공받아 출력
		for(int i=1; i<=5; i++) {
			System.out.println(i+" 번째 실수난수 = " +(int) (Math.random() * 10));
		}
		
		
		
	}
}
