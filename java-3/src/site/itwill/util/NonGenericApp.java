package site.itwill.util;

//Object �ʵ尡 ����� Ŭ������ �ν��Ͻ��� �����Ͽ� ����ϴ� ���α׷�
// => �ʵ忡 ��� �ν��Ͻ��� �����Ͽ� ���� ���� - ����
//=> �ʵ忡 ����� �ν��Ͻ��� ��ȯ�޾� ����� ��� �ݵ�� ����� ��ü����ȯ�� �ؾ��Ѵ�.
public class NonGenericApp {
	public static void main(String[] args) {
		NonGeneric ng1=new NonGeneric();
		
		//Integer �ν��Ͻ��� �����Ͽ� Object �ʵ忡 ����
		//ng1.setField(new Integer(100));
		ng1.setField(100);//����ڽ�
		
		//�ʵ尪�� ������ Object �ν��Ͻ��� ��ȯ - Object Ŭ������ �޼ҵ常 ȣ�� ����
		// => ����� ��ü ����ȯ�� �� �̿��Ͽ� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ�� ����
		int ng1Value=((Integer)ng1.getField()).intValue();
		
		//����� ��ü ����ȯ�� �߸��� ��� ClassCastException �߻�
		//int ng1Value=((Double)ng1.getField()).intValue();
		
		System.out.println("������ = "+ng1Value);
		System.out.println("======================================");
		NonGeneric ng2=new NonGeneric();
		
		//Double �ν��Ͻ��� �����Ͽ� Object �ʵ忡 ����
		ng2.setField(12.34);
		
		//��instanceof�� �����ڸ� �̿��Ͽ� ����� ��ü �����濡 ���� ���� �۾�
		if(ng2.getField() instanceof Double) {
			double ng2Value=((Double)ng2.getField()).doubleValue();
			System.out.println("�Ǽ��� = "+ng2Value);
		}
		
		
		System.out.println("======================================");
		NonGeneric ng3=new NonGeneric();
		
		//String �ν��Ͻ��� �����Ͽ� Object �ʵ忡 ����
		ng3.setField("ȫ�浿");
		
		if(ng3.getField() instanceof String) {
			String ng3Value = ((String)ng3.getField()).trim();
			System.out.println("���ڿ�= " + ng3Value);
		}
		System.out.println("======================================");
	}
}
