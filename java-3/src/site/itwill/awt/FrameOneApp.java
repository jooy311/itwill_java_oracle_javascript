package site.itwill.awt;

import java.awt.Frame;

//���۳�Ʈ (Component) : GUI ���α׷��� ������ ������Ҹ� ǥ���ϴ� Ŭ����
//=> Button , Label,Canvas, CheckBox, Choice, List, Scrollbar, TextField, TextArea��
//=> �����̳�(Container) : ������Ʈ�� ���� �� �ִ� ���۳�Ʈ
// => frame, Window. Dailog, /*(�������� �����̶�, ��ҿ��� �츮���� ������ ����) Panel, scrollPane*/ ��
public class FrameOneApp {
	public static void main(String[] args) {
		//frame : �޴��� �ִ� â�� ����� ���� �����̳�
		Frame f = new Frame();//�������� ������ ���� �����ӻ���
		Frame f2 = new Frame("������ �ִ� ������");
		
		//setTitle(String name) : �������� ������ �����ϴ� �޼ҵ�
		f.setTitle("������");
		
		//setSize(int width, int weight) : ������Ʈ�� ũ�⸦ �����ϴ� �޼ҵ�
		//=> �̵� �Ǵ� ũ�� ������ �ȼ�(pixel)���
		//=> �ȼ�: �ϳ��� ���� ����� �� �ִ� ��(dot)
		f.setSize(300,400);
		
		//setLocation() : ������Ʈ ��� ��ġ�� ������� �ִ� �޼ҵ�
		f.setLocation(500, 100);
		
		//���� �޼ҵ� �ΰ��� ���� ���� ���
		//setBounds(int x, int y, int width, int weight) 
		f.setBounds(500, 100, 300, 400);
		
		//setResizable(boolean b) : �������� ũ�� ���濩�θ� ����
		//=>false : ���� �Ұ�, true : ���氡�� (�⺻)
		f.setResizable(false);
		
		//component.setVisible() : ������Ʈ�� ȭ�鿡 ��¿��θ� �����ϴ� �޼ҵ�
		//false : ����� (�⺻) , true : ���
		//=> �����̳ʿ� ������ ����� �����̳ʿ� ��� ������Ʈ�� ���޵ȴ�.
		f.setVisible(true);
	}
}
