package realization;

//mysql�� �̿��Ͽ�, �л����� ����� �����ϴ� Ŭ����
public class JdbcMysql implements Jdbc {
	@Override
	public void insert() {
		System.out.println("[mysql]�л������� �����մϴ�.");
	}
	
	@Override
	public void update() {
		System.out.println("[mysql]�л������� �˻��մϴ�.");
	}
	
	@Override
	public void select() {
		System.out.println("[mysql]�л������� �����մϴ�.");
	}
	
	@Override
	public void delete() {
		System.out.println("[mysql]�л������� �����մϴ�.");
	}
}
