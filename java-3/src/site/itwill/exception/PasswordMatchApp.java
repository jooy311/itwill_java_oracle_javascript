package site.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
//import site.itwill.exception.PasswordMIssMatchException;

//키보드로 정수값을 입력받아 비밀번호를 비교하여 결과를 출력하는 프로그램
//throws -> 발생시켜 전달(시켜서 발생시킨다)한다.(알려주는것) - 뭔가 미리 알려주는것.
//throw -> 발생시키는것
public class PasswordMatchApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("비밀번호를 입력해주세요 >>");
			int pwd = sc.nextInt();

			/*if (pwd == 1234) {
				System.out.println("[결과] 입력한 비밀번호가 맞습니다.");
			} else {
				System.out.println("[결과] 비밀번호가 틀렸습니다.");
			}*/
			
			if(pwd != 1234) {
				//throw키워드를 이용하여 인위적으로 예외발생
				//=>예외 클래스로 인스턴스를 생성시켜 예외 발생시킨
				//=>예외를 처리하지 않을경우, 컴파일 오류가 발생
				//=>checked Exception 클래스는 예외를 처리하지 않을경우 컵ㅁ파일에러가 난다
				//checked Exception : 예외 처리후, 쓰레드가 종료가 된다.
				//->무조건 실행되어야 하는 명령은 finally블록에 적어준다.
				throw new PasswordMIssMatchException("[error] 비밀번호가 틀렸습니다.");
			}
			
			System.out.println("[결과] 입력한 비밀번호가 맞습니다.");

		} catch (InputMismatchException e) {
			System.out.println("[error] 비밀번호를 형식에 맞게(숫자만 가능) 작성해주세요");
		}catch (PasswordMIssMatchException str) {
			System.out.println(str.getMessage());
		}finally {
			sc.close();

		}

	}
}
