package site.itwill.awt;

import java.awt.Frame;

//컴퍼넌트 (Component) : GUI 프로그램의 디자인 구성요소를 표현하는 클래스
//=> Button , Label,Canvas, CheckBox, Choice, List, Scrollbar, TextField, TextArea등
//=> 컨테이너(Container) : 컴포넌트를 담을 수 있는 컴퍼넌트
// => frame, Window. Dailog, /*(종속적인 성격이라, 평소에는 우리눈에 보이지 않음) Panel, scrollPane*/ 등
public class FrameOneApp {
	public static void main(String[] args) {
		//frame : 메뉴가 있는 창을 만들기 위한 컨테이너
		Frame f = new Frame();//프레임의 제목이 없는 프레임생성
		Frame f2 = new Frame("제목이 있는 프레임");
		
		//setTitle(String name) : 프레임의 제목을 변경하는 메소드
		f.setTitle("프레임");
		
		//setSize(int width, int weight) : 컴포넌트의 크기를 변경하는 메소드
		//=> 이동 또는 크기 단위는 픽셀(pixel)사용
		//=> 픽셀: 하나의 색을 출력할 수 있는 점(dot)
		f.setSize(300,400);
		
		//setLocation() : 컴포넌트 출력 위치를 변경시켜 주는 메소드
		f.setLocation(500, 100);
		
		//위에 메소드 두개를 같이 쓰는 경우
		//setBounds(int x, int y, int width, int weight) 
		f.setBounds(500, 100, 300, 400);
		
		//setResizable(boolean b) : 프레임의 크기 변경여부를 설정
		//=>false : 변경 불가, true : 변경가능 (기본)
		f.setResizable(false);
		
		//component.setVisible() : 컴포넌트를 화면에 출력여부를 설정하는 메소드
		//false : 미출력 (기본) , true : 출력
		//=> 컨테이너에 설정된 결과는 컨테이너에 담긴 컴포넌트에 전달된다.
		f.setVisible(true);
	}
}
