package realization;

public class JdbcOracle implements Jdbc {
	public void add() {
		System.out.println("[oracle]�л������� �����߽��ϴ�.");
	}
	
	/*public void insert() {
		System.out.println("[oracle]�л������� �����մϴ�.");
	}
	
	public void update() {
		System.out.println("[oracle]�л������� �˻��մϴ�.");
	}
	
	public void select() {
		System.out.println("[oracle]�л������� �����մϴ�.");
	}
	
	public void delete() {
		System.out.println("[oracle]�л������� �����մϴ�.");
	}*/
	@Override
	public void delete() {
		System.out.println("[oracle]�л������� �˻��մϴ�.");
		
	}@Override
	public void insert() {
		System.out.println("[oracle]�л������� �����մϴ�.");
		
	}@Override
	public void select() {
		System.out.println("[oracle]�л������� �����մϴ�.");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
