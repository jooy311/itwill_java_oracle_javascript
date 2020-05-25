package oop;
//������

//�̱��� ������ ������ �����Ͽ� �ۼ��� Ŭ���� - �̱��� Ŭ����
//->���α׷��� �ν��Ͻ��� ���ϳ����� �����ϱ� ���� Ŭ����
public class Singletone {

	//���� Ŭ������ �ν��Ͻ��� ������ �����ϱ� ���� �ʵ弱��
	//�ý����ʵ�(Ŭ���� ���ο����� ����ϴ� �ʵ�)�� ����ٷ� ǥ�� -> setter getter�޼ҵ带 ������ ����� ����
//	private static Singletone _istance = new Singletone(); -> ���� �������� �ʴ� �����
	private static Singletone _instance; //Ŭ������ �ε�Ǹ鼭 �� �ʵ尡 ������
	
	//��������(Static Block) : Ŭ������ �޸𸮿� �ε��� �� �ڵ������ �� �ֵ��� �ϴ� ����
	//->���⿡�� �ʱ�ȭ �۾��� �� �� ����
	//-> ���������� ����� �� �ѹ��� ����ȴ�.
	static {
		//�̷��� ������ ����� �پ��ϰ� �ʱ�ȭ�� ������
		_instance = new Singletone(); //�ν��Ͻ��� ������� ����Ǿ���
	}
	
	//�����ڸ� ����ȭ ó�� - �ν��Ͻ� �����Ұ���
	private Singletone() {
		// TODO Auto-generated constructor stub
	}
	
	//�ý����ʵ忡 ����� �ν��Ͻ� ������ ��ȯ�ϴ� �޼ҵ��
	public static Singletone getInstance() {
		//static ������ ���� �ʰ� �Ʒ��� ���� ����� �ִ�.(������ �ڹٿ����� static������ ����� ���� ����)
		/*if(_instance == null)
		 * 		_instance = new Singletone();
		 * */
		return _instance;//���⼭ ���� �ν��Ͻ��� ��ȯ�ϰ� ��
	}
	public void display() {
		System.out.println("Singletone Ŭ������ display()�޼ҵ带 ȣ���մϴ�.");
	}

}
