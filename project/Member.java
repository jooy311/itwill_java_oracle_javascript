package project;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String workplace;// 근무지
	private String salperhour; // 시급

	public Member(String id, String pwd, String name, String workpalce, String salperhour) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.workplace = workpalce;
		this.salperhour = salperhour;
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
