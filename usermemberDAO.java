package project.manager.frame;

import java.sql.PreparedStatement;
import java.sql.SQLException;

//DB�� ���õ� ���, �˻�, ����, ���� �۾��� �ϴ� Ŭ����
//DAOŬ������ ���̺�� 1���� �ʿ��ϴ�.
//ȸ�������� �����ϱ� ���� DAOŬ�����̴�.
public class usermemberDAO {
	private static usermemberDAO instance;
	private PreparedStatement checkIDStmt;
	private PreparedStatement checkNameStmt;
	private PreparedStatement getStmt;// ��ȸ?
	private PreparedStatement joinStmt;// ����
	private PreparedStatement updateStmt;// ����

	private usermemberDAO(DBManager dbmanager) throws SQLException {
		String checkId = "select id from USERMEMBER where ID = ?";
		String checkName = "select id from USERMEMBER where NAME = ?";
		String getMember = "select * from USERMEMBER where ID = ?";
		String join = "insert into USERMEMBER values(?, ?, ?, ?, ?)";
		String update = "update USERMEMBER set ID = ?, PWD = ?, NAME = ?, WORKPLACE = ?, SALPERHOUR = ? where ID = ?";

		this.checkIDStmt = dbmanager.create(checkId);
		this.checkNameStmt = dbmanager.create(checkName);
		this.getStmt = dbmanager.create(getMember);
		this.joinStmt = dbmanager.create(join);
		this.updateStmt = dbmanager.create(update);
	}
	
	
}
