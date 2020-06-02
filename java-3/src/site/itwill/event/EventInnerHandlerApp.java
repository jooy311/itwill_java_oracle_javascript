package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//디자인 클래스를 이벤트 핸들러 클래스 구현
public class EventInnerHandlerApp extends Frame {

	private static final long serialVersionUID = 1L;

	public EventInnerHandlerApp(String title) {
		super(title);

		Button exit = new Button("프로그램 종료");
		setLayout(new FlowLayout());
		add(exit);

		exit.addActionListener(new ActionEventHandler()); // 이벤트를 처리하는 오버라이드된 메소드가 여기 디자인 클래스 자체에 있으므로this호출

		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventInnerHandlerApp("app");
	}
	
	//이벤트 핸들러 클래스에서 디자인 클래스의 컴퍼넌트 사용가능
	//이렇게하면 이벤트핸들러를 여러개 만들 수 있음
	public class ActionEventHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	}

}
