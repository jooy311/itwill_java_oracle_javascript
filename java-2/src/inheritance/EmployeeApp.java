package inheritance;

//사원 급여 관리 프로그램 작성
public class EmployeeApp {
	public static void main(String[] args) {
		// 추상클래스는 인스턴스를 생성할 수 없다.
		// Employee em = new Employee();

		// 추상클래스(부모클래스)로 참조변수에 자식클래스의 생성자로 인스턴스 생성하여 저장
		// =>자식 인스턴스 생성 전에 부모 인스턴스 생성 - 부모인스턴스
//		Employee employee1 = new EmployeeRegular();
//		Employee employee2 = new EmployeeContract();
//		Employee employee2 = new EmployeeTime();

		Employee[] eArray = new Employee[5];
		eArray[0] = new EmployeeRegular(1000, "홍길동", 9600000);
		eArray[1] = new EmployeeTime(1001, "전우치", 50000, 150);
		eArray[2] = new EmployeeContract(1002, "김철수", 7000000);
		eArray[3] = new EmployeeRegular(1003, "김영희", 6600000);
		eArray[4] = new EmployeeTime(1004, "홍경례", 60000, 160);

		for (Employee emp : eArray) {
			System.out.println("사원번호 = " + emp.getEmpNo());
			System.out.println("사원 이름 = " + emp.getEmpName());

			// 사원급여를 출력하기 위해서 명시적 객체 형변환을 이용하여 자식메소드를 호출할 수 있다.
			// 자식을 구분해야함
			/*if (emp instanceof EmployeeRegular) {
				System.out.println("사원급여 = " + ((EmployeeRegular) emp).computeSalary());
			} else if (emp instanceof EmployeeTime) {
				System.out.println("사원급여 = " + ((EmployeeTime) emp).calcPay());
			} else if (emp instanceof EmployeeContract) {
				System.out.println("사원급여 = " + ((EmployeeContract) emp).getContractPay());
			}*/
			
			
			//묵시적 객체 형변환을 이용하여 자식 인스턴스의 메소드 호출
			//=>부모클래스의 메소드를 자식클래스에서 오버라이드 선언
			System.out.println("사원 급여 = " + emp.computePay());
			System.out.println("인센티브 = " + emp.computeincentive());
			
			System.out.println("=========================================");
		}

	}

}
