package inheritance;

public class CarApp {
	public static void main(String[] args) {
		Car car=new Car("ȫ�浿", "��Ÿ��");
		
		System.out.println("������ = "+car.getUserName());
		System.out.println("�𵨸� = "+car.getModelName());
		System.out.println("======================================");
		//Object Ŭ������ Car Ŭ������ �θ�Ŭ�����̱� ������ �޼ҵ� ȣ�� ����
		//Car Ŭ������ Object Ŭ������ toString() �޼ҵ带 �������̵� ����
		// => Object Ŭ������ toString() �޼ҵ� ��� Car Ŭ������ toString() �޼ҵ� ȣ��
		System.out.println("car.toString() >> "+car.toString());
		
		//���������� ����� �ν��Ͻ� ������ ����� ��� �ڵ����� 
		//Object Ŭ������ toString() �޼ҵ尡 ȣ��Ǿ� ����� ���
		System.out.println("car >> "+car);
		System.out.println("======================================");
		String name="�Ӳ���";

		//String Ŭ�������� Object Ŭ������ toString() �޼ҵ带 �������̵� ����
		// => String �ν��Ͻ��� ����� ���ڿ��� ��ȯ�޾� ����� ��� ȣ���Ͽ� ���
		//System.out.println("�̸� = "+name.toString());
		System.out.println("�̸� = "+name);
		System.out.println("======================================");
	}
}














