package site.itwill.thread;

//���߽����� ���α׷�
//Thread �ν��Ͻ��� �����Ͽ� ���ο� �����带 ������ ����� ������ �� �ֵ��� �Ѵ�.
//=>���ο� �����尡 ����� ����� �ۼ��� �޼ҵ带 Thread�ν��Ͻ��� �����ؾ��Ѵ�
//=>��� �����尡 �Ҹ�Ǹ� ���α׷� ���� - System.exit(0);
public class MultiThreadApp {
	public static void main(String[] args) throws InterruptedException {
		//Thread thread = new Thread(); //����� ���� �� �� �ִ� �޼ҵ尡 ����
		
		//ThreadŬ������ ��ӹ��� �ڽ�Ŭ������ �ν��Ͻ� ���� = Thread�ν��Ͻ��� �ᱹ ����
		//=>Thread.start() : Thread�ν��Ͻ��� ���ο� �����带 �����ϴ� �޼ҵ�
		//=>������ ������� �ڵ����� run �޼ҵ� ��� ����
		//=>thread�ν��Ͻ��� �ϳ��� �����常 �������� ->�׷��� ���������� ������ ������ ����
		new MultiThreadOne().start();
		new MultiThreadOne().start();
		
		//Thread�ν��Ͻ��� ���޹޾� Runnable�ν��Ͻ��� ����
		//=> Thread�ν��Ͻ��� run()�޼ҵ尡 ���Ӱ� ������
		new Thread(new MultiThreadTwo()).start();
		
		/*
		for(char i = 'a'; i <='z'; i++) {
			System.out.println(i);
			//�����带 ���ϴ� �ð���ŭ �Ͻ����� ��ų �� ����
			//=>InterruptedException �߻� - ����ó�� �ʿ�
			Thread.sleep(500);;
		}*/
		
		for(int i = 0; i <=9; i++) {
			System.out.println(i);
			Thread.sleep(500);;
		}
	}
}
