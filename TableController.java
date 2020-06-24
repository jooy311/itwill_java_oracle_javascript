package project.manager.frame;

import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class TableController extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private usermemberDAO dao = new usermemberDAO();
	// private MemberPayInfo info;
	private String id;
	private Vector<Object[]> data = new Vector<Object[]>();
	private final String header[] = { "��","��","��", "��ٽð�", "��ٽð�", "�ٹ��ð�", "�ϱ�" };

	public TableController(String id) {
		this.id = id;
		try {
			data = dao.selectAllData(id);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getColumnName(int column) {
		return header[column];
	}

	@Override
	public int getColumnCount() {// ���� ���� ��ȯ
		return header.length;
	}

	@Override
	public int getRowCount() {// ���� ���� ��ȯ
		//System.out.println(data.size());
		return data.size();
	}

	@Override
	public Object getValueAt(int r, int c) {// �־��� ����� ��ġ�� ����� �����͸� ��ȯ
		return data.get(r)[c];
	}
	

	@Override
	public boolean isCellEditable(int row, int column) {// �������� ���ϰ� �������� �ڵ�
		if (column >= 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override			//������ ������ ��		������ ���ε���		�������÷��ε���
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {//�����ϱ� ����
		super.setValueAt(aValue, rowIndex, columnIndex);
	}

	public void addMemberPayInfo(MemberPayInfo info) {//��ü�� �߰��ϱ����� -> table�� �����߰��ϴ°� �ƴ϶� ��Ʈ�ѷ��� �߰��Ͽ� ��Ʈ���ϵ���
		Object[] obj = new Object[] {info.getWorkdateY(), info.getWorkdateM(), info.getWorkdateD(), info.getStarttime(), info.getEndtime(), info.getWorktime(), info.getDaysal()};
		data.addElement(obj);
		fireTableRowsInserted(data.size() - 1, data.size() - 1);

	}

	// ��ü�� �����ϱ� ����
	public void delMemberPayInfo(MemberPayInfo info) {// 1) MemberPayInfo��ü ��ü�� �޾������� �޼ҵ�
		int index = data.indexOf(info);//DATA���� ���° �ε������� ã�´�.
		delMemberPayInfo(index);
	}

	public void delMemberPayInfo(int row) { // 2) ���õ� ���� ������ ����� �޼ҵ�
		data.remove(row);
		fireTableRowsDeleted(row, row);
	}

// private class AddAction implements ActionListener{
//  public void actionPerformed(ActionEvent e) {
//   // TODO Auto-generated method stub
//   if(e.getSource() == addButton){
//    Student student = new Student();
//    student.setStudentNo(Integer.parseInt(studentNoTxt.getText()));
//    student.setName(nameTxt.getText());
//    student.setGrade(Integer.parseInt(gradeTxt.getText()));
//    student.setAddress(addressTxt.getText());
//    tableModel.addStudent(student);
//   }else if(e.getSource() == deleteButton){
//    tableModel.delStudent(selectIndex);
//   }
//  }
// 

}
