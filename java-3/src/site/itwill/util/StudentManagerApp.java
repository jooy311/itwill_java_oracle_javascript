package site.itwill.util;

import java.util.Collections;
import java.util.List;

//�л����� ���� ���α׷�
public class StudentManagerApp {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		
		//�л������� �����Ͽ� �����ü(�ݷ��� �ʵ�)�� ����
		manager.insertStudent(new Student(1000, "ȫ�浿"));
		manager.insertStudent(new Student(2000, "�Ӳ���"));
		manager.insertStudent(new Student(3000, "����ġ"));
		manager.insertStudent(new Student(4000, "����"));
		
		boolean result = manager.insertStudent(new Student(5000, "ȫ���"));
		
		if(result) {
			System.out.println("[�޼���] ���������� ����Ǿ����ϴ�.");
		}else {
			System.out.println("[�޼���] �̹� ������� �й��̹Ƿ�, ������� �ʾҽ��ϴ�.");
		}
		System.out.println("=========================================");
		
		
		//����� �л����� �� �й��� 2000�� �л������� �˻��Ͽ� ���		
		Student findStudent = manager.selectStudent(2000);
		if(findStudent == null) {
			System.out.println("[�޼���] �ش� �й��� �л������� ã�� �� �����ϴ�.");
		}else {
			System.out.println(findStudent);
		}
		System.out.println("=========================================");
		
		
		//�й��� 2000�� �л��� �̸��� [�Ӱ���]���� ���� 
		findStudent.setName("�Ӱ���");
		if(manager.updateStudent(findStudent)) {
			System.out.println("�л������� ���������� �����Ͽ����ϴ�.");
			
		}else {
			System.out.println("[�޼���] �����ϰ��� �ϴ� �й��� �л������� ã�� �� �����ϴ�.");
		}
		System.out.println("=========================================");
		
		
		//�й��� 4000�� �л������� �����Ѵ�.
		if(manager.deleteStudent(4000)) {
			System.out.println("[�޼���] �ش� �й��� �л������� �����Ͽ����ϴ�.");
		}else {
			System.out.println("[�޼���] �����ϰ��� �ϴ� �й��� �л������� ã�� �� �����ϴ�.");
		}
		
		System.out.println("=========================================");
		
		List<Student> studentList = manager.selectAllStudent();
		for(Student student : studentList) {
			System.out.println(student);
		}
		
		System.out.println("=========================================");
		
		//������ ������ �񱳸� �ؾ��ϴ��� �𸣱� ������ �Ʒ��� ���� �ϸ� �ȵ�
		Collections.sort(studentList);
		
		
		for(Student student : studentList) {
			System.out.println(student);
		}
	}
}
