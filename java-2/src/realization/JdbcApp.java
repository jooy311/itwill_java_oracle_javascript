package realization;

//DBMS관리 프로그램
public class JdbcApp {
	public static void main(String[] args) {
		JdbcOracle ms = new JdbcOracle();
		
		/*
		ms.insert();
		ms.update();
		ms.select();
		ms.delete();
		*/	
		
		//시스템 변경에 의한 다른 클래스 사용할 경우 프로그램 대부분 변경 처리
		/*JdbcOracle oracle = new JdbcOracle();
		
		oracle.add();
		oracle.delete();
		oracle.insert();
		oracle.select();
		oracle.update();*/
		
		//인터페이스를 이용하여 클래스를 작성할 경우, 시스템 변경에 의한 다른 클래스 사용시, 프로그램 일부만 변경처리 된다.
		//=>클래스들의 결합도를 낮추어, 유지보수에 효율성을 증가시킴
		//=>참조변수는 인터페이스를 가지고 작성한다
		Jdbc jdbc = new JdbcMysql();
		//묵시적 객체 형변환에 의해 자식메소드가 호출됨
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
	}

}
