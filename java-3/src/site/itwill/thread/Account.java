package site.itwill.thread;

//������������� �����ϱ� ���� Ŭ����
public class Account {
	private int balance; //�ܾ��� �����ϴ� ����
	
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
	
	//�Աݸ޼ҵ�� ��ݸ޼ҵ带 ������ش�.
	//�Աݸ޼ҵ�
	public synchronized void deposit(String name, int ammount) {
		balance += ammount;
		System.out.println(name + " ���� " + ammount +" ���� �Ա��ϼ̽��ϴ�. �ܾ��� "
		+ balance +" �� �Դϴ�.");
	}
	
	//��ݸ޼ҵ�
	public  void withDraw(String name, int ammount) {
		if(balance < ammount) {
			System.out.println("[error] " + name + " ��, �ܾ��� " + balance + "�� ���ҽ��ϴ�." + ammount + " �� ����� �� �����ϴ�.");
			return;//�޼ҵ� ����
		}
		
		balance -= ammount;
		System.out.println(name + " ���� " + ammount +" ���� ����ϼ̽��ϴ�. �ܾ��� "
				+ balance +" �� �Դϴ�.");
	}
}
