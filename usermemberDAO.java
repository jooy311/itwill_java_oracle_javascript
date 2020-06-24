package project.manager.frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
//import project.manager.frame.Member;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//DB�� ���õ� ���, �˻�, ����, ���� �۾��� �ϴ� Ŭ����
//DAOŬ������ ���̺�� 1���� �ʿ��ϴ�.
//ȸ�������� �����ϱ� ���� DAOŬ�����̴�.
public class usermemberDAO {
	private static usermemberDAO instance;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
//	private DefaultTableModel model;

	public usermemberDAO() {
		try {
			String ubURL = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbID = "SCOTT";
			String dbPassword = "TIGER";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(ubURL, dbID, dbPassword);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//ȸ������ �ҷ�����
	public Member getMember(String id) throws SQLException {
		Member member = null;

		String getmember = "select * from usermember where id = ?";
		pstmt = conn.prepareStatement(getmember);// sql�� �ؼ����ֶ�
		pstmt.setString(1, id);

		ResultSet rs = pstmt.executeQuery();

		if (rs.next())
			member = new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		return member;
	}

	// ȸ������
	public boolean join(Member user) throws SQLException {
		String SQL = "INSERT INTO USERMEMBER VALUES(? ,? ,? ,?, ?)";
		try {
			pstmt = conn.prepareStatement(SQL);// sql�� �ؼ����ֶ�

			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPwd());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getWorkpalce());
			pstmt.setString(5, user.getSalperhour());
			// return pstmt.executeUpdate();
			return this.pstmt.executeUpdate() != 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		pstmt.close();
		conn.close();
		return this.pstmt.executeUpdate() != 0;
	}
	
	public int checkUser(String id, String pwd) throws SQLException {//�α����Ҷ� �ش� ���̵� �´��� üũ�ϱ� ����
		int result = -1;
		String sql = "SELECT * FROM USERMEMBER WHERE ID = ?";
		pstmt = conn.prepareStatement(sql);// sql�� �ؼ����ֶ�
		pstmt.setString(1, id);

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			if(rs.getString(2).equals(pwd)) {//�´°��
				result = 1; 
			}else {
				result = 2;//��ġ���� �ʴ°��
			}
		}else if(rs.next() == false) {
			result = 0; //�ش���̵� ���°��
		}
		return result;
	}

	// ȸ������ ����
	public boolean update(Member user) throws SQLException {
		String SQL = "UPDATE USERMEMBER SET PWD = ?, NAME = ?, WORKPLACE = ?, SALPERHOUR = ? WHERE ID = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, user.getPwd());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getWorkpalce());
			pstmt.setString(4, user.getSalperhour());
			pstmt.setString(5, user.getId());
			

			return this.pstmt.executeUpdate() != 0; // true�� ���� ����

		} catch (Exception e) {
			e.printStackTrace();
		}
		pstmt.close();
		conn.close();
		return this.pstmt.executeUpdate() != 0;
	}

	public boolean checkId(String id) throws SQLException {
		String checkId = "SELECT ID FROM USERMEMBER WHERE ID = ?";
		pstmt = conn.prepareStatement(checkId);

		pstmt.setString(1, id);
		return !pstmt.executeQuery().next();
	}

	//------------ȸ���� paymanager�����ϴ� DAO---------------
	//�ʱ�ȭtruncate!!
//	public boolean setinit(String id) {
//		String getmember = "DELETE TABLE PAYMANAGER WHERE ID = ?";
//		pstmt = conn.prepareStatement(getmember);// sql�� �ؼ����ֶ�
//		pstmt.setString(1, id);
//
//	}
	
	public boolean insertPayData(MemberPayInfo info) throws SQLException {
		String SQL = "INSERT INTO PAYMANAGER VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(SQL);// sql�� �ؼ����ֶ�

			pstmt.setString(1, info.getId());
			pstmt.setString(2, info.getWorkdate());
			pstmt.setString(3, info.getWorkdateY());
			pstmt.setString(4, info.getWorkdateM());
			pstmt.setString(5, info.getWorkdateD());
			pstmt.setString(6, info.getStarttime());
			pstmt.setString(7, info.getEndtime());
			pstmt.setString(8, info.getWorktime());
			pstmt.setString(9, info.getDaysal());
			
			return this.pstmt.executeUpdate() != 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//db_close();
		return this.pstmt.executeUpdate() != 0;
	}
	
	public boolean deleteOnePayData(String id, String workdate) throws SQLException {
		String SQL = "DELETE FROM PAYMANAGER WHERE USERID = ? AND WORKDATE = ?";//���ξ��ص� �ǳ�..?
		
		pstmt = conn.prepareStatement(SQL);// sql�� �ؼ����ֶ�
		pstmt.setString(1, id);//�α����� ������� id�� �Ű������� �޾� �� ���̵� �ش��ϴ� ������ ��� �ҷ����Բ� �Ѵ�.
		pstmt.setString(2, workdate);
		
		return this.pstmt.executeUpdate() != 0;
	}
	
	public boolean updateOnePayData() {
		String SQL = "UPDATE PAYMANAGER SET  WHERE USERID = ?";
		return this.pstmt.executeUpdate() != 0;
	}
	
	public boolean checkWorkDate(String id, String workdate) throws SQLException {//�������� ������ ���� ���ϵ��� ���´�.
		String sql = "SELECT WORKDATE FROM PAYMANAGER WHERE USERID= ? AND WORKDATE = ?";
		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, id);
		pstmt.setString(2, workdate);

		return !pstmt.executeQuery().next();
	}
	
	public Vector<Object[]> selectAllData(String id) throws SQLException {
		String SQL = "SELECT  WORKDATEY, WORKDATEM, WORKDATED, STARTTIME, ENDTIME, WORKTIME, DAYSAL FROM PAYMANAGER JOIN USERMEMBER ON PAYMANAGER.USERID = USERMEMBER.ID WHERE PAYMANAGER.USERID = ? ORDER BY WORKDATEY,WORKDATEM,WORKDATED";
		
		pstmt = conn.prepareStatement(SQL);// sql�� �ؼ����ֶ�
		pstmt.setString(1, id);//�α����� ������� id�� �Ű������� �޾� �� ���̵� �ش��ϴ� ������ ��� �ҷ����Բ� �Ѵ�.
		
		ResultSet rs = pstmt.executeQuery();
		
		Vector<Object[]> obj = new Vector<Object[]>();
		
		 while(rs.next()) {// ���� ���� �����ͼ� ���̺����� �߰�
           obj.add(new Object[] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7)});
         }
		
		 //db_close();//Ŀ�Ծ��ؼ� ��� �ȶߴ°ſ��� ^^...��Ŭ���������� auto commit�ε� sql������ Ŀ�����־����!!!!!
		 return obj;
	}
	
	public void db_close() {

		try {

			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			System.out.println(e + "=> �ݱ� ����");
		}

	}

}
