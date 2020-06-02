package site.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//키보드로 정수값 두개를 입력받아 나눈 결과값을 출력하는 프로그램
public class CalcApp {
	public CalcApp() throws InputMismatchException, ArithmeticException {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력해 주세요 >> ");
		int a = sc.nextInt();

		System.out.print("두번째 정수를 입력해 주세요 >> ");
		int b = sc.nextInt();

		
		//if (b != 0) {
			int ans = a / b;
			//0으로 나누는 경우  ArithmeticException발생
			System.out.println(a + " / " + b + " 를 나눈 몫은 " + ans + " 입니다.");
		//}
		
	}

	public static void main(String[] args) {
		/*
		try {
			//인스턴스 생성 = 생성자의 명령 실행
			//=>전달받은 예외를 처리를 해주는 것을 권장
			new CalcApp();
			
		} catch (InputMismatchException e) {
			System.out.println("[error] 정수만을 입력해 주시기 바랍니다.");
		} catch (ArithmeticException e) {
			System.out.println("[error] 0으로 나눌 수 없습니다..");
		} catch (Exception e) {
			// 모든 예외 클래스의 부모클래스 이므로, 생길 수 있는 예외가 많으면 그냥 얘를 쓰는 것이 더 편하다.
			//발생될 수 있는 오류를 먼저쓰고, 마지막에 Exception을 써줘야한다.(제일 마지막)
			System.out.println("[error] 프로그램에 예기치 못한 에러가 발생했습니다.");
		}
	
	*/
		
		try {
			//인스턴스 생성 = 생성자의 명령 실행
			//=>전달받은 예외를 처리를 해주는 것을 권장
			new CalcApp();
			
			//JVM 1.7이상에서는 | 기호로 여러개 한번에 작성 가능하다.
		}  catch (Exception e) {
			// 모든 예외 클래스의 부모클래스 이므로, 생길 수 있는 예외가 많으면 그냥 얘를 쓰는 것이 더 편하다.
			//발생될 수 있는 오류를 먼저쓰고, 마지막에 Exception을 써줘야한다.(제일 마지막)
			System.out.println("[error] 프로그램에 예기치 못한 에러가 발생했습니다.");
		}
		
	}	

}
