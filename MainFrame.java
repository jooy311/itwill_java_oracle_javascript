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
		if(pan instanceof LoginPanel) {//명시적 객체형변환을 해서 메인프레임에 로그인 판넬을 뿌려준다.
			setSize(250, 314);//판넬 사이즈 설정
			pan.setVisible(true);
			setResizable(false);
			setTitle("로그인 화면");
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
