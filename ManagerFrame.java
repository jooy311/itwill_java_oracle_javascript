package project.manager.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ManagerFrame extends JFrame implements ActionListener {
	private JDesktopPane desktopPane;
	private JTable table;
	private JComboBox<Month> monthCombo;
	private JComboBox dateCombo;
	private JLabel lblNewLabel_2;
	private JComboBox startHCombo;
	private JComboBox startMCombo;
	private JComboBox endHCombo;
	private JComboBox endMCombo;
	private JTextField todayWorkHourTxt;
	private JButton saveBtn;
	private JButton selectedDelete;
	private JTextField totalWorkHour;
	private JTextField totalWorkDay;
	private JTextField currentPay;
	private JTextField currentEarned;
	private JLabel label_12;
	private JPanel panel;
	private JLabel label_13;
	private JButton searchMonthBtn;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem initItem;
	private JMenuItem changeInfo;
	private JComboBox yearCombo;
	private String selectedMonth, selectedYear, selectedDate;
	private String selectedStartH, selectedStartM, selectedEndtH, selectedEndtM;
	private String str = "";
	private String worktime = "";
	private double worktime_double;

	private DefaultTableModel tableModel;
	private JButton selectedUpdateBtn;
	private JLabel lb_username;
	private JLabel lb_workspace;

	private Member member;// 현재 프레임에서 (로그인프레임에서 전달받은 ) member객체를 계속 사용할 것이기 때문에 선언!!
	private usermemberDAO dao = new usermemberDAO();
	private MemberPayInfo payInfo;
	private TableController tc;

	// 생성자
	public ManagerFrame(Member m, String title) throws SQLException {// 생성자에서 Member객체를 전달받는다.
		super(title);
		this.member = m;// 전달받은 매개변수를 지금 (나) 프레임에서 사용할 수 있도록 적용
		init();
		start();
		tableSetting();

		setBounds(100, 100, 662, 622);
		setVisible(true);
		setResizable(false);

		initItem.addActionListener(this);
		changeInfo.addActionListener(this);
		saveBtn.addActionListener(this);
		selectedDelete.addActionListener(this);
		yearCombo.addActionListener(this);
		monthCombo.addActionListener(this);
		dateCombo.addActionListener(this);
		selectedUpdateBtn.addActionListener(this);
		startHCombo.addActionListener(this);
		startMCombo.addActionListener(this);
		endHCombo.addActionListener(this);
		endMCombo.addActionListener(this);

	}

	public void start() {
		lb_username.setText(member.getName());
		lb_workspace.setText(member.getWorkpalce());

	}

	public void tableSetting() throws SQLException {
		tc = new TableController(member.getId());
		table = new JTable(tc);

		table.isCellEditable(table.getRowCount(), table.getColumnCount() - 1);// 수정하지 못하게

		table.getTableHeader().setReorderingAllowed(false);// 이동불가
		table.getTableHeader().setResizingAllowed(false);// 크기조정 불가

		JScrollPane scrollPane = new JScrollPane(table);// 테이블은 스크롤팬
		desktopPane.add(scrollPane);
		scrollPane.setBounds(130, 52, 510, 300);
	}

	public void labelSetting() {
		currentPay.setText(member.getSalperhour());
		currentEarned.setText(arg0);
		
	}

	private void init() {
		getContentPane().setLayout(null);

		// 현재 날짜 받아와서 뿌리기
		SimpleDateFormat pattern = new SimpleDateFormat("MM월 dd일");
		String time = pattern.format(new Date());
		SimpleDateFormat pattern_m = new SimpleDateFormat("MM월");
		String mm = pattern_m.format(new Date());

		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.DARK_GRAY);
		getContentPane().add(desktopPane);
		desktopPane.setBounds(0, 23, 652, 559);

		JPanel input = new JPanel();
		input.setBackground(new Color(255, 250, 250));
		input.setBounds(10, 358, 630, 134);
		desktopPane.add(input);

		JPanel panel_6 = new JPanel();
		input.add(panel_6);

		yearCombo = new JComboBox();
		yearCombo.setModel(new DefaultComboBoxModel(
				new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));

		panel_6.add(yearCombo);

		JLabel lblNewLabel_11 = new JLabel("\uB144");
		panel_6.add(lblNewLabel_11);

		JPanel panel_1 = new JPanel();
		input.add(panel_1);

		monthCombo = new JComboBox();
		monthCombo.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

		panel_1.add(monthCombo);

		JLabel lblNewLabel_1 = new JLabel("월");
		lblNewLabel_1.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1);

		JPanel panel_2 = new JPanel();
		input.add(panel_2);

		dateCombo = new JComboBox();
		panel_2.add(dateCombo);

		JLabel label = new JLabel("\uC77C");
		label.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		panel_2.add(label);

		JPanel panel_3 = new JPanel();
		input.add(panel_3);

		lblNewLabel_2 = new JLabel("\uCD9C\uADFC \uC2DC\uAC04");
		lblNewLabel_2.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		panel_3.add(lblNewLabel_2);

		startHCombo = new JComboBox();
		startHCombo.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
		panel_3.add(startHCombo);

		JLabel lblNewLabel_3 = new JLabel("\uC2DC");
		lblNewLabel_3.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		panel_3.add(lblNewLabel_3);

		startMCombo = new JComboBox();
		startMCombo.setModel(new DefaultComboBoxModel(
				new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
						"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
						"31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46",
						"47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
		panel_3.add(startMCombo);

		JLabel lblNewLabel_4 = new JLabel("\uBD84");
		lblNewLabel_4.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		panel_3.add(lblNewLabel_4);

		JPanel panel_4 = new JPanel();
		input.add(panel_4);

		JLabel label_1 = new JLabel("\uD1F4\uADFC \uC2DC\uAC04");
		label_1.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		panel_4.add(label_1);

		endHCombo = new JComboBox();
		endHCombo.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
		panel_4.add(endHCombo);

		JLabel label_2 = new JLabel("\uC2DC");
		label_2.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		panel_4.add(label_2);

		endMCombo = new JComboBox();
		endMCombo.setModel(new DefaultComboBoxModel(
				new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
						"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
						"31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46",
						"47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
		panel_4.add(endMCombo);

		JLabel label_3 = new JLabel("\uBD84");
		label_3.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		panel_4.add(label_3);

		JPanel panel_5 = new JPanel();
		input.add(panel_5);

		JLabel lblNewLabel_5 = new JLabel("\uC624\uB298 \uADFC\uBB34 \uC2DC\uAC04");
		lblNewLabel_5.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		panel_5.add(lblNewLabel_5);

		todayWorkHourTxt = new JTextField();
		todayWorkHourTxt.setEditable(false);
		panel_5.add(todayWorkHourTxt);
		todayWorkHourTxt.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("\uC2DC\uAC04!");
		lblNewLabel_6.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		panel_5.add(lblNewLabel_6);

		JPanel panel_8 = new JPanel();
		input.add(panel_8);

		saveBtn = new JButton("\uC800\uC7A5");
		saveBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_8.add(saveBtn);

		selectedUpdateBtn = new JButton("\uC9C0\uC815\uC77C \uBCC0\uACBD");
		selectedUpdateBtn.setFont(new Font("나눔바른펜", Font.BOLD, 15));
		panel_8.add(selectedUpdateBtn);

		selectedDelete = new JButton("지정일 삭제");
		selectedDelete.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_8.add(selectedDelete);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(255, 175, 175), 2));
		panel_9.setForeground(Color.DARK_GRAY);
		panel_9.setBackground(Color.DARK_GRAY);
		panel_9.setBounds(10, 10, 113, 34);
		desktopPane.add(panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel_7 = new JLabel("\uD604\uC7AC \uB0A0\uC9DC\uB294");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		panel_9.add(lblNewLabel_7);

		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(new Color(248, 248, 255));
		desktopPane_1.setBounds(10, 131, 113, 50);
		desktopPane.add(desktopPane_1);

		JLabel label_6 = new JLabel("근무시간");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_6.setBounds(42, 0, 59, 23);
		desktopPane_1.add(label_6);

		totalWorkHour = new JTextField("365");
		totalWorkHour.setEditable(false);
		totalWorkHour.setBounds(12, 25, 59, 21);
		desktopPane_1.add(totalWorkHour);

		JLabel label_7 = new JLabel("시간");
		label_7.setFont(new Font("나눔바른펜", Font.PLAIN, 12));
		label_7.setBounds(83, 28, 30, 16);
		desktopPane_1.add(label_7);

		JLabel lblNewLabel_10 = new JLabel(mm);
		lblNewLabel_10.setFont(new Font("나눔바른펜", Font.BOLD, 15));
		lblNewLabel_10.setBounds(12, 4, 34, 15);
		desktopPane_1.add(lblNewLabel_10);

		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(new Color(255, 250, 250));
		desktopPane_2.setBounds(10, 188, 113, 50);
		desktopPane.add(desktopPane_2);

		JLabel label_8 = new JLabel("근무 일");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_8.setBounds(40, 0, 65, 23);
		desktopPane_2.add(label_8);

		totalWorkDay = new JTextField("25");
		totalWorkDay.setEditable(false);
		totalWorkDay.setBounds(12, 25, 59, 21);
		desktopPane_2.add(totalWorkDay);

		JLabel lblNewLabel = new JLabel("일");
		lblNewLabel.setBounds(88, 28, 20, 15);
		desktopPane_2.add(lblNewLabel);

		JLabel label_4 = new JLabel(mm);
		label_4.setFont(new Font("굴림", Font.BOLD, 13));
		label_4.setBounds(12, 4, 31, 15);
		desktopPane_2.add(label_4);

		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(new Color(255, 250, 250));
		desktopPane_3.setBounds(10, 243, 113, 50);
		desktopPane.add(desktopPane_3);

		JLabel label_9 = new JLabel("나의 시급");
		label_9.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_9.setBounds(30, 0, 72, 16);
		desktopPane_3.add(label_9);

		currentPay = new JTextField("7500");
		currentPay.setEditable(false);
		currentPay.setBounds(10, 24, 60, 21);
		desktopPane_3.add(currentPay);

		JLabel lblNewLabel_8 = new JLabel("원");
		lblNewLabel_8.setBounds(82, 27, 20, 15);
		desktopPane_3.add(lblNewLabel_8);

		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(new Color(255, 250, 250));
		desktopPane_4.setBounds(10, 300, 113, 51);
		desktopPane.add(desktopPane_4);

		JLabel label_10 = new JLabel("에 번돈");
		label_10.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		label_10.setBounds(56, 4, 59, 16);
		desktopPane_4.add(label_10);

		currentEarned = new JTextField("1200000");
		currentEarned.setEditable(false);
		currentEarned.setBounds(5, 25, 80, 21);
		desktopPane_4.add(currentEarned);

		JLabel label_11 = new JLabel("원");
		label_11.setBounds(90, 28, 20, 15);
		desktopPane_4.add(label_11);

		JLabel label_5 = new JLabel(mm);
		label_5.setFont(new Font("굴림", Font.BOLD, 13));
		label_5.setBounds(15, 4, 32, 15);
		desktopPane_4.add(label_5);

		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBackground(new Color(255, 250, 250));
		desktopPane_5.setBounds(10, 502, 630, 50);
		desktopPane.add(desktopPane_5);

		searchMonthBtn = new JButton("월별 검색");
		searchMonthBtn.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		searchMonthBtn.setBounds(311, 6, 120, 33);
		desktopPane_5.add(searchMonthBtn);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(208, 6, 68, 37);
		desktopPane_5.add(panel_11);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		panel_11.add(comboBox_2);

		JLabel label_16 = new JLabel("\uC6D4");
		label_16.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		panel_11.add(label_16);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.PINK, 2));
		panel_7.setBackground(Color.DARK_GRAY);
		panel_7.setBounds(10, 54, 113, 70);
		desktopPane.add(panel_7);

		label_12 = new JLabel(time);
		label_12.setForeground(new Color(248, 248, 255));
		label_12.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		panel_7.add(label_12);

		panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(130, 10, 510, 30);
		desktopPane.add(panel);

		lb_username = new JLabel("\uC774\uC8FC\uC601");
		lb_username.setFont(new Font("나눔바른펜", Font.BOLD, 15));
		panel.add(lb_username);

		label_13 = new JLabel(" 님 안녕하세요! 현재 근무지는  ");
		label_13.setFont(new Font("나눔바른펜", Font.PLAIN, 14));
		panel.add(label_13);

		lb_workspace = new JLabel("\uD22C\uC378\uD50C\uB808\uC774\uC2A4");
		lb_workspace.setFont(new Font("나눔바른펜", Font.BOLD, 15));
		panel.add(lb_workspace);

		JLabel lblNewLabel_9 = new JLabel("\uC785\uB2C8\uB2E4.");
		lblNewLabel_9.setFont(new Font("나눔바른펜", Font.BOLD, 13));
		panel.add(lblNewLabel_9);

		menuBar = new JMenuBar();
		menuBar.setLocation(0, 0);
		menuBar.setBackground(new Color(255, 250, 250));
		menuBar.setSize(659, 27);
		getContentPane().add(menuBar);
		// setJMenuBar(menuBar);

		mnNewMenu = new JMenu("\u2261");
		menuBar.add(mnNewMenu);

		initItem = new JMenuItem("초기화");
		mnNewMenu.add(initItem);

		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);

		changeInfo = new JMenuItem("정보 변경하기");
		mnNewMenu.add(changeInfo);
	}

	// 이벤트 클래스
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == initItem) {
			// 해당아이디에 저장되어 있는 내용 db에 있는거 다 삭제
			tableModel.setNumRows(0);

		} else if (src == changeInfo) {
			ModifyInfoFrame mf = new ModifyInfoFrame(member ,"회원정보 수정", this);
			

		} else if (src == yearCombo) {
			if (yearCombo.getSelectedIndex() != -1) { // 선택하지 않았다면
				selectedYear = (String) yearCombo.getSelectedItem();
				str = str + selectedYear;

				System.out.println(selectedYear);

			} else {
				JOptionPane.showMessageDialog(this, "년도를 선택해주세요!");
			}

		} else if (src == monthCombo) {
			if (yearCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, "년도를 선택해주세요!");
			} else if (monthCombo.getSelectedIndex() != -1) { // 선택하지 않았다면
				selectedMonth = (String) monthCombo.getSelectedItem();

//				if ((Integer.parseInt(selectedMonth) < 10))
//					str = str + "0" + selectedMonth;
//				else
//					str = str + selectedMonth;

				Calendar cal = new GregorianCalendar(Integer.parseInt(selectedYear),
						Integer.parseInt(selectedMonth) - 1, 1);
				int daysOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(daysOfMonth);

				for (int i = 1; i <= daysOfMonth; i++) {
//					if (i < 10)
//						dateCombo.addItem("0" + i);
//					else
						dateCombo.addItem(i + "");
				}
			} else {
				JOptionPane.showMessageDialog(this, "月을 선택해주세요!");
			}

		} else if (src == dateCombo) {
			if (monthCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, " 月을 선택해주세요!");
			} else if (dateCombo.getSelectedIndex() != -1) { // 선택하지 않았다면

				selectedDate = (String) dateCombo.getSelectedItem();

				System.out.println(selectedDate);
			} else {
				JOptionPane.showMessageDialog(this, "日를 선택해주세요!");
			}

		} else if (src == startHCombo) {// 사용자가 출근 시간을 고를때
			if (dateCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, " 日를 선택해주세요!");
			} else if (startHCombo.getSelectedIndex() != -1) { // 선택하지 않았다면

				selectedStartH = (String) startHCombo.getSelectedItem();
			} else {
				JOptionPane.showMessageDialog(this, " 출근시간(시간)을 선택해주세요!");
			}

		} else if (src == startMCombo) {
			if (startHCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, " 출근시간(시간)을 선택해주세요!");
			} else if (startMCombo.getSelectedIndex() != -1) { // 선택하지 않았다면
				selectedStartM = (String) startMCombo.getSelectedItem();
			} else {
				JOptionPane.showMessageDialog(this, " 출근시간(분)을 선택해주세요!");
			}

		} else if (src == endHCombo) {
			if (startMCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, "출근시간(분)을 선택해주세요!");
			} else if (endHCombo.getSelectedIndex() != -1) { // 선택하지 않았다면
				selectedEndtH = (String) endHCombo.getSelectedItem();
			} else {

				JOptionPane.showMessageDialog(this, "퇴근시간(시간)을 선택해 주세요!");
			}

		} else if (src == endMCombo) {
			if (endHCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, " 퇴근시간(시간)을 선택해 주세요!");
			} else if (endMCombo.getSelectedIndex() != -1) { // 선택했다면
				selectedEndtM = (String) endMCombo.getSelectedItem();
				
				SimpleDateFormat format = new SimpleDateFormat("HH:mm");
				long hour = 0;
				long minute = 0;
				
				try {
					Date st = format.parse(selectedStartH + ":" + selectedStartM);
					Date et = format.parse(selectedEndtH + ":" + selectedEndtM);
					long dif = et.getTime() - st.getTime();
					//System.out.println(et.getTime()+","+st.getTime() +","+ dif);					
					hour = dif/(1000*60*60);
					minute = (dif/(1000*60)) -  (hour*60);
					
					worktime_double = ((int)((double)dif/(1000*60*60)*10))/10.0;
					
					if(dif < 0) {
						hour = 24 + hour;
						minute = 60 + minute;
						if(minute == 60)
							minute = 0;
					}
					
				} catch (ParseException e2) {
					System.out.println("날짜 변환 중에 알수없는 오류");
					e2.printStackTrace();
				}
				
				if(minute < 10)
					worktime = hour + ":0" + minute;
				else
					worktime = hour + ":" + minute;	
								
				System.out.println(worktime);
				todayWorkHourTxt.setText(worktime);
				todayWorkHourTxt.setEditable(false);
				
			} else {
				JOptionPane.showMessageDialog(this, "퇴근시간(분)을 선택해 주세요!");
			}

		} else if (src == saveBtn) {
			if (yearCombo.getSelectedIndex() == 0) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, "년도를 선택해주세요!");
			} else if (monthCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, "달을 선택해주세요!");
			} else if (dateCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, "일수를 골라주세요!");
			} else if (startHCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, "출근시간을 골라주세요!");
			} else if (startHCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, "출근 분을 골라주세요!");
			} else if (startHCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, "퇴근 시간을 골라주세요!");
			} else if (endMCombo.getSelectedIndex() == -1) { // 선택하지 않았다면
				JOptionPane.showMessageDialog(this, "퇴근 분을 골라주세요!");
			}

			else {
				String str_workdate =  selectedYear + "/" + selectedMonth + "/" + selectedDate;
				String str_starttime = selectedStartH + ":" + selectedStartM;
				String str_endtime = selectedEndtH + ":" + selectedEndtM;
				
//				tableModel.addRow(new String[] { selectedYear + "/" + selectedMonth + "/" + selectedDate,ㅛ
//						selectedStartH + " : " + selectedStartM, selectedEndtH + " : " + selectedEndtM, worktime,
//						member.getSalperhour() }); // 사용자가 변경한 값으로 저장되는 부분!!!!!!!!!!
				
				try {
					
					if(!dao.checkWorkDate(member.getId(), str_workdate)) {
						JOptionPane.showMessageDialog(this, "같은날 한근무지에서 여러가지 일을 할 수 없습니다.");
					}
					
				} catch (HeadlessException | SQLException e2) {
					System.out.println("workdate유효성검사를 하는 과정에서의 오류");
					e2.printStackTrace();
				}
				double money = worktime_double * Long.parseLong(member.getSalperhour());
				payInfo = new MemberPayInfo(member.getId(), str_workdate ,selectedYear , selectedMonth, selectedDate, str_starttime, str_endtime, worktime, money+"" );
				
				//db에 insert되도록
				try {
					dao.insertPayData(payInfo);					
					JOptionPane.showMessageDialog(this, "성공적으로 저장되었습니다!");
					tc.addMemberPayInfo(payInfo);//테이블컨트롤러에도 추가해서 테이블에 뿌릴수 있도록 한다.
				} catch (SQLException e1) {
					System.out.println("insert중 데이터베이스 오류");
					e1.printStackTrace();
				}				
			}

		} else if (src == selectedDelete) {
			int one = table.getSelectedRow(); // 사용자가 선택한 행값을 받아온뒤

			if (one == -1) {
				JOptionPane.showMessageDialog(this, "선택된 행이 없습니다.", "경고", JOptionPane.OK_OPTION);
			} else {
				int choice = JOptionPane.showConfirmDialog(this, "정말 삭제하시겠습니까?", "경고", JOptionPane.OK_CANCEL_OPTION);
				if (choice == JOptionPane.OK_OPTION) {
					//1)테이블 컨트롤러에서 삭제
					tc.delMemberPayInfo(one);
					
					//2)DB에서 삭제
					String selectDate = (String)tc.getValueAt(one, 0) + "/" +(String)tc.getValueAt(one, 1) + "/" + (String)tc.getValueAt(one, 2);
					try {
						dao.deleteOnePayData(member.getId(), selectDate);
						System.out.println(selectDate);
						JOptionPane.showMessageDialog(this, "성공적으로 삭제되었습니다!");
					} catch (SQLException e1) {
						System.out.println("테이블 데이터를 삭제하는 과정에서의 오류");
						e1.printStackTrace();
					}
				}
			}
		}else if(src == selectedUpdateBtn) {//지정일 변경
			
		}
	}
}