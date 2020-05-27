package realization;

//mysql을 이용하여, 학생관리 기능을 제공하는 클래스
public class JdbcMysql implements Jdbc {
	@Override
	public void insert() {
		System.out.println("[mysql]학생정보를 저장합니다.");
	}
	
	@Override
	public void update() {
		System.out.println("[mysql]학생정보를 검색합니다.");
	}
	
	@Override
	public void select() {
		System.out.println("[mysql]학생정보를 선택합니다.");
	}
	
	@Override
	public void delete() {
		System.out.println("[mysql]학생정보를 삭제합니다.");
	}
}
