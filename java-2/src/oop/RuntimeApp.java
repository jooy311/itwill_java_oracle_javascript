package oop;

//��Ÿ�� : java���α׷��� �����ϴ� JVM���� ������ �����ϱ� ���� Ŭ����
//=>��Ÿ�� Ŭ������ �ν��Ͻ��� �������� ���ϰ� ��ȯ�޾� �����
//���α׷��� �ϳ��� �ν��Ͻ����� ������ �������� �ۼ��� Ŭ����
//�� Ŭ������ �츮�� singletone class��� �Ѵ�.
//->�̱��� ������ ������ �����Ͽ� �ۼ��� Ŭ������

public class RuntimeApp {
	public static void main(String[] args) {
		//��Ÿ�� Ŭ������ �����ڴ� ����ȭ ����Ǿ� new�����ڷ� �ν��Ͻ� ������ �Ұ�����
		//Runtime runtime = new Runtime();
		
		//Runtime.getRuntime() : ��Ÿ�� �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		
		Runtime runtime = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		
		//����غ��� �޸� �ּҰ� ����.
		//������� �޸� ������ ���ٴ� �����
		//�Ϲ� Ŭ������ ��ü�� ������ �����ϸ� ���Ӱ� ����� ���̱� ������ �ּҰ��� �ٸ�����,
		//getRuntime�޼ҵ�� ������ �ν��Ͻ��� ��ȯ�Ѵ� -> �� �ϳ��� �ν��Ͻ����� ��ȯ�Ѵ�
		System.out.println("runtime = " + runtime);
		System.out.println("runtime2 = " + runtime2);
		
		
	}
}
