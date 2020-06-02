package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//디자인 클래스(Frame클래스 상속)와 이벤트 핸들러(인터페이스 상속) 클래스를 같은 클래스로 구현
public class EventsourceHandlerApp extends Frame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	public EventsourceHandlerApp(String title) {
		super(title);
		
		Button exit = new Button("프로그램 종료");
		setLayout(new FlowLayout());
		add(exit);
	
		exit.addActionListener(this); //이벤트를 처리하는 오버라이드된 메소드가 여기 디자인 클래스 자체에 있으므로this호출
		
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
