package realization;

public class PrinterMultiple implements Printable {
	@Override
	public void print() {
		System.out.println("[���ձ�]������ ����մϴ�.");
	}
	
	@Override
	public void scan() {
		System.out.println("[���ձ�]������ ��ĵ�մϴ�.");
	}
}