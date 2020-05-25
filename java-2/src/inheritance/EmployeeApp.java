package inheritance;

//��� �޿� ���� ���α׷� �ۼ�
public class EmployeeApp {
	public static void main(String[] args) {
		// �߻�Ŭ������ �ν��Ͻ��� ������ �� ����.
		// Employee em = new Employee();

		// �߻�Ŭ����(�θ�Ŭ����)�� ���������� �ڽ�Ŭ������ �����ڷ� �ν��Ͻ� �����Ͽ� ����
		// =>�ڽ� �ν��Ͻ� ���� ���� �θ� �ν��Ͻ� ���� - �θ��ν��Ͻ�
//		Employee employee1 = new EmployeeRegular();
//		Employee employee2 = new EmployeeContract();
//		Employee employee2 = new EmployeeTime();

		Employee[] eArray = new Employee[5];
		eArray[0] = new EmployeeRegular(1000, "ȫ�浿", 9600000);
		eArray[1] = new EmployeeTime(1001, "����ġ", 50000, 150);
		eArray[2] = new EmployeeContract(1002, "��ö��", 7000000);
		eArray[3] = new EmployeeRegular(1003, "�迵��", 6600000);
		eArray[4] = new EmployeeTime(1004, "ȫ���", 60000, 160);

		for (Employee emp : eArray) {
			System.out.println("�����ȣ = " + emp.getEmpNo());
			System.out.println("��� �̸� = " + emp.getEmpName());

			// ����޿��� ����ϱ� ���ؼ� ����� ��ü ����ȯ�� �̿��Ͽ� �ڽĸ޼ҵ带 ȣ���� �� �ִ�.
			// �ڽ��� �����ؾ���
			/*if (emp instanceof EmployeeRegular) {
				System.out.println("����޿� = " + ((EmployeeRegular) emp).computeSalary());
			} else if (emp instanceof EmployeeTime) {
				System.out.println("����޿� = " + ((EmployeeTime) emp).calcPay());
			} else if (emp instanceof EmployeeContract) {
				System.out.println("����޿� = " + ((EmployeeContract) emp).getContractPay());
			}*/
			
			
			//������ ��ü ����ȯ�� �̿��Ͽ� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
			//=>�θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� �������̵� ����
			System.out.println("��� �޿� = " + emp.computePay());
			System.out.println("�μ�Ƽ�� = " + emp.computeincentive());
			
			System.out.println("=========================================");
		}

	}

}
