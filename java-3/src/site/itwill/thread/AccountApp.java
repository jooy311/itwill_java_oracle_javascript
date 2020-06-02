package site.itwill.thread;


//다중스레드의 문제점
//=>동일한 클래스로 생성된 여러개의 스레드가 같은 인스턴스의 메소드를 
//=> 호출할 경우, 메소드 명령에 대한 처리 순서가 불규칙하여 잘못된 결과를 발생시킨다.
//(해결) 여러개의 스레드 중 인스턴스 메소드를 먼저 호출한 경우, 메소드의 명령을 끝날때까지 다른 
//쓰레드의 메소드 호출을 하지 못하도록 방지하도록 한다.
//=>스레드가 요청하는 인스턴스의 메소드를 동기화 처리한다.
public class AccountApp {
	public static void main(String[] args) {
		Account account = new Account(100000);//잔액이 만원
		
		new AccountUser("홍길동", account).start();
		new AccountUser("전우치", account).start();
		new AccountUser("임꺽정", account).start();
		
	}
}
