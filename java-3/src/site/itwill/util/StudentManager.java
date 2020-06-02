package site.itwill.util;

import java.util.ArrayList;
import java.util.List;

//�л������� ����(����, ����, ����, �˻�)�ϱ� ���� ����� �����ϴ� Ŭ����
//=>BO(business object)Ŭ���� or managerŬ���� ��� �Ѵ�.
public class StudentManager {
	
	//�ټ��� �л������� �����ϱ� ���� �ݷ��� �ʵ带 �����.
	//=> Ŭ���� ���ο����� ����ϱ� ���� �ʵ�(�ý����ʵ�)
	private List<Student> _studentList; //�ý����ʵ��� ��!(setter,getter x)
	

	public StudentManager() {
		_studentList = new ArrayList<Student>();
	}
	
	
	
	/******�ε����� ��ȯ�ϴ� �޼ҵ�******/
	
	//�й��� ���޹޾� �ݷ��� �ʵ忡 ����� �ش� �л������� ÷�ڸ� ��ȯ�ϴ� �޼ҵ�
	//=>�ش��й��� �л������� �������� �ʴ� ���, -1�� ��ȯ
	//=>Ŭ���� ���ο����� ���� �����ϵ��� ����ȭó��
	private int getStudentIndex(int num) {
		int index = -1;
		for(int i = 0; i < _studentList.size(); i++) {
			//���޹��� �й��� ���� �й��� �л������� ������ ��� �ش�÷�ڸ� �����Ѵ�.
			if(_studentList.get(i).getNum() == num) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	
	/******�����͸� �߰��ϴ� �޼ҵ�******/
	
	//�л������� ���޹޾� Collections�ʵ忡 ����(�߰�)�ϴ� �޼ҵ�
	//=>���޹��� �л������� �ݷ��� �ʵ忡 ������� ������� false�� ��ȯ
	//=> ����� ��� true�� ��ȯ�Ѵ�.
	//=> ���޹��� �л������� �й��� �̹� �÷��� �ʵ忡 ����� ���, ��������� �ʵ��� ó��
	public boolean insertStudent(Student student) {
		if(getStudentIndex(student.getNum()) != -1) {//�������� �ʴ´ٸ�
			return false;//flase��ȯ
		}
		_studentList.add(student);
		return true;
	}
	
	//�л������� ���޹޾� �ݷ��� �ʵ忡 ����� �л������� �����ϴ� �޼ҵ�
	// => ���޹��� �л������� ������� ���� ��� false�� ��ȯ
	//-> ����� ��� true�� ��ȯ
	//=>���޹��� �л������� �й��� �ݷ����ʵ忡 ���ڿ���� ���� ���� ��� �̺���
	public boolean updateStudent(Student student) {
		int index = getStudentIndex(student.getNum());
		if(index == -1) return false; //�л��� ����.
		_studentList.set(index, student);
		return true;
	}
	
	
	//���޹��� �л������� ���޹޾� �ݷ����ʵ忡 ����� �л������� �����ϴ� �޼ҵ�
	//=>���޹��� �й��� �л������� �������� ������� false��ȯ
	//=>�����ɰ�� true��ȯ
	//=>���޹��� �л������� �ݷ��� �ʵ忡 ����Ǿ� ���� ���� ��� �������� �ʵ��� ����
	public boolean deleteStudent(int num) {
		int index = getStudentIndex(num);
		if(index == -1) {
			return false;
		}
		_studentList.remove(index);
		return true;
	}
	
	//�й��� ���޹޾� �ݷ����ʵ忡 ����� �л������� �˻��Ͽ� ��ȯ�ϴ� �޼ҵ�
	//=> ����Ǿ� ���� ���� ��� null��ȯ
	//=> ����Ǿ� �ִ� ��� �ش� �л� ���� ��ȯ
	public Student selectStudent(int num) {
		int index = getStudentIndex(num);
		if(index == -1) {
			return null;
		}
		return _studentList.get(index);
	}
	
	
	//�ݷ��� �ʵ忡 ����� ��� �л������� ��ȯ�ϴ� �޼ҵ�
	public List<Student> selectAllStudent(){
		return _studentList;
	}
}
