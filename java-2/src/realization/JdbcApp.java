package realization;

//DBMS(Oracle, Mysql, MS-SQL ��)�� �̿��� �л����� ���α׷�
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
		//�ý��� ���濡 ���� �ٸ� Ŭ������ ���� ���α׷� ��κ� ���� ó��
		JdbcOracle oracle=new JdbcOracle();
		
		oracle.add();
		oracle.modify();
		oracle.remove();
		oracle.search();
		*/
		
		//�������̽��� �̿��Ͽ� Ŭ������ �ۼ��� ��� �ý��� ���濡 ����
		//�ٸ� Ŭ���� ���� ���α׷� �Ϻκ� ���� ó�� ����
		// => Ŭ������ ���յ��� ���� ���������� ȿ���� ����
		// => ���������� �������̽��� �̿��Ͽ� ����
		//Jdbc jdbc=new JdbcMysql();
		Jdbc jdbc=new JdbcOracle();
		
		//������ ��ü ����ȯ�� ���� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
		jdbc.select();
	}
}
