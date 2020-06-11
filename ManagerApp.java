package project.manager.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Month;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ManagerApp extends JFrame implements ActionListener {
   private JLabel workPlace; //어디서 일하는 중인지 받는 변수
   private JLabel totalWorkHours, totalWorkDays, SalaryPerHour, earnedMoney;
   private JDesktopPane desktopPane;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTable table;
   private JLabel lblNewLabel;
   private JLabel month;
   private JPanel panel_1;
   private JComboBox comboBox;
   private JLabel lblNewLabel_1;
   private JPanel panel_2;
   private JComboBox comboBox_1;
   private JLabel label;
   private JPanel panel_3;
   private JLabel lblNewLabel_2;
   private JComboBox comboBox_2;
   private JComboBox comboBox_3;
   private JLabel lblNewLabel_3;
   private JLabel lblNewLabel_4;
   private JPanel panel_4;
   private JLabel label_1;
   private JComboBox comboBox_4;
   private JLabel label_2;
   private JComboBox comboBox_5;
   private JLabel label_3;
   private JPanel panel_5;
   private JLabel lblNewLabel_5;
   private JTextField textField_4;
   private JTextField textField_5;
   private JButton btnNewButton_4;
   private JPanel panel_8;
   private JButton button;
   private JButton button_1;
   private JLabel lblNewLabel_7;
   private JLabel label_6;
   private JLabel lblNewLabel_8;
 
   
   //--------------------생성자--------------------
   public ManagerApp(String title) {
      super(title);
    // getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.PINK);
      //사용자가 어디서 일했는지 알려주는 라벨
      //=>일단 인풋다이얼로그로 근무지를 받게 한다.(회원가입으로 하면 아이디를 pk로 이용하여 근무지를 불러오도록 한다)
//      String workspace = JOptionPane.showInputDialog(this
//            , "어디서 근무하시나요?", "근무지 입력"
//            , JOptionPane.QUESTION_MESSAGE).trim();
//      if(workspace == null) {
//         //다시 입력해달라고 다이얼로그 띄우기
//      }
      
      workPlace = new JLabel("[\uC774\uC8FC\uC601] \uB2D8 \uC548\uB155\uD558\uC138\uC694! \uD604\uC7AC \uADFC\uBB34\uC9C0\uB294 [\uD22C\uC378\uD50C\uB808\uC774\uC2A4] \uC785\uB2C8\uB2E4.");
      workPlace.setFont(new Font("나눔바른펜", Font.PLAIN, 14));
      getContentPane().add(panel);
      panel.add(workPlace, BorderLayout.NORTH);
      panel.setBounds(130, 10, 510, 30);
      
      
      JPanel today = new JPanel();
      today.setBorder(new LineBorder(Color.PINK, 2));
      today.setBackground(Color.DARK_GRAY);
      today.setBounds(10, 10, 100, 100);
      getContentPane().add(today);
      
      lblNewLabel = new JLabel("6");
      lblNewLabel.setForeground(Color.WHITE);
      lblNewLabel.setFont(new Font("나눔바른펜", Font.PLAIN, 35));
      today.add(lblNewLabel);
      today.setBounds(10, 55, 113, 70);
      
      label_6 = new JLabel("\uC6D4");
      label_6.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
      label_6.setForeground(Color.WHITE);
      today.add(label_6);
      
      month = new JLabel("11");
      month.setForeground(Color.WHITE);
      month.setFont(new Font("나눔바른펜", Font.PLAIN, 35));
      today.add(month);
      
      lblNewLabel_8 = new JLabel("\uC77C");
      lblNewLabel_8.setForeground(Color.WHITE);
      lblNewLabel_8.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
      today.add(lblNewLabel_8);
      
      
      //테이블에 들어갈 데이터(임시)
      String header[] = {"날짜","출근시간","퇴근시간","근무시간","일급"};
      String contents[][] = {
            {"6월 1일", "아침8시", "오후5시","8시간","7300원"}
      };
      
      table = new JTable(contents,header);
      JScrollPane scrollPane = new JScrollPane(table);//테이블은 스크롤팬
      getContentPane().add(scrollPane);
      scrollPane.setBounds(130, 52, 510, 300);
      
      
      desktopPane = new JDesktopPane();
      desktopPane.setBackground(Color.DARK_GRAY);
      getContentPane().add(desktopPane);
      //desktopPane.setLayout(new BoxLayout(desktopPane, BoxLayout.X_AXIS));
      desktopPane.setBounds(0,60,100,300);
     
      
      JPanel totalworkhours = new JPanel();
      desktopPane.add(totalworkhours);
      totalWorkHours = new JLabel("\uCD1D \uADFC\uBB34\uC2DC\uAC04");
      totalWorkHours.setFont(new Font("나눔바른펜", Font.PLAIN, 17));
      textField_1 = new JTextField("365");
      textField_1.setEditable(false);
      totalworkhours.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
      totalworkhours.add(totalWorkHours);
      totalworkhours.add(textField_1);
      totalworkhours.setBounds(10, 132, 113, 50);
      
      JLabel lblNewLabel_9 = new JLabel("\uC2DC\uAC04");
      lblNewLabel_9.setFont(new Font("나눔바른펜", Font.PLAIN, 12));
      totalworkhours.add(lblNewLabel_9);
      
      
      JPanel totalworkdays = new JPanel();
      desktopPane.add(totalworkdays);
      //totalworkdays.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
      totalWorkDays = new JLabel("\uCD1D \uADFC\uBB34\uC77C");
      totalWorkDays.setFont(new Font("나눔바른펜", Font.PLAIN, 12));
      totalworkdays.add(totalWorkDays);
      textField = new JTextField("25");
      textField.setEditable(false);
      totalworkdays.add(textField);
      totalworkdays.setBounds(10, 188, 113, 50);
      
      
      JPanel salaryperhour = new JPanel();
      desktopPane.add(salaryperhour);
    //salaryperhour.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
      SalaryPerHour = new JLabel("\uB098\uC758 \uC2DC\uAE09");
      SalaryPerHour.setFont(new Font("나눔바른펜", Font.PLAIN, 12));
      salaryperhour.add(SalaryPerHour);
      textField_2 = new JTextField("7500\uC6D0");
      textField_2.setEditable(false);
      salaryperhour.add(textField_2);
      salaryperhour.setBounds(10, 243, 113, 50);
      
      
      JPanel earnedmoney = new JPanel();
      desktopPane.add(earnedmoney);
      //earnedmoney.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
      earnedMoney = new JLabel("\uD604\uC7AC\uAE4C\uC9C0 \uBC88 \uB3C8");
      earnedMoney.setFont(new Font("나눔바른펜", Font.PLAIN, 12));
      earnedmoney.add(earnedMoney);
      textField_3 = new JTextField("120000\uB9CC\uC6D0");
      textField_3.setEditable(false);
      earnedmoney.add(textField_3);
      earnedmoney.setBounds(10, 298, 113, 50);
      
      JPanel input = new JPanel();
      input.setBounds(10, 358, 630, 138);
      desktopPane.add(input);
      
      panel_1 = new JPanel();
      input.add(panel_1);
      
      comboBox = new JComboBox();
      panel_1.add(comboBox);
      
      lblNewLabel_1 = new JLabel("\uC6D4");
      lblNewLabel_1.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
      panel_1.add(lblNewLabel_1);
      
      panel_2 = new JPanel();
      input.add(panel_2);
      
      comboBox_1 = new JComboBox();
      panel_2.add(comboBox_1);
      
      label = new JLabel("\uC77C");
      label.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
      panel_2.add(label);
      
      panel_3 = new JPanel();
      input.add(panel_3);
      
      lblNewLabel_2 = new JLabel("\uCD9C\uADFC \uC2DC\uAC04");
      lblNewLabel_2.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_3.add(lblNewLabel_2);
      
      comboBox_2 = new JComboBox();
      panel_3.add(comboBox_2);
      
      lblNewLabel_3 = new JLabel("\uC2DC");
      lblNewLabel_3.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_3.add(lblNewLabel_3);
      
      comboBox_3 = new JComboBox();
      panel_3.add(comboBox_3);
      
      lblNewLabel_4 = new JLabel("\uBD84");
      lblNewLabel_4.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_3.add(lblNewLabel_4);
      
      panel_4 = new JPanel();
      input.add(panel_4);
      
      label_1 = new JLabel("\uD1F4\uADFC \uC2DC\uAC04");
      label_1.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_4.add(label_1);
      
      comboBox_4 = new JComboBox();
      panel_4.add(comboBox_4);
      
      label_2 = new JLabel("\uC2DC");
      label_2.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_4.add(label_2);
      
      comboBox_5 = new JComboBox();
      panel_4.add(comboBox_5);
      
      label_3 = new JLabel("\uBD84");
      label_3.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_4.add(label_3);
      
      panel_5 = new JPanel();
      input.add(panel_5);
      
      lblNewLabel_5 = new JLabel("\uC624\uB298 \uADFC\uBB34 \uC2DC\uAC04");
      lblNewLabel_5.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_5.add(lblNewLabel_5);
      
      textField_4 = new JTextField();
      panel_5.add(textField_4);
      textField_4.setColumns(10);
      
      JLabel lblNewLabel_6 = new JLabel("\uC2DC\uAC04!");
      lblNewLabel_6.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_5.add(lblNewLabel_6);
      
      JPanel panel_6 = new JPanel();
      input.add(panel_6);
      
      JLabel label_4 = new JLabel("\uB098\uC758 \uC2DC\uAE09");
      label_4.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_6.add(label_4);
      
      textField_5 = new JTextField();
      textField_5.setColumns(10);
      panel_6.add(textField_5);
      
      JLabel label_5 = new JLabel("\uC6D0");
      label_5.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_6.add(label_5);
      
      panel_8 = new JPanel();
      input.add(panel_8);
      
      button = new JButton("\uC800\uC7A5");
      button.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_8.add(button);
      
      button_1 = new JButton("\uC9C0\uC815\uC77C \uC0AD\uC81C");
      button_1.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_8.add(button_1);
      
      JPanel panel_7 = new JPanel();
      panel_7.setBounds(10, 506, 630, 45);
      desktopPane.add(panel_7);
      panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
      
      btnNewButton_4 = new JButton("\uB0A0\uC9DC\uB85C \uAC80\uC0C9");
      btnNewButton_4.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_7.add(btnNewButton_4);
      
      JButton btnNewButton_1 = new JButton("\uC6D4\uBCC4 \uAC80\uC0C9");
      btnNewButton_1.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
      panel_7.add(btnNewButton_1);
      
      JPanel panel_9 = new JPanel();
      panel_9.setBorder(new LineBorder(new Color(255, 175, 175), 2));
      panel_9.setForeground(Color.DARK_GRAY);
      panel_9.setBackground(Color.DARK_GRAY);
      panel_9.setBounds(10, 10, 113, 34);
      desktopPane.add(panel_9);
      
      lblNewLabel_7 = new JLabel("\uD604\uC7AC \uB0A0\uC9DC\uB294");
      lblNewLabel_7.setForeground(Color.WHITE);
      lblNewLabel_7.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
      panel_9.add(lblNewLabel_7);
      
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      
      JMenu mnNewMenu = new JMenu("\uC124\uC815");
      menuBar.add(mnNewMenu);
      
      JMenuItem mntmNewMenuItem = new JMenuItem("\uCD08\uAE30\uD654");
      mnNewMenu.add(mntmNewMenuItem);
      
      JSeparator separator = new JSeparator();
      mnNewMenu.add(separator);
      
      JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uC774\uB984\uBCC0\uACBD");
      mnNewMenu.add(mntmNewMenuItem_1);
      
      JMenuItem mntmNewMenuItem_2 = new JMenuItem("\uADFC\uBB34\uC9C0 \uBCC0\uACBD");
      mnNewMenu.add(mntmNewMenuItem_2);
      
    //  JComboBox<Month> jcombo = new JComboBox<>(Month.values());
      //input.add(jcombo);
     // jcombo.addActionListener(e -> {
    //      Month selMonth = (Month) ((JComboBox<Month>) e.getSource()).getSelectedItem();//사용자가 고른 월
          //System.out.println(selMonth);
     // });

      init();
   }
   
   private void init() {
      //JPanel p = new JPanel(new FlowLayout()); //세로로 배열은 안되려나
      
      setBounds(100, 100, 664, 625);
      setResizable(false);
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new ManagerApp("알바 수당 계산 프로그램");
   }
   
   
   //이벤트 클래스
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
   }
}
