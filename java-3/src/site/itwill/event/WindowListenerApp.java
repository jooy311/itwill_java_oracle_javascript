package site.itwill.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//프레임 에서는 window이벤트 발생
//=> WindowListener 인터페이스를 상속받은 클래스로 이벤트처리
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
	
	//windowListener 인터페이스에는 7개 추상메소드 선언
	// => 자식클래스에서는 모든 추상 메소드를 반드시 오버라이드 해주어야 함
	//=> 불필요한 이벤트 핸들러 메소드도 오버라이드 선언해주어야 함
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
