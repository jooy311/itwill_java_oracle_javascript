package oop;

public class SingletoneApp {
	//�̱��濡���� ���������� ������ �ʴ� ���� ����.
	public static void main(String[] args) {
		//�ν��Ͻ��� �����Ͽ� ���������� ����
		//���������� ����� �ν��Ͻ��� �޼ҵ带 ȣ��
		//-> �������� ����� ���ؼ�
		Singletone st =  Singletone.getInstance();
		st.display();
		
		//�ν��Ͻ��� �����Ͽ� �޼ҵ� ȣ�� = �������� ����� ���� ���
		//new Singletone().display();//�ν��Ͻ��� ��� ��������� �޸𸮸� �����ϰ� ��
		
		//�������ص� �Ȱ��� �ν��Ͻ��� ��ȯ��
		//->���� �Ʒ��Ͱ��� ���������� ������ ����°��� ���ʿ��ϴ�.
		Singletone stt =  Singletone.getInstance();
		Singletone sttt = Singletone.getInstance();
		
		System.out.println("stt = " + stt);
		System.out.println("sttt = " + sttt);
		System.out.println("====================================");
		
		//�̱��� Ŭ������ �������� ���� �ν��Ͻ��� ��ȯ�޾� �޼ҵ带 ȣ��
		Singletone.getInstance().display();
		Singletone.getInstance().display();
		System.out.println("====================================");
	}
}
