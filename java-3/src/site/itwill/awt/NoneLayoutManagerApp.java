package site.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

public class NoneLayoutManagerApp extends Frame{
	
	private static final long serialVersionUID = 1L;

	public NoneLayoutManagerApp(String title) {
		super(title);
		Button button1 = new Button("first button");
		Button button2 = new Button("second button");
		
		//container.setLayout(LayoutManager) : ���޹��� LayoutManager
		//�ν��Ͻ��� �����̳��� ��ġ�����ڸ� �����ϴ� �޼ҵ�
		//LayoutManager�ν��Ͻ� ��� null�� ������ ���, ��ġ������ �̻��
		setLayout(null);
		
		//��ġ�����ڸ� ������� �ʴ� ���, ���۳�Ʈ�� ũ��� �����ġ�� �����ؾ߸� ������ ������
		button1.setBounds(80, 100, 80, 50);
		button2.setBounds(100, 130, 80, 50);
		add(button1);
		add(button2);
		
		setBounds(500,100,400,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new NoneLayoutManagerApp("title");
	}
}
