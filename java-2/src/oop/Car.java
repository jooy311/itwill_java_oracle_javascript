package oop;

//�ڵ����� ǥ���ϱ� ���� Ŭ����
//Ŭ������ �ۼ��� �� �ʵ� �Ǵ� �޼ҵ忡 ���� �����ڸ� �����Ͽ� ���� ���� ����
//���� ������(Access Modifies) : private, protected, public 
//private : Ŭ���� ���ο����� ���� �����ϸ� Ŭ���� �ܺο����� ���� �Ұ����ϵ��� �����ϴ� Ű����
// => �ʵ� ����� ����Ͽ� ����ȭ ó��
//public : ��� ��Ű���� Ŭ�������� ���� �����ϵ��� �����ϴ� Ű����
// => �޼ҵ� ����� ����Ͽ� ���� ó��
public class Car {
	//�ʵ�(Filed) : ��� ���� �Ӽ� ǥ��
	// => Ŭ���� �ȿ� ����� ��� �޼ҵ忡�� ���� ����
	private String aliasName;//�̸�(��Ī) - ������
	private boolean engineStatus;//��������(�õ�����) - false : Off, true : On
	private int currentSpeed;//����ӵ�
	
	//������(Constructor) : ��ü�� �����ϱ� ���� Ư���� �޼ҵ� 
	// => ���� ���� : �⺻ �����ڰ� �����ϴ� ������ ó��
			
	//�޼ҵ�(Method) : ��� ���� ��� ǥ��
	// => �ʵ带 �̿��Ͽ� ���ϴ� ��� ����
	public void startEngine() {//�õ��� �״� �޼ҵ�
		engineStatus=true;
		System.out.println(aliasName+"�� �õ��� �׽��ϴ�.");
	}
	
	public void stopEngine() {//�õ��� ���� �޼ҵ�
		if(currentSpeed!=0) {
			/*
			currentSpeed=0;
			System.out.println(aliasName+"��(��) ������ϴ�.");
			*/
			
			//���� Ŭ������ ����� �޼ҵ�� ���� ȣ�� ����
			speedZero();
		}
		
		engineStatus=false;
		System.out.println(aliasName+"�� �õ��� �����ϴ�.");
	}
	
	public void speedUp(int speed) {//�ӵ��� �����ϴ� �޼ҵ�
		if(!engineStatus) {//������ ���� �ִ� ���
			System.out.println(aliasName+"�� ������ ���� �ֽ��ϴ�.");
			return;
		}
		
		//�Ű������� ���޵Ǿ� ����� ���� ���������� ��� 
		if(currentSpeed+speed>150) {
			speed=150-currentSpeed;			
		}
		
		currentSpeed+=speed;
		System.out.println(aliasName+"�� �ӵ��� "+speed
			+"Km/h ���� �Ǿ����ϴ�. ���� �ӵ��� "+currentSpeed+"Km/h�Դϴ�.");
	}
	
	public void speedDown(int speed) {//�ӵ��� �����ϴ� �޼ҵ�
		if(!engineStatus) {
			System.out.println(aliasName+"�� ������ ���� �ֽ��ϴ�.");
			return;
		}
		
		if(speed>currentSpeed) {
			speed=currentSpeed;
		}
		
		currentSpeed-=speed;
		System.out.println(aliasName+"�� �ӵ��� "+speed
			+"Km/h ���� �Ǿ����ϴ�. ���� �ӵ��� "+currentSpeed+"Km/h�Դϴ�.");
	}
	
	public void speedZero() {//�ӵ��� 0���� �����ϴ� �޼ҵ�
		currentSpeed=0;
		System.out.println(aliasName+"��(��) ������ϴ�.");
	}
	
	//����ȭ ó���� �ʵ�� �ʵ尪�� ��ȯ�ϴ� Getter �޼ҵ�� �ʵ尪��
	//�����ϴ� Setter �޼ҵ� ���� => ĸ��ȭ
	//ĸ��ȭ ó�� ����Ű : Getter �޼ҵ�� Setter �޼ҵ� �ڵ� �ϼ�
	// => [Alt]+[Shift]+[S] >> [R] >> �ʵ� ���� >> Generate
	public String getAliasName() {//Getter �޼ҵ�
		return aliasName;//�ʵ尪 ��ȯ
	}
	
	public void setAliasName(String aliasName) {
		//�Ű������� ���޵Ǿ� ����� ���� �̿��Ͽ� �ʵ尪 ����
		// => �Ű������� ���޵� ���� ���� ��ȿ�� �˻�
		this.aliasName=aliasName;//�ʵ尪 ����
	}

	//�ʵ��� �ڷ����� boolean�� ��� Getter �޼ҵ� ��� is �޼ҵ� ����
	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
}
