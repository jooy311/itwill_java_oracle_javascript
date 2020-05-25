package inheritance;

//학생정보 (학생번호, 학생이름, 수강과정)을 저장하기 위한 클래스
// => 학생번호와, 학생이름은 AcademyPerson 클래스에서 상속받아온다
public class AcademyStudent extends AcademyPerson {
	private String course;
	
	public AcademyStudent() {
		// TODO Auto-generated constructor stub
	}

	public AcademyStudent(int num, String name, String course) {
		super(num, name); //원하는 생성자를 이용하며 바로 초기화~~★★
		this.course = course;
	}
	
	//----------------------------------------------------------------------------

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	//부모꺼 맘에 안들어서 부모꺼 숨겨두고 내꺼 쓰고싶을때는 오버라이드
	@Override
	public void display() {
		//super.display(); -> 여기서는 번호랑 이름을 출력하라는 거였지 학생정보가 아니므로 쓰지 않는다.
		System.out.println("학생 번호 >> " + getNum());
		System.out.println("학생 이름 >> " + getName());
		System.out.println("수강 과목 >> " + course);
		System.out.println();
	}
	
}
