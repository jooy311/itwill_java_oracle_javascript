package basic;

public class ForApp {
	public static void main(String[] args) {
		//java programming�� ȭ�鿡 ���
		//System.out.println("java programming");
		for(int i = 0; i < 5; i++) {
			System.out.println("java programming");			
		}
		
		for(int i =1 ; i<10; i+=2) {
			System.out.print(i + "\n");
		}
		
		int sum = 0;
		
		for(int i=1; i <=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int begin = 80, end = 30;
//		if(begin > end) {
//			System.out.println("[����] ���۰��� ������������ �۾ƾ��մϴ�.");
//			System.exit(0);
//		}
		
		//����� �������� ���� �ٲپ� ���� = ġȯ �˰���
		int tmp;
		if(begin > end) {
			System.out.println("[���!] ���۰��� ������������ �۾ƾ��ϹǷ� ���� �ٲߴϴ�.");
			tmp = begin;
			begin = end;
			end = tmp;
		}
		
		int sum1 = 0;
		
		for(int i = begin; i<=end; i++) {
			sum1 += i;
		}
		
		for(int i=1,j=5; i<=3; i++,j--) {
			System.out.println("i= " + i + " , j = " + j);
		}
		System.out.println(sum1);
		
		int i = 1;
		for(; i<=4; i++) {
			System.out.println(i);
		}
		for(; i>=1; i--) {
			System.out.println(i);
		}
		//���ǽ��� �����Ȱ�� ������ ������ ó���� ��->���ѷ����� �ݺ��Ҷ� �����
		//���� ������ ���� �ؿ� ��ɹ��� ������ �ν��� ����
		//for(;;) {
			
		//}
			
	}
}
