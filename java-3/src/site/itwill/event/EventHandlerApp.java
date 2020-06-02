package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//이벤트 프로그램 작성 방법
// 1. 컴퍼넌트를(컨테이너를) 이용하여 디자인 클래스를 작성
// => Frame클래스를 상속받아 작성
// => 컨테이너(컴포넌트)에서 다양한 이벤트가 발생 - 이벤트 소스 (모두 다가 이벤트가 되는것은 아님)
// 2. 이벤트를 처리하기 위한 이벤트 핸들러 클래스를 작성
// => 컴퍼넌트에서 발생된 이벤트를 처리하기 위한 클래스
// => 컴퍼넌트에서 발생된 xxx이벤트를 처리하기 위해 xxxListener 인터페이스를 상속받아 
// => 리스너 인터페이스 : 이벤트를 처리하기 위한 추상메소드가 선언된 인터페이스
// => 추상메소드를 오버라이드 선언하여 메소드에 이벤트 처리 명령을 작성
// ★3.이벤트 소스에서 이벤트가 발생될 경우, 이벤트 핸들러가 동작되도록 이벤트 등록을 해야한다.
// => Component.addXXXListener(Listener l) : 컴퍼넌트에서 이벤트가 발생될 경우 이벤트 헨들러 인스터스를 이용하도록 처리하는 메소드
// => 이벤트 핸들러 인스턴스가 이벤트 처리 메소드를 자동 호출하여 이벤트 처리


//디자인 클래스
public class EventHandlerApp extends Frame {

	private static final long serialVersionUID = 1L;

	public EventHandlerApp(String title) {
		super(title);
		
		//Button 컴퍼넌트를 사용자가 누룰 경우 Action이벤트가 발생
		//-> 시스템(os)에서 컴퍼넌트의 이벤트에 대한 인스턴스를 자동생성 
		//
		Button exit = new Button("프로그램 종료");
		setLayout(new FlowLayout());;
		add(exit);
		
		//Button 컴퍼넌트에 액션이벤트를 처리하는 ActionListener를 추가한다.
		exit.addActionListener(new ActionEventHandler());
		
		setBounds(500,100,300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new EventHandlerApp("이벤트");
	}
}

//이벤트 핸들러 클래스
// => ActionEvent를 처리하기 위해 ActionListener인터페이스를 상속받아 작성
// 이벤트가 무수히 많기 때문에 인터페이스를 상속받아 하는것임 -> 다중상속이 더 용이. 그렇기 때문에 인터페이스를 사용
class ActionEventHandler implements ActionListener {
	
	//ActionEvent가 발생된 경우, 자동 호출되는 메소드(JVM이 알아서 호출~)
	//이벤트 처리메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
	
}