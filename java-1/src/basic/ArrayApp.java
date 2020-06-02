package basic;

public class ArrayApp {
	public static void main(String[] args) {
		//�迭�� �����Ͽ� â�������� ����
		//�ڷ���[] ������ = new �ڷ���[��Ұ���];
		//=>�ڷ���[] : �迭 �ڷ����� �̿��Ͽ� ���������� ������ �� ����
		//new �ڷ���[��Ұ���] : �ڷ����� ���� ������ ��ŭ ���� ����
		//�迭 ��Ҵ� �ڵ����� �ʱ�ȭ�� �ȴ�.
		int[] arr = new int[3];
		System.out.println("num = " + arr);
		System.out.println("=========================");
		
		//���������� ����� �迭������ ÷�ڸ� �̿��Ͽ� �迭 ��� ǥ��
		//÷��[index] :�迭��Ҹ� �����ϴ� ������(0���� ����)
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("=========================");

		int index = 0;
		arr[index] = 10; //0���� ��ҿ� 10�� ������Ѷ�
		//����� ÷�ڸ� ���� �Ǵ� ������� �̿� ����
		System.out.println(arr[0]);
		arr[index +1] = 20;
		arr[index +2] = 30;
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("=========================");
		
		//for������ �̿��Ͽ� �迭�� �ϰ�ó��
		for(int i=0; i<3; i++) {
			System.out.println("num[" + i + "] = " + arr[i]);
		
		}
		System.out.println("=========================");
		
		//�迭�� �����Ͽ� ���������� ���� - ��ҿ� �c�� �ʱⰪ�� ����
		//int n = new int[] {}
		//int[] = {} ���ϸ� heap�� ����Ǵ� ���� �ƴ϶� static�� ����ǰ� �ȴ�.(�׷��� ������
		//������ ��쿡 ���
		//������ �ʱⰪ�� ������ŭ�� ��Ҹ� ���� �迭�� �����ȴ�
		
		int[] su = new int[] {13,20,21,22,33};//������ �Ҷ� ���� ���� ���
		
		//�ݺ������ڸ� �̿��Ͽ� �迭��Ұ��� ���ʴ�� �����޾� ������ �����Ѵ�
		for(int tmp : su) {
			System.out.println(tmp);
		}
		System.out.println("=========================");
		
		int[] sum = {54,88,99,45,65,29,16,48,43};
		int tot = 0;
		for(int i=0; i<sum.length; i++) {
			tot += sum[i];
		}
		System.out.println(tot);
		System.out.println("=========================");
		
		//�迭�� �����ϴ� ��Ұ� �� 30-60������ �������� ����� ���
		int cnt = 0;
		for(int i=0; i<sum.length; i++) {
			if(sum[i] >=30 && sum[i] <=60) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
