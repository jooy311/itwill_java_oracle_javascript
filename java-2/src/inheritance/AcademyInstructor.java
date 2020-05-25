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
		//super.display(); -> ���⼭�� ��ȣ�� �̸��� ����϶�� �ſ��� �л������� �ƴϹǷ� ���� �ʴ´�.
		System.out.println("���� ��ȣ >> " + getNum());
		System.out.println("���� �̸� >> " + getName());
		System.out.println("���� >> " + subject);
		System.out.println();
	}
}
