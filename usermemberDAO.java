package project.manager.frame;

import java.sql.PreparedStatement;
import java.sql.SQLException;

//DB와 관련된 등록, 검색, 수정, 삭제 작업을 하는 클래스
//DAO클래스는 테이블당 1개가 필요하다.
//회원정보를 관리하기 위한 DAO클래스이다.
public class usermemberDAO {
	private static usermemberDAO instance;
	private PreparedStatement checkIDStmt;
	private PreparedStatement checkNameStmt;
	private PreparedStatement getStmt;// 조회?
	private PreparedStatement joinStmt;// 가입
	private PreparedStatement updateStmt;// 변경

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
