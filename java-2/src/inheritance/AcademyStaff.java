package inheritance;

//직원정보(직원번호, 직원이름, 근무부서)를 저장하기 위한 클래스
public class AcademyStaff extends AcademyPerson {
	private String depart;
	
	public AcademyStaff() {
		// TODO Auto-generated constructor stub
	}

	public AcademyStaff(int num, String name, String depart) {
		super(num, name);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	@Override
	public void display() {
		//super.display(); -> 여기서는 번호랑 이름을 출력하라는 거였지 학생정보가 아니므로 쓰지 않는다.
		System.out.println("직원 번호 >> " + getNum());
		System.out.println("직원 이름 >> " + getName());
		System.out.println("직원 과목 >> " + depart);
		System.out.println();
	}
}
