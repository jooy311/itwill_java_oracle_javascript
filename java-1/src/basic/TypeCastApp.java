package basic;

public class TypeCastApp {
	public static void main(String[] args) {
		System.out.println("결과 = " + (3 +1.5));//자료형이 다른 값을 연산할 경우 자동 형변환되어 연산처리 됨
		System.out.println("결과 = " + (95/10));
		System.out.println("결과 = " + (95/10.0));
		
		int kor = 95; int eng = 96;
		int tot = kor+eng;
		double ave = tot/2.0;
		System.out.println("총점 : " + tot + " 평균 : " + ave);
		int num = (int) 12.3;//cast연산자를 이용하여 실수값을 정수값으로 형변환
		
		int num1 = 95; int num2 = 10;
		double num3 = num1/num2;
		System.out.println(num3);
		
		//정수값이 큰 경우 _를 이용하여 표현 가능
		int num4 = 100_000_000, num5 = 30;
		//연산결과가 정수값의 표현범위를 벗어난 경우 쓰레기가 발생
		long num6 = (long)num4 *num5;
		System.out.println(num6);
		
		double number =1.23456789;
		System.out.println(number);
		//소수점 두자리까지만 출력되도록
		System.out.println((int)(number * 100)/100.0);
		System.out.println((int)(number * 100)/100.0);
		
	}
}
