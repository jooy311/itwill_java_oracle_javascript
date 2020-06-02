package site.itwill.thread;

//������� ����� ������ �����ϱ� ���� Ŭ����
public class AccountUser extends Thread {
	private String userName;
	private Account account;

	public AccountUser() {
		// TODO Auto-generated constructor stub
	}

	public AccountUser(String userName, Account account) {
		super();
		this.userName = userName;
		this.account = account;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	// �Աݰ� ����� �ݺ�ó�� �� �� �ֵ��� �ϴ� �޼ҵ�
	/*
	 * @Override public void run() { for(int i = 1; i<= 3; i++) {
	 * account.deposit(userName, 5000); try {
	 * 
	 * Thread.sleep(1000);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * } }
	 */

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			synchronized (account) {
				account.withDraw(userName, 3000);
			}
			try {

				Thread.sleep(1000);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
