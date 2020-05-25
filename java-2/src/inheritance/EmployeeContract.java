package inheritance;

//계약직 사원정보를(사원번호, 사원이름, 계약급여)저장하기 위한 클래스
//=> employee클래스를 상속받아 작성
public class EmployeeContract extends Employee{
	private int contractPay;
	
	public EmployeeContract() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeContract(int empNo, String empName, int contractPay) {
		super(empNo, empName);
		this.contractPay = contractPay;
	}

	public int getContractPay() {
		return contractPay;
	}

	public void setContractPay(int contractPay) {
		this.contractPay = contractPay;
	}
	
	@Override
	public int computePay() {
		return contractPay;
	}
	
	//final메소드를 오버라이드 선언할 경우 에러가 발생
	/*@Override
	public int computeincentive() {
		return 1000000000;
	}*/
	
}
