package project.manager.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

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

public class ManagerPanel extends JPanel implements ActionListener {
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
	private JButton searchMonthBtn;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem initItem;
	private JMenuItem changeInfo;

	
	//»ý¼ºÀÚ
	public ManagerPanel() {
		init();
		setBounds(100, 100, 664, 625);
		setVisible(true);
		
		initItem.addActionListener(this);
		changeInfo.addActionListener(this);
		
	}

	
	//È­¸é ¼ÂÆÃ ¸Þ¼Òµå
	private void init() {
		setLayout(null);

		//ÇöÀç ³¯Â¥ ¹Þ¾Æ¿Í¼­ »Ñ¸®±â
		SimpleDateFormat pattern = new SimpleDateFormat("MM¿ù ddÀÏ");
		String time = pattern.format(new Date());
		SimpleDateFormat pattern_m = new SimpleDateFormat("MM¿ù");
		String mm = pattern_m.format(new Date());

		// Å×ÀÌºí¿¡ µé¾î°¥ µ¥ÀÌÅÍ(ÀÓ½Ã)
		String header[] = { "³¯Â¥", "Ãâ±Ù½Ã°£", "Åð±Ù½Ã°£", "±Ù¹«½Ã°£", "ÀÏ±Þ" };
		String contents[][] = { { "6¿ù 1ÀÏ", "¾ÆÄ§8½Ã", "¿ÀÈÄ5½Ã", "8½Ã°£", "7300¿ø" } };

		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.DARK_GRAY);
		add(desktopPane);
		// desktopPane.setLayout(new BoxLayout(desktopPane, BoxLayout.X_AXIS));
		desktopPane.setBounds(0, 23, 659, 532);
		
		table = new JTable(contents, header);
		JScrollPane scrollPane = new JScrollPane(table);// Å×ÀÌºíÀº ½ºÅ©·ÑÆÒ
		desktopPane.add(scrollPane);
		scrollPane.setBounds(130, 52, 510, 300);

		JPanel input = new JPanel();
		input.setBackground(new Color(255, 250, 250));
		input.setBounds(10, 358, 630, 101);
		desktopPane.add(input);

		JPanel panel_1 = new JPanel();
		input.add(panel_1);

		monthCombo = new JComboBox();
		monthCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		panel_1.add(monthCombo);

