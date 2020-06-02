package inheritance;

//�ڵ��� ����(������ �̸�, �𵨸�)�� �����ϱ� ���� Ŭ����
// => �θ�Ŭ������ ���� Ŭ������ �⺻������ Object Ŭ���� ���
public class Car /* extends Object */ {
	private String userName;
	private String modelName;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String userName, String modelName) {
		super();
		this.userName = userName;
		this.modelName = modelName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	//�ʵ尪�� ��ȯ�Ͽ� Ȯ���ϴ� �޼ҵ�� Ȱ���ϱ� ���� �������̵� ����
	@Override
	public String toString() {
		return "������ = "+userName+", �𵨸� = "+modelName;
	}
}





