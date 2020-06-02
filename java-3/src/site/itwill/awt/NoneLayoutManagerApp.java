package site.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

public class NoneLayoutManagerApp extends Frame{
	
	private static final long serialVersionUID = 1L;

	public NoneLayoutManagerApp(String title) {
		super(title);
		Button button1 = new Button("first button");
		Button button2 = new Button("second button");
		
		//container.setLayout(LayoutManager) : 전달받은 LayoutManager
		//인스턴스로 컨테이너의 배치관리자를 변경하는 메소드
		//LayoutManager인스턴스 대신 null을 전달할 경우, 배치관리자 미사용
		setLayout(null);
		
		//배치관리자를 사용하지 않는 경우, 컴퍼넌트의 크기와 출력위치를 변경해야만 부착이 가능함
		button1.setBounds(80, 100, 80, 50);
		button2.setBounds(100, 130, 80, 50);
		add(button1);
		add(button2);
		
		setBounds(500,100,400,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new NoneLayoutManagerApp("title");
	}
}
