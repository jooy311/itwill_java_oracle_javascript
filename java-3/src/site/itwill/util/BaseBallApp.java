package site.itwill.util;

import java.util.Random;
import java.util.Scanner;

//���ھ߱����� : ��������(0~9)�� 3�� �����Ͽ� Ű����� �Է��� ���ߴ� ����
// => ������ �Է°��� 3�� ���������� ���� Ʋ���� 0���� ���۵Ǽ��� �ȵȴ�.
// => ������ �Է°��� ���� �������� ������ �� ��ġ�� ������ ��Ʈ����ũ, �ٸ��� ���� ����Ͽ� ���
// => ��Ʈ����ũ�� 3���� ���� �޼��� ��� �� ���α׷� ����
// => �Է±�ȸ�� 15���� �����ϸ� ������ ���� ��� ����(����) ���
// => �Է°��� ���Ŀ� ���� ���� ��� ���Է�(�Է�Ƚ�� ������)
public class BaseBallApp {
	public static void main(String[] args) {
		//0~9 ������ ���� 3���� �����ϱ� ���� �迭 ����
		int[] dap=new int[3];
		
		Random random=new Random();
		//��Ģ�� �´� ������ �迭 ��ҿ� ����
		while(true) {
			for(int i=0;i<dap.length;i++) {
				dap[i]=random.nextInt(10);
			}
			if(dap[0]!=0 && dap[0]!=dap[1] && dap[1]!=dap[2] && dap[2]!=dap[0]) break;
		}
		
		Scanner scanner=new Scanner(System.in);
		
		//���� ���� ������ �����ϱ� ���� ����
		boolean result=false;
		
		//�Է� ��ȸ ���� - �Է¿� ���� ��� ���
		for(int cnt=1;cnt<=15;cnt++) {
			//��Ʈ����ũ�� ���� �����ϱ� ���� ���� ����
			int strike=0,ball=0;
			
			//�Է°��� �����ϱ� ���� �迭 ����
			int[] num=new int[3];
			
			//��Ģ�� �´� �Է°��� �迭�� ����
			loop:
			while(true) {
				System.out.print(cnt+"��° �Է� >> ");
				String input=scanner.nextLine();
				
				if(input.length()!=3) {
					System.out.println("[����]3�ڸ��� ���ڸ� �Է� �����մϴ�.");
					continue;
				}
				
				for(int i=0;i<num.length;i++) {
					//Unicode - '0':48 ~ '9':57
					//ex) '4'-'0' >> 52-48 >> 4
					num[i]=input.charAt(i)-'0';
					
					if(num[i]<0 || num[i]>9) {
						System.out.println("[����]���ڸ� �Է� �����մϴ�.");
						continue loop;
					}
				}
				
				if(num[0]!=0 && num[0]!=num[1] && num[1]!=num[2] && num[2]!=num[0]) break;
				
				System.out.println("[����]0���� ���۵ǰų� �ߺ��� ���ڰ� �����մϴ�.");	
			}//while�� ��
			
			//�������� �Է°��� ���Ͽ� ��Ʈ����ũ�� �� ���
			for(int i=0;i<dap.length;i++) {//�������� ���� �迭 ����� ÷��
				for(int j=0;j<num.length;j++) {//�Է°��� ���� �迭 ����� ÷��
					if(dap[i]==num[j]) {//�������� �Է°��� ���� ���
						//����� ÷�ڰ� ���� ��� >> ��ġ�� ���� ���
						if(i==j) strike++;
						else ball++;
					}
				}
			}
			
			if(strike==3) {
				System.out.println("[�޼���]�����մϴ�."+cnt+"������ ������ϴ�.");
				result=true;
				break;
			}
			
			System.out.println("[���]"+strike+"��Ʈ����ũ "+ball+"��");
		}//for����
		
		//������ ������ ���� ���
		if(!result) {
			System.out.print("������ �� ���豺��. �ٺ�!!! ������[");
			for(int su:dap) {
				System.out.print(su);
			}
			System.out.println("]�Դϴ�.");
		}
		
		scanner.close();
	}
}








