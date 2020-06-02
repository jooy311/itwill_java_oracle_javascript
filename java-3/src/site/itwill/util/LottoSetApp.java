package site.itwill.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//1~45 ������ �ߺ����� �ʴ� �������� 6���� �����޾� ������������ �����Ͽ� ���
public class LottoSetApp {
	public static void main(String[] args) {
		Set<Integer> lottoSet = new HashSet<Integer>();
		Random random = new Random();
		
		while(true) {
			//������ �ش��ϴ� ���ڸ� ��ҷ� ����
			//�ߺ����� ���� ���� �ȵ�
			lottoSet.add(random.nextInt(45) + 1);
			if(lottoSet.size() == 6) break;
		}
		
		//set.toArray() : set �ν��Ͻ��� �迭�� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		Integer[] lotto = lottoSet.toArray(new Integer[0]);//����� ������ �𸣴ϱ� 0���� �صд�.
		
		//Arrays.sort() : �迭�� ���޹޾� �����ϴ� �޼ҵ�
		Arrays.sort(lotto);
		
		//toString() : �迭�� ���޹޾� ��ҵ��� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println("����� ���� >> " + Arrays.toString(lotto));
	}
}
