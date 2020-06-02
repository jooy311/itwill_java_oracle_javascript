package site.itwill.awt;

import java.awt.Frame;

//GuI 프로그램은 Frame클래스를 상속받아 작성하는 것을 권장!
public class FrameTwoApp extends Frame {

	private static final long serialVersionUID = 1L;

	//생성자를 이용하여 프레임에 대한 디자인 작업
	public FrameTwoApp(String title) {
		//super키워드를 이용하여 frame클래스 생성자 호출 : 제목 전달
		super(title); //부모의 생성자에게 title을 전달한다.
		
		setBounds(500,100,300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//부모인스턴스 생성 후 자식 인스턴스 생성
		//=> 프레임 인스턴스 생성 - 프레임 생성
		new FrameTwoApp("프레임");
	}
}
