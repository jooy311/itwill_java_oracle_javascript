package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.Year;
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
	private JComboBox monthCombo;
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
	private JButton searchBtn;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem initItem;
	private JMenuItem changeInfo;
	private JComboBox yearCombo;
	private String selectedMonth, selectedYear, selectedDate;
	private String selectedStartH, selectedStartM, selectedEndtH, selectedEndtM;
	// private String str = "";
	private String worktime = "";
	private double worktime_double;

	private JButton selectedUpdateBtn;
	private JLabel lb_username;
	private JLabel lb_workspace;

	private Member member;// ���� �����ӿ��� (�α��������ӿ��� ���޹��� ) member��ü�� ��� ����� ���̱� ������ ����!!
	private usermemberDAO dao = usermemberDAO.getDAO();
	private MemberPayInfo payInfo;
	private TableController tc;
	private JComboBox searchYear;
	private JComboBox searchMonth;

	private JScrollPane scrollPane;
	private JScrollPane scrollPane2;

	private String selectedSearchMonth, selectedSearchYear;
	private JButton undoBtn;
	private JTable table2;
	private String mm;// ���� month�� �޴� ��Ʈ��
	private String yy;
	private JLabel lbMonth2;
	private JLabel lbMonth1;
	private JLabel lbMonth3;

	private boolean isPushSearchBtn = false;
	private JButton cancelBtn;
	private boolean isUpdateMode = false;
	// private String colname;
	private int t1 = -1;
	private String t2 = "";
	private String t3 = "";
	private String t4 = "";
	private String[] tmp;

	// ������
	public ManagerFrame(Member m, String title) throws SQLException {// �����ڿ��� Member��ü�� ���޹޴´�.
		super(title);
		this.member = m;// ���޹��� �Ű������� ���� (��) �����ӿ��� ����� �� �ֵ��� ����

		init();
		start();
		tableSetting();
		labelSetting(yy, mm.substring(1, 2));

		setBounds(100, 100, 662, 618);
		setVisible(true);
		setResizable(false);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dao.db_close();
				dispose();
			}
		});


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
		searchBtn.addActionListener(this);
		searchYear.addActionListener(this);
		searchMonth.addActionListener(this);
		undoBtn.addActionListener(this);
		cancelBtn.addActionListener(this);

	}

	public void start() {
		lb_username.setText(member.getName());
		lb_workspace.setText(member.getWorkpalce());
	}

	public void tableSetting() throws SQLException {
		tc = new TableController(member.getId());
		table = new JTable(tc);

		table.isCellEditable(table.getRowCount(), table.getColumnCount() - 1);// �������� ���ϰ�

		table.getTableHeader().setReorderingAllowed(false);// �̵��Ұ�
		table.getTableHeader().setResizingAllowed(false);// ũ������ �Ұ�

		scrollPane = new JScrollPane(table);// ���̺��� ��ũ����
		desktopPane.add(scrollPane);
		scrollPane.setBounds(130, 52, 510, 300);
	}

	public int tableSetting2() throws SQLException {// �˻������ �ִ��� ������ �˱����ؼ� ��ȯ���� int������ �־���
		TableController tc2 = new TableController(member.getId(), selectedSearchYear, selectedSearchMonth);
		table2 = new JTable(tc2);

		if (tc2.getRowCount() == 0)
			return 0;
		table2.isCellEditable(table2.getRowCount(), table2.getColumnCount() - 1);// �������� ���ϰ�

		table2.getTableHeader().setReorderingAllowed(false);// �̵��Ұ�
		table2.getTableHeader().setResizingAllowed(false);// ũ������ �Ұ�

		scrollPane2 = new JScrollPane(table2);// ���̺��� ��ũ����
		desktopPane.add(scrollPane2);
		scrollPane2.setBounds(130, 52, 510, 300);

		return 1;
	}

	public void labelSetting(String year, String month) {// ����ڰ� �ش� �� �����͸� �߰��ϸ� �ǽð����� �߰��� �Ǿ����
		currentPay.setText(member.getSalperhour() + "");

		String[] str;
		try {
			str = dao.calTotalNow(member.getId(), year, month);// ���� ���� "�ٹ��ð�"�� "�ϱ�"�� ����ϱ� ����
			totalWorkHour.setText(str[0]);
			currentEarned.setText(str[1]);

			int count = dao.calCountworkDay(member.getId(), year, month);// ���ʶ��� "�ٹ��ϼ�"�� ����ϱ� ����
			totalWorkDay.setText(count + "");

			// dao.db_close();

		} catch (SQLException e) {
			System.out.println("�󺧼����ϴµ� ����" + e.getMessage());
		}
	}

	public void changeSearchDate(String month) {
		lbMonth1.setText(month + "��");
		lbMonth2.setText(month + "��");
		lbMonth3.setText(month + "��");
	}

	public void repaint(Member member) throws SQLException {
		// this.setVisible(false);
		new ManagerFrame(member, "Pay manager");
		this.dispose();
	}

	public void settingCombo(boolean flag) {
		yearCombo.setEnabled(flag);
		monthCombo.setEnabled(flag);
		dateCombo.setEnabled(flag);
		startHCombo.setEnabled(flag);
		startMCombo.setEnabled(flag);
		endHCombo.setEnabled(flag);
		endMCombo.setEnabled(flag);

	}

	public String[] update_calWorkTime(String starttime, String endtime) {
		String[] str = new String[2];

		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		long hour = 0;
		long minute = 0;

		String worktime = "";
		double worktimeTmp = 0;

		try {
			Date st = format.parse(starttime);
			Date et = format.parse(endtime);
			long dif = et.getTime() - st.getTime();

			hour = dif / (1000 * 60 * 60);
			minute = (dif / (1000 * 60)) - (hour * 60);

			worktimeTmp = ((int) ((double) dif / (1000 * 60 * 60) * 10)) / 10.0;

			if (dif < 0) {
				hour = 24 + hour;
				minute = 60 + minute;
				if (minute == 60) {
					minute = 0;
					worktimeTmp = hour + minute / 60;
				} else
					worktimeTmp = hour + minute / 60;
			}

		} catch (ParseException e2) {
			System.out.println("��¥ ��ȯ �߿� �˼����� ����");
			e2.printStackTrace();
		}

		if (minute < 10)
			worktime = hour + ":0" + minute;
		else
			worktime = hour + ":" + minute;

		str[0] = worktime;
		str[1] = (int) (worktimeTmp * Integer.parseInt(t4)) + "";// �� ������ ���� �ñ� * �ٲ� �ٹ��ð�

		return str;
	}

	public void settingCombofield(String colname, String year, String month, String date, String starth, String startm,
			String endh, String endm, String worktime) {// ����ڰ� ������ ���� ������ �޺��ڽ� �ʵ带 �ٲٱ� ���� �޼ҵ�
		// String[] tmpStr = new String[8];

		if (colname.equals("��ٽð�")) {
			yearCombo.setSelectedItem(year);
			monthCombo.setSelectedItem(month);
			dateCombo.setSelectedItem(date);
			startHCombo.setSelectedItem(starth);
			startMCombo.setSelectedItem(startm);
			endHCombo.setSelectedItem(endh);
			endMCombo.setSelectedItem(endm);
			todayWorkHourTxt.setText(worktime);

		} else if (colname.equals("��ٽð�")) {
			yearCombo.setSelectedItem(year);
			monthCombo.setSelectedItem(month);
			dateCombo.setSelectedItem(date);
			startHCombo.setSelectedItem(starth);
			startMCombo.setSelectedItem(startm);
			endHCombo.setSelectedItem(endh);
			endMCombo.setSelectedItem(endm);
			todayWorkHourTxt.setText(worktime);
		}

		// return tmpStr;
	}

	public int setComboEnable(String colname) {// ����ڰ� ������ ������ �ش��ϴ� �޺��ڽ��� true�� ����� ���� �޼ҵ�
		// JComboBox<Object> box = null;

		if (colname.equals("��")) {
			yearCombo.setEnabled(true);
			return 1;
		} else if (colname.equals("��")) {
			monthCombo.setEnabled(true);
			return 2;
		} else if (colname.equals("��")) {
			dateCombo.setEnabled(true);
			return 3;
		} else if (colname.equals("��ٽð�")) {
			startHCombo.setEnabled(true);
			startMCombo.setEnabled(true);
			return 4;
		} else if (colname.equals("��ٽð�")) {
			endHCombo.setEnabled(true);
			endMCombo.setEnabled(true);
			return 5;
		}
		return 0;
	}

	public void updateMode(int selectedCombo, String selectedValue, String colname, String salperhour) {
		String updateValue = "";
		String[] worktime_money = new String[2];

		if (selectedCombo == 4) {// ��� �޺�
			updateValue = (String) startHCombo.getSelectedItem();
			updateValue += ":";
			updateValue += (String) startMCombo.getSelectedItem();
		} else if (selectedCombo == 5) {// ��� �޺�
			updateValue = (String) endHCombo.getSelectedItem();
			updateValue += ":";
			updateValue += (String) endMCombo.getSelectedItem();
		}
		if (selectedValue.equals(updateValue)) {// ���� ����Ǿ��ִ� �� vs ���� ���� �� ��
			JOptionPane.showMessageDialog(this, "������ ���� ������ ���� �����ϴ�!");
		} else {
			try {

				if (selectedCombo == 4) {// ��ٽð������� �����ٸ�
					worktime_money = update_calWorkTime(updateValue, tmp[4]);

				} else if (selectedCombo == 5) {// ��ٽð� ������ �����ٸ�
					worktime_money = update_calWorkTime(tmp[3], updateValue);

				}

				// �� //�� //��
				dao.updateOnePayData(member.getId(), colname, worktime_money[0], worktime_money[1], updateValue, tmp[0],
						tmp[1], tmp[2]);

				todayWorkHourTxt.setText(worktime_money[0]);

				JOptionPane.showMessageDialog(this, "������ ���������� �Ϸ�Ǿ����ϴ�!");
				this.repaint(member);
				// �ٹ��ð� ����ǰ� �ؾ���

			} catch (SQLException e1) {
				System.out.println("payinfo�������" + e1.getMessage());
			}
		}
	}

	private void init() {
		getContentPane().setLayout(null);

		SimpleDateFormat pattern_m = new SimpleDateFormat("MM��");
		mm = pattern_m.format(new Date());
		SimpleDateFormat pattern_y = new SimpleDateFormat("YYYY");
		yy = pattern_y.format(new Date());

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
		lblNewLabel_11.setFont(new Font("��������ڵ�", Font.BOLD, 12));
		panel_6.add(lblNewLabel_11);

		JPanel panel_1 = new JPanel();
		input.add(panel_1);

		monthCombo = new JComboBox();
		monthCombo.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

		panel_1.add(monthCombo);

		JLabel lblNewLabel_1 = new JLabel("��");
		lblNewLabel_1.setFont(new Font("�����ٸ���", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1);

		JPanel panel_2 = new JPanel();
		input.add(panel_2);

		dateCombo = new JComboBox();
		panel_2.add(dateCombo);

		JLabel label = new JLabel("\uC77C");
		label.setFont(new Font("�����ٸ���", Font.PLAIN, 20));
		panel_2.add(label);

		JPanel panel_3 = new JPanel();
		input.add(panel_3);

		lblNewLabel_2 = new JLabel("\uCD9C\uADFC \uC2DC\uAC04");
		lblNewLabel_2.setFont(new Font("�����ٸ���", Font.PLAIN, 18));
		panel_3.add(lblNewLabel_2);

		startHCombo = new JComboBox();
		startHCombo.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
		panel_3.add(startHCombo);

		JLabel lblNewLabel_3 = new JLabel("\uC2DC");
		lblNewLabel_3.setFont(new Font("�����ٸ���", Font.PLAIN, 18));
		panel_3.add(lblNewLabel_3);

		startMCombo = new JComboBox();
		startMCombo.setModel(new DefaultComboBoxModel(
				new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
						"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
						"31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46",
						"47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
		panel_3.add(startMCombo);

		JLabel lblNewLabel_4 = new JLabel("\uBD84");
		lblNewLabel_4.setFont(new Font("�����ٸ���", Font.PLAIN, 18));
		panel_3.add(lblNewLabel_4);

		JPanel panel_4 = new JPanel();
		input.add(panel_4);

		JLabel label_1 = new JLabel("\uD1F4\uADFC \uC2DC\uAC04");
		label_1.setFont(new Font("�����ٸ���", Font.PLAIN, 18));
		panel_4.add(label_1);

		endHCombo = new JComboBox();
		endHCombo.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
		panel_4.add(endHCombo);

		JLabel label_2 = new JLabel("\uC2DC");
		label_2.setFont(new Font("�����ٸ���", Font.PLAIN, 18));
		panel_4.add(label_2);

		endMCombo = new JComboBox();
		endMCombo.setModel(new DefaultComboBoxModel(
				new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
						"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
						"31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46",
						"47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
		panel_4.add(endMCombo);

		JLabel label_3 = new JLabel("\uBD84");
		label_3.setFont(new Font("�����ٸ���", Font.PLAIN, 18));
		panel_4.add(label_3);

		JPanel panel_5 = new JPanel();
		input.add(panel_5);

		JLabel lblNewLabel_5 = new JLabel("\uC624\uB298 \uADFC\uBB34 \uC2DC\uAC04");
		lblNewLabel_5.setFont(new Font("�����ٸ���", Font.PLAIN, 18));
		panel_5.add(lblNewLabel_5);

		todayWorkHourTxt = new JTextField();
		todayWorkHourTxt.setEditable(false);
		panel_5.add(todayWorkHourTxt);
		todayWorkHourTxt.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("\uC2DC\uAC04!");
		lblNewLabel_6.setFont(new Font("�����ٸ���", Font.PLAIN, 18));
		panel_5.add(lblNewLabel_6);

		saveBtn = new JButton("\uC800\uC7A5");
		saveBtn.setBackground(Color.PINK);
		panel_5.add(saveBtn);
		saveBtn.setFont(new Font("��������ڵ�", Font.BOLD, 12));

		JPanel panel_8 = new JPanel();
		input.add(panel_8);

		JLabel lblNewLabel_12 = new JLabel("�����带 ������ ��, �����ϱ⸦ �����ּ���");
		lblNewLabel_12.setForeground(Color.RED);
		panel_8.add(lblNewLabel_12);

		selectedUpdateBtn = new JButton("\uC9C0\uC815\uAC12 \uBCC0\uACBD");
		selectedUpdateBtn.setBackground(Color.PINK);
		selectedUpdateBtn.setFont(new Font("��������ڵ�", Font.BOLD, 12));
		panel_8.add(selectedUpdateBtn);

		cancelBtn = new JButton("���������");
		cancelBtn.setBackground(Color.PINK);
		cancelBtn.setFont(new Font("��������ڵ�", Font.BOLD, 12));
		panel_8.add(cancelBtn);

		selectedDelete = new JButton("������ ����");
		selectedDelete.setBackground(Color.PINK);
		selectedDelete.setFont(new Font("��������ڵ�", Font.BOLD, 12));
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
		lblNewLabel_7.setFont(new Font("���� ���", Font.PLAIN, 17));
		panel_9.add(lblNewLabel_7);

		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(new Color(248, 248, 255));
		desktopPane_1.setBounds(10, 131, 113, 50);
		desktopPane.add(desktopPane_1);

		JLabel label_6 = new JLabel("�ٹ��ð�");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_6.setBounds(42, 0, 59, 23);
		desktopPane_1.add(label_6);

		totalWorkHour = new JTextField("365");
		totalWorkHour.setHorizontalAlignment(SwingConstants.CENTER);
		totalWorkHour.setEditable(false);
		totalWorkHour.setBounds(12, 25, 59, 21);
		desktopPane_1.add(totalWorkHour);

		JLabel label_7 = new JLabel("�ð�");
		label_7.setFont(new Font("�����ٸ���", Font.PLAIN, 12));
		label_7.setBounds(83, 28, 30, 16);
		desktopPane_1.add(label_7);

		lbMonth1 = new JLabel(mm);
		lbMonth1.setHorizontalAlignment(SwingConstants.CENTER);
		lbMonth1.setFont(new Font("�����ٸ���", Font.BOLD, 15));
		lbMonth1.setBounds(12, 4, 34, 15);
		desktopPane_1.add(lbMonth1);

		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(new Color(255, 250, 250));
		desktopPane_2.setBounds(10, 188, 113, 50);
		desktopPane.add(desktopPane_2);

		JLabel label_8 = new JLabel("\uADFC\uBB34 \uD69F\uC218");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_8.setBounds(40, 0, 65, 23);
		desktopPane_2.add(label_8);

		totalWorkDay = new JTextField("25");
		totalWorkDay.setHorizontalAlignment(SwingConstants.CENTER);
		totalWorkDay.setEditable(false);
		totalWorkDay.setBounds(12, 25, 59, 21);
		desktopPane_2.add(totalWorkDay);

		JLabel lblNewLabel = new JLabel("��");
		lblNewLabel.setBounds(88, 28, 20, 15);
		desktopPane_2.add(lblNewLabel);

		lbMonth2 = new JLabel(mm);
		lbMonth2.setHorizontalAlignment(SwingConstants.CENTER);
		lbMonth2.setFont(new Font("����", Font.BOLD, 13));
		lbMonth2.setBounds(12, 4, 31, 15);
		desktopPane_2.add(lbMonth2);

		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(new Color(255, 250, 250));
		desktopPane_3.setBounds(10, 243, 113, 50);
		desktopPane.add(desktopPane_3);

		JLabel label_9 = new JLabel("���� �ñ�");
		label_9.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_9.setBounds(30, 0, 72, 16);
		desktopPane_3.add(label_9);

		currentPay = new JTextField("");
		currentPay.setHorizontalAlignment(SwingConstants.CENTER);
		currentPay.setEditable(false);
		currentPay.setBounds(10, 24, 60, 21);
		desktopPane_3.add(currentPay);

		JLabel lblNewLabel_8 = new JLabel("��");
		lblNewLabel_8.setBounds(82, 27, 20, 15);
		desktopPane_3.add(lblNewLabel_8);

		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(new Color(255, 250, 250));
		desktopPane_4.setBounds(10, 300, 113, 51);
		desktopPane.add(desktopPane_4);

		JLabel label_10 = new JLabel("\uC5D0 \uBC88(\uBC8C)\uB3C8");
		label_10.setFont(new Font("�����ٸ���", Font.PLAIN, 15));
		label_10.setBounds(40, 3, 73, 16);
		desktopPane_4.add(label_10);

		currentEarned = new JTextField("1200000");
		currentEarned.setHorizontalAlignment(SwingConstants.CENTER);
		currentEarned.setEditable(false);
		currentEarned.setBounds(5, 25, 80, 21);
		desktopPane_4.add(currentEarned);

		JLabel label_11 = new JLabel("��");
		label_11.setBounds(90, 28, 20, 15);
		desktopPane_4.add(label_11);

		lbMonth3 = new JLabel(mm);
		lbMonth3.setHorizontalAlignment(SwingConstants.CENTER);
		lbMonth3.setFont(new Font("����", Font.BOLD, 13));
		lbMonth3.setBounds(5, 4, 32, 15);
		desktopPane_4.add(lbMonth3);

		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBackground(new Color(255, 250, 250));
		desktopPane_5.setBounds(10, 502, 630, 50);
		desktopPane.add(desktopPane_5);

		searchBtn = new JButton("���� �˻�");
		searchBtn.setBackground(Color.PINK);
		searchBtn.setFont(new Font("��������ڵ�", Font.BOLD, 12));
		searchBtn.setBounds(302, 10, 120, 33);
		desktopPane_5.add(searchBtn);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(222, 10, 68, 33);
		desktopPane_5.add(panel_11);

		searchMonth = new JComboBox();
		searchMonth.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		panel_11.add(searchMonth);

		JLabel label_16 = new JLabel("\uC6D4");
		label_16.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_11.add(label_16);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(118, 10, 92, 33);
		desktopPane_5.add(panel_10);

		searchYear = new JComboBox();
		searchYear.setModel(new DefaultComboBoxModel(
				new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));
		panel_10.add(searchYear);

		JLabel label_14 = new JLabel("\uB144");
		label_14.setFont(new Font("����", Font.BOLD, 15));
		panel_10.add(label_14);

		undoBtn = new JButton("��ü ������ ����");
		undoBtn.setBackground(Color.PINK);
		undoBtn.setFont(new Font("��������ڵ�", Font.BOLD, 12));
		undoBtn.setBounds(438, 10, 152, 33);
		desktopPane_5.add(undoBtn);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.PINK, 2));
		panel_7.setBackground(Color.DARK_GRAY);
		panel_7.setBounds(10, 54, 113, 70);
		desktopPane.add(panel_7);

		JLabel lblNewLabel_10 = new JLabel(new SimpleDateFormat("YYYY��").format(new Date()));
		lblNewLabel_10.setFont(new Font("���� ���", Font.BOLD, 15));
		lblNewLabel_10.setForeground(Color.WHITE);
		panel_7.add(lblNewLabel_10);

		label_12 = new JLabel(new SimpleDateFormat("MM�� dd��").format(new Date()));
		label_12.setForeground(new Color(248, 248, 255));
		label_12.setFont(new Font("���� ���", Font.PLAIN, 20));
		panel_7.add(label_12);

		panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(130, 10, 510, 30);
		desktopPane.add(panel);

		lb_username = new JLabel("\uC774\uC8FC\uC601");
		lb_username.setFont(new Font("�����ٸ���", Font.BOLD, 15));
		panel.add(lb_username);

		label_13 = new JLabel(" �� �ȳ��ϼ���! ���� �ٹ�����  ");
		label_13.setFont(new Font("�����ٸ���", Font.PLAIN, 14));
		panel.add(label_13);

		lb_workspace = new JLabel("\uD22C\uC378\uD50C\uB808\uC774\uC2A4");
		lb_workspace.setFont(new Font("�����ٸ���", Font.BOLD, 15));
		panel.add(lb_workspace);

		JLabel lblNewLabel_9 = new JLabel("\uC785\uB2C8\uB2E4.");
		lblNewLabel_9.setFont(new Font("�����ٸ���", Font.BOLD, 13));
		panel.add(lblNewLabel_9);

		menuBar = new JMenuBar();
		menuBar.setLocation(0, 0);
		menuBar.setBackground(new Color(255, 250, 250));
		menuBar.setSize(659, 27);
		getContentPane().add(menuBar);
		// setJMenuBar(menuBar);

		mnNewMenu = new JMenu("\u2261");
		menuBar.add(mnNewMenu);

		initItem = new JMenuItem("�ʱ�ȭ");
		mnNewMenu.add(initItem);

		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);

		changeInfo = new JMenuItem("���� �����ϱ�");
		mnNewMenu.add(changeInfo);
	}

	// �̺�Ʈ Ŭ����
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == initItem) {// �޴����� �ʱ�ȭ ������
			int choice = JOptionPane.showConfirmDialog(this, "��� �����Ǵµ�, ���� �ʱ�ȭ �Ͻðڽ��ϱ�?", "���",
					JOptionPane.OK_CANCEL_OPTION);

			if (choice == JOptionPane.OK_OPTION) {
				try {
					dao.setinit(member.getId());
					JOptionPane.showMessageDialog(this, "�ʱ�ȭ�Ǿ����ϴ�!");
					this.repaint(member);

				} catch (SQLException e1) {
					System.out.println("�ʱ�ȭ�ϴ� ���������� ����" + e1.getMessage());
				}
			}

		} else if (src == changeInfo) {
			new ModifyInfoFrame(member, "ȸ������ ����", this);

		} else if (src == yearCombo) {
			selectedYear = (String) yearCombo.getSelectedItem();

		} else if (src == monthCombo) {
			if (selectedYear == null) { // �������� �ʾҴٸ�
				JOptionPane.showMessageDialog(this, "�⵵�� �������ּ���!");
				return;
			} else {
				selectedMonth = (String) monthCombo.getSelectedItem();

				// �ش� �⵵, ���� �´� ��¥�� �޺��ڽ��� ��Ÿ���� �ϱ� ���� �ڵ�
				Calendar cal = new GregorianCalendar(Integer.parseInt(selectedYear),
						Integer.parseInt(selectedMonth) - 1, 1);

				int daysOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

				for (int i = 1; i <= daysOfMonth; i++)
					dateCombo.addItem(i + "");
			}

		} else if (src == dateCombo) {
			if (selectedMonth == null) { // �������� �ʾҴٸ�
				JOptionPane.showMessageDialog(this, " ���� �������ּ���!");
				return;
			} else {
				selectedDate = (String) dateCombo.getSelectedItem();
			}
		} else if (src == startHCombo) {// ����ڰ� ��� �ð��� ����

			selectedStartH = (String) startHCombo.getSelectedItem();

		} else if (src == startMCombo) {

			selectedStartM = (String) startMCombo.getSelectedItem();

		} else if (src == endHCombo) {

			selectedEndtH = (String) endHCombo.getSelectedItem();

		} else if (src == endMCombo) {
			selectedEndtM = (String) endMCombo.getSelectedItem();

		} else if (src == saveBtn) {
			if (selectedStartH == null) { // �������� �ʾҴٸ�
				JOptionPane.showMessageDialog(this, " ��ٽð�(�ð�)�� �������ּ���!");
				// return;
			} else if (selectedEndtH == null) {
				JOptionPane.showMessageDialog(this, " ��ٽð�(�ð�)�� �������ּ���!");
				// return;
			} else if (selectedStartM == null) {
				JOptionPane.showMessageDialog(this, " ��ٽð�(��)�� �������ּ���!");
				// return;
			} else if (selectedDate == null) {
				JOptionPane.showMessageDialog(this, "�� �������ּ���! �ϼ��� �����ϱ� ���ؼ� ���� ���� �����ؾ��մϴ�.");
				// return;
			} else if (selectedEndtM == null) { // �������� �ʾҴٸ�
				JOptionPane.showMessageDialog(this, "��ٽð� (��)�� ����ּ���!");
				// return;

			} else {
				if (!isUpdateMode) {

					// ��ٽð��� ��ٽð��� ���̷� ���� �ٹ��ð��� �˾Ƴ��� ���� ��� �ڵ�
					SimpleDateFormat format = new SimpleDateFormat("HH:mm");
					long hour = 0;
					long minute = 0;

					try {
						Date st = format.parse(selectedStartH + ":" + selectedStartM);
						Date et = format.parse(selectedEndtH + ":" + selectedEndtM);
						long dif = et.getTime() - st.getTime();

						hour = dif / (1000 * 60 * 60);
						minute = (dif / (1000 * 60)) - (hour * 60);

						worktime_double = ((int) ((double) dif / (1000 * 60 * 60) * 10)) / 10.0;

						if (dif < 0) {
							hour = 24 + hour;
							minute = 60 + minute;
							if (minute == 60) {
								minute = 0;
								worktime_double = hour + minute / 60;
							} else
								worktime_double = hour + minute / 60;
						}

					} catch (ParseException e2) {
						System.out.println("��¥ ��ȯ �߿� �˼����� ����" + e2.getMessage());
					}

					if (minute < 10)
						worktime = hour + ":0" + minute;
					else
						worktime = hour + ":" + minute;

					todayWorkHourTxt.setText(worktime);
					todayWorkHourTxt.setEditable(false);

					String str_workdate = selectedYear + "/" + selectedMonth + "/" + selectedDate;
					String str_starttime = selectedStartH + ":" + selectedStartM;
					String str_endtime = selectedEndtH + ":" + selectedEndtM;

					try {

						if (!dao.checkWorkDate(member.getId(), str_workdate)) {
							JOptionPane.showMessageDialog(this, "������ �ѱٹ������� �������� ���� �� �� �����ϴ�.");
							// dao.db_close();
							return;
						}

					} catch (HeadlessException | SQLException e2) {
						System.out.println("workdate��ȿ���˻縦 �ϴ� ���������� ����");
						e2.printStackTrace();
					}
					// �ϱް��
					int money = (int) (worktime_double * (Integer.parseInt(member.getSalperhour())));

					payInfo = new MemberPayInfo(member.getId(), str_workdate, selectedYear, selectedMonth, selectedDate,
							str_starttime, str_endtime, worktime, money, member.getSalperhour());

					try {
						dao.insertPayData(payInfo);
						JOptionPane.showMessageDialog(this, "���������� ����Ǿ����ϴ�!");
						tc.addMemberPayInfo(payInfo);// ���̺���Ʈ�ѷ����� �߰��ؼ� ���̺� �Ѹ��� �ֵ��� �Ѵ�.

						if (selectedYear.equals(yy) && selectedMonth.equals(mm.substring(1, 2)))// ���Ե����� ���� �Ű� ���ٸ�
																								// label���� �����ϵ���
							labelSetting(yy, mm.substring(1, 2));// �ٽ� ���ΰ�ħ
						// dao.db_close();

					} catch (SQLException e1) {
						System.out.println("insert�� �����ͺ��̽� ����");
						e1.printStackTrace();
					}

				} else if (isUpdateMode) {
					updateMode(t1, t2, t3, t4);

					if (selectedYear.equals(yy) && selectedMonth.equals(mm.substring(1, 2)))// ���Ե����� ���� �Ű� ���ٸ� label����
																							// �����ϵ���
						labelSetting(yy, mm.substring(1, 2));// �ٽ� ���ΰ�ħ

					// �Ϸ���
					settingCombo(true);// �ٽ� ����޺��ڽ��� ����� �� �ֵ��� true�� �ٲ��ش�.
					isUpdateMode = false;// �����尡 �������Ƿ� �ٽ� false
				}
			}

		} else if (src == selectedDelete) {
			int one = table.getSelectedRow(); // ����ڰ� ������ �ప�� �޾ƿµ�

			if (one == -1) {
				JOptionPane.showMessageDialog(this, "���õ� ���� �����ϴ�.", "���", JOptionPane.OK_OPTION);
			} else {
				int choice = JOptionPane.showConfirmDialog(this, "���� �����Ͻðڽ��ϱ�?", "���", JOptionPane.OK_CANCEL_OPTION);
				if (choice == JOptionPane.OK_OPTION) {

					String selectDate = (String) tc.getValueAt(one, 0) + "/" + (String) tc.getValueAt(one, 1) + "/"
							+ (String) tc.getValueAt(one, 2);

					try {
						dao.deleteOnePayData(member.getId(), selectDate);

						JOptionPane.showMessageDialog(this, "���������� �����Ǿ����ϴ�!");

						if (((String) tc.getValueAt(one, 0)).equals(yy)
								&& ((String) tc.getValueAt(one, 1)).equals(mm.substring(1, 2)))
							labelSetting(yy, mm.substring(1, 2));// �ٽ� ���ΰ�ħ

						tc.delMemberPayInfo(one);

						// this.repaint();
						// dao.db_close();

					} catch (SQLException e1) {
						System.out.println("���̺� �����͸� �����ϴ� ���������� ����");
						e1.printStackTrace();
					}
				}
			}

		} else if (src == selectedUpdateBtn) {// ������ ������

			int one = table.getSelectedRow(); // ����ڰ� ������ �ప�� �޾ƿ´�
			int col = table.getSelectedColumn();// ����ڰ� ������ ������ �޾ƿ´�

			if (one == -1) {
				JOptionPane.showMessageDialog(this, "���õ� ���� �����ϴ�.", "���", JOptionPane.OK_OPTION);
			} else if (col == 0 || col == 1 || col == 2 || col == 5 || col == 6 || col == 7) {
				JOptionPane.showMessageDialog(this, "��ٽð��� ��ٽð��� ���� �����մϴ�!!");
				return;
			} else {
				String colname = tc.getColumnName(col);// �ٲٰ� ���� ���� �̸��� �޾ƿ´�.

				int choice = JOptionPane
						.showConfirmDialog(this,
								tc.getValueAt(one, 0) + "�� " + tc.getValueAt(one, 1) + "�� " + tc.getValueAt(one, 2)
										+ "�� " + " ���� " + "\"" + colname + "\"" + " �� �����Ͻðڽ��ϱ�?",
								"���", JOptionPane.OK_CANCEL_OPTION);

				if (choice == JOptionPane.OK_OPTION) {
					String selectedValue = (String) tc.getValueAt(one, col);// ����ڰ� ������ ���� ���´�.
					settingCombo(false);// �ϴ� �� false�� ����� �ص�
					isUpdateMode = true;// ������Ʈ ��带 ����

					// �� �ش� �������� �޺��ڽ��� ��밡���ϰ� ����д�.
					int selectedCombo = setComboEnable(colname);

					// ������ ���� �� �����͸� �迭�� ��ƿ´�
					String s1 = null, s2 = null, s3 = null, s4 = null;

					tmp = new String[tc.getColumnCount() - 2];
					for (int i = 0; i < tmp.length; i++) {
						tmp[i] = (String) tc.getValueAt(one, i);
						if (i == 3) {
							if (tmp[i].length() == 5) {// 19:00�� ���� 10���ڸ� ��
								s1 = tmp[3].substring(0, 2);
								s2 = tmp[3].substring(3);
							} else {
								s1 = tmp[3].substring(0, 1);
								s2 = tmp[3].substring(2);
							}

						} else if (i == 4) {
							if (tmp[i].length() == 5) {
								s3 = tmp[4].substring(0, 2);
								s4 = tmp[4].substring(3);
							} else {
								s3 = tmp[4].substring(0, 1);
								s4 = tmp[3].substring(2);
							}
						}

					}
					// �׸��� ������ �޺��ڽ����� ����ڰ� ������ �������� ���õǵ��� �Ѵ�.
					settingCombofield(colname, tmp[0], tmp[1], tmp[2], s1, s2, s3, s4, tmp[5]);

					// ������Ʈ��忡�� ����� ���� �Ф� �̹������ �� ���� ������� ������ ����� �����Ͱ����� �������� �ʴ´�....
					t1 = selectedCombo;
					t2 = selectedValue;
					t3 = colname;
					t4 = (String) tc.getValueAt(one, 7);// �� ���� �ñ�

				}
			}

		} else if (src == searchYear) {
			selectedSearchYear = (String) searchYear.getSelectedItem();// ����ڰ� ������ �Ⱚ�� ��ȯ�޴´�.
			System.out.println(selectedSearchYear);

		} else if (src == searchMonth) {
			selectedSearchMonth = (String) searchMonth.getSelectedItem();// ����ڰ� ������ ���� ��ȯ�޴´�
			System.out.println(selectedSearchMonth);

		} else if (src == searchBtn) {// ���� �˻�

			if (searchYear.getSelectedIndex() == -1) { // �������� �ʾҴٸ�
				JOptionPane.showMessageDialog(this, "�˻��� �⵵�� �������ּ���!");
			}
			if (searchMonth.getSelectedIndex() == -1) { // �������� �ʾҴٸ�
				// selectedEndtH = (String) endHCombo.getSelectedItem();
				JOptionPane.showMessageDialog(this, "�˻��� ���� �������ּ���!");
			} else {

				try {
					// db�� ���� ���� �˻��ϸ� �˻� ��� ���ٰ� �߰� �ϱ�
					if (selectedSearchYear != null && selectedSearchMonth != null) {
						dao.userSelectMonth(selectedSearchYear, selectedSearchMonth, member.getId());

						if (tableSetting2() == 0) {
							JOptionPane.showMessageDialog(this, "�˻������ �����ϴ�!");
						} else {
							scrollPane.setVisible(false);
							isPushSearchBtn = true;// �ѹ� �������� ǥ��
							JOptionPane.showMessageDialog(this, "���������� �˻��Ǿ����ϴ�!");
							labelSetting(selectedSearchYear, selectedSearchMonth);// �˻��� �޷� �ٲٱ�
							changeSearchDate(selectedSearchMonth);// �� ����� �ٲٷ��� �ִ� �ڵ�
							// dao.db_close();
						}

					} else {
						JOptionPane.showMessageDialog(this, "�˻��� ��¥�� ����ּ���!");
					}

				} catch (SQLException e1) {
					System.out.println("�ش糯¥�� �˻��ϴµ� ������ �߻��߽��ϴ�.");
					e1.printStackTrace();
				}
			}

		} else if (src == undoBtn) {// search��ư�� ���������µ� �̰� ������ �������ϱ� ����ó������
			if (isPushSearchBtn) {// �����ϰ˻��� �ѹ� �������� �� ��ư�� ������ �� �ֵ���
				scrollPane.setVisible(true);
				scrollPane2.setVisible(false);
				labelSetting(selectedSearchYear, mm.substring(1, 2));// �ٽ� ���ΰ�ħ
				changeSearchDate(mm.substring(1, 2));
			} else
				JOptionPane.showMessageDialog(this, "�̹� ��ü �����͸� ����輼��!");

		} else if (src == cancelBtn) {// ������ ���������
			settingCombo(true);// ������ ����� �� �ֵ���
			isUpdateMode = false;// ������Ʈ ��尡 �ƴ��� �˷��ֱ� ����
		}
	}
}