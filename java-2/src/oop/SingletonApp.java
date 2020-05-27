package oop;

public class SingletonApp {
	public static void main(String[] args) {
		/*
		//�ν��Ͻ��� �����Ͽ� ���������� ���� - �������� ����� ����
		// => ���������� ����� �ν��Ͻ��� �޼ҵ� ȣ��
		Singleton singleton=new Singleton();
		singleton.display();
		
		//�ν��Ͻ��� �����Ͽ� �޼ҵ� ȣ�� - �������� ����� ����
		new Singleton().display();
		new Singleton().display();
		*/

		/*
		Singleton s1=new Singleton();
		Singleton s2=new Singleton();
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		*/
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("=======================================");
		s1.display();
		s2.display();
		System.out.println("=======================================");
		//�̱��� Ŭ������ �������� ���� �ν��Ͻ��� ��ȯ�޾� �޼ҵ� ȣ��
		Singleton.getInstance().display();
		Singleton.getInstance().display();
		System.out.println("=======================================");
	}
}








