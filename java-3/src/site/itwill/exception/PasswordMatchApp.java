package site.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
//import site.itwill.exception.PasswordMIssMatchException;

//Ű����� �������� �Է¹޾� ��й�ȣ�� ���Ͽ� ����� ����ϴ� ���α׷�
//throws -> �߻����� ����(���Ѽ� �߻���Ų��)�Ѵ�.(�˷��ִ°�) - ���� �̸� �˷��ִ°�.
//throw -> �߻���Ű�°�
public class PasswordMatchApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("��й�ȣ�� �Է����ּ��� >>");
			int pwd = sc.nextInt();

			/*if (pwd == 1234) {
				System.out.println("[���] �Է��� ��й�ȣ�� �½��ϴ�.");
			} else {
				System.out.println("[���] ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}*/
			
			if(pwd != 1234) {
				//throwŰ���带 �̿��Ͽ� ���������� ���ܹ߻�
				//=>���� Ŭ������ �ν��Ͻ��� �������� ���� �߻���Ų
				//=>���ܸ� ó������ �������, ������ ������ �߻�
				//=>checked Exception Ŭ������ ���ܸ� ó������ ������� �Ť����Ͽ����� ����
				//checked Exception : ���� ó����, �����尡 ���ᰡ �ȴ�.
				//->������ ����Ǿ�� �ϴ� ����� finally��Ͽ� �����ش�.
				throw new PasswordMIssMatchException("[error] ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
			
			System.out.println("[���] �Է��� ��й�ȣ�� �½��ϴ�.");

		} catch (InputMismatchException e) {
			System.out.println("[error] ��й�ȣ�� ���Ŀ� �°�(���ڸ� ����) �ۼ����ּ���");
		}catch (PasswordMIssMatchException str) {
			System.out.println(str.getMessage());
		}finally {
			sc.close();

		}

	}
}
