package inheritance;

//��� �޿� ���� ���α׷� �ۼ�
public class EmployeeApp {
	public static void main(String[] args) {
		//�߻�Ŭ������ �ν��Ͻ� ���� �Ұ���
		//Employee employee=new Employee();
		
		//�߻�Ŭ����(�θ�Ŭ����)�� ���������� �ڽ�Ŭ������ �����ڷ� �ν��Ͻ� �����Ͽ� ����
		// => �ڽ� �ν��Ͻ� ���� ���� �θ� �ν��Ͻ� ���� - �θ� �ν��Ͻ��� �������� ����
		/*
		Employee employee1=new EmployeeReguler();
		Employee employee2=new EmployeeTime();
		Employee employee3=new EmployeeContract();
		*/
		
		Employee[] employeeArray=new Employee[5];
		
		employeeArray[0]=new EmployeeReguler(1000, "ȫ�浿", 96000000);
		employeeArray[1]=new EmployeeTime(2000, "�Ӳ���", 50000, 150);
		employeeArray[2]=new EmployeeContract(3000, "����ġ", 7000000);
		employeeArray[3]=new EmployeeTime(4000, "����", 10000, 100);
		employeeArray[4]=new EmployeeReguler(5000, "ȫ�淡", 60000000);
		
		for(Employee employee:employeeArray) {
			System.out.println("�����ȣ = "+employee.getEmpNo());
			System.out.println("����̸� = "+employee.getEmpName());
			
			/*
			//��� �޿� ��� - ����� ��ü ����ȯ�� �̿��Ͽ� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
			// => instanceof �����ڸ� �̿��Ͽ� �ڽ�Ŭ������ �����Ͽ� ��ü ����ȯ
			if(employee instanceof EmployeeReguler) {
				System.out.println("����޿� = "+((EmployeeReguler)employee).computeSalary());
			} else if(employee instanceof EmployeeTime) {
				System.out.println("����޿� = "+((EmployeeTime)employee).calcPay());
			} else if(employee instanceof EmployeeContract) {
				System.out.println("����޿� = "+((EmployeeContract)employee).getContractPay());
			}
			*/
			
			//������ ��ü ����ȯ�� �̿��Ͽ� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
			// => �θ�Ŭ������ �߻�޼ҵ带 �ڽ�Ŭ�������� �������̵� ����
			System.out.println("����޿� = "+employee.computePay());
			System.out.println("�μ�Ƽ�� = "+employee.computeIncetive());
			System.out.println("===================================");
		}
		
	}
}









