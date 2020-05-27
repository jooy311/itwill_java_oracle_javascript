package inheritance;

//�̺�Ʈ ���� ȸ������(���̵�,�̸�,�̸���)�� �����ϱ� ���� Ŭ����
// => ȸ�������� �����ϴ� Ŭ����(Member)�� ��ӹ޾� �ۼ��ϴ� ���� ����
//extends Ű���带 �̿��Ͽ� ���� Ŭ����(�θ�Ŭ����)�� ��ӹ޾� ���ο� Ŭ����(�ڽ�Ŭ����) �ۼ�
// => ����� �̿��Ͽ� �ڽ�Ŭ������ �θ�Ŭ������ �ʵ�� �޼ҵ� ���� ���� - ��Ӽ�(Inheritance)
// => ���ϻ�Ӹ� ���� - ���߻�� �Ұ���
public class MemberEvent extends Member {
	/*
	//�θ�Ŭ������ ��ӹ޾� ����ϹǷ� �̼��� 
	private String id;
	private String name;
	*/
	private String email;
	
	//super : �ڽ�Ŭ������ �޼ҵ忡 �θ� �ν��Ͻ��� ������ ���޹޾� �����ϱ� ���� Ű����(��������)
	// => �ڽ�Ŭ������ �����ڿ��� �θ�Ŭ������ �����ڸ� ȣ���ϱ� ���� ���
	// => �ڽ�Ŭ�������� �������̵� �����Ͽ� ������ �θ�Ŭ������ �޼ҵ� ȣ���� ��� ���
	public MemberEvent() {
		//�ڽ�Ŭ������ �����ڿ��� �θ�Ŭ������ �⺻������ ȣ��
		// => �θ�Ŭ������ �⺻�����ڸ� ȣ���ϰ��� �� ��� ���� ����
		// => �θ�Ŭ������ �⺻�����ڰ� ���ų� ����ȭ�� ��� ���� �߻�
		// => ������ ȣ���ϴ� ������� �ٸ� ����� ������ ��� ���� �߻�
		//super();
	}

	/*
	public MemberEvent(String id, String name, String email) {
		super();
		//this.id = id;
		setId(id);
		//this.name = name;
		setName(name);
		this.email = email;
	}
	*/
	
	//[Alt]+[Shift]+[S] >> [O] >> �θ�Ŭ������ ������ ���� >> �ʵ� ���� >> Generate
	public MemberEvent(String id, String name, String email) {
		super(id, name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//�������̵�(Override) : �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� �缱���ϴ� ���
	// => �θ�Ŭ������ �޼ҵ�� ���� ������ �Ӹ��η� �ڽ�Ŭ�������� ����
	// => �θ�Ŭ������ �޼ҵ�� �������� �ڽ�Ŭ������ �޼ҵ常 ���
	/*
	public void display() {
		//System.out.println("���̵� = "+id);
		System.out.println("���̵� = "+getId());
		//System.out.println("�̸� = "+name);
		System.out.println("�̸� = "+getName());
		System.out.println("�̸��� = "+email);
	}
	*/

	//��Ŭ������ �̿��Ͽ� �θ�Ŭ������ �޼ҵ带 �������̵� �����ϴ� ���
	// => �θ�Ŭ���� �޼ҵ�� �Է� >> [Ctrl]+[Space] >> Override ���� >> ����
	//@Override : �������̵� �޼ҵ带 ǥ���ϱ� ���� ������̼�(Annotation)
	// => �������̵� �ۼ� ��Ģ�� ������ ��� ���� �߻�
	@Override
	public void display() {
		//super Ű���带 �̿��Ͽ� �θ�Ŭ������ ������ �޼ҵ带 ���� ȣ��
		super.display();
		System.out.println("�̸��� = "+email);
	}
}











