package project.manager.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class MainFrame extends JFrame {
	
	//private LoginPanel loginpanel;
	private ManagerPanel managerpanel;
	
	public MainFrame() {
		getContentPane().setBackground(Color.DARK_GRAY);
		setBounds(400, 100, 252, 306);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setResizable(false);
		setVisible(true);
	}
	
	
	public void setPanel(JPanel pan) {
		if(pan instanceof LoginPanel) {//����� ��ü����ȯ�� �ؼ� ���������ӿ� �α��� �ǳ��� �ѷ��ش�.
			setSize(250, 314);//�ǳ� ������ ����
			pan.setVisible(true);
			setResizable(false);
			setTitle("�α��� ȭ��");
		}else if(pan instanceof ManagerPanel) {
			setSize(664, 625);
			setResizable(false);
			pan.setVisible(true);
			setTitle("PayManager");
			
		}
		setContentPane(pan);
		revalidate();
	}
	
	public JFrame getFrame() {
		return this;
	}
	
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		LoginPanel loginpanel = new LoginPanel();
		//ManagerPanel managerPanel = new ManagerPanel();
		frame.setPanel(loginpanel);
	}
}
