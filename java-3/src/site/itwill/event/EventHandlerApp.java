package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�̺�Ʈ ���α׷� �ۼ� ���
// 1. ���۳�Ʈ��(�����̳ʸ�) �̿��Ͽ� ������ Ŭ������ �ۼ�
// => FrameŬ������ ��ӹ޾� �ۼ�
// => �����̳�(������Ʈ)���� �پ��� �̺�Ʈ�� �߻� - �̺�Ʈ �ҽ� (��� �ٰ� �̺�Ʈ�� �Ǵ°��� �ƴ�)
// 2. �̺�Ʈ�� ó���ϱ� ���� �̺�Ʈ �ڵ鷯 Ŭ������ �ۼ�
// => ���۳�Ʈ���� �߻��� �̺�Ʈ�� ó���ϱ� ���� Ŭ����
// => ���۳�Ʈ���� �߻��� xxx�̺�Ʈ�� ó���ϱ� ���� xxxListener �������̽��� ��ӹ޾� 
// => ������ �������̽� : �̺�Ʈ�� ó���ϱ� ���� �߻�޼ҵ尡 ����� �������̽�
// => �߻�޼ҵ带 �������̵� �����Ͽ� �޼ҵ忡 �̺�Ʈ ó�� ����� �ۼ�
// ��3.�̺�Ʈ �ҽ����� �̺�Ʈ�� �߻��� ���, �̺�Ʈ �ڵ鷯�� ���۵ǵ��� �̺�Ʈ ����� �ؾ��Ѵ�.
// => Component.addXXXListener(Listener l) : ���۳�Ʈ���� �̺�Ʈ�� �߻��� ��� �̺�Ʈ ��鷯 �ν��ͽ��� �̿��ϵ��� ó���ϴ� �޼ҵ�
// => �̺�Ʈ �ڵ鷯 �ν��Ͻ��� �̺�Ʈ ó�� �޼ҵ带 �ڵ� ȣ���Ͽ� �̺�Ʈ ó��


//������ Ŭ����
public class EventHandlerApp extends Frame {

	private static final long serialVersionUID = 1L;

	public EventHandlerApp(String title) {
		super(title);
		
		//Button ���۳�Ʈ�� ����ڰ� ���� ��� Action�̺�Ʈ�� �߻�
		//-> �ý���(os)���� ���۳�Ʈ�� �̺�Ʈ�� ���� �ν��Ͻ��� �ڵ����� 
		//
		Button exit = new Button("���α׷� ����");
		setLayout(new FlowLayout());;
		add(exit);
		
		//Button ���۳�Ʈ�� �׼��̺�Ʈ�� ó���ϴ� ActionListener�� �߰��Ѵ�.
		exit.addActionListener(new ActionEventHandler());
		
		setBounds(500,100,300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new EventHandlerApp("�̺�Ʈ");
	}
}

//�̺�Ʈ �ڵ鷯 Ŭ����
// => ActionEvent�� ó���ϱ� ���� ActionListener�������̽��� ��ӹ޾� �ۼ�
// �̺�Ʈ�� ������ ���� ������ �������̽��� ��ӹ޾� �ϴ°��� -> ���߻���� �� ����. �׷��� ������ �������̽��� ���
class ActionEventHandler implements ActionListener {
	
	//ActionEvent�� �߻��� ���, �ڵ� ȣ��Ǵ� �޼ҵ�(JVM�� �˾Ƽ� ȣ��~)
	//�̺�Ʈ ó���޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
	
}