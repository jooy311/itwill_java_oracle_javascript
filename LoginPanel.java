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
	
	//생성자
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
	
	//화면 셋팅 메소드
	public void init() {
		setLayout(null);
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(250, 240, 230));
		add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("payManager 프로그램");
		lblNewLabel.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		lblNewLabel.setBounds(37, 22, 180, 70);
		add(lblNewLabel);
		
		signupBtn = new JButton("가입하기");
		signupBtn.setBounds(23, 201, 91, 23);
		add(signupBtn);
		
		loginBtn = new JButton("로그인");
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
		new LoginPanel("로그임");
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
				//mainframe.setPanel(new ManagerPanel());//이거말고 메인화면을 프레임을 바꾸게 해야함//로그인 완료되면 -> 필드 ""로 초기화
				//mainframe.setPanel(new ManagerPanel());//클래스가 따로 있어야될듯? DB에서 비번일치하는치 체크하고 managerFrame으로 가야하는 거니까.
				//new
				//로그인이 완료되면
				//this.setVisible(false);//아...
				
					
			}
		}
		
	}
}
