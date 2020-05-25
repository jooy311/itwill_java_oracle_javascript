package inheritance;

//�������(�����ȣ, ����̸�)�� �����ϱ� ���� Ŭ����
//=> �ν��Ͻ� ������ ������ �ƴ� ����� �������� �ۼ��� Ŭ����
//=> ����� �������� �ۼ��� Ŭ������ �߻�Ŭ����(Abstract Class)�� �����ϴ� ���� ����
//=> �ν��Ͻ��� ������ ���� �ʴ´�.
public abstract class Employee {
	private int empNo;
	private String empName;
	
	//����ʵ�Constant field : �� ��� ����ϱ� ���� �ʵ�
	//����� �ǹ��ִ� �ܾ �̿��Ͽ� ǥ���ϱ� ���� ��� ->���������� ����
	//�빮�ڷθ� ǥ���Ͽ� �ܾ��� ���п��� ����ٸ� ���
	public static final double INCENTIVE_RATE = 1.5;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	public int getEmpNo() {	
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	//�ڽ�Ŭ�������� �ݵ�� �������̵� �����ϵ��� �߻�޼ҵ�� �������ش�.
	//=> ������ �ο�
	public abstract int computePay(); 
	
	//�μ�Ƽ�긦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	//=>��� ������� �޿��� 150%�� �μ�Ƽ�긦 ����Ͽ� ����
	//=>�ڽ�Ŭ�������� �������̵� ������ ��� ��ȯ�Ǵ� �μ�Ƽ�갡 ���氡���ϴ� 
	//=>�ڽ�Ŭ�������� �������̵� �������� ���ϵ��� final�޼ҵ�� �ۼ��Ѵ�.
	//=>�������̵尡 �Ұ����� ����.
	public final int computeincentive() {
		
		int incentive = (int)(computePay() * INCENTIVE_RATE);

		return incentive;
	}
}
