package project;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Label;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.SwingConstants;

public class LoginFrame extends JFrame implements ActionListener {
	private JTextField idfield;
	private JPasswordField passwordField;
	private JButton loginBtn;
	private JButton signupBtn;
	// private MainFrame mainframe;
	// private ManagerPanel managerpanel;
	private usermemberDAO dao = usermemberDAO.getDAO();

	// ������
	public LoginFrame(String title) {
		super(title);
		getContentPane().setBackground(Color.DARK_GRAY);
		setBackground(new Color(255, 255, 255));

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
		setBounds(300, 300, 257, 315);
		setResizable(false);

		signupBtn.addActionListener(this);
		loginBtn.addActionListener(this);
	}

	// ȭ�� ���� �޼ҵ�
	public void init() {
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(23, 27, 205, 219);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("payManager ���α׷�");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(14, 0, 180, 70);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));

		signupBtn = new JButton("�����ϱ�");
		signupBtn.setBounds(0, 179, 91, 23);
		panel.add(signupBtn);

		loginBtn = new JButton("�α���");
		loginBtn.setBounds(103, 179, 91, 23);
		panel.add(loginBtn);

		idfield = new JTextField();
		idfield.setBounds(81, 80, 96, 21);
		panel.add(idfield);
		idfield.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(81, 111, 96, 21);
		panel.add(passwordField);

		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(19, 83, 50, 15);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("PWD");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(8, 114, 61, 15);
		panel.add(lblNewLabel_2);
	}

	public static void main(String[] args) {
		new LoginFrame("�α���");
	}

	// �̺�Ʈ �ڵ鷯
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		/**
		 * ���;��ϴ� ��ȿ���˻� 1) ���̵� �Է¾��� ��й�ȣ�� �Է��Ҷ� -> ���̵� ���� �Է��� �ְ� ��й�ȣ �Է��ش޶�� �ϱ� 2) �ߺ��˻�����
		 * �ʾ����� �ߺ��˻��ϰ� ���̾�α� ���� -> boolean�̿��ؼ� �ߺ�üũ ��ư ������ Ȯ���ϸ� -> ���� true�� �ٲٴ� ������ 3)
		 * ��й�ȣ ��ȿ�� �˻� 4) �̸��̶� �ٹ����� �׳� ��������� ���ܵθ� ���̾�α� ���� 5) �ñ��� ���ڷθ� ���� �����
		 * 
		 */

		if (src == signupBtn) {// �����ϱ� ȭ���� ����.
			new SignUpFrame("ȸ������");

		} else if (src == passwordField || src == loginBtn) {
			if (idfield.getText().length() == 0) {
				JOptionPane.showMessageDialog(this, "���̵� �Է��ϼ���");
			} else if (passwordField.getPassword().length == 0) {
				JOptionPane.showMessageDialog(this, "��ȣ�� �Է��ϼ���");
			} else {
				String userid = idfield.getText();
				String userpwd = String.valueOf(passwordField.getPassword());
				// �Է��� ���̵�� ��й�ȣ�� ��ġ�ϴ��� Ȯ���ϴ� �ڵ�

				int check = dao.checkUser(userid, userpwd);

				try {

					if (check == 1) {
						// PayManager�����ӿ� ȸ�������� �����ϱ� ���� �ڵ�
						Member member = null;

						member = dao.getMember(userid);
						JOptionPane.showMessageDialog(this, "�α��� �Ϸ�!");
						dao.db_close();// ���⼭ �ݾ��ش�.
						new ManagerFrame(member, "Manager pay program");

						this.dispose();

					} else if (check == 0) {
						JOptionPane.showMessageDialog(this, "���̵� �������� �ʽ��ϴ�.");
					} else if (check == 2) {
						JOptionPane.showMessageDialog(this, "���̵�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
				} catch (HeadlessException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}