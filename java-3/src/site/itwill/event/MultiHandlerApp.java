package site.itwill.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트 소스가 여러개인 경우의 이벤트 처리 방법
//색상버튼을 누른경우, 캔버스의 배경색을 변경하는 프로그램
public class MultiHandlerApp extends Frame {
	
	private static final long serialVersionUID = 1L;
	
	//이벤트 핸들러 메소드에서 사용할 컴포넌트는 필드로 선언해주어야 한다.
	//=>그래야지 이벤트 핸들러에서도 사용가능
	Button red, green, blue, white;
	Canvas canvas;


	//컴포넌트는 생성자에서 만들어 준다.
	public MultiHandlerApp(String title) {
		super(title);
		
		red = new Button("red");
		green = new Button("green");
		blue = new Button("blue");
		white = new Button("white");
		
		Panel panel = new Panel();
		
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(white);
		
		canvas = new Canvas();
		
		add(panel, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		
		panel.setBackground(Color.gray);
		panel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		red.addActionListener(new ColorButtonEventHandler()); //레드 버튼 액션이벤트
		green.addActionListener(new ColorButtonEventHandler());
		blue.addActionListener(new ColorButtonEventHandler());
		white.addActionListener(new ColorButtonEventHandler());
	
		white.setEnabled(false);
		
		setBounds(500, 100, 400, 400);
		setVisible(true);
	}
	
	/*
	//모든 색상버튼을 활성화하는 기능을 제공하는 메소드
	public void initColorButton() {
		red.setEnabled(true);
		green.setEnabled(true);
		blue.setEnabled(true);
		white.setEnabled(true);
	}
	*/
	
	public static void main(String[] args) {
		new MultiHandlerApp("app");
	}
	
	/*
	public class redbuttonEventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			initColorButton();
			red.setEnabled(false);
			
			canvas.setBackground(Color.RED);
			//white.setEnabled(true);
			
		}
	}
	
	public class greenbuttonEventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			initColorButton();	
			green.setEnabled(false);
			
			canvas.setBackground(Color.green);
			
		}
	}
	
	public class bluebuttonEventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			initColorButton();
			blue.setEnabled(false);
		
			canvas.setBackground(Color.blue);
			
		}
	}
	
	public class whitebuttonEventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			initColorButton();
			white.setEnabled(false);
			canvas.setBackground(Color.white);
			
		}
	}
	*/
	
	//버튼에 대한 이벤트를 1개만 만들어 준다.
	public class ColorButtonEventHandler implements ActionListener{
		
		//이벤트 핸들러 메소드의 매개변수에는 이벤트 정보가 자동으로 전달되어 저장된다
		@Override
		public void actionPerformed(ActionEvent e) {//전달되어지는 매개변수가 중요
			red.setEnabled(true);
			green.setEnabled(true);
			blue.setEnabled(true);
			white.setEnabled(true);
			
			//이벤트 소스를 구분하여 이벤트를 처리한다.
			//getActionCommand() : 이벤트 소스의 actionCommand를 반환하는 메소드이다.
			//=> actionCommand : 이벤트 소스의 대푯값
			//=> Button 컴포넌트는 기본적으로 라벨명이 ActionCommand가된다.
			String actionCommand = e.getActionCommand();
			
			//전달되는 이벤트 소스에따라 구분지어 명령을 실행하도록 한다.
			if(actionCommand.equals("red")) {
				red.setEnabled(false);
				canvas.setBackground(Color.red);
			}else if(actionCommand.equals("green")){
				green.setEnabled(false);
				canvas.setBackground(Color.green);
			}else if(actionCommand.equals("blue")){
				blue.setEnabled(false);
				canvas.setBackground(Color.blue);
			}else if(actionCommand.equals("white")){
				white.setEnabled(false);
				canvas.setBackground(Color.white);
			}
			
		}
	}
	
}
