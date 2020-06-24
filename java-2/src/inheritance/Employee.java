package inheritance;

//�������(�����ȣ, ����̸�)�� �����ϱ� ���� Ŭ����
// => �ν��Ͻ� ������ ������ �ƴ� ����� �������� �ۼ��� Ŭ����
// => ����� �������� �ۼ��� Ŭ������ �߻�Ŭ����(Abstract Class)�� �����ϴ� ���� ����
public abstract class Employee {
	private int empNo;
	private String empName;
	
	//����ʵ�(Constant Field) : �� ��� ����ϱ� ���� �ʵ� - �ʵ尪 ���� �Ұ���
	// => �� ��� �ǹ��ִ� �ܾ �̿��Ͽ� ǥ���ϱ� ���� ���
	// => �빮�ڷθ� ǥ���ϸ� �ܾ��� �����ڴ� _ ���
	public static final double INCENTIVE_RATE=1.5;
	
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
	
	//�޿��� ����Ͽ� ��ȯ�ϴ� �޼ҵ� - �޼ҵ� �ۼ� ��Ģ ����(�۾����ü�)
	// => �ڽ�Ŭ�������� �ݵ�� �������̵� �����ϵ��� �߻�޼ҵ�� ����
	// => �߻�޼ҵ�(Abstract Method) : ������ �ۼ����� �ʴ� �޼ҵ� - ���ɺ� ����
	//�߻�޼ҵ尡 �ϳ��� ����� Ŭ������ �ݵ�� �߻�Ŭ������ ����
	public abstract int computePay();
	
	//�μ�Ƽ�긦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => ��� ������� �޿��� 150%�� �μ�Ƽ��� ����Ͽ� ����
	//�ڽ�Ŭ������ �������̵� ������ ��� ��ȯ�Ǵ� �μ�Ƽ�� ���� ����
	// => �ڽ�Ŭ�������� �������̵� �������� ���ϵ��� final �޼ҵ�� �ۼ�
	public final int computeIncetive() {
		//�߻�޼ҵ带 ȣ���� ��� ������ ��ü ����ȯ�� ���� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
		// => �θ�Ŭ������ �޼ҵ忡�� �ڽ�Ŭ������ �޼ҵ� ȣ��
		//int incentive=(int)(computePay()*1.5);
		//��(���ͷ�) ��� ����ʵ带 �̿��Ͽ� �ۼ��ϴ� ���� ����
		int incentive=(int)(computePay()*INCENTIVE_RATE);
		return incentive;
	}
}