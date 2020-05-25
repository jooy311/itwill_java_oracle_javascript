package inheritance;

//��������(������ȣ, �����̸�, �ٹ��μ�)�� �����ϱ� ���� Ŭ����
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
		//super.display(); -> ���⼭�� ��ȣ�� �̸��� ����϶�� �ſ��� �л������� �ƴϹǷ� ���� �ʴ´�.
		System.out.println("���� ��ȣ >> " + getNum());
		System.out.println("���� �̸� >> " + getName());
		System.out.println("���� ���� >> " + depart);
		System.out.println();
	}
}
