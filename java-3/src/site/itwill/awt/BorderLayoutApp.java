package site.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

//��ġ������(LayoutManager) : �����̳ʿ� ���۳�Ʈ�� ������ �� ������Ʈ�� ũ��� �����ġ�� �ڵ����� �����Ͽ� �����ϴ� ����� �����ϴ� Ŭ����
//=> borderLayout , flowLayout, gridLayout ��..
//��� �����̳ʿ��� ���۳�Ʈ�� �����ϱ� ���� ��ġ�����ڰ� �⺻���� ������
//=> borderLayout : frame, window, Dialog��
//=> FlowLayout : panel��

//BorderLayout : ���۳�Ʈ�� �������� �߾ӿ� �����ϴ� ��ġ������
//=>���۳�Ʈ�� ������ �� �ݵ�� ������ġ ���� - ������ġ�� ������ ��� ������ �߾ӿ� ����
//=>������ ��ġ�� ���۳�Ʈ�� �̹� ������ ��� ������ �߻�
public class BorderLayoutApp extends Frame{
	
	private static final long serialVersionUID = 1L;

	public BorderLayoutApp(String title) {
		super(title);
		
		Button btn1 = new Button("button1");
		Button btn2 = new Button("button2");
		Button btn3 = new Button("button3");
		Button btn4 = new Button("button4");
		Button btn5 = new Button("button5");
		
		//frame�� ��ġ�����ڸ� borderLayout���� ����
		//BorderLayout layout = new BorderLayout(10,10);
		//setLayout(layout);
		
		//�������� �⺻��ġ�����ڰ� borderlayout�̹Ƿ�, ������ ���ǹ�! �׷��� ��������
		//setLayout(new BorderLayout());
		
		//component.add(Container c, object constraints) : ���۳�Ʈ�� ���ϴ� ��ġ�� �����ϴ� �޼ҵ�
		//=> ������ġ�� borderLayout Ŭ������ ����ʵ带 �̿�
		add(btn1, BorderLayout.EAST);
		add(btn2, BorderLayout.WEST);
		add(btn3, BorderLayout.SOUTH);
		add(btn4, BorderLayout.NORTH);
		add(btn5, BorderLayout.CENTER);
		
		setBounds(500, 100, 400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutApp("app");
	}
}
