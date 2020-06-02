package site.itwill.event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import site.itwill.event.WindowListenerApp.WindowListenerHandler;

//WindowEvent를 처리하기 위해서 WindowAdapter클래스를 상속받아 작성
//Adapter클래스 : 이벤트를 처리하기 위한 ㅁㅔ소드를 제공하는 클래스
//=> Listener 인터페이스의 추상메소드가 2개이상인 경우에만 Adapter클래스
public class WindowAdapterApp extends Frame {

	private static final long serialVersionUID = 1L;

	public WindowAdapterApp(String title) {
		super(title);

		//근데 얘의 경우, 한번만 쓰고 말것이기 때문에 익명의 클래스로 선언하면 따로 내부클래스 선언하지 않고 바로 가능하다
		//addWindowListener(new WindowAdapterHandler());
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowAdapterApp("windowAdapterApp");
	}
	
	//WindowListener인터페이스를 상속받으면, 모든 메소드를 오버라이드 해야하므로
	//Adapter클래스를 상속받아 사용한다.
	//디자인클래스와 분리해서 쓰는 이유는 WindowAdapterHandler도 WindowAdapter를 상속받아 사용해야 하기 때문이다.
	
	//Adapter클래스(추상클래스이므로 직접인스턴스를 만들지 못함)를 상속받은 경우 필요한 이벤트 핸들러 메소드만
	//오버라이드 선언하여 이벤트 처리 가능
	public class WindowAdapterHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
