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

public class TableController extends AbstractTableModel {

   private static final long serialVersionUID = 1L;
   private usermemberDAO dao = usermemberDAO.getDAO();
   
   private String id;
   private String year;
   private String month;

   private Vector<Object[]> data = new Vector<Object[]>();
   private final String header[] = { "��", "��", "��", "��ٽð�", "��ٽð�", "�ٹ��ð�", "�ϱ�", "�ñ�" };

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
   public int getColumnCount() {// ���� ���� ��ȯ
      return header.length;
   }

   @Override
   public int getRowCount() {// ���� ���� ��ȯ
      // System.out.println(data.size());
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

   @Override // ������ ������ �� ������ ���ε��� �������÷��ε���
   public void setValueAt(Object aValue, int rowIndex, int columnIndex) {// �����ϱ� ����
      super.setValueAt(aValue, rowIndex, columnIndex);
      
   }

   public void addMemberPayInfo(MemberPayInfo info) {// ��ü�� �߰��ϱ����� -> table�� �����߰��ϴ°� �ƴ϶� ��Ʈ�ѷ��� �߰��Ͽ� ��Ʈ���ϵ���
      Object[] obj = new Object[] { info.getWorkdateY(), info.getWorkdateM(), info.getWorkdateD(),
            info.getStarttime(), info.getEndtime(), info.getWorktime(), info.getDaysal() , info.getSalperhour()};
      data.addElement(obj);
      fireTableRowsInserted(data.size() - 1, data.size() - 1);

   }

   // ��ü�� �����ϱ� ����
   public void delMemberPayInfo(MemberPayInfo info) {// 1) MemberPayInfo��ü ��ü�� �޾������� �޼ҵ�
      int index = data.indexOf(info);// DATA���� ���° �ε������� ã�´�.
      delMemberPayInfo(index);
   }

   public void delMemberPayInfo(int row) { // 2) ���õ� ���� ������ ����� �޼ҵ�
      data.remove(row);
      fireTableRowsDeleted(row, row);
   }

}