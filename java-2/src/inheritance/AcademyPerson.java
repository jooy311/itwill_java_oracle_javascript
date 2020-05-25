package inheritance;

//학원사람정보()를 저장하기 위한 클래스
//(각자 만들기보다 공통적인것을 가져와 클래스로 만들어버리기)
//=> 학생, 강사, 직원의 공통적인 속성과 기능을 정의하기위한 클래스
//=> 코드의 중복성을 최소화하여 프로그램의 생산성 및 유지보수 효율성을 증가 시킴
// => 학원 인적자원 관련 클래스가 반드시 상속받아야 하는 클래스가 되어야 함
public class AcademyPerson {
	private int num;
	private String name;
	
	public AcademyPerson() {
		// TODO Auto-generated constructor stub
	}
	
	public AcademyPerson(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	//-----------------------------------------------------------------------------
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("번호 >> " + num);
		System.out.println("이름 >> " + name);
	}
}
