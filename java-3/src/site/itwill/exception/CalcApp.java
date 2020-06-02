package site.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//Ű����� ������ �ΰ��� �Է¹޾� ���� ������� ����ϴ� ���α׷�
public class CalcApp {
	public CalcApp() throws InputMismatchException, ArithmeticException {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ������ �Է��� �ּ��� >> ");
		int a = sc.nextInt();

		System.out.print("�ι�° ������ �Է��� �ּ��� >> ");
		int b = sc.nextInt();

		
		//if (b != 0) {
			int ans = a / b;
			//0���� ������ ���  ArithmeticException�߻�
			System.out.println(a + " / " + b + " �� ���� ���� " + ans + " �Դϴ�.");
		//}
		
	}

	public static void main(String[] args) {
		/*
		try {
			//�ν��Ͻ� ���� = �������� ��� ����
			//=>���޹��� ���ܸ� ó���� ���ִ� ���� ����
			new CalcApp();
			
		} catch (InputMismatchException e) {
			System.out.println("[error] �������� �Է��� �ֽñ� �ٶ��ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("[error] 0���� ���� �� �����ϴ�..");
		} catch (Exception e) {
			// ��� ���� Ŭ������ �θ�Ŭ���� �̹Ƿ�, ���� �� �ִ� ���ܰ� ������ �׳� �긦 ���� ���� �� ���ϴ�.
			//�߻��� �� �ִ� ������ ��������, �������� Exception�� ������Ѵ�.(���� ������)
			System.out.println("[error] ���α׷��� ����ġ ���� ������ �߻��߽��ϴ�.");
		}
	
	*/
		
		try {
			//�ν��Ͻ� ���� = �������� ��� ����
			//=>���޹��� ���ܸ� ó���� ���ִ� ���� ����
			new CalcApp();
			
			//JVM 1.7�̻󿡼��� | ��ȣ�� ������ �ѹ��� �ۼ� �����ϴ�.
		}  catch (Exception e) {
			// ��� ���� Ŭ������ �θ�Ŭ���� �̹Ƿ�, ���� �� �ִ� ���ܰ� ������ �׳� �긦 ���� ���� �� ���ϴ�.
			//�߻��� �� �ִ� ������ ��������, �������� Exception�� ������Ѵ�.(���� ������)
			System.out.println("[error] ���α׷��� ����ġ ���� ������ �߻��߽��ϴ�.");
		}
		
	}	

}
