package site.itwill.event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import site.itwill.event.WindowListenerApp.WindowListenerHandler;

//WindowEvent�� ó���ϱ� ���ؼ� WindowAdapterŬ������ ��ӹ޾� �ۼ�
//AdapterŬ���� : �̺�Ʈ�� ó���ϱ� ���� ���ļҵ带 �����ϴ� Ŭ����
//=> Listener �������̽��� �߻�޼ҵ尡 2���̻��� ��쿡�� AdapterŬ����
public class WindowAdapterApp extends Frame {

	private static final long serialVersionUID = 1L;

	public WindowAdapterApp(String title) {
		super(title);

		//�ٵ� ���� ���, �ѹ��� ���� �����̱� ������ �͸��� Ŭ������ �����ϸ� ���� ����Ŭ���� �������� �ʰ� �ٷ� �����ϴ�
		//addWindowListener(new WindowAdapterHandler());
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowAdapterApp("windowAdapterApp");
	}
	
	//WindowListener�������̽��� ��ӹ�����, ��� �޼ҵ带 �������̵� �ؾ��ϹǷ�
	//AdapterŬ������ ��ӹ޾� ����Ѵ�.
	//������Ŭ������ �и��ؼ� ���� ������ WindowAdapterHandler�� WindowAdapter�� ��ӹ޾� ����ؾ� �ϱ� �����̴�.
	
	//AdapterŬ����(�߻�Ŭ�����̹Ƿ� �����ν��Ͻ��� ������ ����)�� ��ӹ��� ��� �ʿ��� �̺�Ʈ �ڵ鷯 �޼ҵ常
	//�������̵� �����Ͽ� �̺�Ʈ ó�� ����
	public class WindowAdapterHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
