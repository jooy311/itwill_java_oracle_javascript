package basic;

public class MathRandomApp {
	public static void main(String[] args) {
		//��ǻ�ͷκ��� �������� �����޾� ����ϴ� ���α׷��� �ۼ��ض�
		//���� : �ұ�Ģ������ �߻��Ǵ� ���ڰ�
		//Math Ŭ���� : ���� ���� ����� �޼ҵ尡 ����� Ŭ����
		//Math.random() 0.0���� ũ�ų� ���� 1.0���� ���� �Ǽ������� ��ȯ�ϴ� �޼ҵ�
		
		for(int i=1; i<=5; i++) {
			System.out.println(i+" ��° �Ǽ����� = " +Math.random());
		}
		
		System.out.println("=================================");
	
		//0~99������ ���������� �����޾� ���
		for(int i=1; i<=5; i++) {
			System.out.println(i+" ��° �Ǽ����� = " +(int) (Math.random() * 10));
		}
		
		
		
	}
}
