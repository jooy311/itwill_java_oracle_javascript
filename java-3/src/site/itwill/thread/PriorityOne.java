package site.itwill.thread;

public class PriorityOne extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("A");
		}
	}
}
