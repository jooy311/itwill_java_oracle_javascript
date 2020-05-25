package inheritance;

public class AcademyInstructor extends AcademyPerson {
	private String subject;
	
	public AcademyInstructor() {
		// TODO Auto-generated constructor stub
	}

	public AcademyInstructor(int num, String name, String subj) {
		super(num, name);
		this.subject = subj;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void display() {
		//super.display(); -> 여기서는 번호랑 이름을 출력하라는 거였지 학생정보가 아니므로 쓰지 않는다.
		System.out.println("강사 번호 >> " + getNum());
		System.out.println("강사 이름 >> " + getName());
		System.out.println("과목 >> " + subject);
		System.out.println();
	}
}
