package site.itwill.exception;

//����(Exception) : ���α׷��� ��� ���࿡ ���� �߻��Ǵ� ����
//���ܰ� �߻��Ǵ� ��ɿ����� ó���� �ʿ� = ����ó��
//=>�ɰ��� ������ ��� ���α׷� ���� �� ����ó�� ���� �ʴ� ���, ���� �߻�
//=>�ɰ����� ���� ������ ��� JVM�� ���� �ڵ� ����ó���� �ȴ�.
public class ExceptionHandleApp {
	
	public static void main(String[] args)  {
		int[] array = { 10, 20, 30, 40, 50 };

		// ���ܰ� �߻��Ǵ� ����� try������ �ۼ�
		// =>try������ ����� ����� �� ���ܰ� �߻��Ǵ����� ����
		// =>���ܰ� �߻��� ��� ���� Ŭ������ �ν��Ͻ��� �ڵ� ����
		// => catch�� ��Ƴ���
		//=> ���ܰ� �߻��� ��� �ϴܿ� �ۼ��� ��� �̽��� -> catch�������� �̵�
		
		try {

			// �迭������ ÷�ڸ� �߸������ ��� ArrayIndexOutOfBoundsException�� �߻�
			for (int i = 0; i <= array.length; i++) {
				System.out.println("array [" + i + "] = " + array[i]);
			}
			System.out.println("[�޼���] ���α׷��� ���������� ����Ǿ����ϴ�.");
			
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// ���ܰ� �߻��� ���, catch������ ��� ����
			//catch ������ ���������� ���� Ŭ������ �ν��Ͻ��� ���޹޾� ó��
			//���� ó�� : ���α׷� ����ڿ��� �޼����� �����ϰų� �����ڿ��� �����α׸� �����ϱ� ���ؼ�
			System.out.println("[�����޼���] ���α׷� ���࿡ ����ġ ���� ������ �߻��Ǿ����ϴ�.");
			
			//e.getMessage() : ���� ���� ���� �ν��Ͻ��� �����޼����� ��ȯ
			System.out.println("[error Log] �����޼��� = " +e.getMessage());
			
			//������ �߻��� �帧�� �����ؼ� �����ش�.
			e.printStackTrace();
			
		}finally {
			//���ܿ� ������� ����Ǵ� ����� �ۼ�
			System.out.println();
		}
	}
}
