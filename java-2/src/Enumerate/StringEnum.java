package Enumerate;

public enum StringEnum {
	//�����ڸ� ������ ��� ����ʵ� ����� �ʱⰪ�� �����ؾ߸� ����ʵ尡 ������.
	INSERT("insert"), UPDATE("update"), DELETE("delete"), SELECT("select"); //���������δ� �ڵ����� 0,1,2,3�� ��
	
	//����ʵ忡 ���ϴ� �ڷ��� �Ǵ� ���� �����ϱ����� �ʵ带 ����
	//private final �ʵ�� ������ �־����
	//����ʵ忡 ���ϴ� ���� �����ϱ� ���� �ݵ�� �����ڸ� ����
	private final String value;
	
	//����ʵ忡 �ʱⰪ�� �����Ͽ� �����ϱ� ���� ������ ����
	//�����ڴ� �ݵ�� private���������ڸ� �̿��Ͽ� ����ȭ �����ؾ���
	//�Ű������� ���޵� ���� �ʵ忡 �����ϸ� ����ʵ尪���� �ʱ�ȭ��
	
	private StringEnum(String value) {
		this.value = value;
	}

	//����ʵ��� ���� Ȯ���ϱ� ���� ���� �޼ҵ�
	public String getValue() {
		return value;
	}
	
	
	
	
}
