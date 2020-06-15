package project.manager.frame;

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

	public Member(String[] userInfo) { //회원정보를 한번에 가지고 다니기 위한 String배열 매개변수사용한 생성자
		id = userInfo[0];
		pwd = userInfo[1];
		name = userInfo[2];
		workplace = userInfo[3];
		salperhour = userInfo[4];
	}

	public void setAll(String[] tmp) { // 나중에 회원정보를 수정하거나할대 한번에 가지고 오기 위한 메소드
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
