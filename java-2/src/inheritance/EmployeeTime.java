package inheritance;

//�ð��� �������(�����ȣ, ����̸�, �ñ�, �ٹ��ð�)�� �����ϱ� ���� Ŭ����
//=> employeeŬ������ ��ӹ޾� �ۼ�
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
	
	//�޿��� ��ȯ�ϴ� �޼ҵ�
	/*
	public int calcPay() {
		return moneyperHour * workedHour;
	}*/
	
	@Override
	public int computePay() {
		return moneyperHour * workedHour;
	}
	
	
}
