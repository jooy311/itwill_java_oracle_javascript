package enumerate;

public enum StringEnum {
	//�����ڸ� ������ ��� ����ʵ� ����� �ʱⰪ�� �����ؾ߸� ����ʵ� ����
	INSERT("Insert"), UPDATE("Update"), DELETE("Delete"), SELECT("Select");
	
	//����ʵ忡 ���ϴ� �ڷ��� �Ǵ� ���� �����ϱ� ���� �ʵ� ����
	// => private final �ʵ� ����
	// => ����ʵ忡 ���ϴ� ���� �����ϱ� ���� �ݵ�� ������ ����
	private final String value;
	
	//����ʵ忡 �ʱⰪ�� �����Ͽ� �����ϱ� ���� ������ ����
	// => �����ڴ� �ݵ�� private ���������ڸ� �̿��Ͽ� ����ȭ ����
	// => �Ű������� ���޵� ���� �ʵ忡 �����ϸ� ����ʵ�� �ʱ�ȭ �۾� 
	private StringEnum(String value) {
		this.value=value;
	}

	//����ʵ��� ���� Ȯ���ϱ� ���� Getter �޼ҵ� ����
	public String getValue() {
		return value;
	}
}