		JLabel lblNewLabel_1 = new JLabel("\uC6D4");
		lblNewLabel_1.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1);

		JPanel panel_2 = new JPanel();
		input.add(panel_2);

		dateCombo = new JComboBox();
		dateCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		panel_2.add(dateCombo);

		JLabel label = new JLabel("\uC77C");
		label.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 20));
		panel_2.add(label);

		JPanel panel_3 = new JPanel();
		input.add(panel_3);

		lblNewLabel_2 = new JLabel("\uCD9C\uADFC \uC2DC\uAC04");
		lblNewLabel_2.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		panel_3.add(lblNewLabel_2);

		startHCombo = new JComboBox();
		startHCombo.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		panel_3.add(startHCombo);

		JLabel lblNewLabel_3 = new JLabel("\uC2DC");
		lblNewLabel_3.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		panel_3.add(lblNewLabel_3);

		startMCombo = new JComboBox();
		startMCombo.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		panel_3.add(startMCombo);

		JLabel lblNewLabel_4 = new JLabel("\uBD84");
		lblNewLabel_4.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		panel_3.add(lblNewLabel_4);

		JPanel panel_4 = new JPanel();
		input.add(panel_4);

		JLabel label_1 = new JLabel("\uD1F4\uADFC \uC2DC\uAC04");
		label_1.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		panel_4.add(label_1);

		endHCombo = new JComboBox();
		endHCombo.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		panel_4.add(endHCombo);

		JLabel label_2 = new JLabel("\uC2DC");
		label_2.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		panel_4.add(label_2);

		endMCombo = new JComboBox();
		endMCombo.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		panel_4.add(endMCombo);

		JLabel label_3 = new JLabel("\uBD84");
		label_3.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		panel_4.add(label_3);

		JPanel panel_5 = new JPanel();
		input.add(panel_5);

		JLabel lblNewLabel_5 = new JLabel("\uC624\uB298 \uADFC\uBB34 \uC2DC\uAC04");
		lblNewLabel_5.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		panel_5.add(lblNewLabel_5);

		todayWorkHourTxt = new JTextField();
		panel_5.add(todayWorkHourTxt);
		todayWorkHourTxt.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("\uC2DC\uAC04!");
		lblNewLabel_6.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		panel_5.add(lblNewLabel_6);

		JPanel panel_8 = new JPanel();
		input.add(panel_8);

		saveBtn = new JButton("\uC800\uC7A5");
		saveBtn.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		panel_8.add(saveBtn);

		selectedDelete = new JButton("\uC9C0\uC815\uC77C \uC0AD\uC81C");
		selectedDelete.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
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
		lblNewLabel_7.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		panel_9.add(lblNewLabel_7);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(new Color(248, 248, 255));
		desktopPane_1.setBounds(10, 131, 113, 50);
		desktopPane.add(desktopPane_1);
		
		JLabel label_6 = new JLabel("\uADFC\uBB34\uC2DC\uAC04");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
		label_6.setBounds(29, 0, 72, 23);
		desktopPane_1.add(label_6);
		
		totalWorkHour = new JTextField("365");
		totalWorkHour.setEditable(false);
		totalWorkHour.setBounds(12, 25, 59, 21);
		desktopPane_1.add(totalWorkHour);
		
		JLabel label_7 = new JLabel("\uC2DC\uAC04");
		label_7.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 12));
		label_7.setBounds(83, 28, 18, 16);
		desktopPane_1.add(label_7);
		
		JLabel lblNewLabel_10 = new JLabel(mm);
		lblNewLabel_10.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.BOLD, 15));
		lblNewLabel_10.setBounds(12, 4, 34, 15);
		desktopPane_1.add(lblNewLabel_10);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(new Color(255, 250, 250));
		desktopPane_2.setBounds(10, 188, 113, 50);
		desktopPane.add(desktopPane_2);
		
		JLabel label_8 = new JLabel("\uADFC\uBB34\uC77C");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
		label_8.setBounds(40, 0, 65, 23);
		desktopPane_2.add(label_8);
		
		totalWorkDay = new JTextField("25");
		totalWorkDay.setEditable(false);
		totalWorkDay.setBounds(12, 25, 59, 21);
		desktopPane_2.add(totalWorkDay);
		
		JLabel lblNewLabel = new JLabel("\uC77C");
		lblNewLabel.setBounds(88, 28, 20, 15);
		desktopPane_2.add(lblNewLabel);
		
		JLabel label_4 = new JLabel(mm);
		label_4.setFont(new Font("±¼¸²", Font.BOLD, 13));
		label_4.setBounds(12, 4, 31, 15);
		desktopPane_2.add(label_4);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(new Color(255, 250, 250));
		desktopPane_3.setBounds(10, 243, 113, 50);
		desktopPane.add(desktopPane_3);
		
		JLabel label_9 = new JLabel("\uB098\uC758 \uC2DC\uAE09");
		label_9.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
		label_9.setBounds(30, 0, 50, 16);
		desktopPane_3.add(label_9);
		
		currentPay = new JTextField("7500\uC6D0");
		currentPay.setEditable(false);
		currentPay.setBounds(10, 24, 60, 21);
		desktopPane_3.add(currentPay);
		
		JLabel lblNewLabel_8 = new JLabel("\uC6D0");
		lblNewLabel_8.setBounds(82, 27, 20, 15);
		desktopPane_3.add(lblNewLabel_8);
		
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(new Color(255, 250, 250));
		desktopPane_4.setBounds(10, 300, 113, 51);
		desktopPane.add(desktopPane_4);
		
		JLabel label_10 = new JLabel("\uC5D0 \uBC88 \uB3C8");
		label_10.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
		label_10.setBounds(56, 4, 59, 16);
		desktopPane_4.add(label_10);
		
		currentEarned = new JTextField("1200000");
		currentEarned.setEditable(false);
		currentEarned.setBounds(5, 25, 80, 21);
		desktopPane_4.add(currentEarned);
		
		JLabel label_11 = new JLabel("\uC6D0");
		label_11.setBounds(90, 28, 20, 15);
		desktopPane_4.add(label_11);
		
		JLabel label_5 = new JLabel(mm);
		label_5.setFont(new Font("±¼¸²", Font.BOLD, 13));
		label_5.setBounds(15, 4, 32, 15);
		desktopPane_4.add(label_5);
		
		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBackground(new Color(255, 250, 250));
		desktopPane_5.setBounds(12, 464, 628, 50);
		desktopPane.add(desktopPane_5);
		
		searchMonthBtn = new JButton("¿ùº° °Ë»ö");
		searchMonthBtn.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 18));
		searchMonthBtn.setBounds(311, 6, 120, 33);
		desktopPane_5.add(searchMonthBtn);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(208, 6, 68, 37);
		desktopPane_5.add(panel_11);
		
		JComboBox comboBox_2 = new JComboBox();
		panel_11.add(comboBox_2);
		
		JLabel label_16 = new JLabel("\uC6D4");
		label_16.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 20));
		panel_11.add(label_16);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.PINK, 2));
		panel_7.setBackground(Color.DARK_GRAY);
		panel_7.setBounds(10, 54, 113, 70);
		desktopPane.add(panel_7);
		
		label_12 = new JLabel(time);
		label_12.setForeground(new Color(248, 248, 255));
		label_12.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 27));
		panel_7.add(label_12);
		
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(130, 10, 510, 30);
		desktopPane.add(panel);
		
		JLabel lb_username = new JLabel("\uC774\uC8FC\uC601");
		lb_username.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.BOLD, 15));
		panel.add(lb_username);
		
		label_13 = new JLabel(" \uB2D8 \uC548\uB155\uD558\uC138\uC694! \uD604\uC7AC \uADFC\uBB34\uC9C0\uB294 ");
		label_13.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 14));
		panel.add(label_13);
		
		JLabel lb_wortkspace = new JLabel("\uD22C\uC378\uD50C\uB808\uC774\uC2A4");
		lb_wortkspace.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.BOLD, 15));
		panel.add(lb_wortkspace);
		
		JLabel lblNewLabel_9 = new JLabel("\uC785\uB2C8\uB2E4.");
		lblNewLabel_9.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.BOLD, 13));
		panel.add(lblNewLabel_9);

		menuBar = new JMenuBar();
		menuBar.setLocation(0, 0);
		menuBar.setBackground(new Color(255, 250, 250));
		menuBar.setSize(659, 27);
		add(menuBar);
		//setJMenuBar(menuBar);

		mnNewMenu = new JMenu("\u2261");
		menuBar.add(mnNewMenu);

		initItem = new JMenuItem("\uCD08\uAE30\uD654");
		mnNewMenu.add(initItem);

		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);

		changeInfo = new JMenuItem("\uC815\uBCF4 \uBCC0\uACBD\uD558\uAE30");
		mnNewMenu.add(changeInfo);

		// JComboBox<Month> jcombo = new JComboBox<>(Month.values());
		// input.add(jcombo);
		// jcombo.addActionListener(e -> {
		// Month selMonth = (Month) ((JComboBox<Month>)
		// e.getSource()).getSelectedItem();//»ç¿ëÀÚ°¡ °í¸¥ ¿ù
		// System.out.println(selMonth);
		// });

	}

	
	// ÀÌº¥Æ® Å¬·¡½º
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == initItem) {
			//ÇØ´ç¾ÆÀÌµð¿¡ ÀúÀåµÇ¾î ÀÖ´Â ³»¿ë db¿¡ ÀÖ´Â°Å ´Ù »èÁ¦
		}else if(src == changeInfo) {
			//MainFrame frame;
			new ModifyInfoFrame("È¸¿øÁ¤º¸ ¼öÁ¤");
		}

	}
}
