package site.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

//배치관리자(LayoutManager) : 컨테이너에 컴퍼넌트를 부착할 때 컴포넌트의 크기와 출력위치를 자동으로 변경하여 부착하는 기능을 제공하는 클래스
//=> borderLayout , flowLayout, gridLayout 등..
//모든 컨테이너에는 컴퍼넌트를 부착하기 위한 배치관리자가 기본으로 설정됨
//=> borderLayout : frame, window, Dialog등
//=> FlowLayout : panel등

//BorderLayout : 컴퍼넌트를 동서남북 중앙에 부착하는 배치관리자
//=>컴퍼넌트를 부착할 때 반드시 부착위치 지정 - 부착위치가 생략된 경우 무조건 중앙에 부착
//=>동일한 위치에 컴퍼넌트가 이미 부착된 경우 덮어씌우기 발생
public class BorderLayoutApp extends Frame{
	
	private static final long serialVersionUID = 1L;

	public BorderLayoutApp(String title) {
		super(title);
		
		Button btn1 = new Button("button1");
		Button btn2 = new Button("button2");
		Button btn3 = new Button("button3");
		Button btn4 = new Button("button4");
		Button btn5 = new Button("button5");
		
		//frame의 배치관리자를 borderLayout으로 변경
		//BorderLayout layout = new BorderLayout(10,10);
		//setLayout(layout);
		
		//프레임의 기본배치관리자가 borderlayout이므로, 변경은 무의미! 그래서 생략가능
		//setLayout(new BorderLayout());
		
		//component.add(Container c, object constraints) : 컴퍼넌트를 원하는 위치에 부착하는 메소드
		//=> 부착위치는 borderLayout 클래스의 상수필드를 이용
		add(btn1, BorderLayout.EAST);
		add(btn2, BorderLayout.WEST);
		add(btn3, BorderLayout.SOUTH);
		add(btn4, BorderLayout.NORTH);
		add(btn5, BorderLayout.CENTER);
		
		setBounds(500, 100, 400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutApp("app");
	}
}
