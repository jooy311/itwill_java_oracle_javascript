package site.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

//
public class PanelApp extends Frame{
	
	private static final long serialVersionUID = 1L;
	
	public PanelApp(String title) {
		super(title);
		
		Button red = new Button("red");
		Button green = new Button("green");
		Button blue = new Button("blue");
		
		//panel : 컴포넌트를 부착하기위한 컨테이너 = 기본레이아웃은 flow
		Panel panel = new Panel();
		
		//패널에 컨포넌트를 부착
		panel.add(red);
		panel.add(green);
		panel.add(blue);
				
		//TextArea : 문자열을 여러줄 입력하거나 출력하는 컴포넌트이다.
		TextArea area = new TextArea();
		
		//TextField : 문자열을 한 줄 입력하거나 출력하는 컴포넌트
		TextField field = new TextField();
		
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		add(field, BorderLayout.SOUTH);
		
		//setFont(font f) : 컴포넌트의 글자관련 속성을 변경하는 메소드
		//font : 글자관련련 속성을 저장하기 위한 클래스 : name(글꼴) style(스타일), size(크기)지정 가능
		//=>컨테이너의 디자인 속성을 변경하면 종속된 컴퍼넌트도 변경됨(색은 영향x)
		panel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));//버튼에게 영향이 간다.
		area.setFont(new Font(Font.SERIF, Font.BOLD, 16));
		field.setFont(new Font(Font.SERIF, Font.ITALIC, 16));
		
		panel.add(area);
		
		//SetForeground(Color c) : 컴퍼넌트의 글자색을 변경
		//Color : 색상정보(RGB)를 저장하기 위한 클래스
		red.setForeground(new Color(255,0,0));
		green.setForeground(new Color(150,255,150));
		blue.setForeground(new Color(0,0,255));
		
		//setBackground : 컴퍼넌트의 배경색을 변경
		//=> Color클래스에는 대표적인 색을 상수필드로 제공
		//-> 컨테이너에 종속된 컴포넌트에 배경색은 미변경
		panel.setBackground(Color.yellow);
		
		//setEnabled(boolean b) : 컴포넌트의 활성여부를 설정하기 위한 메소드
		//false : 비활성화, true : 활성화
		red.setEnabled(false);

		//setEditable(boolean b) : 텍스트 컴포넌트의 문자열 수정여부를 설정하기 위한 메소드
		//=> false : 수정불가능, true : 수정가능
		//area.setEditable(false);
		
		//setFocusable(boolean b) : 입력컴포넌트의 입력초점 위치여부를 설정하는 메소드
		//=> false : 초점위치 불가, true : 가능
		area.setFocusable(false);//결국 출력 컴포넌트로밖에 사용할수밖에 없음
		
		setBounds(500,100,300,400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new PanelApp("title");
	}
}
