package example;

public class MultiForExample {
	public static void main(String[] args) {
		// �ڡڡڡڡ�
		// �ڡڡڡ�
		// �ڡڡ�
		// �ڡ�
		// ��
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("============================================");

		// �ڡڡڡڡ�
		// �١ڡڡڡ�
		// �١١ڡڡ�
		// �١١١ڡ�
		// �١١١١�

		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print("��");
			}
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}

		System.out.println("============================================");
		// 	��1
		// �ڡڡ�3
		// �ڡڡڡڡ�5
		// �ڡڡڡڡڡڡ�
		// �ڡڡڡڡڡڡڡڡ�
		//        ��        
		//      �ڡڡ�      
		//    �ڡڡڡڡ�    
		//  �ڡڡڡڡڡڡ�  
		//�ڡڡڡڡڡڡڡڡ�
		int count = 1; int s = 5;
		for(int k = 1;k<=5; k++) {//��
			for(int i = 1; i <=5; i++) {
				if(i == s) {
					for(int j = 1; j <=count; j++) {
						System.out.print("��");			
					}
					s--;
					count+=2;
				}else System.out.print("  ");
			}System.out.println();
		
		}
		
		/*int cnt = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= cnt; j++) {
				System.out.print("��");
			}
			cnt += 2;
			System.out.println();
		}*/

		System.out.println("============================================");
		// �ڡ١١١�1,5
		// �١ڡ١ڡ�2,4
		// �١١ڡ١�3
		// �١ڡ١ڡ�
		// �ڡ١١١�
		int start = 1;
		int end = 5;
		for (int k = 1; k <= 5; k++) {
			for (int i = 1; i <= 5; i++) {
				if (i == start || i == end) {
					System.out.print("��");
				} else
					System.out.print("��");

				// if(start == end)break;
			}
			start++;
			end--;
			System.out.println();
		}
		System.out.println("============================================");
	}
}