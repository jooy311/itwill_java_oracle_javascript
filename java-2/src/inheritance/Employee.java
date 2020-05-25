package inheritance;

//사원정보(사원번호, 사원이름)를 저장하기 위한 클래스
//=> 인스턴스 생성이 목적이 아닌 상속을 목적으로 작성된 클래스
//=> 상속을 목적으로 작성된 클래스는 추상클래스(Abstract Class)로 선언하는 것을 권장
//=> 인스턴스가 생성이 되지 않는다.
public abstract class Employee {
	private int empNo;
	private String empName;
	
	//상수필드Constant field : 값 대신 사용하기 위한 필드
	//값대신 의미있는 단어를 이용하여 표현하기 위해 사용 ->유지보수에 좋다
	//대문자로만 표현하여 단어의 구분에는 언더바를 사용
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
	
	//자식클래스에서 반드시 오버라이드 선언하도록 추상메소드로 설정해준다.
	//=> 강제성 부여
	public abstract int computePay(); 
	
	//인센티브를 계산하여 반환하는 메소드
	//=>모든 사원에게 급여의 150%를 인센티브를 계산하여 지급
	//=>자식클래스에서 오버라이드 선언할 경우 반환되는 인센티브가 변경가능하다 
	//=>자식클래스에서 오버라이드 선언하지 못하도록 final메소드로 작성한다.
	//=>오버라이드가 불가능해 진다.
	public final int computeincentive() {
		
		int incentive = (int)(computePay() * INCENTIVE_RATE);

		return incentive;
	}
}
