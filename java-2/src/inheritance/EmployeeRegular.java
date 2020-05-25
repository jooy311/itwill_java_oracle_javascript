package inheritance;

//������ �������(�����ȣ, ����̸�, ����)�� �����ϴ� Ŭ����
//=> employeeŬ������ ��ӹ޾� �ۼ�
public class EmployeeRegular extends Employee {
	private int annualSalary;
	
	public EmployeeRegular() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeRegular(int empNo, String empName, int annualSalary) {
		super(empNo, empName);
		this.annualSalary = annualSalary;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	//�޿��� ��ȯ�ϴ� �޼ҵ�
	/*
	public int computeSalary() {
		return annualSalary/12;
	}*/
	
	@Override
	public int computePay() {
		return annualSalary/12;
	}
	
}
