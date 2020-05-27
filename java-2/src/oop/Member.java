package oop;

//this : �޼ҵ忡 ������ �ִ� �Ű�����(��������)
// => �޼ҵ带 ȣ���� �ν��Ͻ� ������ �ڵ����� ���޹޾� ����
// => �޼ҵ忡�� �ν��Ͻ��� �ʵ带 ��Ȯ�� �����ϱ� ���� �����Ǵ� Ű����
// => this Ű���带 ������� �ʾƵ� �ڵ����� �νĵǾ� ó�� 

//this Ű���带 ����ϴ� ����
//1.�޼ҵ��� �Ű������� �ʵ��� �̸��� ���� ��� this Ű���带 ����Ͽ� �ʵ� ǥ��
//2.�����ڿ��� �ٸ� �����ڸ� ȣ���Ͽ� �ʱ�ȭ �۾��� �����ϰ��� �� ��� this Ű���� ���
//3.�޼ҵ忡�� ȣ���� �ν��Ͻ��� ǥ���ϱ� ���� ��� >> �̺�Ʈ ó��, ���� ������ ��

//ȸ������(���̵�, �̸�, �̸���)�� �����ϱ� ���� Ŭ���� : VO(Value Object) Ŭ����
public class Member {
	//�ʵ�(Field) ����
	// => �ν��Ͻ� ������ �ʵ忡 ����Ǵ� �⺻�� ���� ����
	private String id="NoId";
	private String name="NoName";
	private String email="NoEmail";

	//������(Constructor) ����
	// => �����ڸ� �������� ���� ��� ���������� �⺻ �����ڰ� ����
	// => �����ڸ� �ϳ��� �����ϸ� �⺻ ������ ������
	//�⺻ ������(Default Constructor) : �Ű������� ���� ������
	// => �Ϲ������� �ʱ�ȭ �۾� �̱���
	// => �������� ���� ��� Ŭ���� ��� ������ �߻��� �� �����Ƿ� �����ϴ� ���� ����
	//�⺻ ������ �ڵ� �ϼ� : [Ctrl]+[Space] >> Constructor ���� >> ����
	public Member() {
		// TODO Auto-generated constructor stub
		/*
		id="NoId";
		name="NoName";
		email="NoEmail";
		*/
		
		//this Ű���带 �̿��Ͽ� �ٸ� ������ ȣ��
		// => �ٸ� �����ڸ� ȣ���ϴ� ��� ���� �ٸ� ����� ������ ��� ���� �߻�
		// => public Member(String id, String name, String email) ȣ��
		//this("NoId","NoName","NoEmail");
	}
	
	//�Ű������� �����ϴ� ������ ����
	// => �ν��Ͻ� ������ �Ű������� ���޹��� ������ �ʵ尪 ���� - �ʱ�ȭ �۾�
	//������ �ڵ� �ϼ� : [Alt]+[Shift]+[S] >> [O] >> �ʵ� ���� >> Generate
	public Member(String id) {
		this.id=id;
		
		/*
		this.id=id;
		name="NoName";
		email="NoEmail";
		*/

		//this(id, "NoName", "NoEmail");
	}
	
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
		
		/*
		this.id=id;
		this.name=name;
		email="NoEmail";
		*/
		
		//this(id, name, "NoEmail");
	}
	
	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	//�޼ҵ�(Method) ����
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//�ʵ尪�� ����ϴ� �޼ҵ� >> �ʵ尪 Ȯ��
	public void display() {
		//System.out.println("���̵� = "+this.id);
		System.out.println("���̵� = "+id);
		System.out.println("�̸� = "+name);
		System.out.println("�̸��� = "+email);
	}
}









