package site.itwill.thread;

//Thread를 생성하기 위한 클래스
//=> Thread클래스를 상속받아 작성한다.
public class MultiThreadOne extends Thread {
	//Thread의 run메소드는 비어있음!!
	//Thread가 실행하기 위한 명령을 작성하는 run메소드를 오버라이드 선언.
	//★꼭필요
	//=>run메소드가 종료되면 Thread가 소멸된다.
	
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
