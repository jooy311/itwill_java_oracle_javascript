package site.itwill.thread;

//다중스레드 프로그램
//Thread 인스턴스를 생성하여 새로운 쓰레드를 생성ㅁ 명령을 실행할 수 있도록 한다.
//=>새로운 스레드가 실행된 명령이 작성된 메소드를 Thread인스턴스에 정의해야한다
//=>모든 스레드가 소멸되면 프로그램 종료 - System.exit(0);
public class MultiThreadApp {
	public static void main(String[] args) throws InterruptedException {
		//Thread thread = new Thread(); //명령을 실행 할 수 있는 메소드가 없음
		
		//Thread클래스를 상속받은 자식클래스로 인스턴스 생성 = Thread인스턴스가 결국 생성
		//=>Thread.start() : Thread인스턴스로 새로운 스레드를 생성하는 메소드
		//=>생성된 스레드는 자동으로 run 메소드 명령 실행
		//=>thread인스턴스로 하나의 스레드만 생성가능 ->그래서 참조변수를 만들을 이유가 없음
		new MultiThreadOne().start();
		new MultiThreadOne().start();
		
		//Thread인스턴스를 전달받아 Runnable인스턴스를 생성
		//=> Thread인스턴스에 run()메소드가 새롭게 구현ㅅ
		new Thread(new MultiThreadTwo()).start();
		
		/*
		for(char i = 'a'; i <='z'; i++) {
			System.out.println(i);
			//스레드를 원하는 시간만큼 일시중지 시킬 수 있음
			//=>InterruptedException 발생 - 예외처리 필요
			Thread.sleep(500);;
		}*/
		
		for(int i = 0; i <=9; i++) {
			System.out.println(i);
			Thread.sleep(500);;
		}
	}
}
