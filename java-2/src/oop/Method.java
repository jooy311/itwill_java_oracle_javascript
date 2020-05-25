package oop;

//������ ������ Ŭ����
//����� ����� �ϱ� ���ٴ� ���α׷��� ����°��� ����
public class Method {
	
	//refactor����� �̿��Ͽ� �ĺ��ڸ� ������ �� �ִ�(alt + shift + r)�� �������
	//->�̷��� ��ü ������ �� �� ����
	void displayOne() {
		System.out.println("methodŬ������ ���÷���() �޼ҵ� ȣ��");
	}
	
	void displayTwo() {
		System.out.println("MethodŬ������ display()�޼ҵ带 ȣ��");
	}
	
	void printOne() {
		int tot = 0;
		for(int i=1; i<100; i++) {
		tot+=i;
			
		}
		System.out.println("������ �ش��ϴ� ���� �հ��?" + tot);
	}
	
	void printTwp(int n) {
		int tot = 0;
		for(int i=1; i<=n; i++) {
			tot += i;
			
		}
		System.out.println("������ �ش��ϴ� ���� �հ��?" + tot);
	}
	
	int printThree(int n, int b) {
		//�Ű�����
		if(n > b) { //���������� ���� ���޵Ǿ� ����� ���
			System.out.println("[����] ù��° ���ް��� �ι�° ���ް����� Ů�ϴ�");
			
			//�޼ҵ带 ������ �����Ű�� ��ɾ�
			//=>������ �������� ������ ��ȯ�ؾ� ��
			return 0;
		}
		
		int tot = 0;
		for(int i=n; i<=b; i++) {
			tot += i;
			
		}//System.out.println(n + " �� " + b + " ������ �ش��ϴ� ���� �հ��?" + tot);
		return tot;
	}
	
	int returnTot(int s, int k) {
		int tot = 0;
		for(int i=s; i<=k; i++) {
			tot += i;
			
		}
		//return����� �̿��Ͽ� �޼ҵ� ����� ���� ������� ��ȯ
		//->��ȯ�Ǵ� ������� �ڷ����� �޼ҵ� ��ȯ������ ����
		return tot;
	}
	
	
	//���ް��� Ȧ���� ��� false��ȯ 
	//¦���ΰ�� true��ȯ
	boolean isOdd(int num) {
		if(num % 2 == 0) {
			return true;
		}else return false;
	}
		
	
	//��ü�� ��ȯ�ϴ� �޼ҵ�
	String getHello(String name) {
		
		return name + " �� �ȳ��ϼ���~";
	}
	
	
	int[] getArray() {
		int [] array = {10,20,30,40,55};
		return array;
		//return new int[] = {10....} �̷��� ��ȯ���־ ��
	}
	
	int sumOne(int n1, int n2, int n3) {
		//������ �Ű��������������� ���޹޾� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
		//�Ű������� ���� ���������� ���޵��� ���� ��� �޼ҵ�� ȣ
		return n1+n2+n3;
	}
	
	int sumTwo(int[] arr) {
		int tot = 0;
		for(int num : arr) {
			tot += num;
		}
		return tot;
	}
	
	//���� 0���̻� ���޹޾� �迭�������� ����� �����ϴ�
	//�迭�� ������ �ʾƵ� �迭�� �νĵ�
	int sumThree(int... param) {
		int tot = 0;
		for(int num : param) {
			tot += num;
		}
		return tot;
	}
}
