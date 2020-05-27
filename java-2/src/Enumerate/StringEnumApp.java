package Enumerate;

public class StringEnumApp {
	public static void main(String[] args) {
		System.out.println("���� = " + StringEnum.INSERT);
		System.out.println("���� = " + StringEnum.UPDATE);
		System.out.println("���� = " + StringEnum.DELETE);
		System.out.println("�˻� = " + StringEnum.SELECT);
		
		System.out.println("���� = " + StringEnum.INSERT.getValue());
		System.out.println("���� = " + StringEnum.UPDATE.getValue());
		System.out.println("���� = " + StringEnum.DELETE.getValue());
		System.out.println("�˻� = " + StringEnum.SELECT.getValue());
		
		//StringEnum.values() : ����ʵ带 �������� ����� ����ʵ带 �迭�� ��ȯ�Ͽ� ��ȯ
		for(StringEnum tmp : StringEnum.values()) {
			//tmp.ordinal() : ��� �ʵ带 �����ϱ� ���� �������� ��ȯ�ϴ� �޼ҵ�
			System.out.println(tmp + " = " + tmp.ordinal());
		}
	}
}
