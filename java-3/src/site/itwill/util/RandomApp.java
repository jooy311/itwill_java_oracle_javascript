package site.itwill.util;

import java.util.Random;

//���� ���� ����� �����ϴ� Ŭ����
public class RandomApp {
	public static void main(String[] args) {
		//Random(seed) : seed���� �����Ͽ� ���� �ν��Ͻ��� �����ϴ� �������̴�.
		//=> seed :�ұ�Ģ�� ������ �߻��ǵ��� �����ϴ� longŸ���� ���� ����
		//=> seed���� System.currentTimeMillis()�޼ҵ��� ��ȯ���� ����Ѵ�.
		//=> currentTimeMillis : �ý����� Ÿ�ӽ������� ����Ͽ� ���� �ð��� ��ȯ���ִ� �޼ҵ�
		//=> Ÿ�ӽ����� : 1970�� 1/1�������� �ʴ� 1�� ����
		//=> �ڹٿ����� ms������ 1�� �����Ǵ� longŸ���� �������� �̿��Ѵ�.
		
		//Random Ŭ������ �⺻�����ڴ� �õ尪�� �ڵ����� �����Ͽ� �ν��Ͻ� ����
		Random rd = new Random();
		
		for(int i = 1; i <=5; i++) {
			//rd.nextInt(int bound) : 0~������ ������ �߻��Ѵ�.
			System.out.println(i + " ��° ���� = " + rd.nextInt(100));
		}
	}
}
