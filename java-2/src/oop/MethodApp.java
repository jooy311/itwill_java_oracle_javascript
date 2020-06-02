package oop;

//������ ������ Ŭ���� : ���α׷� - ���ø����̼�(Application)
// => ����ũž ���ø����̼ǿ��� main �޼ҵ� ���� 
public class MethodApp {
	public static void main(String[] args) {
		//��ü�� �����Ͽ� ���������� ����
		// => new Ŭ������() : new �����ڿ� ������(Constructor)�� �̿��Ͽ� ��ü�� ����
		// => Ŭ������ �������� : ��ü�� �����ϱ� �ϱ� ���� ���� ���� - ���������� �̿��Ͽ� ��ü ��ҿ� ����
		//���� ��Ű���� Ŭ������ ��Ű�� ǥ������ Ŭ���� ���� ����
		Method method=new Method();
		
		//�޼ҵ� ȣ�� : �����尡 �޼ҵ�� �̵��Ͽ� �޼ҵ��� ����� ���� �� ��ȯ
		// => �޼ҵ��� ���ް��� ���� �޼ҵ� ȣ�� - ���ް��� �߸��� ��� �޼ҵ� ȣ�� ����
		method.displayOne();
		method.displayTwo();
		method.displayOne();
		System.out.println("=======================================");
		method.printOne();
		method.printOne();
	
		//�޼ҵ��� �Ű�����(Parameter)�� ���� ���������� �����ؾ߸� �޼ҵ� ȣ�� ����
		method.printTwo(50);
		method.printTwo(75);
		
		method.printThree(55,80);
		method.printThree(2,36);
		
		method.printThree(90,10);
		System.out.println("=======================================");
		//�޼ҵ带 ȣ���Ͽ� ��ȯ�Ǵ� ���� ������ ����
		int total=method.returnTot(30, 60);
		System.out.println("�հ� = "+total);
		
		System.out.println("�հ� = "+method.returnTot(40, 80));
		
		total=method.returnTot(80, 40);
		if(total!=0) {//�޼ҵ��� ��ȯ���� ������ ���� �ƴ� ���
			System.out.println("�հ� = "+total);
		}
		System.out.println("=======================================");
		boolean result=method.isOddEven(10);
		if(result) {
			System.out.println("[���]¦��");
		} else {
			System.out.println("[���]Ȧ��");
		}
		
		//���ǽ� ��� ������ ��ȯ�ϴ� �޼ҵ带 ȣ���Ͽ� ���ù� �ۼ�
		if(method.isOddEven(11)) {
			System.out.println("[���]¦��");
		} else {	
			System.out.println("[���]Ȧ��");
		}
		System.out.println("=======================================");
		System.out.println(method.getHello("ȫ�浿"));
		System.out.println(method.getHello("�Ӳ���"));
		System.out.println("=======================================");
		//��ȯ���� �迭�� ���������� ����
		int[] num=method.getArray();
		System.out.print("��ȯ�� �迭 ��Ұ� = ");
		for(int temp:num) {
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("=======================================");
		System.out.println("�հ� = "+method.sumOne(10, 20, 30));
		
		//�޼ҵ��� �Ű������� ���� �߸� ������ ��� �޼ҵ� ȣ�� �Ұ���
		//System.out.println("�հ� = "+method.sumOne(10));
		//System.out.println("�հ� = "+method.sumOne(10,20,30,40,50));
		System.out.println("=======================================");
		int[] array={10,20,30};
		System.out.println("�հ� = "+method.sumTwo(array));
		System.out.println("�հ� = "+method.sumTwo(new int[]{10,20,30,40,50}));
		System.out.println("�հ� = "+method.sumTwo(new int[]{10}));
		System.out.println("=======================================");
		System.out.println("�հ� = "+method.sumThree());
		System.out.println("�հ� = "+method.sumThree(10));
		System.out.println("�հ� = "+method.sumThree(10,20,30));
		System.out.println("�հ� = "+method.sumThree(10,20,30,40,50));
		System.out.println("=======================================");
	}
}










