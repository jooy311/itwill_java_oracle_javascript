package basic;

public class MultiForApp {
	public static void main(String[] args) {

		int cnt = 0;//����� ����
		for(int i = 1; i<=3; i++) {//������ ���� ����� ó���ϴ� �ݺ���
			for(int j=1; j<=4; j++) {//������ ������ ����� ó���ϴ� �ݺ���
				cnt++;
			}
		}
		System.out.println(cnt);
		
		//********
		//********
		//********
		//********
		//********
		//********
		//********
		//********
		//********
		//********
		
		for(int i =1; i<=9; i++) {
			for(int j=1; j<=8; j++) {
				System.out.print(j+1);
				System.out.print("*" );
				System.out.print(i + " = ");
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j <=5-i; j++) {
				System.out.print("��");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		for(int i = 5; i >0; i--) {
			for(int j = 1; j<= i-1; j++) {
				System.out.print("��");
			}
			for(int j=1; j <=6-i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
	}
	
}
