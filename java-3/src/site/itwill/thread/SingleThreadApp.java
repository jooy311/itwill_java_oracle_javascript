package site.itwill.thread;

//������ : ���α׷��� ����� �����ϱ����� �۾�����
//���α׷������, JVM�� ���� Main�޼ҵ带 ȣ���� ��� �ڵ����� Main�����尡 �����ȴ�.
//Main�����常�� �̿��Ͽ� ���α׷��ۼ��� �����ϴ� : singleThread(����)������ ���α׷�
//=> ���θ޼ҵ� ����Ǹ�, main������� �ڵ��Ҹ�ȴ�.
public class SingleThreadApp {
	public static void main(String[] args) {
		System.out.println("SingleThreadApp Ŭ������ main()�޼ҵ� ����");
		
		//ThreadŬ���� : ������ ���� ����� �����ϱ� ���� Ŭ����
		//Thread.currentThread(); : ���� ��ɤ��� �����ϴ� Thread�ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//Thread.getName(); : ������ �ν��Ͻ��� �̸��� ��ȯ�ϴ� �޼ҵ�
		System.out.println(Thread.currentThread().getName() + "�� ���� ��ɽ���");
		
		//�ν��Ͻ� ������ �޼ҵ� ȣ��
		//=>�����尡 �̵��Ͽ� �ν��Ͻ� �޼ҵ��� ��ɽ���
		//=>�ν��Ͻ� �޼ҵ��� ����� ������ �� ������ ����...!! �ö� ����(retrun ���� �ִٸ�) ����´�.
		new SingleThread().display();
		
		System.out.println("SingleThreadApp Ŭ������ main()�޼ҵ� ����");
		
	}
}
