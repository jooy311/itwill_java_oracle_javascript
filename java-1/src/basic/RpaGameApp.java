package basic;

import java.util.Scanner;

//���������� ���� ���α׷��� �ۼ��ϱ��
//��ǻ��(����)�� ���̸�(Ű����)���������� ����� �ϵ��� �Ұ���
//���̸Ӱ� �̱��� ����� �ݺ������ϰ�, �� ��쿡�� ������ ����
//������ ����� �� ���̸Ӱ� �̱� Ƚ���� ���
public class RpaGameApp {
	public static void main(String[] args) {
		
		int cnt = 0;//�̱�Ƚ���� ����ϱ� ���� ����
		
		Scanner sc = new Scanner(System.in);

		//���������� ����� �ݺ�����
		while(true) {
			//��ǻ�Ϳ��� ���������� �� �ϳ��� �����޾� ���� > ����(1-3)
			//���� :1, ����:2, ��:3
			int computer = ((int) (Math.random()*10) % 3 +1);
			
			//���̸ӿ��� ������������ �ϳ��� �����޾� ���� > Ű����� �Է�
			//1-3�������� �ƴѰ�� ���Էĵǵ��� ��
			int gamer;
			while(true) {
				System.out.println("���������� �Է� >> ����=1, ����=2, ��=3");
				gamer = sc.nextInt();
				
				if(gamer >=1 || gamer <= 3) break;
					System.out.println("[error] ���� ���� ���� �Է����ּ���");
					
			}
			//��ǻ�Ϳ� ���̸Ӱ� ������ ������������ ���
			System.out.print("[�Է�] ��ǻ�� : ");
			if(computer == 1) System.out.print("����");
			else if(computer == 2) System.out.print("����");
			else if(computer == 3) System.out.print("��");
			
			System.out.println();
			
			//��ǻ�Ϳ� ���̸��� ���������� �Ǵ��Ͽ� ����� ���
			//->���̸Ӱ� �̱��� ���� Ƚ�� ���� >> ����
			//->���̸Ӱ� �� ��� �ݺ��� ����
			if(computer == gamer) {
				System.out.println("[���] ��ǻ�Ϳ� ���̸Ӱ� �����ϴ�.");
			}else if((computer == 1 && gamer == 2) || (computer == 2 && gamer == 3) || (computer == 3 && gamer == 1)) {
				cnt++;
				System.out.println("���̸Ӱ� �̰���ϴ�.");
			}else {
				System.out.println("���̸Ӱ� �����ϴ�.");
				break;
			}
			
		}
		System.out.println();
		if(cnt == 0) {
			System.out.println("���̸Ӱ� ��ǻ�Ϳ��� �ѹ��� �̱��� ���߽��ϴ�...");
		}else {
			System.out.println("���̸Ӱ� ��ǻ�Ϳ��� " + cnt +" �� �̰���ϴ�.");
		}
	}
}
