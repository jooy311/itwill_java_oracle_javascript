package basic;

public class BreakApp {
	public static void main(String[] args) {
		
		//���ǽ��� ������ ����� �ݺ��� ����
		for(int i=1; i<=5; i++) {
			if(i==3) break;//�ݺ����� ������ �����ϴ� ���
			System.out.println("i = " + i);
		}
		System.out.println("==================");
		//�ݺ����� ��(�ĺ���)�ο� �ݷ�����!! ���� �극��ũ �ڿ� ����
		loop : for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==3) break loop;
				System.out.println("i = " + i + " , j = " + j);
			}
		}
		System.out.println("==================");
		int cnt = 0;
		int gae = 1;
		while(true) {
			cnt++;
			gae*=2;
			if(gae > cnt) break;
		}
		
		while(true) {
			
		}
	}
}
