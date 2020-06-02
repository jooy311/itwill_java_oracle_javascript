package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//������ Ŭ����(FrameŬ���� ���)�� �̺�Ʈ �ڵ鷯(�������̽� ���) Ŭ������ ���� Ŭ������ ����
public class EventsourceHandlerApp extends Frame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	public EventsourceHandlerApp(String title) {
		super(title);
		
		Button exit = new Button("���α׷� ����");
		setLayout(new FlowLayout());
		add(exit);
	
		exit.addActionListener(this); //�̺�Ʈ�� ó���ϴ� �������̵�� �޼ҵ尡 ���� ������ Ŭ���� ��ü�� �����Ƿ�thisȣ��
		
		setBounds(500,100,300,300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new EventsourceHandlerApp("event");
		
	}
}
