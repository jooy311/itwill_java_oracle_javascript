package site.itwill.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//������ ������ window�̺�Ʈ �߻�
//=> WindowListener �������̽��� ��ӹ��� Ŭ������ �̺�Ʈó��
public class WindowListenerApp extends Frame{

	private static final long serialVersionUID = 1L;
	
	public WindowListenerApp(String title) {
		super(title);
		
		addWindowListener(new WindowListenerHandler());
		
		setBounds(500,100,300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowListenerApp("window Listener");
	}
	
	//windowListener �������̽����� 7�� �߻�޼ҵ� ����
	// => �ڽ�Ŭ���������� ��� �߻� �޼ҵ带 �ݵ�� �������̵� ���־�� ��
	//=> ���ʿ��� �̺�Ʈ �ڵ鷯 �޼ҵ嵵 �������̵� �������־�� ��
	public class WindowListenerHandler implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("windowActivated");
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("windowClosed");
		
		}

		@Override
		public void windowClosing(WindowEvent e) {
			
			System.out.println("windowClosing");
			System.exit(0);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowDeactivated");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowDeiconified");
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowIconified");
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowOpened");
			
		}
	
		
	}
	
	
	
}
