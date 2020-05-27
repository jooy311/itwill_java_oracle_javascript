package inheritance;

//�п� �����ڿ�(�л�,����,����) ���� ���α׷� �ۼ�
public class AcademyApp {
	public static void main(String[] args) {
		/*
		//�л������� �����ϱ� ���� �迭 ����
		AcademyStudent[] students=new AcademyStudent[300];
		//���������� �����ϱ� ���� �迭 ����
		AcademyInstructor[] instructors=new AcademyInstructor[50];
		//���������� �����ϱ� ���� �迭 ����
		AcademyStaff[] staffs=new AcademyStaff[100];
		*/
		
		//�п� �����ڿ�����(�л�,����,����)�� �����ϱ� ���� �迭 ����
		AcademyPerson[] persons=new AcademyPerson[5];
		
		//�迭�� �������(AcademyPerson Ŭ����)�� �ڽ� �ν��Ͻ�(AcademyStudent Ŭ����
		//, AcademyInstructor Ŭ����, AcademyStaff Ŭ����)�� �����Ͽ� ����
		persons[0]=new AcademyStudent(1000, "ȫ�浿", "�� ������ ����");
		persons[1]=new AcademyInstructor(2000, "�Ӳ���", "JSP ����");
		persons[2]=new AcademyStaff(3000, "����ġ", "����������");
		persons[3]=new AcademyStudent(4000, "����", "�� ������ ����");
		persons[4]=new AcademyInstructor(5000, "ȫ�淡", "HTML ����");
	
		for(AcademyPerson person:persons) {
			//instanceof ������ : Ŭ������ ��Ӱ��踦 �����ϱ� ���� ������
			//����) �θ��������� instanceof �ڽ�Ŭ����
			// => ���������� �ڽ�Ŭ������ ����ȯ ������ ��� true ����
			// => ����� ��ü ����ȯ ���� ����ϴ� ������
			//����� ��ü ����ȯ�� �߸��� ��� ClassCastException �߻�
			// => ��Ӱ��谡 �ƴ� Ŭ������ ����ȯ �� ���
			if(person instanceof AcademyStudent) {
				System.out.println(((AcademyStudent)person).getCourse()
					+"�� �л����� >> ");
			} else if(person instanceof AcademyInstructor) {
				System.out.println(((AcademyInstructor)person).getSubject()
					+"�� �������� >> ");
			} else if(person instanceof AcademyStaff) {
				System.out.println(((AcademyStaff)person).getDepart()
					+"�� �������� >> ");
			}
			
			//�޼ҵ� �������̵� ���� ���� ������ ��ü ����ȯ�� �߻��Ǿ�
			//�θ� �ν��Ͻ��� �޼ҵ� ��� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
			//������ ��ü ����ȯ�� �ڵ����� �θ� �ν��Ͻ��� ��� �����
			//������ �ڽ� �ν��Ͻ��� ��ȯ�Ǿ� �޼ҵ� ȣ�� 
			// => �������̵忡 ���� ������ ����
			person.display();
			System.out.println("===================================");
		}
	}
}













