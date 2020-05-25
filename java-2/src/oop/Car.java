package oop;

//�ڵ����� ǥ���ϱ� ���� Ŭ����
//Ŭ������ �ۼ��� �� �ʵ� �Ǵ� �޼ҵ忡 ���� �����ڸ� �����Ͽ� ���������� �����Ѵ�
//���� ������ : private, protected, public
//private : Ŭ���� ���ο����� ���� �����ϸ� Ŭ���� �ܺο����� ���� �Ұ���
//->�ʵ� ����� ����Ͽ� ����ȭ(�����) �Ҷ� �ַ� ���

public class Car {
	// �ʵ� : ����� �Ӽ��� ǥ��
	//->Ŭ���� �ȿ� ����� ��� �޼ҵ忡�� ��밡����
	private String aliasName; // �̸� : ��Ī
	private boolean engineStates;//�������� (�õ�����)
	private int currentSpeed; //����ӵ�
	

	// ������- ����(�⺻�����ڰ� �����ϴ� ������ ó��
	// ->��ü�� �����ϱ� ���� Ư���� �޼ҵ�

	// �޼ҵ� : ����� ����� ǥ��
	//�ʵ带 �̿��Ͽ� ���ϴ� ����� ������ �� ����
	
	

	public void startEngine(boolean flag) {// �õ��� �Ѵ� �޼ҵ�
		engineStates = true;
		System.out.println(aliasName +" �� �õ��� �׽��ϴ�.");
	}

	public void stopEngine() {// �õ��� ���� �޼ҵ�
		
		if(currentSpeed != 0) {
			System.out.println("�̹� �������Դϴ�.");
			currentSpeed = 0;
			System.out.println("�õ��� �������ϴ�.");
		}
		engineStates = false;
		System.out.println(aliasName +" �� �õ��� �����ϴ�.");
	}
	
	public void speedUp(int speed) {// ���� �ӵ��� ������Ű�� �޼ҵ�
		if(!engineStates) {
			System.out.println("������ ���� �ֽ��ϴ�.");
			return;
		}
		if(currentSpeed + speed >= 100) {
			System.out.println("���̻� �ӵ��� ���� �� �����ϴ�.");
			return;
		}
		currentSpeed += speed;
		
		System.out.println(aliasName +" �� �ӵ��� " +speed+ " km/h �������׽��ϴ�.");
		System.out.println("���� �ӵ��� " + currentSpeed + " km/h  �Դϴ�.");
	}

	public void SpeedDown(int speed) {// ���� �ӵ��� ���ҽ�Ű�� �޼ҵ�
		if(!engineStates) {
			System.out.println("������ ���� �ֽ��ϴ�.");
			return;
		}
		
		if(currentSpeed< speed) {
			System.out.println("�ӵ��� " + speed + " ��ŭ ���� �������ϴ�.");
			speed = currentSpeed;
		}
		currentSpeed -= speed;
		
		System.out.println(aliasName +" �� �ӵ��� " +speed+ " km/h ���ҽ��׽��ϴ�.");
		System.out.println("���� �ӵ��� " + currentSpeed + " km/h  �Դϴ�.");
	}

	public void makeSpeedZero() {// �ӵ��� ���� �ӵ��� 0���� �����ϴ� �޼ҵ�
		currentSpeed = 0;
		System.out.println(aliasName +" �� ������ϴ�.");
	}
	
	//����ȭ ó���� �ʵ�� �ʵ尪�� ��ȯ�ϴ� Getter�޼ҵ�� �ʵ尪�� �����ϴ� Setter�޼ҵ带 ����
	//->ĸ��ȭ(��, �ʵ带 ����ȭ�ϰ�, �װ��� ��ȯ�ϴ� Getter,Setter�޼ҵ带 ���� ����°�)
	//ĸ��ȭ ó�� ����� : Getter�޼ҵ�� Setter�޼ҵ� �ڵ� �ϼ�
	//Alt + shift + S -> R
	public String getAliasName() {
		return aliasName;//�ʵ尪�� ��ȯ�ϵ��� ����� ��
	}
	
	/*public void setAliasName(String name) {//�Ű������� ���޵Ǿ� ����� ���� �̿��Ͽ� �ʵ尪�� ����
		//�߸��� ���� �������� �ʵ尪�� ������� �ʰ� �����
		//->�Ű������� ���޵� ���� ���� ��ȿ�� �˻� ��, �����۾��� �� �� �ֵ��� �Ѵ�
		
		aliasName = name;//�ʵ尪 ����
	}*/
	
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName; 
		//this.�� Ŭ������ �ǹ��� ��, �� Ŭ���� �ȿ����� �ʵ尪�� aliasName�� �ǹ���
	}
	
	public boolean isEngineStates() {
		return engineStates;
	}

	public void setEngineStates(boolean engineStates) {
		this.engineStates = engineStates;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

}
