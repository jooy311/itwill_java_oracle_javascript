package site.itwill.thread;

//ThreadŬ������ ��ӹ��� ���Ѱ��(�̹� ����Ŭ������ ��ӹ޴� ���)
//Runnable�������̽��� ��ӹ޾� �ۼ�
//=>run()�޼ҵ� �������̵� ����
//���� ���������� �ʴ´�.��

public class MultiThreadTwo implements Runnable {
	@Override
	public void run() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}
