package site.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

public class ComponentAddApp extends Frame {
	
	public ComponentAddApp(String title) {
		super(title);
		
		//Button : 버튼 컴퍼넌트 ->라벨명 설정
		Button btn = new Button("버튼");
		
		//add(component) : 컨테이너가 가지고 있는 메소드이며, 컴포넌트를 컨테이너에 부착하는 메소드
		add(btn);//버튼을 프레임에 부착
		
				
		
		
		setBounds(500,100,300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComponentAddApp("컴퍼넌트");
	}
}
