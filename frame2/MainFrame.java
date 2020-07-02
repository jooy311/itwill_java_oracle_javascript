package project.manager.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Chatt.DBManager;
import Chatt.MemberDAO;

import java.awt.Color;
import java.sql.SQLException;

public class MainFrame extends JFrame {
	
	private static MainFrame instance;
	private static Member member;
	private ManagerPanel managerpanel;
	
	public MainFrame(Member memeber) {
		this.member = member;
		getContentPane().setBackground(Color.DARK_GRAY);
		setBounds(400, 100, 663, 663);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setResizable(false);
		setVisible(true);
	}
	
	public static MainFrame getInstance() {
	       if (instance == null)
	         instance = new MainFrame(member);
	       return instance;
	}
	
	public void setPanel(JPanel pan) {
	 if(pan instanceof ManagerPanel) {
			setSize(662, 622);
			setResizable(false);
			pan.setVisible(true);
			setTitle("PayManager");
		}
		setContentPane(pan);
		revalidate();//¾ê´Â ¹¹ÇÏ´Â ¾ÖÁö
	}
	
	public void repaintPanel(ManagerPanel pan) {
		pan.repaint();
	}
	
	public JFrame getFrame() {
		return this;
	}
}
