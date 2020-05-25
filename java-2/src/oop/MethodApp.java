package oop;

//������ ������ Ŭ���� : ���α׷� = ���ø����̼�
//->����ũž ���ø����̼ǿ����� main�޼ҵ� ����
public class MethodApp {
	public static void main(String[] args) {
		//��ü�� �����Ͽ� ���������� �����Ѵ�.
		//=>new Ŭ������() : ������(constructor)�� �̿��Ͽ� ��ü�� ����
		//->Ŭ������ ���� ���� : ��ü�� �����ϱ� ���� ���� - ���������� �̿��Ͽ� ��ü��ҿ� ����
		
		//���� ��Ű���� Ŭ������ ��Ű�� ǥ������ Ŭ���������� �����ϴ�.
		Method method = new Method();
		
		//�޼ҵ� ȣ�� : �����尡 �޼ҵ�� �̵��Ͽ� �޼ҵ��� ����� ������ ��ȯ
		//->�޼ҵ��� ���ް��� ���� �޼ҵ� ȣ�� - ���ް��� �߸���
		method.displayOne();//����� �ʿ��Ҷ����� �����ͼ� ��밡��
		method.displayTwo();
		System.out.println("===================================================");
		method.displayOne();
		method.displayTwo();
		method.printOne();
		
		//�޼ҵ��� �Ű����� �Ķ���Ϳ� ���� ���������� �����ؾ߸� �޼ҵ� ȣ���� ������ 
		method.printTwp(100);
		System.out.println("===================================================");
		
		int tot = method.printThree(55,80);
		System.out.println("printThree�� �հ� >> " + tot);
		System.out.println("===================================================");
		
		//�޼ҵ带 ȣ���Ͽ� ��ȯ�Ǵ� ���� ������ ����
		int result = method.returnTot(55,80);
		if(result != 0) 
			System.out.println("returnTot�� ������� >> "+result);
		System.out.println("===================================================");
		
		
		//���ǽ� ��� ������ ��ȯ�ϴ� �޼ҵ� ȣ���Ͽ� ���ù� �ۼ�
		boolean flag = method.isOdd(67);
		if(flag == true) System.out.println("��ȯ���� ¦���Դϴ�.");
		else System.out.println("��ȯ���� Ȧ���Դϴ�.");
		
		System.out.println("===================================================");

		String str = method.getHello("���ֿ�");
		System.out.println(str);
		System.out.println(method.getHello("ȫ�浿"));
		System.out.println("===================================================");
		
		//��ȯ���� �迭�� ���������� �����Ѵ�
		int[] arr = method.getArray();
		for(int i =0 ; i<method.getArray().length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		System.out.println("===================================================");

		
		System.out.println("�հ� >> " + method.sumOne(44,53,78));
		System.out.println("===================================================");
		
		int[] a = {30,55,20};
		System.out.println("�հ� >> " + method.sumTwo(a));
		System.out.println("===================================================");
		
		System.out.println("�Ķ���� �հ� >> " + method.sumThree(14,22,67,44));
		
		
		
	}
}
