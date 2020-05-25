package oop;

//ȸ�������� �����ϱ� ���� Ŭ����
//���̵�.�̸�.�̸���
//���̵�: ������

//���𰡸� �����ϴ� Ŭ���� : VO(Value Object) - web������ �ڹٺ��̶�� ��!

//�̷� ������ ������ �ִ� Ŭ������ ���� ���̰�, VOŬ���� ��� ��


//this : �޼ҵ忡 ������ �ִ� �Ű�����(��������)
// -> �޼ҵ带 ȣ���� �ν��Ͻ� ������ �ڵ����� ���޹޾� ������
//-> �޼ҵ忡�� �ν��Ͻ��� �ʵ带 ��Ȯ�� �ϱ� ����

//thisŰ���带 ����ϴ� ����
//1.�޼ҵ��� �Ű������� �ʵ��� �̸��� ���� ��� this.Ű���带 �����
//2.�����ڿ��� �ٸ� �����ڸ� ȣ���Ͽ� �ʱ�ȭ �۾��� �� �� ���
//3.�޼ҵ忡�� ȣ���� �ν��Ͻ��� ǥ���ϱ� ���� ����(�̺�Ʈ ó�����α׷�, ���߽����� ���α׷�)
public class Member {
	//�ʵ�
	private String id = "No Id";//ó���� �� �ʱ�ȭ��Ŵ ->�ʵ忡 ������ ��Ű�� �⺻���� �Ǿ� �����°�.
	//�׷��� ���� �ȵ��� �⺻���� ����̵�(�ڹٿ����� ������)
	//��? �ڹٴ� ������Ÿ���̱⶧��->	Ŭ�������޸𸮿� ���� ������ �ϱ� ������ 
	//��Ŭ������ ���� �ε�ȴ��� ��ü�� �ε�ʡ�
	private String name = "No Name";
	private String email = "No email";
	
	//Constructor������ ����
	//�����ڰ� ���� �ȵȰ�� : ���������� �⺻ �����ڰ� ������	
	
	//�������� �ϳ��� �����ϸ� �⺻ �����ڴ� �������� ����
	//�⺻�����ڶ�? �Ű������� ���� ������ - �޼ҵ嵵���� ������ �׳� ��ü ������ �������� ��
	//�Ϲ������� �ʱ�ȭ �۾��� �̸� �����Ѵ�
	//�������� ������� ��ӹ����� �߻��� �� �����Ƿ� �����ϴ°��� ����
	//�⺻������ �ڵ� �ϼ���� : ctrl + space
	public Member() {
		//this�� �̿��Ͽ� �ٸ� �����ڸ� ȣ���� �� �� �ִ�
		//�ٸ� �����ڸ� ȣ���ϴ� ������� �ٸ� ����� �����ϸ� �ȵȴ�
		//������ ���� ������ ����
		this("","","");
	}
	
	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	//�Ű� ������ �����ϴ� �����ڸ� ����
	public Member(String id) {
		//this.id = id;
		this(id, "No Name", "NoEmail");
	}
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	//�޼ҵ� ����
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
	
	//�ʵ尪�� ����ϴ� �޼ҵ�  >> �ʵ尪 Ȯ�� (VOŬ���� �ȿ����� ������ �ƴ�)
	public void display(){
		System.out.println("���̵� >> " + id);
		System.out.println("�̸� >> " + name);
		System.out.println("�̸��� >> " + email);
	}
	
	
}
