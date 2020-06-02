package oop;

//�̱��� ������ ������ �����Ͽ� �ۼ��� Ŭ���� - �̱��� Ŭ����
// => ���α׷��� �ν��Ͻ��� �ϳ��� �����ϱ� ���� Ŭ����
public class Singleton {
	//���� Ŭ������ �ν��Ͻ� ������ �����ϱ� ���� �����ʵ� ���� - �ý��� �ʵ�� ����
	//�ý��� �ʵ� : Ŭ���� ���ο����� ���� ���� �����ϱ� ���� �ʵ�
	// => Getter & Setter �޼ҵ� �̼���
	// => �ʵ��� �̸��� _�� ���۵ǵ��� �����ϴ� ���� ����
	//private static Singleton _instance=new Singleton();
	private static Singleton _instance;
	
	//��������(Static Block) : Ŭ������ �޸𸮿� �ε��� �� �ڵ� ����� ����� �ۼ��ϴ� ����
	// => ���������� ����� ���α׷����� �� �ѹ��� ����
	static {
		_instance=new Singleton();
	}
	
	//�����ڸ� ����ȭ ó�� - �ν��Ͻ� ���� �Ұ�
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	//�ý��� �ʵ忡 ����� �ν��Ͻ� ������ ��ȯ�ϴ� �޼ҵ� 
	public static Singleton getInstance() {
		return _instance;
	}
	
	public void display() {
		System.out.println("Singleton Ŭ������ display() �޼ҵ� ȣ��");
	}
}
