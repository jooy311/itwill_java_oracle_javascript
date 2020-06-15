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

public class LoginPanel extends JPanel implements ActionListener {
	private JTextField idfield;
	private JPasswordField passwordField;
	private JButton loginBtn;
	private JButton signupBtn;
	private MainFrame mainframe;
	private ManagerPanel managerpanel;
	
	//������
	public LoginPanel() {
		setBackground(new Color(72, 209, 204));
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		//super(title);
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(0, 0, 252, 306);
		init();
		
		signupBtn.addActionListener(this);
		loginBtn.addActionListener(this);
	}
	
	//ȭ�� ���� �޼ҵ�
	public void init() {
		setLayout(null);
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(250, 240, 230));
		add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("payManager ���α׷�");
		lblNewLabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		lblNewLabel.setBounds(37, 22, 180, 70);
		add(lblNewLabel);
		
		signupBtn = new JButton("�����ϱ�");
		signupBtn.setBounds(23, 201, 91, 23);
		add(signupBtn);
		
		loginBtn = new JButton("�α���");
		loginBtn.setBounds(126, 201, 91, 23);
		add(loginBtn);
		
		idfield = new JTextField();
		idfield.setBounds(104, 102, 96, 21);
		add(idfield);
		idfield.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(104, 133, 96, 21);
		add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setBounds(42, 105, 50, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setBounds(31, 136, 50, 15);
		add(lblNewLabel_2);
	}
	
	public static void main(String[] args) {
		new LoginPanel("�α���");
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
				//mainframe.setPanel(new ManagerPanel());//�̰Ÿ��� ����ȭ���� �������� �ٲٰ� �ؾ���//�α��� �Ϸ�Ǹ� -> �ʵ� ""�� �ʱ�ȭ
				//mainframe.setPanel(new ManagerPanel());//Ŭ������ ���� �־�ߵɵ�? DB���� �����ġ�ϴ�ġ üũ�ϰ� managerFrame���� �����ϴ� �Ŵϱ�.
				//new
				//�α����� �Ϸ�Ǹ�
				//this.setVisible(false);//��...
				
					
			}
		}
		
	}
}
