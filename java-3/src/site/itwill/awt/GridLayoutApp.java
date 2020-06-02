package site.itwill.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

//gridLayout : ������Ʈ�� ��ķ� �����Ͽ� �����ϴ� ��ġ������
//=> ��� ���� ������ �����Ͽ� ������Ʈ�� ������ �� �ֵ��� ��
public class GridLayoutApp extends Frame {

	private static final long serialVersionUID = 1L;

	public GridLayoutApp(String title) {
		super(title);
		
		Button btn1 = new Button("button1");
		Button btn2 = new Button("button2");
		Button btn3 = new Button("button3");
		Button btn4 = new Button("button4");
		Button btn5 = new Button("button5");
		Button btn6 = new Button("button6");
		
		setLayout(new GridLayout(3,2));
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		setBounds(500, 100, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutApp("app");
	}
}
