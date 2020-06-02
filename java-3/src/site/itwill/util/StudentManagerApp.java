package site.itwill.util;

import java.util.Collections;
import java.util.List;

//학생정보 관리 프로그램
public class StudentManagerApp {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		
		//학생정보를 생성하여 저장매체(콜렉션 필드)에 저장
		manager.insertStudent(new Student(1000, "홍길동"));
		manager.insertStudent(new Student(2000, "임꺽정"));
		manager.insertStudent(new Student(3000, "전우치"));
		manager.insertStudent(new Student(4000, "장길산"));
		
		boolean result = manager.insertStudent(new Student(5000, "홍경례"));
		
		if(result) {
			System.out.println("[메세지] 성공적으로 저장되었습니다.");
		}else {
			System.out.println("[메세지] 이미 사용중인 학번이므로, 저장되지 않았습니다.");
		}
		System.out.println("=========================================");
		
		
		//저장된 학생정보 중 학번이 2000인 학생정보를 검색하여 출력		
		Student findStudent = manager.selectStudent(2000);
		if(findStudent == null) {
			System.out.println("[메세지] 해당 학번의 학생정보를 찾을 수 없습니다.");
		}else {
			System.out.println(findStudent);
		}
		System.out.println("=========================================");
		
		
		//학번이 2000인 학생의 이름을 [임걱정]으로 변경 
		findStudent.setName("임걱정");
		if(manager.updateStudent(findStudent)) {
			System.out.println("학생정보를 성공적으로 변경하였습니다.");
			
		}else {
			System.out.println("[메세지] 변경하고자 하는 학번의 학생정보를 찾을 수 없습니다.");
		}
		System.out.println("=========================================");
		
		
		//학번이 4000인 학생정보를 삭제한다.
		if(manager.deleteStudent(4000)) {
			System.out.println("[메세지] 해당 학번의 학생정보를 삭제하였습니다.");
		}else {
			System.out.println("[메세지] 삭제하고자 하는 학번의 학생정보를 찾을 수 없습니다.");
		}
		
		System.out.println("=========================================");
		
		List<Student> studentList = manager.selectAllStudent();
		for(Student student : studentList) {
			System.out.println(student);
		}
		
		System.out.println("=========================================");
		
		//무엇을 가지고 비교를 해야하는지 모르기 때문에 아래와 같이 하면 안됨
		Collections.sort(studentList);
		
		
		for(Student student : studentList) {
			System.out.println(student);
		}
	}
}
