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
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
//   private DefaultTableModel model;

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
	
	public static usermemberDAO getDAO() {
		usermemberDAO dao = new usermemberDAO();
		return dao;
	}
	

	// ȸ������ �ҷ�����
	public Member getMember(String id)  {
		Member member = null;

		try {
			String getmember = "select * from usermember where id = ?";
			pstmt = conn.prepareStatement(getmember);// sql�� �ؼ����ֶ�
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next())
				member = new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			
		} catch (SQLException e) {
			System.out.println("getMember ����" + e.getMessage());
		}
		
		db_close();
		
		return member;
	}

	// ȸ������
	public boolean join(Member user) throws SQLException  {
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

		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			db_close();
		}

		return this.pstmt.executeUpdate() != 0;
	}

	public int checkUser(String id, String pwd)  {// �α����Ҷ� �ش� ���̵� �´��� üũ�ϱ� ����
		int result = -1;
		
		try {
			String sql = "SELECT * FROM USERMEMBER WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString(2).equals(pwd)) {// �´°��
					result = 1;
				} else {
					result = 2;// ��ġ���� �ʴ°��
				}
			} else if (rs.next() == false) {
				result = 0; // �ش���̵� ���°��
			}
			
		} catch (SQLException e) {
			System.out.println("�α��� üũ ����" +e.getMessage());
		}
		
		
		//db_close();//����ڰ� ���� ���� ��� üũ�ؾ��ϱ� ������ ���⼭ ���� �ʴ´�.
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
		
		db_close();
		
		return this.pstmt.executeUpdate() != 0;
	}

	public boolean checkId(String id)  {
		boolean isAlreadyUser = false;
		String checkId = "SELECT ID FROM USERMEMBER WHERE ID = ?";
		try {
			
			pstmt = conn.prepareStatement(checkId);
			pstmt.setString(1, id);
			if(pstmt.executeQuery().next()) isAlreadyUser = false;
			else isAlreadyUser = true;
			return !pstmt.executeQuery().next();//isAlreadyUser = true ��ȯ : ��밡���� ���̵�(=�˻������ ������Ѵ� pstmt.executeQuery().next()== false)
												//isAlreadyUser=false��ȯ  : ���Ұ� ���̵�(=�˻������ �ִ� pstmt.executeQuery().next()== true)
			
		} catch (SQLException e) {
			System.out.println("���̵� �ߺ�üũ ����" +e.getMessage());
		}

		db_close();
		return isAlreadyUser;
	}

	// ------------ȸ���� paymanager�����ϴ� DAO---------------

	public boolean setinit(String id) throws SQLException {
		boolean flag = false;
		
		String sql = "DELETE PAYMANAGER1 WHERE USERID = ?";
		pstmt = conn.prepareStatement(sql);// sql�� �ؼ����ֶ�
		pstmt.setString(1, id);

		return this.pstmt.executeUpdate() !=0;//pstmt.executeUpdate() != 0 : ������ �� ���� �ִ� ? �� �̸� true yy
	}

	public boolean insertPayData(MemberPayInfo info) throws SQLException {
		String SQL = "INSERT INTO PAYMANAGER1 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
			pstmt.setInt(9, info.getDaysal());
			pstmt.setString(10, info.getSalperhour());

			return this.pstmt.executeUpdate() != 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		// db_close();
		return this.pstmt.executeUpdate() != 0;
	}

	public boolean deleteOnePayData(String id, String workdate) throws SQLException {
		String SQL = "DELETE FROM PAYMANAGER1 WHERE USERID = ? AND WORKDATE = ?";// ���ξ��ص� �ǳ�..?

		pstmt = conn.prepareStatement(SQL);// sql�� �ؼ����ֶ�
		pstmt.setString(1, id);// �α����� ������� id�� �Ű������� �޾� �� ���̵� �ش��ϴ� ������ ��� �ҷ����Բ� �Ѵ�.
		pstmt.setString(2, workdate);

		return this.pstmt.executeUpdate() != 0;
	}

	public boolean updateOnePayData(String id, String colname, String worktime, String daysal ,String changeValue, String workdateY,
			String workdateM, String workdateD) throws SQLException {

		if (colname.equals("��ٽð�")) {
			colname = "STARTTIME";
		} else if (colname.equals("��ٽð�")) {
			colname = "ENDTIME";
		}

		String SQL = "UPDATE PAYMANAGER1 SET " + colname
				+ " = ? , WORKTIME = ? , DAYSAL = ? WHERE USERID = ? AND WORKDATEY = ? AND WORKDATEM = ? AND WORKDATED = ? ";
		//System.out.println(SQL);

		pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, changeValue);
		pstmt.setString(2, worktime);
		pstmt.setString(3, daysal);
		pstmt.setString(4, id);
		pstmt.setString(5, workdateY);
		pstmt.setString(6, workdateM);
		pstmt.setString(7, workdateD);

		return this.pstmt.executeUpdate() != 0;
	}

	public boolean checkWorkDate(String id, String workdate) throws SQLException {// �������� ������ ���� ���ϵ��� ���´�.
		String sql = "SELECT WORKDATE FROM PAYMANAGER1 WHERE USERID= ? AND WORKDATE = ?";
		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, id);
		pstmt.setString(2, workdate);

		return !pstmt.executeQuery().next();
	}

	public Vector<Object[]> selectAllData(String id) throws SQLException {
		String SQL = "SELECT WORKDATEY, WORKDATEM, WORKDATED, STARTTIME, ENDTIME, WORKTIME, DAYSAL, SAL_PER_HOUR FROM PAYMANAGER1 JOIN USERMEMBER ON PAYMANAGER1.USERID = USERMEMBER.ID WHERE PAYMANAGER1.USERID = ? ORDER BY WORKDATEY,WORKDATEM,WORKDATED";

		pstmt = conn.prepareStatement(SQL);// sql�� �ؼ����ֶ�
		pstmt.setString(1, id);// �α����� ������� id�� �Ű������� �޾� �� ���̵� �ش��ϴ� ������ ��� �ҷ����Բ� �Ѵ�.

		rs = pstmt.executeQuery();

		Vector<Object[]> obj = new Vector<Object[]>();

		while (rs.next()) {// ���� ���� �����ͼ� ���̺����� �߰�
			obj.add(new Object[] { rs.getString("WORKDATEY"), rs.getString("WORKDATEM"), rs.getString("WORKDATED"),
					rs.getString("STARTTIME"), rs.getString("ENDTIME"), rs.getString("WORKTIME"),
					rs.getString("DAYSAL"), rs.getString("SAL_PER_HOUR") });
		}

		// db_close();//Ŀ�Ծ��ؼ� ��� �ȶߴ°ſ��� ^^...��Ŭ���������� auto commit�ε� sql������ Ŀ�����־����!!!!!
		return obj;
	}

	public Vector<Object[]> userSelectMonth(String id, String year, String month) throws SQLException {
		String sql = "SELECT WORKDATEY, WORKDATEM, WORKDATED, STARTTIME, ENDTIME, WORKTIME, DAYSAL, SAL_PER_HOUR FROM PAYMANAGER1 WHERE USERID = ? AND WORKDATEY = ? AND WORKDATEM = ? order by WORKDATEY, WORKDATEM, WORKDATED, STARTTIME, ENDTIME ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, year);
		pstmt.setString(3, month);

		rs = pstmt.executeQuery();

		Vector<Object[]> obj = new Vector<Object[]>();

		if (rs.next()) {

			do {// ���� ���� �����ͼ� ���̺����� �߰�
				obj.add(new Object[] { rs.getString("WORKDATEY"), rs.getString("WORKDATEM"), rs.getString("WORKDATED"),
						rs.getString("STARTTIME"), rs.getString("ENDTIME"), rs.getString("WORKTIME"),
						rs.getString("DAYSAL"), rs.getString("SAL_PER_HOUR") });
			} while (rs.next());
		} else {

		}

		return obj;
	}

	public String[] calTotalNow(String id, String year, String month) throws SQLException {// �ѱٹ��ð�, �ѹ���
		String sql = "SELECT WORKTIME, DAYSAL FROM PAYMANAGER1 WHERE USERID = ? AND WORKDATEY = ? AND WORKDATEM = ? order by WORKDATEY, WORKDATEM, WORKDATED, STARTTIME, ENDTIME ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, year);
		pstmt.setString(3, month);

		rs = pstmt.executeQuery();

		int worktimeH = 0, worktimeMM = 0, daySal = 0;
		String[] str = new String[2];

		while (rs.next()) {
			if (rs.getString("WORKTIME").length() == 5) {
				worktimeH += Integer.parseInt(rs.getString("WORKTIME").substring(0, 2));
				worktimeMM += Integer.parseInt(rs.getString("WORKTIME").substring(3));
			}else {
				worktimeH += Integer.parseInt(rs.getString("WORKTIME").substring(0, 1));
				worktimeMM += Integer.parseInt(rs.getString("WORKTIME").substring(2));
			}

			daySal += rs.getInt("DAYSAL");
		}

		int tmpH = worktimeMM / 60;
		worktimeH += tmpH;
		worktimeMM = worktimeMM - (60 * tmpH);
		str[0] = worktimeH + " : " + worktimeMM;
		str[1] = daySal + "";

		return str;
	}

	public int calCountworkDay(String id, String year, String month) throws SQLException {// ���� ���� ���� ī��Ʈ�ϸ�ȴ�. ������ 0
		String sql = "SELECT * FROM PAYMANAGER1 WHERE USERID = ? AND WORKDATEY = ? AND WORKDATEM = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, year);
		pstmt.setString(3, month);
		rs = pstmt.executeQuery();
		
		int count = 0;
		while (rs.next()) {
			count++;
		}
		return count;
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