package basic;

public class PrimitiveApp {
	public static void main(String[] args) {
		System.out.println("<<정수형>>");
		//출력메소드를 이용할 경우 10진수 정수값으로 출력
		System.out.println("정수값(10진수)" + 100);
		System.out.println("정수값(8진수)" + 0100);
		System.out.println("정수값(16진수)" + 0x100);
				
		System.out.println("정수값(4Byte)" + 2147483647);
		//4바이트로 표현할 수 없는 정수값을 사용할 경우 에러
		//System.out.println("정수값(4Byte)" + 2147483648);
		//4바이트로 표현할 수 없는 정수값은 long으로 표현하면 됨
		System.out.println("정수값(8Byte)" + 2147483648L);//소문자 l도 가능
		
		byte a1 = 127;//바이트는 1바이트 -128~127까지만 표현가능
		short a2 = 32767;//쇼트는 2바이트 -32768~32767
		int a3 = 2147483647;
		long a4 = 2147483648L;//21억이 넘으면 long으로 하는게 나음 연산속도가 다름
		
		System.out.println("a1 = " + a1);//소문자 l도 가능
		System.out.println("a2 = " + a2);//소문자 l도 가능
		System.out.println("a3 = " + a3);//소문자 l도 가능
		System.out.println("a4 = " + a4);//소문자 l도 가능
		
		//int a5 = 100L; 데이터 손실 가능성에 의한 에러 발생
		long a5 = 100;
		System.out.println("a5 = " + a5);//소문자 l도 가능
		System.out.println("==============");//소문자 l도 가능

		System.out.println("<<실수형>>");
		System.out.println("실수값(8byte)" + 1.23);
		System.out.println("실수값(4byte)" + 1.23F);
		//아주 작거나 큰 실수 값은 지수형식으로 표현
		System.out.println("실수값(8byte)" + 1.23E9);
		System.out.println("실수값(8byte)" + 0.000000000123);
		
		float b1 = 1.23456789F;//F를 꼭 붙여주어야 함
		//가수부의 표현 범위 : 소숫점 7자리
		double b2 = 1.23456789;//가수부의 표현범위 : 소수점 15자리
					
		System.out.println("<<문자형>>");
		System.out.println("문자값 = " + " 'A' ");
		System.out.println("문자값 = " + " '한' ");
		System.out.println("문자값 = " + " '\' ");
		
		char c1 = 'A';//문자값은 약속된 정수값으로 저장
		char c2 = 65;
		char c3 = 'a' -32;
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		System.out.println("<<논리형>>");
		System.out.println("논리값 = " + false);
		System.out.println("논리값 = " + true);
		
		boolean d1 = false;
		boolean d2 = 20 > 10;
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("<<문자열>>");
		System.out.println("문자열 = " + "홍길동");
		System.out.println("\"대한민국만세\"" + "홍길동");
		
		String s1 = "JAVa";
		//String 
		
	}

}
