package site.itwill.thread;


//���߽������� ������
//=>������ Ŭ������ ������ �������� �����尡 ���� �ν��Ͻ��� �޼ҵ带 
//=> ȣ���� ���, �޼ҵ� ��ɿ� ���� ó�� ������ �ұ�Ģ�Ͽ� �߸��� ����� �߻���Ų��.
//(�ذ�) �������� ������ �� �ν��Ͻ� �޼ҵ带 ���� ȣ���� ���, �޼ҵ��� ����� ���������� �ٸ� 
//�������� �޼ҵ� ȣ���� ���� ���ϵ��� �����ϵ��� �Ѵ�.
//=>�����尡 ��û�ϴ� �ν��Ͻ��� �޼ҵ带 ����ȭ ó���Ѵ�.
public class AccountApp {
	public static void main(String[] args) {
		Account account = new Account(100000);//�ܾ��� ����
		
		new AccountUser("ȫ�浿", account).start();
		new AccountUser("����ġ", account).start();
		new AccountUser("�Ӳ���", account).start();
		
	}
}
