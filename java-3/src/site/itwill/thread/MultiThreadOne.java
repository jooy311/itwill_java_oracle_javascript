package site.itwill.thread;

//Thread�� �����ϱ� ���� Ŭ����
//=> ThreadŬ������ ��ӹ޾� �ۼ��Ѵ�.
public class MultiThreadOne extends Thread {
	//Thread�� run�޼ҵ�� �������!!
	//Thread�� �����ϱ� ���� ����� �ۼ��ϴ� run�޼ҵ带 �������̵� ����.
	//�ڲ��ʿ�
	//=>run�޼ҵ尡 ����Ǹ� Thread�� �Ҹ�ȴ�.
	
	@Override
	public void run() {
		for(char i ='A'; i<= 'Z'; i++) {
			System.out.println(i);
			try {
			Thread.sleep(500);
			}catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}
