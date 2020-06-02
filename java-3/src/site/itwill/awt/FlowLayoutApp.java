package site.itwill.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

//������Ʈ�� ���ʿ��� ���������� ���ʴ�� �����ϴ� ��ġ������
//�����̳��� ũ�⸦ ��� ��� �ڵ����� �Ʒ��� ��ġ�Ͽ� ������
public class FlowLayoutApp extends Frame {
	
	private static final long serialVersionUID = 1L;

	public FlowLayoutApp(String title) {
		super(title);
		
		Button btn1 = new Button("button1");
		Button btn2 = new Button("button2");
		Button btn3 = new Button("button3");
		Button btn4 = new Button("button4");
		Button btn5 = new Button("button5");
		
		//�������� ��ġ�����ڸ� border���� flow�� ����
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
	