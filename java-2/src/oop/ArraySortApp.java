package oop;

import java.util.Arrays;//�迭 ���� ����� �����ϴ� Ŭ����

//�迭 ��Ұ��� �����Ͽ� ����ϴ� ���α׷� �ۼ�

public class ArraySortApp {
	public static void main(String[] args) {
		int[] array = {20,50,10,40,30};
		
//		System.out.print("���� �� >> ");
//		for(int num : array) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
//		
//		
//		//�������� �˰����� �̿��Ͽ� �迭 ��Ұ��� ���� ���� �ϱ�
//		for(int i = 0 ; i<array.length-1; i++) {
//			for(int j = i+1 ; j< array.length; j++) {
//				if(array[i] > array[j]) {
//					int tmp = array[i];
//					array[i] = array[j];
//					array[j] = tmp;
//				}
//			}
//		}
//		
//		System.out.print("���� �� >> ");
//		for(int num : array) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
		
		System.out.print("���� �� >> ");
		
		Arrays.sort(array);//�迭 ���� ����� �����ϴ� Ŭ������
		
		System.out.println(Arrays.toString(array));//��Ұ����� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		//�迭�� ���޹޾� �迭�� ��� ��Ұ��� ��Ʈ������ �������ش�.
		
		
		
	}
}
