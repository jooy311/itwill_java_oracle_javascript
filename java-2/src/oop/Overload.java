package oop;

public class Overload {

	public void display(int param) {
		System.out.println("������ = " + param);
	}

	public void displayBoolean(boolean param) {
		System.out.println("���� = " + param);
	}

	public void displayString(String param) {
		System.out.println("���ڿ�  = " + param);
	}
	
	//This is methodOverLoad!!!!
	// -> ������ ����� �����ϴ� �޼ҵ尡 
	// �Ű������� ���� ������ �����ؾ� �� ���޼ҵ带 ���� ������ �����ϴ� ���
	// �Ű������� ���ڷ���, ������ �� ���� �ʾƾ���
	//-> ���� ������ �Ǵ� ��ȯ���� �����ε� ����� ����̾���(public int << �̺κ��� ����� ���ܸ�)
	public void display(double param) {
		//�Ȱ��� �޼ҵ��� �̸��� ����ϵ� ������, �Ű������� ���ͷ� Ÿ���� �ٸ��� ��������
		System.out.println("�Ǽ��� = " + param);
	}
	

}
