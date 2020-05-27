package oop;

public class StudentApp {
	public static void main(String[] args) {
		/*
		Student student1=new Student("1000", "ȫ�浿", 90, 96);
		Student student2=new Student("2000", "�Ӳ���", 94, 88);
		Student student3=new Student("3000", "����ġ", 92, 80);
		Student student4=new Student("4000", "����", 76, 82);
		Student student5=new Student("5000", "ȫ�淡", 84, 86);
		
		//student1.calcTot();
		//student2.calcTot();
		//student3.calcTot();
		//student4.calcTot();
		//student5.calcTot();
		
		student1.setKor(100);
		//student1.calcTot();
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
		*/
		
		//�ν��Ͻ��� ������ �� �ִ� ������Ұ� ������ �����ϴ� �迭 ����
		// => �迭�� ������ҿ��� null �ڵ� ����
		Student[] students=new Student[5];
		
		//�ν��Ͻ��� �����Ͽ� �迭�� ������ҿ� ����
		students[0]=new Student("1000", "ȫ�浿", 90, 96);
		students[1]=new Student("2000", "�Ӳ���", 94, 88);
		students[2]=new Student("3000", "����ġ", 92, 80);
		students[3]=new Student("4000", "����", 76, 82);
		students[4]=new Student("5000", "ȫ�淡", 84, 86);
		
		//�ϰ�ó���� �̿��� �޼ҵ� ȣ��
		/*
		for(int i=0;i<students.length;i++) {
			//������ҿ� ����� ������ null�� �ƴ� ���
			if(students[i]!=null) {//NullPointerException ����
				students[i].display();
			}
		}
		*/
		
		//int total=0;//�л� ���� �հ踦 �����ϱ� ���� ����
		
		for(Student student:students) {
			student.display();			
			//total+=student.getTot();
			//���� �޼ҵ�� Ŭ������ �̿��Ͽ� ȣ��
			Student.setTotal(Student.getTotal()+student.getTot());
		}
		System.out.println("=======================================");
		//��� �л����� ���� �հ� ���
		//System.out.println("���հ� = "+total);
		System.out.println("���հ� = "+Student.getTotal());
		System.out.println("=======================================");
	}
}













