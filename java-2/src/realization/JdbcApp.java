package realization;

//DBMS���� ���α׷�
public class JdbcApp {
	public static void main(String[] args) {
		JdbcOracle ms = new JdbcOracle();
		
		/*
		ms.insert();
		ms.update();
		ms.select();
		ms.delete();
		*/	
		
		//�ý��� ���濡 ���� �ٸ� Ŭ���� ����� ��� ���α׷� ��κ� ���� ó��
		/*JdbcOracle oracle = new JdbcOracle();
		
		oracle.add();
		oracle.delete();
		oracle.insert();
		oracle.select();
		oracle.update();*/
		
		//�������̽��� �̿��Ͽ� Ŭ������ �ۼ��� ���, �ý��� ���濡 ���� �ٸ� Ŭ���� ����, ���α׷� �Ϻθ� ����ó�� �ȴ�.
		//=>Ŭ�������� ���յ��� ���߾�, ���������� ȿ������ ������Ŵ
		//=>���������� �������̽��� ������ �ۼ��Ѵ�
		Jdbc jdbc = new JdbcMysql();
		//������ ��ü ����ȯ�� ���� �ڽĸ޼ҵ尡 ȣ���
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
	}

}
