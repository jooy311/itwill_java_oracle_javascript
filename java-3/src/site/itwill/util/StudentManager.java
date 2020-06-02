package site.itwill.util;

import java.util.ArrayList;
import java.util.List;

//학생정보를 관리(저장, 변경, 삭제, 검색)하기 위한 기능을 제공하는 클래스
//=>BO(business object)클래스 or manager클래스 라고 한다.
public class StudentManager {
	
	//다수의 학생정보를 저장하기 위한 콜렉션 필드를 만든다.
	//=> 클래스 내부에서만 사용하기 위한 필드(시스템필드)
	private List<Student> _studentList; //시스템필드라는 말!(setter,getter x)
	

	public StudentManager() {
		_studentList = new ArrayList<Student>();
	}
	
	
	
	/******인덱스를 반환하는 메소드******/
	
	//학번을 전달받아 콜렉션 필드에 저장된 해당 학생정보의 첨자를 반환하는 메소드
	//=>해당학번의 학생정보가 존재하지 않는 경우, -1을 반환
	//=>클래스 내부에서만 접근 가능하도록 은닉화처리
	private int getStudentIndex(int num) {
		int index = -1;
		for(int i = 0; i < _studentList.size(); i++) {
			//전달받은 학번과 같은 학번의 학생정보가 존재할 경우 해당첨자를 저장한다.
			if(_studentList.get(i).getNum() == num) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	
	/******데이터를 추가하는 메소드******/
	
	//학생정보를 전달받아 Collections필드에 저장(추가)하는 메소드
	//=>전달받은 학생정보가 콜렉션 필드에 저장되지 않을경우 false를 반환
	//=> 저장될 경우 true를 반환한다.
	//=> 전달받은 학생정보의 학번이 이미 컬렉션 필드에 저장된 경우, 미저장되지 않도록 처리
	public boolean insertStudent(Student student) {
		if(getStudentIndex(student.getNum()) != -1) {//존재하지 않는다면
			return false;//flase반환
		}
		_studentList.add(student);
		return true;
	}
	
	//학생정보를 전달받아 콜렉션 필드에 저장된 학생정보를 변경하는 메소드
	// => 전달받은 학생정보가 변경되지 않을 경우 false를 반환
	//-> 변경될 경우 true를 반환
	//=>전달받은 학생정보의 학번이 콜레션필드에 저자오디어 있지 않을 경우 미변경
	public boolean updateStudent(Student student) {
		int index = getStudentIndex(student.getNum());
		if(index == -1) return false; //학생이 없다.
		_studentList.set(index, student);
		return true;
	}
	
	
	//전달받은 학생정보를 전달받아 콜레션필드에 저장된 학생정보를 삭제하는 메소드
	//=>전달받은 학번의 학생저오가 삭제되지 않을경우 false반환
	//=>삭제될경우 true반환
	//=>전달받은 학생정보가 콜레션 필드에 저장되어 있지 않을 경우 삭제되지 않도록 삽입
	public boolean deleteStudent(int num) {
		int index = getStudentIndex(num);
		if(index == -1) {
			return false;
		}
		_studentList.remove(index);
		return true;
	}
	
	//학번을 전달받아 콜렉션필드에 저장된 학생정보를 검색하여 반환하는 메소드
	//=> 저장되어 있지 않은 경우 null반환
	//=> 저장되어 있는 경우 해당 학생 정보 반환
	public Student selectStudent(int num) {
		int index = getStudentIndex(num);
		if(index == -1) {
			return null;
		}
		return _studentList.get(index);
	}
	
	
	//콜렉션 필드에 저장된 모든 학생정보를 반환하는 메소드
	public List<Student> selectAllStudent(){
		return _studentList;
	}
}
