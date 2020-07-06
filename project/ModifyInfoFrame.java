package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ModifyInfoFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private Member member;
	private ManagerFrame managerFrame;
	private usermemberDAO dao = usermemberDAO.getDAO();// �̷��� ���ϰ� �̱��� ������ �̿��ϸ� ���� ���߿� �ٲ���
	private JPasswordField passwordField;
	private JTextField nameTxt;
	private JTextField myworkplace;
	private JTextField myPay;
	private JTextField idTxt;
	private boolean checkedId = false;
	private JButton cancelBtn;
	private JButton changeBtn;
	private JButton checkIdBtn;

	public boolean flag = false;

	public ModifyInfoFrame(Member member, String title, ManagerFrame managerFrame) {
		// ���̵� ���� x -> �������� �� ���
		super(title);
		this.member = member;
		this.managerFrame = managerFrame;

		init();
		start(member);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		setBounds(0, 0, 403, 486);
		setVisible(true);
		this.setResizable(false);

		// �̺�Ʈ ���
		cancelBtn.addActionListener(this);
		changeBtn.addActionListener(this);
	}

	public void start(Member m) {
		// ȸ�����̵� ��� ��� ���ð��ΰ�..
		checkedId = true;
		checkIdBtn.setEnabled(false);

		idTxt.setText(m.getId());
		passwordField.setText(m.getPwd());
		nameTxt.setText(m.getName());
		myworkplace.setText(m.getWorkpalce());
		myPay.setText(m.getSalperhour());

	}

	// ������ ����� �޼ҵ�
	public void init() {
		getContentPane().setBackground(SystemColor.activeCaption);

		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.controlLtHighlight);
		panel.setBackground(new Color(255, 192, 203));
		getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("[\uC815\uBCF4 \uC218\uC815]");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("�����ٸ���", Font.PLAIN, 25));
		panel.add(lblNewLabel);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 250, 250));
		getContentPane().add(desktopPane, BorderLayout.CENTER);

		checkIdBtn = new JButton("\uC911\uBCF5\uD655\uC778");
		checkIdBtn.setEnabled(false);
		checkIdBtn.setBackground(new Color(255, 182, 193));
		checkIdBtn.setFont(new Font("��������ڵ�", Font.BOLD, 11));
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

		changeBtn = new JButton("\uBCC0\uACBD");
		changeBtn.setBackground(new Color(255, 182, 193));
		changeBtn.setFont(new Font("�����ٸ���", Font.PLAIN, 15));
		changeBtn.setBounds(28, 10, 84, 37);
		desktopPane_1.add(changeBtn);

		passwordField = new JPasswordField();
		passwordField.setBounds(143, 99, 204, 35);
		desktopPane.add(passwordField);

		idTxt = new JTextField();
		idTxt.setEditable(false);
		idTxt.setBounds(145, 40, 96, 35);
		desktopPane.add(idTxt);
		idTxt.setColumns(10);

		JLabel label = new JLabel(" \uBE44\uBC00\uBC88\uD638 ");
		label.setFont(new Font("Dialog", Font.PLAIN, 16));
		label.setBounds(32, 102, 89, 27);
		desktopPane.add(label);

		JLabel label_1 = new JLabel(" \uC544\uC774\uB514 ");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_1.setBounds(44, 45, 58, 27);
		desktopPane.add(label_1);

		nameTxt = new JTextField();
		nameTxt.setBounds(143, 163, 155, 35);
		desktopPane.add(nameTxt);
		nameTxt.setColumns(10);

		JLabel label_2 = new JLabel("  \uC774\uB984  ");
		label_2.setBounds(52, 161, 53, 35);
		desktopPane.add(label_2);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 15));

		JLabel label_3 = new JLabel(" \uD604\uC7AC \uB098\uC758 \uADFC\uBB34\uC9C0 ");
		label_3.setBounds(12, 219, 130, 35);
		desktopPane.add(label_3);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 13));

		myworkplace = new JTextField();
		myworkplace.setBounds(143, 221, 233, 35);
		desktopPane.add(myworkplace);
		myworkplace.setColumns(10);

		JLabel label_4 = new JLabel(" \uB098\uC758 \uD604\uC7AC \uC2DC\uAE09 ");
		label_4.setBounds(12, 281, 115, 35);
		desktopPane.add(label_4);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 15));

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

		if (src == cancelBtn) {
			// setVisible(false);
			this.dispose();
		} else if (src == changeBtn) {
			if (pwd.length() < 4 || pwd.length() > 10) {
				JOptionPane.showMessageDialog(this, "��й�ȣ�� 4�ڸ� �̻� 10�ڸ� ���Ϸ� �������ּ���!");
			} else if (nameTxt.getText().length() == 0) {
				JOptionPane.showMessageDialog(this, "�̸��� �ݵ�� �Է����ּ���!");
			} else if (myworkplace.getText().length() == 0) {
				JOptionPane.showMessageDialog(this, "�ٹ����� �ݵ�� �Է����ּ���!");
			} else if (myPay.getText().length() == 0) {
				JOptionPane.showMessageDialog(this, "�ñ��� �ݵ�� �Է����ּ���!");
			} else if (!Pattern.matches("^\\d+", myPay.getText())) {
				JOptionPane.showMessageDialog(this, "�ñ��� ��Ȯ�� ���ڷ� �Է����ּ���!");
			} else {
				if (!flag) {
					if (!myworkplace.getText().equals(member.getWorkpalce())) {
						int choice = JOptionPane.showConfirmDialog(this, "�ٹ��� �����, ���±��� ����� ������ �ʱ�ȭ�˴ϴ�. �׷��� �����Ͻðڽ��ϱ�?",
								"���", JOptionPane.OK_CANCEL_OPTION);
						if (choice == JOptionPane.CANCEL_OPTION) {
							myworkplace.setText(member.getWorkpalce());
							myworkplace.setEditable(false);
							flag = false;// �ȹٲ۴�.
							return;
						} else if (choice == JOptionPane.OK_OPTION) {
							flag = true;// �ٲ۴�.
							myworkplace.setEditable(false);
							return;
						}

					}
				}

				if (flag) {// �ٹ����������� �ʱ�ȭ�ҰŴ�
					member = new Member(idTxt.getText(), String.valueOf(passwordField.getPassword()), nameTxt.getText(),
							myworkplace.getText(), myPay.getText());

					try {
						if (dao.update(member)) {
							JOptionPane.showMessageDialog(this, "������ �Ϸ�Ǿ����ϴ�!");

							// ������̺� ����
							dao.setinit(member.getId());// �� J���̺��� ������ �ȵǴ�?
							this.dispose();
							managerFrame.repaint(member);

						} else {
							JOptionPane.showMessageDialog(this, "���濡 �����Ͽ����ϴ�!!�Ф�");
						}

					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				} else {// �ٹ��� ������ҰŴ�
					member = new Member(idTxt.getText(), String.valueOf(passwordField.getPassword()), nameTxt.getText(),
							myworkplace.getText(), myPay.getText());

					try {
						if (dao.update(member)) {

							JOptionPane.showMessageDialog(this, "������ �Ϸ�Ǿ����ϴ�!");
							this.dispose();
							managerFrame.repaint(member);

						} else {
							JOptionPane.showMessageDialog(this, "���濡 �����Ͽ����ϴ�!!�Ф�");
						}

					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		}

	}
}