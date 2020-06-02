package site.itwill.lang;

//Wrapper class : 자바 기본 자료형 대신 사용하기 위한 클래스ㅜ
//=>Byte, Short, integer, long, float, double, boolean, character
public class WrapperApp {
	public static void main(String[] args) {
//		int num = 100, num2 = 200;
//		int num3 = num + num2;
//		System.out.println("합계 = " + num3);
		
		//Integer : 정수값을 저장하기 위한 클래스
//		Integer num1 = new Integer(100);
//		Integer num2 = new Integer("200");//내부적으로 정수값으로 저장됨
//		Integer num3 = Integer.valueOf(num1.intValue() + num2.intValue());
//		System.out.println("합계 = " + num3.intValue());
//		
		
		//JDK 1.5 에서 오토박싱, 오토언박싱 기능이 추가됨
		//=> autoBoxing ? 자동으로 box화 시키는 것 : 자동으로 값을 Wrapper 인스턴스로, 자동으로 변환하는 기능
		//=> autoUnBoxing ? 자동으로 unbox화 하는것 : Wrapper인스턴스를 기본 자료형 값으로 자동으로 변환하는 기능
		Integer num1 = 100; //생성자로 초기화 하지 않아도 알아서 처리됨
		Integer num2 = 200;
		Integer num3 = num1 + num2; //unboxing
		System.out.println("합계 = " + num3);
		System.out.println("============================================");
		
		Integer number = 50;
		
		System.out.println("number(10) = " +number);//10진수 출력
		System.out.println("number(8) = " + Integer.toOctalString(number)); //16진수
		System.out.println("number(16) = " + Integer.toHexString(number));
		System.out.println("number(2) = " + Integer.toBinaryString(number));
		String s1 = "100", s2 = "200";
		System.out.println("합계 = " + (s1+s2)); //문자열 결합
		
		//Integer.parseInt(String str) : 전달받은 문자열을 정수형으로 변환하여 반환한다.
		//=> 전달받은 문자열이 정수값으로 변환되지 못할 경우 NumberFomatException발생
		System.out.println("합계 = " + (Integer.parseInt(s1)+ Integer.parseInt(s2)));
		
		System.out.println("============================================");
		
		
		
		
		
	}
}
