package site.itwill.exception;

//throws : �޼ҵ��� ��� ���࿡ ���� �߻��Ǵ� ���ܸ� �޼ҵ带 ȣ���� ��ɾ�� �����ϴ� ���
//, ��ȣ�� �̿��Ͽ� �������� ���������� �� �� �ִ�.
public class ExceptionThrowsApp {
	
	public static void displayArray() /*throws ArrayIndexOutOfBoundsException*/ {
		int array[]  = {10,20,30,40,50};
		
		for(int i = 0 ; i<= array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	
	
	//JVM���� ���ܰ� ���޵� ��� �ڵ����� ����ó���� �ȴ�.
	public static void main(String[] args) /*throws ArrayIndexOutOfBoundsException*/ { //displayArray()�Լ��� static�Լ��̱� ������ 
		//ExceptionThrowsApp.displayArray(); : static�Լ��� �ƴϸ� �̷��� ȣ���ؾ���
		
		try {
			//�޼ҵ带 ȣ���� ��� ���޵� ���ܸ� �߻���Ŵ
			displayArray();//�̷��� ȣ���� �����ϴ�.

			
		} catch (Exception e) {
			System.out.println("[�޼���] ���α׷����� ����ġ���� ������ �߻��߽��ϴ�.");
		}
	}
}
