package site.itwill.thread;

public class PriorityApp {
	public static void main(String[] args) {
		PriorityOne one = new PriorityOne();
		PriorityTwo two = new PriorityTwo();
		
		//Thread.setPriority(int newPriority) : 쓰레드의 처리 우선순위를 변경하는 메소드
		one.setPriority(Thread.MAX_PRIORITY);//1~10까지의 정수를 부여할 수 있음(10 is max , 1 is min)
		two.setPriority(Thread.MIN_PRIORITY);
		
		one.start();
		two.start();
	}
}
