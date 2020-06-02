package basic;

public class TwoArrayApp {
	public static void main(String[] args) {
		int[][] n = new int[2][3];
		
		System.out.println("n = " + n);

		System.out.println("=======================");
		
		System.out.println("n�� size = " + n.length);
		System.out.println("n�� size = " + n[0].length);
		System.out.println("n�� size = " + n[1].length);
		System.out.println("=======================");
		
		System.out.println("n[0] = " + n[0]);
		System.out.println("n[0] = " + n[1]);
		System.out.println("=======================");
		System.out.println("n[0] = " + n[0][0]);
		System.out.println("n[0] = " + n[0][1]);
		System.out.println("n[0] = " + n[0][2]);
		System.out.println("n[0] = " + n[1][0]);
		System.out.println("n[0] = " + n[0][1]);
		System.out.println("n[0] = " + n[0][2]);
		System.out.println("=======================");
		
		for(int i = 0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.println("n["+i+"]"+"["+j+"] = " + n[i][j]);
			}
		}
		
		int[][] su = {{10,20,30}, {40,50,60}};
		
		for(int[] arr : su) {
			for(int a : arr)
				System.out.print(a + " ");
			System.out.println();
		}
		System.out.println("=======================");
		
		//������ �迭�� �������� �ʴ� ������ �迭�� �����ߴ�.
		int[][] number = new int[3][];
		
		//������ �迭�� �����Ͽ� ������ �迭 ��ҿ� �����ϵ����Ѵ�.
		//������ �迭�� ��Ұ��� �����Ƿ� �ڵ������� null�� �ȴ�
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		
		//������ �迭�� �����Ͽ� 2���� �迭 ��ҿ� ���� : �����迭 -> ������ �迭������ ����
		//1���� �迭�� ����� ������ �ٸ��� �����Ͽ� ��������
		number[0] = new int[3];
		number[1] = new int[2];
		number[2] = new int[4];
		
		for(int i=0; i<number.length; i++) {
			int val = 0;
			for(int j=0; j < number[i].length; j++) {
				val += 10;
				number[i][j] = val;
				System.out.println("number["+i+"]"+"["+j+"] = " + number[i][j]);
			}
		}
		
	}
}
