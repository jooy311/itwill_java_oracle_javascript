package oop;

//Car Ŭ������ �̿��� ���α׷� �ۼ�
public class CarApp {
	public static void main(String[] args) {
		//Ŭ������ �̿��Ͽ� �ν��Ͻ��� ������ �������� ����
		//Ŭ������ ��������=new Ŭ������();
		//�ν��Ͻ��� ������ ��� �ν��Ͻ��� �ʵ�� �⺻������ �ڵ� �ʱ�ȭ
		// => ������ : 0, ���� : false, ������ : null
		Car carOne=new Car();
		Car carTwo=new Car();
		
		System.out.println("carOne = "+carOne);
		System.out.println("carTwo = "+carTwo);
		System.out.println("=======================================");
		//���������� �̿��Ͽ� �ν��Ͻ� ���� ����
		// => ������ �ν��Ͻ��� �ʵ� �Ǵ� �޼ҵ� ���� ���� : . ������ ���
		//����)�ν��Ͻ��� �̿��Ͽ� �ʵ忡 ���� ������ ��� ���������� �� ���忡 ���� ���� ���� �߻�
		//�ذ�)�ν��Ͻ��� �̿��Ͽ� �ʵ忡 �������� ���ϵ��� �ʵ��� ����ȭ ó��
		// => ����ȭ�� �ʵ忡 ������ ��� ���� �߻�
		// => Getter �޼ҵ� �Ǵ� Setter �޼ҵ带 ȣ���Ͽ� �ʵ� ���
		//carOne.aliasName="Ƽ��";
		carOne.setAliasName("Ƽ��");
		//carOne.engineStatus=false;
		carOne.setEngineStatus(false);
		//carOne.currentSpeed=0;
		carOne.setCurrentSpeed(0);
		
		//System.out.println("�ڵ��� ��Ī = "+carOne.aliasName);
		System.out.println("�ڵ��� ��Ī = "+carOne.getAliasName());
		//System.out.println("�������� = "+carOne.engineStatus);
		System.out.println("�������� = "+carOne.isEngineStatus());
		System.out.println("���� �ӵ� = "+carOne.getCurrentSpeed());
		System.out.println("=======================================");
		carTwo.setAliasName("�Ÿ");
		
		System.out.println("�ڵ��� ��Ī = "+carTwo.getAliasName());
		System.out.println("�������� = "+carTwo.isEngineStatus());
		System.out.println("���� �ӵ� = "+carTwo.getCurrentSpeed());
		System.out.println("=======================================");
		carOne.startEngine();
		carOne.speedUp(30);
		carOne.speedUp(50);
		carOne.speedDown(40);
		//carOne.speedZero();
		carOne.stopEngine();
		//System.out.println("���� �ӵ� = "+carOne.currentSpeed);
		System.out.println("=======================================");
	}
}






