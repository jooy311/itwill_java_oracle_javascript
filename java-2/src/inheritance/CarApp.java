package inheritance;

public class CarApp {
	public static void main(String[] args) {

		Car car = new Car("ȫ�浿", "��Ÿ��");

		System.out.println("������ = " + car.getUserName());
		System.out.println("���̸� = " + car.getModelName());
		System.out.println("================================================");
		
		//CarŬ������ CarŬ������ �θ�Ŭ������ ObjectŬ������ ����߱� ������ �޼ҵ� ȣ���� �����ϴ�.
		// CarŬ������ Object Ŭ������ toString()�޼ҵ� �������̵带 �����ϸ�
		//=> ObjectŬ������ toString()�޼ҵ� ��� CarŬ������ toString()�޼ҵ尡 ȣ��ȴ�.
		System.out.println("car.toString() = " + car.toString());
		//���������� ����� �ν��Ͻ��� ����� ��� �ڵ����� ObjectŬ���� toString �޼ҵ尡 ȣ��ȴ�.
		System.out.println("car =  " + car);//���� �ڵ�� ���� ������� ��µȴ�.
		
		
		//display�� �����ʰ� toString()�޼ҵ带 ����Ͽ� �ʵ尪�� Ȯ���Ѵ� ��κ�....~_~
		
		//StringŬ�������� ObjectŬ������ toString() �޼ҵ带 �������̵� ����
		//=> String �ν��Ͻ��� ����� ���ڿ��� ��ȯ�޾� ����� ��� ȣ��
		String name = "�Ӳ���";
		System.out.println("�̸� = " + name.toString()); //toString�� ���� ������� �ʾƵ��ȴ�. 
	}
}
