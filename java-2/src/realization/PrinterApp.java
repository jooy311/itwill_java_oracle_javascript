package realization;

public class PrinterApp {
	public static void main(String[] args) {
		//�⺻�޼ҵ带 ȣ���ϱ� ���ؼ��� �ݵ�� ���������� �������̽��� �����ؾ���
		Printable printer1 = new PrinterSingle();
		
		//�������̵弱������ ���� ��� �������̽��� �⺻ �޼ҵ带 ȣ��
		printer1.scan();
		printer1.print();
		System.out.println("===============================================");
		
		Printable print2 = new PrinterMultiful();
		
		//�������̵弱�� �� ��� �ڽ�Ŭ������ �������̵� �޼ҵ带 ȣ��
		print2.scan();
		print2.print();
	}
}
