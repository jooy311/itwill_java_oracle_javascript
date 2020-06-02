package site.itwill.thread;

//Thread클래스를 상속받지 못한경우(이미 따른클래스를 상속받는 경우)
//Runnable인터페이스를 상속받아 작성
//=>run()메소드 오버라이드 선언
//별로 권장하지는 않는다.ㅆ

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
