package site.itwill.thread;

public class PriorityApp {
	public static void main(String[] args) {
		PriorityOne one = new PriorityOne();
		PriorityTwo two = new PriorityTwo();
		
		//Thread.setPriority(int newPriority) : �������� ó�� �켱������ �����ϴ� �޼ҵ�
		one.setPriority(Thread.MAX_PRIORITY);//1~10������ ������ �ο��� �� ����(10 is max , 1 is min)
		two.setPriority(Thread.MIN_PRIORITY);
		
		one.start();
		two.start();
	}
}
