package site.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

public class ComponentAddApp extends Frame {
	
	public ComponentAddApp(String title) {
		super(title);
		
		//Button : ��ư ���۳�Ʈ ->�󺧸� ����
		Button btn = new Button("��ư");
		
		//add(component) : �����̳ʰ� ������ �ִ� �޼ҵ��̸�, ������Ʈ�� �����̳ʿ� �����ϴ� �޼ҵ�
		add(btn);//��ư�� �����ӿ� ����
		
				
		
		
		setBounds(500,100,300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComponentAddApp("���۳�Ʈ");
	}
}
