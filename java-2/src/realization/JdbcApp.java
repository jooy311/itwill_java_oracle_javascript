package realization;

//DBMS(Oracle, Mysql, MS-SQL 등)를 이용한 학생관리 프로그램
public class JdbcApp {
	public static void main(String[] args) {
		/*
		JdbcMysql mysql=new JdbcMysql();
		
		mysql.insert();
		mysql.update();
		mysql.delete();
		mysql.select();
		*/
		
		/*
		//시스템 변경에 의한 다른 클래스를 사용시 프로그램 대부분 변경 처리
		JdbcOracle oracle=new JdbcOracle();
		
		oracle.add();
		oracle.modify();
		oracle.remove();
		oracle.search();
		*/
		
		//인터페이스를 이용하여 클래스를 작성할 경우 시스템 변경에 의한
		//다른 클래스 사용시 프로그램 일부분 변경 처리 가능
		// => 클래스의 결합도를 낮춰 유지보수의 효율성 증가
		// => 참조변수는 인터페이스를 이용하여 생성
		//Jdbc jdbc=new JdbcMysql();
		Jdbc jdbc=new JdbcOracle();
		
		//묵시적 객체 형변환에 의해 자식 인스턴스의 메소드 호출
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
		jdbc.select();
	}
}
