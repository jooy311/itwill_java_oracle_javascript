package site.itwill.thread;

//은행계좌정보를 저장하기 위한 클래스
public class Account {
	private int balance; //잔액을 저장하는 변수
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//입금메소드와 출금메소드를 만들어준다.
	//입금메소드
	public synchronized void deposit(String name, int ammount) {
		balance += ammount;
		System.out.println(name + " 님이 " + ammount +" 원을 입금하셨습니다. 잔액은 "
		+ balance +" 원 입니다.");
	}
	
	//출금메소드
	public  void withDraw(String name, int ammount) {
		if(balance < ammount) {
			System.out.println("[error] " + name + " 님, 잔액이 " + balance + "원 남았습니다." + ammount + " 원 출금할 수 없습니다.");
			return;//메소드 종료
		}
		
		balance -= ammount;
		System.out.println(name + " 님이 " + ammount +" 원을 출금하셨습니다. 잔액은 "
				+ balance +" 원 입니다.");
	}
}
