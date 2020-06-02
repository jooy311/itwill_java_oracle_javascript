package site.itwill.thread;

//스레드 : 프로그램의 명령을 실행하기위한 작업단위
//프로그램실행시, JVM에 의해 Main메소드를 호출할 경우 자동으로 Main쓰레드가 생성된다.
//Main쓰레드만을 이용하여 프로그램작성이 가능하다 : singleThread(단일)쓰레드 프로그램
//=> 메인메소드 종료되면, main스레드는 자동소멸된다.
public class SingleThreadApp {
	public static void main(String[] args) {
		System.out.println("SingleThreadApp 클래스의 main()메소드 시작");
		
		//Thread클래스 : 스레드 관련 기능을 제공하기 위한 클래스
		//Thread.currentThread(); : 현재 명령ㅇ을 실행하는 Thread인스턴스를 반환하는 메소드
		//Thread.getName(); : 스레드 인스턴스의 이름을 반환하는 메소드
		System.out.println(Thread.currentThread().getName() + "에 의해 명령실행");
		
		//인스턴스 생성후 메소드 호출
		//=>스레드가 이동하여 인스턴스 메소드의 명령실행
		//=>인스턴스 메소드의 명령을 실행한 후 스레드 복귀...!! 올때 값도(retrun 값이 있다면) 갖고온다.
		new SingleThread().display();
		
		System.out.println("SingleThreadApp 클래스의 main()메소드 종료");
		
	}
}
