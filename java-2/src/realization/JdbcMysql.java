package realization;

//Mysql DBMS를 이용하여 학생관리 기능을 제공하는 클래스
public class JdbcMysql implements Jdbc {
	@Override
	public void insert() {
		System.out.println("[Mysql]학생정보를 저장 하였습니다.");
	}
	
	@Override
	public void update() {
		System.out.println("[Mysql]학생정보를 변경 하였습니다.");
	}
	
	@Override
	public void delete() {
		System.out.println("[Mysql]학생정보를 삭제 하였습니다.");
	}
	
	@Override
	public void select() {
		System.out.println("[Mysql]학생정보를 검색 하였습니다.");
	}
}
