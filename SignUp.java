package project.manager.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class SignUpFrame extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public SignUpFrame(String title) {
		super(title);
		init();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 403, 486);
		setVisible(true);

	}

	public void init() {
		getContentPane().setBackground(SystemColor.activeCaption);

		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.controlLtHighlight);
		panel.setBackground(SystemColor.desktop);
		getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("[\uD68C\uC6D0\uAC00\uC785]");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("나눔바른펜", Font.PLAIN, 25));
		panel.add(lblNewLabel);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.activeCaption);
		getContentPane().add(desktopPane, BorderLayout.CENTER);

		JSplitPane splitPane = new JSplitPane();
		splitPane.setOneTouchExpandable(true);
		splitPane.setBounds(31, 25, 225, 37);
		desktopPane.add(splitPane);

		JLabel label = new JLabel(" \uC544\uC774\uB514 ");
		label.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		splitPane.setLeftComponent(label);

		textField = new JTextField();
		splitPane.setRightComponent(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("\uC911\uBCF5\uD655\uC778");
		btnNewButton.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		btnNewButton.setBounds(268, 25, 84, 37);
		desktopPane.add(btnNewButton);

		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOneTouchExpandable(true);
		splitPane_1.setBounds(31, 85, 321, 37);
		desktopPane.add(splitPane_1);

		JLabel label_1 = new JLabel(" \uBE44\uBC00\uBC88\uD638 ");
		label_1.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		splitPane_1.setLeftComponent(label_1);

		passwordField = new JPasswordField();
		splitPane_1.setRightComponent(passwordField);

		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setOneTouchExpandable(true);
		splitPane_2.setBounds(31, 150, 321, 37);
		desktopPane.add(splitPane_2);

		JLabel label_2 = new JLabel("  \uC774\uB984  ");
		label_2.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		splitPane_2.setLeftComponent(label_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		splitPane_2.setRightComponent(textField_1);

		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_3.setOneTouchExpandable(true);
		splitPane_3.setBounds(31, 216, 321, 37);
		desktopPane.add(splitPane_3);

		JLabel label_3 = new JLabel(" \uD604\uC7AC \uB098\uC758 \uADFC\uBB34\uC9C0 ");
		label_3.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		splitPane_3.setLeftComponent(label_3);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		splitPane_3.setRightComponent(textField_2);

		JSplitPane splitPane_4 = new JSplitPane();
		splitPane_4.setOneTouchExpandable(true);
		splitPane_4.setBounds(31, 283, 321, 37);
		desktopPane.add(splitPane_4);

		JLabel label_4 = new JLabel(" \uB098\uC758 \uD604\uC7AC \uC2DC\uAE09 ");
		label_4.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		splitPane_4.setLeftComponent(label_4);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		splitPane_4.setRightComponent(textField_3);

		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(SystemColor.activeCaption);
		desktopPane_1.setBounds(129, 338, 224, 70);
		desktopPane.add(desktopPane_1);

		JButton button = new JButton("\uCDE8\uC18C");
		button.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		button.setBounds(128, 10, 84, 37);
		desktopPane_1.add(button);

		JButton button_1 = new JButton("\uAC00\uC785\uD558\uAE30");
		button_1.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		button_1.setBounds(28, 10, 84, 37);
		desktopPane_1.add(button_1);
	}

	public static void main(String[] args) {
		new SignUpFrame("회원가입");
	}
}
