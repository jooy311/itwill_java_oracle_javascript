package oop;

//Runtime : Java ���α׷��� �����ϴ� JVM ���� ������ �����ϱ� ���� Ŭ����
// => Runtime Ŭ������ �ν��Ͻ��� �������� ���ϰ� ��ȯ�޾� ���

//�̱��� Ŭ����(Singleton Class) : ���α׷��� �ϳ��� �ν��Ͻ��� ������ �������� �ۼ��� Ŭ����
// => �̱��� ������ ������ �����Ͽ� �ۼ��� Ŭ����
public class RuntimeApp {
	public static void main(String[] args) {
		//Runtime Ŭ������ �����ڴ� ����ȭ ����Ǿ� new �����ڷ� �ν��Ͻ� ���� �Ұ���
		//Runtime runtime=new Runtime();
		
		//Runtime.getRuntime() : Runtime �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		// => ������ �ν��Ͻ� ��ȯ - �ϳ��� �ν��Ͻ����� ��ȯ
		// => ��ȯ�� �ν��Ͻ��� ���������� �������� �ʰ� ���
		Runtime runtime1=Runtime.getRuntime();
		Runtime runtime2=Runtime.getRuntime();
		
		System.out.println("runtime1 = "+runtime1);
		System.out.println("runtime2 = "+runtime2);
		
		//��ȯ�� �ν��Ͻ��� ���������� �������� �ʰ� ���
		System.out.println("Runtime.getRuntime() = "+Runtime.getRuntime());
		System.out.println("=======================================");
		System.out.println("û�� �� ��� �޸� ũ�� = "
				+(Runtime.getRuntime().totalMemory()
						-Runtime.getRuntime().freeMemory())+"Byte");
		
		//Runtime.getRuntime().gc();//Garbage Collector ����
		System.gc();
		
		System.out.println("û�� �� ��� �޸� ũ�� = "
				+(Runtime.getRuntime().totalMemory()
						-Runtime.getRuntime().freeMemory())+"Byte");
		System.out.println("=======================================");
		
	}
}
