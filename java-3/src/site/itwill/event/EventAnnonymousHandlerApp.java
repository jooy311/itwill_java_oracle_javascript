package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import site.itwill.event.EventInnerHandlerApp.ActionEventHandler;

//이벤트 핸들러 클래스를 생성하지 않고도 직접 이벤트 핸들러를 등록하는 방법
//클래스없이 인스턴스만을 만드는 경우(종종사용됨)
public class EventAnnonymousHandlerApp extends Frame {

	private static final long serialVersionUID = 1L;

	public EventAnnonymousHandlerApp(String title) {
		super(title);

		Button exit = new Button("프로그램 종료");
		setLayout(new FlowLayout());
		add(exit);

		//추상클래스(인터페이스)를 이용하여 인스턴스 생성불가능
		// => 클래스가 상속받아 사용하는 상속전용자료형
		//=> 추상클래스(인터페이스)의 추상메소드를 직접 오버라이드 선언하여 생성가능
		//=> 상속 받는 자식 클래스의 이름을 명시하지 않고도 직접인스턴스를 생성할 수 있다.
		//=> 익명의 내부클래스는 하나의 인스턴스만 생성이 가능하다.
		//익명의 내부클래스(Annonymous inner클래스)로 이벤트핸들러 등록
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}); //단점 이벤트 소스를 계속 만들어줘야한다는 것.//

		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventAnnonymousHandlerApp("app");
	}

}
