package site.itwill.util;

//���׸� �ʵ尡 ����� Ŭ������ �ν��Ͻ��� �����Ͽ� ����ϴ� ���α׷�
//=> ���׸� ��� ���޵� Ŭ���� �ν��Ͻ��� ������ ������(�ٸ��Ŵ� ���� �ȵ�)
//=> ��ü ����ȯ�� ���� �ʾƵ� �ʵ尪�� ��ȯ�޾� ��밡�� ->�������� ���� ����
public class GenericApp {
	public static void main(String[] args) {
		//���׸� Ŭ����(�������̽�)�� ����� ���, ���׸� ��� ���� Ŭ����(�������̽�) ����
		//�ؾ߸� ����� ������
		//���׸� ��� ���޵� Ŭ����(�������̽�)�� �ʵ��� �ڷ������� 
		Generic<Integer> g1 = new Generic<Integer>(); //Integer�� �־����ϱ� intŸ���� Ŭ������ ��
		
		g1.setField(100);
		//������ ��� ���޵� Ŭ������ �ν��Ͻ��� �ƴ� ��� �ʵ��� ����Ұ��� �ϹǷ� �����߻�
		
		int g1Value = g1.getField().intValue(); //����ȯ�� �� �ʿ䰡 ������
		System.out.println("������ = " + g1Value);
		System.out.println("====================================");
		
		Generic<Double> g2 = new Generic<Double>();
		
		g2.setField(72.34);
		double g2Value = g2.getField().doubleValue();
		System.out.println("�Ǽ��� = " + g2Value);
		System.out.println("====================================");
		
		Generic<String> g3 = new Generic<String>();
		
		g3.setField("ȫ�浿");
		String g3Value = g3.getField().toString();
		System.out.println("���ڿ� = " + g3Value);
		
	}
}
