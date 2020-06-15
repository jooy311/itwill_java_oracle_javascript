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
	
	//생성자
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
	
	//화면 셋팅 메소드
	public void init() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(23, 22, 194, 202);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("payManager 프로그램");
		lblNewLabel.setBounds(14, 0, 180, 70);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		
		signupBtn = new JButton("가입하기");
		signupBtn.setBounds(0, 179, 91, 23);
		panel.add(signupBtn);
		
		loginBtn = new JButton("로그인");
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
		new LoginFrame("로그인");
	}
	
	//이벤트 핸들러
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		/**
		 * 나와야하는 유효성검사
		 * 1) 아이디 입력없이 비밀번호를 입력할때 -> 아이디를 먼저 입력해 주고 비밀번호 입력해달라고 하기
		 * 2) 중복검사하지 않았으면 중복검사하게 다이얼로그 띄우기 -> boolean이용해서 중복체크 버튼 눌러서 확인하면 -> 상태 true로 바꾸는 식으로
		 * 3) 비밀번호 유효성 검사
		 * 4) 이름이랑 근무지는 그냥 빈공간으로 남겨두면 다이얼로그 띄우기
		 * 5) 시급은 숫자로만 적게 만들기 
		 * 
		 * */
		
		if(src == signupBtn) {//가입하기 화면을 띄운다.
			new SignUpFrame("회원가입");			
			
		} else if(src == loginBtn) {//로그인 유효성 검사 하도록 -> 다이얼로그 뜨게 함
			if(idfield.getText().equals("jooy311") && String.valueOf(passwordField.getPassword()).equals("12345")) {
				new ManagerFrame("Manager pay program");
				
				//로그인이 완료되면
				this.setVisible(false);//
			
			}
		}
		
	}
}
