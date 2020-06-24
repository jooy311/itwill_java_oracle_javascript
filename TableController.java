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
	private final String header[] = { "년","월","일", "출근시간", "퇴근시간", "근무시간", "일급" };

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
	public int getColumnCount() {// 열의 수를 반환
		return header.length;
	}

	@Override
	public int getRowCount() {// 행의 수를 반환
		//System.out.println(data.size());
		return data.size();
	}

	@Override
	public Object getValueAt(int r, int c) {// 주어진 행렬의 위치에 저장된 데이터를 반환
		return data.get(r)[c];
	}
	

	@Override
	public boolean isCellEditable(int row, int column) {// 수정하지 못하게 막기위한 코드
		if (column >= 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override			//변경할 데이터 값		변경할 행인덱스		변경할컬럼인덱스
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {//수정하기 위해
		super.setValueAt(aValue, rowIndex, columnIndex);
	}

	public void addMemberPayInfo(MemberPayInfo info) {//객체를 추가하기위해 -> table에 직접추가하는게 아니라 컨트롤러에 추가하여 컨트롤하도록
		Object[] obj = new Object[] {info.getWorkdateY(), info.getWorkdateM(), info.getWorkdateD(), info.getStarttime(), info.getEndtime(), info.getWorktime(), info.getDaysal()};
		data.addElement(obj);
		fireTableRowsInserted(data.size() - 1, data.size() - 1);

	}

	// 객체를 삭제하기 위해
	public void delMemberPayInfo(MemberPayInfo info) {// 1) MemberPayInfo객체 전체로 받았을때의 메소드
		int index = data.indexOf(info);//DATA에서 몇번째 인덱스인지 찾는다.
		delMemberPayInfo(index);
	}

	public void delMemberPayInfo(int row) { // 2) 선택된 행을 삭제할 경우의 메소드
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
