package site.itwill.awt;

import java.awt.Frame;

//GuI ���α׷��� FrameŬ������ ��ӹ޾� �ۼ��ϴ� ���� ����!
public class FrameTwoApp extends Frame {

	private static final long serialVersionUID = 1L;

	//�����ڸ� �̿��Ͽ� �����ӿ� ���� ������ �۾�
	public FrameTwoApp(String title) {
		//superŰ���带 �̿��Ͽ� frameŬ���� ������ ȣ�� : ���� ����
		super(title); //�θ��� �����ڿ��� title�� �����Ѵ�.
		
		setBounds(500,100,300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//�θ��ν��Ͻ� ���� �� �ڽ� �ν��Ͻ� ����
		//=> ������ �ν��Ͻ� ���� - ������ ����
		new FrameTwoApp("������");
	}
}
