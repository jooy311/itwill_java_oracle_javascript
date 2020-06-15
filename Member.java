package project.manager.frame;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String workplace;// �ٹ���
	private String salperhour; // �ñ�

	public Member(String id, String pwd, String name, String workpalce, String salperhour) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.workplace = workpalce;
		this.salperhour = salperhour;
	}

	public Member(String[] userInfo) { //ȸ�������� �ѹ��� ������ �ٴϱ� ���� String�迭 �Ű���������� ������
		id = userInfo[0];
		pwd = userInfo[1];
		name = userInfo[2];
		workplace = userInfo[3];
		salperhour = userInfo[4];
	}

	public void setAll(String[] tmp) { // ���߿� ȸ�������� �����ϰų��Ҵ� �ѹ��� ������ ���� ���� �޼ҵ�
		id = tmp[0];
		pwd = tmp[1];
		name = tmp[2];
		workplace = tmp[3];
		salperhour = tmp[4];
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkpalce() {
		return workplace;
	}

	public void setWorkpalce(String workpalce) {
		this.workplace = workpalce;
	}

	public String getSalperhour() {
		return salperhour;
	}

	public void setSalperhour(String salperhour) {
		this.salperhour = salperhour;
	}
}
