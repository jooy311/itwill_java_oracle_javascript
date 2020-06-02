package oop;

//������ ������ Ŭ����
public class Method {
	//�ĺ��� ���� : Refactor >> Rename(Alt+Shift+R) >> ���� ó�� >> ����
	// => ���α׷��� ��� �ĺ��ڸ� ���ÿ� ���� ó��
	void displayOne() {
		System.out.println("Method Ŭ������ displayOne() �޼ҵ� ȣ��");
	}
	
	void displayTwo() {
		System.out.println("Method Ŭ������ displayTwo() �޼ҵ� ȣ��");
	}
	
	void printOne() {
		int tot=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
		}
		System.out.println("1~100 ������ ���� �հ� = "+tot);
	}
	
	void printTwo(int num) {
		int tot=0;
		for(int i=1;i<=num;i++) {
			tot+=i;
		}
		System.out.println("1~"+num+" ������ ���� �հ� = "+tot);
	}
	
	void printThree(int num1, int num2) {
		//�Ű������� ���޵Ǿ� ����� ���� ���� ��ȿ�� �˻�
		if(num1>num2) {//���������� ���� ���޵Ǿ� ����� ��� 
			System.out.println("[����]ù��° ���ް��� �ι�° ���ް����� �۾ƾ� �˴ϴ�.");
			return;//�޼ҵ� ���� ����
		}
		
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		System.out.println(num1+"~"+num2+" ������ ���� �հ� = "+tot);
	}
	
	int returnTot(int num1, int num2) {
		if(num1>num2) { 
			System.out.println("[����]ù��° ���ް��� �ι�° ���ް����� �۾ƾ� �˴ϴ�.");
			return 0;//������ ������ ��ȯ
		}
		
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		//return ����� �̿��Ͽ� �޼ҵ� ����� ���� ������� ��ȯ - �޼ҵ� ����
		// => ��ȯ�Ǵ� ������� �ڷ����� �޼ҵ� ��ȯ������ ����
		return tot;
	}
	
	//���ް��� Ȧ���� ��� false ��ȯ, ¦���� ��� true�� ��ȯ�ϴ� �޼ҵ�
	boolean isOddEven(int num) {
		if(num%2!=0) return false;
		else return true;
	}
	
	//��ü�� ���޹޾� ��ü�� ��ȯ�ϴ� �޼ҵ�
	String getHello(String name) {
		return name+"�� �ȳ��ϼ���.";
	}
	
	//�迭�� ��ȯ�ϴ� �޼ҵ� - �迭�� ��� ��Ұ� ��ȯ
	int[] getArray() {
		/*
		int[] array={10,20,30,40,50};
		return array;
		*/

		//return {10,20,30,40,50};//���� 
		return new int[]{10,20,30,40,50};
	}
	
	//3���� �Ű������� �������� ���޹޾� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => �Ű������� ���� ���������� ���޵��� ���� ��� �޼ҵ� ȣ�� �Ұ���
	int sumOne(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	//�迭�� ���޹޾� �迭 ��Ұ��� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼ҵ� 
	int sumTwo(int[] array) {
		int tot=0;
		for(int num:array) {
			tot+=num;
		}
		return tot;
	}
	
	//�Ű����� ���� ��ȣ(...)�� ����� ��� ���� 0�� �̻� ���޹޾� 
	//�迭 �������� ��� ����
	int sumThree(int... param) {
		int tot=0;
		for(int num:param) {
			tot+=num;
		}
		return tot;
	}
}









