package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import site.itwill.event.EventInnerHandlerApp.ActionEventHandler;

//�̺�Ʈ �ڵ鷯 Ŭ������ �������� �ʰ� ���� �̺�Ʈ �ڵ鷯�� ����ϴ� ���
//Ŭ�������� �ν��Ͻ����� ����� ���(��������)
public class EventAnnonymousHandlerApp extends Frame {

	private static final long serialVersionUID = 1L;

	public EventAnnonymousHandlerApp(String title) {
		super(title);

		Button exit = new Button("���α׷� ����");
		setLayout(new FlowLayout());
		add(exit);

		//�߻�Ŭ����(�������̽�)�� �̿��Ͽ� �ν��Ͻ� �����Ұ���
		// => Ŭ������ ��ӹ޾� ����ϴ� ��������ڷ���
		//=> �߻�Ŭ����(�������̽�)�� �߻�޼ҵ带 ���� �������̵� �����Ͽ� ��������
		//=> ��� �޴� �ڽ� Ŭ������ �̸��� ������� �ʰ� �����ν��Ͻ��� ������ �� �ִ�.
		//=> �͸��� ����Ŭ������ �ϳ��� �ν��Ͻ��� ������ �����ϴ�.
		//�͸��� ����Ŭ����(Annonymous innerŬ����)�� �̺�Ʈ�ڵ鷯 ���
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}); //���� �̺�Ʈ �ҽ��� ��� ���������Ѵٴ� ��.//

		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventAnnonymousHandlerApp("app");
	}

}
