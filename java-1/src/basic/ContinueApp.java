package basic;

public class ContinueApp {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			if(i == 3)continue;
			//continue �� �ݺ����� ����� ó������ �ٽ� �����ϵ��� �ϴ� Ű������
			//Ű���� �Ʒ��� ��ɹ��� ������
			System.out.println("i =  "+ i);
		}
		System.out.println("==================");
		loop : 
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==3) continue loop;
				System.out.println("i = " + i + " , j = " + j);
			}
			
		}
		System.out.println("==================");
	}
}
