package project.manager.frame;

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

public class ModifyInfoFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField nameTxt;
	private JTextField myworkplace;
	private JTextField myPay;
	private JTextField idTxt;
	private boolean checkedId = false;
	private JButton cancelBtn;
	private JButton joinBtn;
	private JButton checkIdBtn;
	
	public ModifyInfoFrame(String title) {
		//¾ÆÀÌµð ¼öÁ¤ x -> ³ª¸ÓÁö´Â ´Ù Çã¿ë
		super(title);
		checkedId = true;
		
		
		
		init();
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);;
			}
		});
		setBounds(0, 0, 403, 486);
		setVisible(true);

	}
	
//	public bringUserInfo() {
//		Member memeber = new Member();
//		
//	}
	
	// µðÀÚÀÎ ¸¸µå´Â ¸Þ¼Òµå
	public void init() {
			getContentPane().setBackground(SystemColor.activeCaption);

			JPanel panel = new JPanel();
			panel.setForeground(SystemColor.controlLtHighlight);
			panel.setBackground(new Color(255, 192, 203));
			getContentPane().add(panel, BorderLayout.NORTH);

			JLabel lblNewLabel = new JLabel("[\uC815\uBCF4 \uC218\uC815]");
			lblNewLabel.setForeground(new Color(0, 0, 0));
			lblNewLabel.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 25));
			panel.add(lblNewLabel);

			JDesktopPane desktopPane = new JDesktopPane();
			desktopPane.setBackground(new Color(255, 250, 250));
			getContentPane().add(desktopPane, BorderLayout.CENTER);

			checkIdBtn = new JButton("\uC911\uBCF5\uD655\uC778");
			checkIdBtn.setEnabled(false);
			checkIdBtn.setBackground(new Color(255, 182, 193));
			checkIdBtn.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
			checkIdBtn.setBounds(253, 39, 84, 37);
			desktopPane.add(checkIdBtn);

			JDesktopPane desktopPane_1 = new JDesktopPane();
			desktopPane_1.setBackground(new Color(255, 250, 250));
			desktopPane_1.setBounds(153, 336, 224, 60);
			desktopPane.add(desktopPane_1);

			cancelBtn = new JButton("\uCDE8\uC18C");
			cancelBtn.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
			cancelBtn.setBounds(128, 10, 84, 37);
			desktopPane_1.add(cancelBtn);

			joinBtn = new JButton("\uAC00\uC785\uD558\uAE30");
			joinBtn.setBackground(new Color(255, 182, 193));
			joinBtn.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
			joinBtn.setBounds(28, 10, 84, 37);
			desktopPane_1.add(joinBtn);

			passwordField = new JPasswordField();
			passwordField.setBounds(143, 99, 204, 35);
			desktopPane.add(passwordField);

			idTxt = new JTextField();
			idTxt.setEnabled(false);
			idTxt.setBounds(145, 40, 96, 35);
			desktopPane.add(idTxt);
			idTxt.setColumns(10);

			JLabel label = new JLabel(" \uBE44\uBC00\uBC88\uD638 ");
			label.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 20));
			label.setBounds(42, 100, 72, 27);
			desktopPane.add(label);

			JLabel label_1 = new JLabel(" \uC544\uC774\uB514 ");
			label_1.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 20));
			label_1.setBounds(44, 45, 58, 27);
			desktopPane.add(label_1);

			nameTxt = new JTextField();
			nameTxt.setBounds(143, 163, 155, 35);
			desktopPane.add(nameTxt);
			nameTxt.setColumns(10);

			JLabel label_2 = new JLabel("  \uC774\uB984  ");
			label_2.setBounds(52, 161, 53, 35);
			desktopPane.add(label_2);
			label_2.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 20));

			JLabel label_3 = new JLabel(" \uD604\uC7AC \uB098\uC758 \uADFC\uBB34\uC9C0 ");
			label_3.setBounds(12, 219, 130, 35);
			desktopPane.add(label_3);
			label_3.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 20));

			myworkplace = new JTextField();
			myworkplace.setBounds(143, 221, 233, 35);
			desktopPane.add(myworkplace);
			myworkplace.setColumns(10);

			JLabel label_4 = new JLabel(" \uB098\uC758 \uD604\uC7AC \uC2DC\uAE09 ");
			label_4.setBounds(12, 281, 115, 35);
			desktopPane.add(label_4);
			label_4.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 20));

			myPay = new JTextField();
			myPay.setBounds(143, 283, 233, 35);
			desktopPane.add(myPay);
			myPay.setColumns(10);
		}


	//ÀÌº¥Æ® ÇÚµé·¯
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
