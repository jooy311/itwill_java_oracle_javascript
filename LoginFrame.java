package project.manager.frame;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Label;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

public class LoginFrame extends JFrame implements ActionListener {
	private JTextField idfield;
	private JPasswordField passwordField;
	private JButton loginBtn;
	private JButton signupBtn;
	private MainFrame mainframe;
	private ManagerPanel managerpanel;
	
	//������
	public LoginFrame(String title) {
		super(title);
		getContentPane().setBackground(new Color(102, 205, 170));
		setBackground(new Color(255, 255, 255));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
		setBounds(0, 0, 241, 295);
		
		signupBtn.addActionListener(this);
		loginBtn.addActionListener(this);
	}
	
	//ȭ�� ���� �޼ҵ�
	public void init() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(23, 22, 194, 202);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("payManager ���α׷�");
		lblNewLabel.setBounds(14, 0, 180, 70);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		
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
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setBounds(19, 83, 50, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setBounds(8, 114, 50, 15);
		panel.add(lblNewLabel_2);
	}
	
	public static void main(String[] args) {
		new LoginFrame("�α���");
	}
	
	//�̺�Ʈ �ڵ鷯
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		/**
		 * ���;��ϴ� ��ȿ���˻�
		 * 1) ���̵� �Է¾��� ��й�ȣ�� �Է��Ҷ� -> ���̵� ���� �Է��� �ְ� ��й�ȣ �Է��ش޶�� �ϱ�
		 * 2) �ߺ��˻����� �ʾ����� �ߺ��˻��ϰ� ���̾�α� ���� -> boolean�̿��ؼ� �ߺ�üũ ��ư ������ Ȯ���ϸ� -> ���� true�� �ٲٴ� ������
		 * 3) ��й�ȣ ��ȿ�� �˻�
		 * 4) �̸��̶� �ٹ����� �׳� ��������� ���ܵθ� ���̾�α� ����
		 * 5) �ñ��� ���ڷθ� ���� ����� 
		 * 
		 * */
		
		if(src == signupBtn) {//�����ϱ� ȭ���� ����.
			new SignUpFrame("ȸ������");			
			
		} else if(src == loginBtn) {//�α��� ��ȿ�� �˻� �ϵ��� -> ���̾�α� �߰� ��
			if(idfield.getText().equals("jooy311") && String.valueOf(passwordField.getPassword()).equals("12345")) {
				new ManagerFrame("Manager pay program");
				
				//�α����� �Ϸ�Ǹ�
				this.setVisible(false);//
			
			}
		}
		
	}
}
