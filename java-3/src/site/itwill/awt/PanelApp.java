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
		
		//panel : ������Ʈ�� �����ϱ����� �����̳� = �⺻���̾ƿ��� flow
		Panel panel = new Panel();
		
		//�гο� ������Ʈ�� ����
		panel.add(red);
		panel.add(green);
		panel.add(blue);
				
		//TextArea : ���ڿ��� ������ �Է��ϰų� ����ϴ� ������Ʈ�̴�.
		TextArea area = new TextArea();
		
		//TextField : ���ڿ��� �� �� �Է��ϰų� ����ϴ� ������Ʈ
		TextField field = new TextField();
		
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		add(field, BorderLayout.SOUTH);
		
		//setFont(font f) : ������Ʈ�� ���ڰ��� �Ӽ��� �����ϴ� �޼ҵ�
		//font : ���ڰ��÷� �Ӽ��� �����ϱ� ���� Ŭ���� : name(�۲�) style(��Ÿ��), size(ũ��)���� ����
		//=>�����̳��� ������ �Ӽ��� �����ϸ� ���ӵ� ���۳�Ʈ�� �����(���� ����x)
		panel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));//��ư���� ������ ����.
		area.setFont(new Font(Font.SERIF, Font.BOLD, 16));
		field.setFont(new Font(Font.SERIF, Font.ITALIC, 16));
		
		panel.add(area);
		
		//SetForeground(Color c) : ���۳�Ʈ�� ���ڻ��� ����
		//Color : ��������(RGB)�� �����ϱ� ���� Ŭ����
		red.setForeground(new Color(255,0,0));
		green.setForeground(new Color(150,255,150));
		blue.setForeground(new Color(0,0,255));
		
		//setBackground : ���۳�Ʈ�� ������ ����
		//=> ColorŬ�������� ��ǥ���� ���� ����ʵ�� ����
		//-> �����̳ʿ� ���ӵ� ������Ʈ�� ������ �̺���
		panel.setBackground(Color.yellow);
		
		//setEnabled(boolean b) : ������Ʈ�� Ȱ�����θ� �����ϱ� ���� �޼ҵ�
		//false : ��Ȱ��ȭ, true : Ȱ��ȭ
		red.setEnabled(false);

		//setEditable(boolean b) : �ؽ�Ʈ ������Ʈ�� ���ڿ� �������θ� �����ϱ� ���� �޼ҵ�
		//=> false : �����Ұ���, true : ��������
		//area.setEditable(false);
		
		//setFocusable(boolean b) : �Է�������Ʈ�� �Է����� ��ġ���θ� �����ϴ� �޼ҵ�
		//=> false : ������ġ �Ұ�, true : ����
		area.setFocusable(false);//�ᱹ ��� ������Ʈ�ιۿ� ����Ҽ��ۿ� ����
		
		setBounds(500,100,300,400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new PanelApp("title");
	}
}
