package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//������ Ŭ������ �̺�Ʈ �ڵ鷯 Ŭ���� ����
public class EventInnerHandlerApp extends Frame {

	private static final long serialVersionUID = 1L;

	public EventInnerHandlerApp(String title) {
		super(title);

		Button exit = new Button("���α׷� ����");
		setLayout(new FlowLayout());
		add(exit);

		exit.addActionListener(new ActionEventHandler()); // �̺�Ʈ�� ó���ϴ� �������̵�� �޼ҵ尡 ���� ������ Ŭ���� ��ü�� �����Ƿ�thisȣ��

		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventInnerHandlerApp("app");
	}
	
	//�̺�Ʈ �ڵ鷯 Ŭ�������� ������ Ŭ������ ���۳�Ʈ ��밡��
	//�̷����ϸ� �̺�Ʈ�ڵ鷯�� ������ ���� �� ����
	public class ActionEventHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	}

}
