package project.manager.frame;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Label;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

public class MainFrame extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	
	public MainFrame(String title) {
		super(title);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(0, 0, 264, 336);
		init();
		
		
	}
	
	public void init() {
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(250, 240, 230));
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("\uC544\uB974\uBC14\uC774\uD2B8 \uC6D4\uAE09 \uACC4\uC0B0\uAE30");
		lblNewLabel.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		lblNewLabel.setBounds(37, 38, 180, 70);
		desktopPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uAC00\uC785\uD558\uAE30");
		btnNewButton.setBounds(23, 216, 91, 23);
		desktopPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB85C\uADF8\uC778");
		btnNewButton_1.setBounds(126, 216, 91, 23);
		desktopPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(96, 132, 96, 21);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(96, 163, 96, 21);
		desktopPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setBounds(34, 135, 50, 15);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setBounds(23, 166, 50, 15);
		desktopPane.add(lblNewLabel_2);
	}
	
	public static void main(String[] args) {
		new MainFrame("로그인하기 ");
	}
}
