package inheritance;

//시간제 사원정보(사원번호, 사원이름, 시급, 근무시간)를 저장하기 위한 클래스
//=> employee클래스를 상속받아 작성
public class EmployeeTime extends Employee {
	private int moneyperHour;
	private int workedHour;
	
	public EmployeeTime() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeTime(int empNo, String empName, int moneyperHour, int workedHour) {
		super(empNo, empName);
		this.moneyperHour = moneyperHour;
		this.workedHour = workedHour;
	}

	public int getMoneyperHour() {
		return moneyperHour;
	}

	public void setMoneyperHour(int moneyperHour) {
		this.moneyperHour = moneyperHour;
	}

	public int getWorkedHour() {
		return workedHour;
	}

	public void setWorkedHour(int workedHour) {
		this.workedHour = workedHour;
	}
	
	//급여를 반환하는 메소드
	/*
	public int calcPay() {
		return moneyperHour * workedHour;
	}*/
	
	@Override
	public int computePay() {
		return moneyperHour * workedHour;
	}
	
	
}
