package project.manager.frame;

public class MemberPayInfo {
	private String id;
	private String workdate;
	private String workdateY;
	private String workdateM;
	private String workdateD;
	private String starttime;
	private String endtime;// 근무지
	private String worktime; // 시급
	private int daysal; 

	public MemberPayInfo(String id, String workdate,String workdateY, String workdateM, String workdateD, String starttime, String endtime, String worktime, int daysal) {
		super();
		this.id = id;
		this.workdate = workdate;
		this.workdateY = workdateY;
		this.workdateM = workdateM;
		this.workdateD = workdateD;
		this.starttime = starttime;
		this.endtime = endtime;
		this.worktime = worktime;
		this.daysal = daysal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWorkdate() {
		return workdate;
	}

	public void setWorkdate(String workdate) {
		this.workdate = workdate;
	}

	public String getWorkdateY() {
		return workdateY;
	}

	public void setWorkdateY(String workdateY) {
		this.workdateY = workdateY;
	}

	public String getWorkdateM() {
		return workdateM;
	}

	public void setWorkdateM(String workdateM) {
		this.workdateM = workdateM;
	}

	public String getWorkdateD() {
		return workdateD;
	}

	public void setWorkdateD(String workdateD) {
		this.workdateD = workdateD;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getWorktime() {
		return worktime;
	}

	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}

	public int getDaysal() {
		return daysal;
	}

	public void setDaysal(int daysal) {
		this.daysal = daysal;
	}
	
}
