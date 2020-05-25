package oop;

import java.util.Scanner;

//carclass�� �̿��Ͽ� ���α׷��� �ۼ��Ұ�
//ĸ��ȭ����������� ������ ���� Ŭ������ ��
public class CarApp {
	public static void main(String[] args) {
		//Ŭ������ �̿��Ͽ� �ν��Ͻ��� ������ ���������� ����
		//Ŭ������ �������� newŬ������();
		//�ν��Ͻ��� ������ ��� �ν��Ͻ��� �ʵ�� �⺻������ �ڵ��ʱ�ȭ��
		//������ : �ν��Ͻ��� �̿��Ͽ� �ʵ忡 ���� ������ ��� ���������� ���� ����� �� ����
		// �ذ� : �ν��Ͻ��� �̿��Ͽ� �ʵ忡 �������� ���ϵ��� Ŭ������ ����(�ʵ��� ����ȭ ó��)
		//->����ȭ�� �ʵ忡 ������ ��� ���� �߻�
		//->getter �޼ҵ� �Ǵ� setter�޼ҵ带 ȣ���Ͽ� �ʵ���
		Car carOne = new Car();
		Car carTwo = new Car();
		
		//Scanner sc = new Scanner(System.in);
		//carOne.aliasName = sc.nextLine();
		//carTwo.aliasName = sc.nextLine();
		System.out.println("carOne = " + carOne);//�޸� �ּҸ� �����ش�
		System.out.println("carTwo = " + carTwo);
		System.out.println("===================================");
		
		//���������� �̿��Ͽ� �ν��Ͻ� ��������
		// -> ������ �ν��Ͻ� �ʵ� �Ǵ� �޼ҵ� ���ٰ���
		carOne.setAliasName("Ƽ��");
		carTwo.setAliasName("�ҳ�Ÿ");
		//carOne.aliasName ="Ƽ��";
		//carTwo.aliasName ="�ҳ�Ÿ";
		carOne.setEngineStates(false);
		carTwo.setEngineStates(false);
		carOne.setCurrentSpeed(0);
		carTwo.setCurrentSpeed(0);
		
		System.out.println("�ڵ�����Ī >> " + carOne.getAliasName());
		System.out.println("�ڵ��� ���� �ӵ� >> " + carOne.getCurrentSpeed());
		System.out.println("�ڵ�����Ī >> " + carOne.isEngineStates());
		System.out.println("===================================");
		System.out.println("�ڵ�����Ī >> " + carTwo.getAliasName());
		System.out.println("�ڵ�����Ī >> " + carTwo.getCurrentSpeed());
		System.out.println("�ڵ�����Ī >> " + carTwo.isEngineStates());
		
		carOne.startEngine(true);
		carOne.speedUp(50);
		carOne.speedUp(20);
		carOne.SpeedDown(80);
		//carOne.makeSpeedZero();
		carOne.stopEngine();

		
	}
}
