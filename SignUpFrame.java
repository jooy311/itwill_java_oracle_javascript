package project.manager.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class SignUpFrame extends JFrame implements ActionListener {
	
	private usermemberDAO dao = new usermemberDAO();		
	private Member member;
	private JPasswordField passwordField;
	private JTextField nameTxt;
	private JTextField myworkplace;
	private JTextField myPay;
	private JTextField idTxt;
	private boolean checkedId = false;
	private JButton cancelBtn;
	private JButton joinBtn;
	private JButton checkIdBtn;
	

	// ������
	public SignUpFrame(String title) {
		super(title);
		init();
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);;
			}
		});
		
		setBounds(0, 0, 403, 486);
		setVisible(true);

		
		//�̺�Ʈ ���
		cancelBtn.addActionListener(this);
		joinBtn.addActionListener(this);
		checkIdBtn.addActionListener(this);
	
	}

	// ������ ����� �޼ҵ�
	public void init() {
		getContentPane().setBackground(SystemColor.activeCaption);

		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.controlLtHighlight);
		panel.setBackground(new Color(255, 192, 203));
		getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("[\uD68C\uC6D0\uAC00\uC785]");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("�����ٸ���", Font.PLAIN, 25));
		panel.add(lblNewLabel);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 250, 250));
		getContentPane().add(desktopPane, BorderLayout.CENTER);

		checkIdBtn = new JButton("\uC911\uBCF5\uD655\uC778");
		checkIdBtn.setBackground(new Color(255, 182, 193));
		checkIdBtn.setFont(new Font("�����ٸ���", Font.PLAIN, 15));
		checkIdBtn.setBounds(253, 39, 84, 37);
		desktopPane.add(checkIdBtn);

		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(new Color(255, 250, 250));
		desktopPane_1.setBounds(153, 336, 224, 60);
		desktopPane.add(desktopPane_1);

		cancelBtn = new JButton("\uCDE8\uC18C");
		cancelBtn.setFont(new Font("�����ٸ���", Font.PLAIN, 15));
		cancelBtn.setBounds(128, 10, 84, 37);
		desktopPane_1.add(cancelBtn);

		joinBtn = new JButton("\uAC00\uC785\uD558\uAE30");
		joinBtn.setBackground(new Color(255, 182, 193));
		joinBtn.setFont(new Font("�����ٸ���", Font.PLAIN, 15));
		joinBtn.setBounds(28, 10, 84, 37);
		desktopPane_1.add(joinBtn);

		passwordField = new JPasswordField();
		passwordField.setBounds(143, 99, 204, 35);
		desktopPane.add(passwordField);

		idTxt = new JTextField();
		idTxt.setBounds(145, 40, 96, 35);
		desktopPane.add(idTxt);
		idTxt.setColumns(10);

		JLabel label = new JLabel(" \uBE44\uBC00\uBC88\uD638 ");
		label.setFont(new Font("�����ٸ���", Font.PLAIN, 20));
		label.setBounds(42, 100, 72, 27);
		desktopPane.add(label);

		JLabel label_1 = new JLabel(" \uC544\uC774\uB514 ");
		label_1.setFont(new Font("�����ٸ���", Font.PLAIN, 20));
		label_1.setBounds(44, 45, 58, 27);
		desktopPane.add(label_1);

		nameTxt = new JTextField();
		nameTxt.setBounds(143, 163, 155, 35);
		desktopPane.add(nameTxt);
		nameTxt.setColumns(10);

		JLabel label_2 = new JLabel("  \uC774\uB984  ");
		label_2.setBounds(52, 161, 53, 35);
		desktopPane.add(label_2);
		label_2.setFont(new Font("�����ٸ���", Font.PLAIN, 20));

		JLabel label_3 = new JLabel(" \uD604\uC7AC \uB098\uC758 \uADFC\uBB34\uC9C0 ");
		label_3.setBounds(12, 219, 130, 35);
		desktopPane.add(label_3);
		label_3.setFont(new Font("�����ٸ���", Font.PLAIN, 20));

		myworkplace = new JTextField();
		myworkplace.setBounds(143, 221, 233, 35);
		desktopPane.add(myworkplace);
		myworkplace.setColumns(10);

		JLabel label_4 = new JLabel(" \uB098\uC758 \uD604\uC7AC \uC2DC\uAE09 ");
		label_4.setBounds(12, 281, 115, 35);
		desktopPane.add(label_4);
		label_4.setFont(new Font("�����ٸ���", Font.PLAIN, 20));

		myPay = new JTextField();
		myPay.setBounds(143, 283, 233, 35);
		desktopPane.add(myPay);
		myPay.setColumns(10);
	}

	// �̺�Ʈ �ڵ鷯
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		String pwd = String.valueOf(passwordField.getPassword());
		/**
		 * �ؾ��ϴ� ��ȿ�� �˻� 1) ��ĭ���� �ߺ��˻縦 �������� 2) �ߺ��˻� 3) ��й�ȣ ��ȿ���˻� 4) �ñ� - �������� �ƴҶ� �Ǵ�
		 * �Ҽ�������������� - �����̾�α� �߰� �Ѵ�.
		 * 
		 * --�ϴ��� �׳� push �غ���� ����
		 */
		if (src == cancelBtn) {
			setVisible(false);
			//this.dispose();
		} else if(src == checkIdBtn) {
			if(idTxt.getText().length() == 0 || idTxt.getText().length() < 4) {
				JOptionPane.showMessageDialog(this, "���̵�� 4���� �̻����� �����ּ���!");
			} else {
				try {
					
					if(dao.checkId(idTxt.getText())) {
						JOptionPane.showMessageDialog(this, "��밡���� ���̵��Դϴ�.");
					}else {
						JOptionPane.showMessageDialog(this, "�̹� ������� ���̵� �Դϴ�!");
					}		
					
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(this, "�˼����� ������ �߻��߽��ϴ�.");
				}
			}
			
		} else if (src == joinBtn) {			
			if(!checkedId) {
				JOptionPane.showMessageDialog(this, "���̵� �ߺ�Ȯ���� ���ּ���!");
				idTxt.requestFocus();//���̵�ĭ�� �ٽ� ��Ŀ���� �����ش�.
			} else if (pwd.length() < 4 || pwd.length() > 10) {
				JOptionPane.showMessageDialog(this, "��й�ȣ�� 4�ڸ� �̻� 10�ڸ� ���Ϸ� �������ּ���!");
			} else if (nameTxt.getText().length() == 0) {
				JOptionPane.showMessageDialog(this, "�̸��� �ݵ�� �Է����ּ���!");
			} else if (myworkplace.getText().length() == 0) {
				JOptionPane.showMessageDialog(this, "�ٹ����� �ݵ�� �Է����ּ���!");
			}else if(myPay.getText().length() == 0) {
				JOptionPane.showMessageDialog(this, "�ñ��� �ݵ�� �Է����ּ���!");
			}else if(myPay.getText().equals("0")) {
				JOptionPane.showMessageDialog(this, "�ñ��� ��Ȯ�� ���ڷ� �Է����ּ���!");
			}else {				
				member = new Member(idTxt.getText(), String.valueOf(passwordField.getPassword()),
						 nameTxt.getText(), myworkplace.getText() , myPay.getText());
				
				try {
					if(dao.join(member)) {
						JOptionPane.showMessageDialog(this, "������ �Ϸ�Ǿ����ϴ�!");			
						//setVisible(false);
						this.dispose();
					}else {
						JOptionPane.showMessageDialog(this, "���Կ� �����Ͽ����ϴ�!!�Ф�");		
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

}
