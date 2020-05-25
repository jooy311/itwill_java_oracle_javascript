package inheritance;

//�л����� (�л���ȣ, �л��̸�, ��������)�� �����ϱ� ���� Ŭ����
// => �л���ȣ��, �л��̸��� AcademyPerson Ŭ�������� ��ӹ޾ƿ´�
public class AcademyStudent extends AcademyPerson {
	private String course;
	
	public AcademyStudent() {
		// TODO Auto-generated constructor stub
	}

	public AcademyStudent(int num, String name, String course) {
		super(num, name); //���ϴ� �����ڸ� �̿��ϸ� �ٷ� �ʱ�ȭ~~�ڡ�
		this.course = course;
	}
	
	//----------------------------------------------------------------------------

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	//�θ� ���� �ȵ� �θ� ���ܵΰ� ���� ����������� �������̵�
	@Override
	public void display() {
		//super.display(); -> ���⼭�� ��ȣ�� �̸��� ����϶�� �ſ��� �л������� �ƴϹǷ� ���� �ʴ´�.
		System.out.println("�л� ��ȣ >> " + getNum());
		System.out.println("�л� �̸� >> " + getName());
		System.out.println("���� ���� >> " + course);
		System.out.println();
	}
	
}
