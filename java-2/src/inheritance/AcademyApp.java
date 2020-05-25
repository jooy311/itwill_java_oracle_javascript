package inheritance;

//�п� ���� �ڿ�(�л�, ����, ����)���� ���α׷�
//�������̵尡 �ȵȰ��� ����� ��ü ����ȯ�� �ؾ���
public class AcademyApp {
	public static void main(String[] args) {
		//��ġ�� ������ ���� ������ ���� �̷��� �����ϱ⺸��,
		/*AcademyStudent[] student = new AcademyStudent[300];
		//��ü�� �����Ѱ��� �ƴ϶�, �����Ҹ� �����
		AcademyInstructor[] instructor = new AcademyInstructor[50];
		AcademyStaff[] staff = new AcademyStaff[100];*/
		
		//�п��� �����ڿ�����(�л�, ����, ����)�� ������ �� �ִ� �迭�� �����.
		//�θ�Ŭ������ AcademyPerson�� �ڷ����� ���������� �ڽ�Ŭ������ �ν��Ͻ��� �����
		AcademyPerson[] person = new AcademyPerson[5];//�θ��� ������ ���� ���Ե�
		person[0] = new AcademyStudent(2500,"ȫ�浿", "�������� ����");
		person[1] = new AcademyStudent(2501,"����", "�������� ����");
		person[2] = new AcademyStudent(2502,"��ö��", "������ ���� ����");
		person[3] = new AcademyInstructor(3100,"�Ӳ���", "����Ŭ ���� ����");
		person[4] = new AcademyStaff(3000, "����ġ", "����������");
		
		
		for(AcademyPerson persons : person) {
			//instanceof��� ������ : ��Ӱ��踦 �����ϱ� ���� ������
			//����� : �������� instanceof Ŭ����(�ڽ�Ŭ����)
			//=>���������� �ڽ�Ŭ������ ����ȯ ������(��Ӱ��迡 �ִ�) ��� true�� ����
			//=>����� ��ü ����ȯ �ϱ� ���� ����ϴ� ������
			
			//(��Ӱ��谡 �ƴҶ� ����ȯ�� �� ���) : ClasscastException Error�� �߻��Ѵ�
			
			if(persons instanceof AcademyStudent) {
				System.out.println(((AcademyStudent)persons).getCourse() + " �� ��� �л� ���� : ");
			}else if(persons instanceof AcademyInstructor) {
				System.out.println(((AcademyInstructor)persons).getSubject() +" �� ����ġ�� ���� ���� : ");
			}else if(persons instanceof AcademyStaff) {
				System.out.println(((AcademyStaff)persons).getDepart() + " �� �ٹ��ϴ� ���� ���� : ");
			}
			
			//�޼ҵ� �������̵� ���� ���� ������ ��ü ����ȯ�� �Ͼ
			//������ ��ü ����ȯ�� �ڵ����� �θ� �ν��Ͻ��� ���õ� �ڽ� �ν��Ͻ��� ��ȯ�Ǿ�,
			//�ڽ��� �޼ҵ尡 ȣ��Ǿ� ����.
			//�ڡ��̰��� �������̵忡 ���� �������ڡ� : ���¿� ���� �ٸ����� ȣ��Ǿ����°�
			persons.display();
		}
	}
}
