package basic;

import java.util.Arrays;

//1-45������ �ߺ����� �ʴ� �������� 6���� �����޾� ������������ �����Ͻÿ�
public class LottoApp {
	// ���� sort : ���� ���ʴ�� �����ϴ� ���
	// 1.�������� ����
	// 2.�������� ����
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			//������ �����޾� ����
			//->������ ���� �տ��ſ� ��� �� -> ������ �����
			arr[i] = (int) (Math.random() *100)%45 +1;
			
			while(true) {
				boolean flag = false;//���������� ���¸� �����ϱ� ���� �Ҹ��𺯼�
			//���� ��Ҹ� �����ϱ� ���� �ݺ���
			//->���ο� ������ ���� ������ ���ϱ� ���� �ݺ���
				for(int j=0; j<i; j++){
					if(arr[i] == arr[j]) {
						flag = true;//�ߺ�
						break;
					}
				}
				
				//���ο� ������ ���� ������ �ߺ����� ���� �����
				if(flag != true) break; 
			}
			
			
		}
		//�迭 ��Ұ��� �����Ͽ� ������
		//	Arrays.sort(arr);//1.��������
		
		//<<<<<��������>>>>>> �˰����� ����غ���
		//30,10,50,20,40
		for(int i=0; i<arr.length-1; i++) { //���ϴ� ���
			for(int j=i+1; j<arr.length; j++) {//�񱳴��ϴ� ���
				if(arr[i] > arr[j]) {//�񱳱��� > �񱳴��ϴ� ���
					int tmp = arr[j]; //�ӽ�����
					arr[j] = arr[i];//�ٲٰ�
					arr[i] = tmp;//�ٲٰ�
				}
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
