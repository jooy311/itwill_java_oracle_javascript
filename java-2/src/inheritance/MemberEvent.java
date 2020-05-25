package inheritance;

//�̺�Ʈ ���� ȸ������(���̵�, �̸�, �̸���)�� �����ϱ� ���� Ŭ����
//=>�̹� MemberŬ������ (���̵�, �̸�)�� ����Ǿ� �ֱ� ������ 
//=>����Ŭ������ ������ �� ������ ����� �޴°� ����
//=>extends Ű���带 �̿��Ͽ� ���� Ŭ������ ��ӹ޾� ���ο� Ŭ������ �ۼ�
//=>����� �̿��Ͽ� �ڽ�Ŭ������ �θ�Ŭ������ �ʵ�� �޼ҵ忡 ���ٰ���
//=>���ϻ�Ӹ� ����(���߻�� ���� �Ұ�)
public class MemberEvent extends Member {
	/*
	 * private String id; private String name;
	 */
	private String email;

	// super : �ڽ� Ŭ������ �޼ҵ忡�� �θ� �ν��Ͻ��� ������ ���޹޾� �����ϱ� ���� ����������
	// �ڽ�Ŭ������ �����ڿ��� �θ�Ŭ������ �����ڸ� ȣ���ϱ� ���� Ű����
	public MemberEvent() {
		// TODO Auto-generated constructor stub
		// �ڽ�Ŭ������ �����ڿ��� �θ�Ŭ������ �⺻�����ڸ� ȣ���ϴ� ���
		// �θ�Ŭ������ �⺻�����ڸ� ȣ���Ϸ��� �� ��� ��������
		// => ���� �θ�Ŭ������ �⺻�����ڰ� ���ٸ� �⺻����� �Ұ����ϹǷ� error����
		// ��, �θ�Ŭ�������� �ݵ�� �⺻�����ڸ� ������־�� �Ѵ�.
		// �����ڸ� ȣ���ϴ� ������� �ٸ� ����� ������ ��� error
		// super();�� �����Ǿ� �ִ�.
	}
//alt + shift + s >> O >> �θ�Ŭ������ ������ ���� (�̰� ���� ������ �׳� super()�� ȣ��)>> �ʵ弱��

	public MemberEvent(String id, String name, String email) {
		super(id, name);// super�� �Ű������� �ƿ� �ʱ�ȭ �ؼ� ������
		// ���� �ؿ��� setId��� ���ص���
		// this.id = id;
		setId(id);// super.setId()�� ���� ���� �ʾƵ� �ڵ����� ã�ư���.

		// this.name = name;
		setName(name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * public void display() { System.out.println("id = " + getId());
	 * System.out.println("name = " + getName()); System.out.println("email = " +
	 * email);
	 * 
	 * }
	 */

	// �޼ҵ� �������̵� : �θ�Ŭ������ �޼ҵ带�� �ڽ�Ŭ�������� �缱���ϴ� ��
	// �θ�Ŭ������ �޼ҵ�� ���� ������ �Ӹ��θ� �����ϰ� �����Ͽ� �ۼ�
	// => �θ�Ŭ������ �޼ҵ�� �������� �ǰ�, �ڽ�Ŭ������ �޼ҵ常 ��밡��������

	// ��Ŭ������ �̿��Ͽ� �θ�Ŭ������ �޼ҵ带 �������̵� �����ϴ� ���
	// =>�θ�Ŭ������ �޼ҵ�� �Է� >> ctrl + space
	// @Overide : (@�ڿ� �ִ� ���� ������̼��̶�� ��) �������̵� �޼ҵ带 ǥ���ϱ� ���� annotation
	// =>�������̵� �ۼ���Ģ�� ������ ���, error
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display(); // this�� �ϸ� �ڱ��ڽ��� ���ȣ���ϴ� ���̹Ƿ� ���ѷ����ɸ�
	}
}
