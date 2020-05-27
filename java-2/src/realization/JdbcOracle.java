package realization;

public class JdbcOracle implements Jdbc {
	public void add() {
		System.out.println("[oracle]학생정보를 저장했습니다.");
	}
	
	/*public void insert() {
		System.out.println("[oracle]학생정보를 저장합니다.");
	}
	
	public void update() {
		System.out.println("[oracle]학생정보를 검색합니다.");
	}
	
	public void select() {
		System.out.println("[oracle]학생정보를 선택합니다.");
	}
	
	public void delete() {
		System.out.println("[oracle]학생정보를 삭제합니다.");
	}*/
	@Override
	public void delete() {
		System.out.println("[oracle]학생정보를 검색합니다.");
		
	}@Override
	public void insert() {
		System.out.println("[oracle]학생정보를 저장합니다.");
		
	}@Override
	public void select() {
		System.out.println("[oracle]학생정보를 선택합니다.");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
