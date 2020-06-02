package site.itwill.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

//컴포넌트를 왼쪽에서 오른쪽으로 차례대로 부착하는 배치관리자
//컨테이너의 크기를 벗어날 경우 자동으로 아래에 위치하여 부착됨
public class FlowLayoutApp extends Frame {
	
	private static final long serialVersionUID = 1L;

	public FlowLayoutApp(String title) {
		super(title);
		
		Button btn1 = new Button("button1");
		Button btn2 = new Button("button2");
		Button btn3 = new Button("button3");
		Button btn4 = new Button("button4");
		Button btn5 = new Button("button5");
		
		//프레임의 배치관리자를 border에서 flow로 변경
		setLayout(new FlowLayout());
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		setBounds(500, 100, 400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutApp("app");
	}
}
	