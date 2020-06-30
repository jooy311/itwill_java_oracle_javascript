package project.manager.frame;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.EventObject;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class TableController extends AbstractTableModel implements ActionListener, TableCellEditor, TableCellRenderer {

   private static final long serialVersionUID = 1L;
   private usermemberDAO dao = new usermemberDAO();
   // private MemberPayInfo info;
   private JRadioButton rBtn;
   private String id;
   private String year;
   private String month;

   private Vector<Object[]> data = new Vector<Object[]>();
   private final String header[] = { "년", "월", "일", "출근시간", "퇴근시간", "근무시간", "일급" };

   public TableController(String id) {
      this.id = id;

      // rBtn = new JRadioButton("");
      // rBtn.addActionListener(e -> {
      // System.out.println(this.getValueAt(this.getSelectedRow(), 1)); });

      try {
         data = dao.selectAllData(id);

      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public TableController(String id, String year, String month) {
      this.id = id;
      this.year = year;
      this.month = month;

      try {
         data = dao.userSelectMonth(id, year, month);

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
      // System.out.println(data.size());
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

   @Override // 변경할 데이터 값 변경할 행인덱스 변경할컬럼인덱스
   public void setValueAt(Object aValue, int rowIndex, int columnIndex) {// 수정하기 위해
      super.setValueAt(aValue, rowIndex, columnIndex);
      
   }

   public void addMemberPayInfo(MemberPayInfo info) {// 객체를 추가하기위해 -> table에 직접추가하는게 아니라 컨트롤러에 추가하여 컨트롤하도록
      Object[] obj = new Object[] { info.getWorkdateY(), info.getWorkdateM(), info.getWorkdateD(),
            info.getStarttime(), info.getEndtime(), info.getWorktime(), info.getDaysal() };
      data.addElement(obj);
      fireTableRowsInserted(data.size() - 1, data.size() - 1);

   }

   // 객체를 삭제하기 위해
   public void delMemberPayInfo(MemberPayInfo info) {// 1) MemberPayInfo객체 전체로 받았을때의 메소드
      int index = data.indexOf(info);// DATA에서 몇번째 인덱스인지 찾는다.
      delMemberPayInfo(index);
   }

   public void delMemberPayInfo(int row) { // 2) 선택된 행을 삭제할 경우의 메소드
      data.remove(row);
      fireTableRowsDeleted(row, row);
   }

   @Override
   public void addCellEditorListener(CellEditorListener arg0) {
      // TODO Auto-generated method stub

   }

   @Override
   public void cancelCellEditing() {
      // TODO Auto-generated method stub

   }

   @Override
   public Object getCellEditorValue() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public boolean isCellEditable(EventObject arg0) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void removeCellEditorListener(CellEditorListener arg0) {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean shouldSelectCell(EventObject arg0) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean stopCellEditing() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
         int row, int column) {

      return rBtn;
   }

   @Override
   public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
      // TODO Auto-generated method stub
      return rBtn;

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object src = e.getSource();
      if (src == rBtn) {

      }

   }

}
