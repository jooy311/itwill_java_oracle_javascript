package example;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		//����鿡 ���� ���̸� �����ϰ� �ִ� �迭 ����
		int[] age={27,16,22,36,57,60,43,23,14,29,44,52,69,51,39,33,11};
		
		//�迭�� ����� ������� ��� ���̸� ����Ͽ� ����ϼ���.
		//ex) ��� ���� = 36�� 
		int sum = 0;
		for(int i=0; i<age.length; i++) {
			sum += age[i];
		}
		int ave = sum / age.length;
		System.out.println("������� ��� ���̴� " + ave + " �� �Դϴ�.");


		System.out.println("============================================");
		
		//�迭�� ����� ������� ���̸� ���ɺ��� �����Ͽ� �ο����� ����Ͽ� ����ϼ���.
		//ex) 10�� = 3��
		//    20�� = 4��
		//    ...
		//    60�� = 2��
		
		Arrays.sort(age);
		int[] cnt = new int[7];
		/*for(int i=0; i<age.length; i++) {
			if(age[i] >=10 && age[i] < 20) {
				cnt[1]++;
			}else if(age[i] >=20 && age[i] <30) {
				cnt[2]++;
			}else if(age[i] >=30 && age[i] <40) {
				cnt[3]++;
			}else if(age[i] >=40 && age[i] <50) {
				cnt[4]++;
			}else if(age[i] >=50 && age[i] <60) {
				cnt[5]++;
			}else if(age[i] >=60 && age[i] <70) {
				cnt[6]++;
			}
		}*/
		for(int a : age) {
			cnt[a/10]++;
		}
		for(int i=1; i<cnt.length; i++) {
			System.out.println( i *10 + "�� = "+cnt[i] +"��");
		}
		

		System.out.println("============================================");
	}
}