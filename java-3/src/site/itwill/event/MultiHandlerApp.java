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

//�̺�Ʈ �ҽ��� �������� ����� �̺�Ʈ ó�� ���
//�����ư�� �������, ĵ������ ������ �����ϴ� ���α׷�
public class MultiHandlerApp extends Frame {
	
	private static final long serialVersionUID = 1L;
	
	//�̺�Ʈ �ڵ鷯 �޼ҵ忡�� ����� ������Ʈ�� �ʵ�� �������־�� �Ѵ�.
	//=>�׷����� �̺�Ʈ �ڵ鷯������ ��밡��
	Button red, green, blue, white;
	Canvas canvas;


	//������Ʈ�� �����ڿ��� ����� �ش�.
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

		red.addActionListener(new ColorButtonEventHandler()); //���� ��ư �׼��̺�Ʈ
		green.addActionListener(new ColorButtonEventHandler());
		blue.addActionListener(new ColorButtonEventHandler());
		white.addActionListener(new ColorButtonEventHandler());
	
		white.setEnabled(false);
		
		setBounds(500, 100, 400, 400);
		setVisible(true);
	}
	
	/*
	//��� �����ư�� Ȱ��ȭ�ϴ� ����� �����ϴ� �޼ҵ�
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
	
	//��ư�� ���� �̺�Ʈ�� 1���� ����� �ش�.
	public class ColorButtonEventHandler implements ActionListener{
		
		//�̺�Ʈ �ڵ鷯 �޼ҵ��� �Ű��������� �̺�Ʈ ������ �ڵ����� ���޵Ǿ� ����ȴ�
		@Override
		public void actionPerformed(ActionEvent e) {//���޵Ǿ����� �Ű������� �߿�
			red.setEnabled(true);
			green.setEnabled(true);
			blue.setEnabled(true);
			white.setEnabled(true);
			
			//�̺�Ʈ �ҽ��� �����Ͽ� �̺�Ʈ�� ó���Ѵ�.
			//getActionCommand() : �̺�Ʈ �ҽ��� actionCommand�� ��ȯ�ϴ� �޼ҵ��̴�.
			//=> actionCommand : �̺�Ʈ �ҽ��� ��ǩ��
			//=> Button ������Ʈ�� �⺻������ �󺧸��� ActionCommand���ȴ�.
			String actionCommand = e.getActionCommand();
			
			//���޵Ǵ� �̺�Ʈ �ҽ������� �������� ����� �����ϵ��� �Ѵ�.
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
