package oop;

public class StudentApp {
	public static void main(String[] args) {
		/*
		Student student1=new Student("1000", "홍길동", 90, 96);
		Student student2=new Student("2000", "임꺽정", 94, 88);
		Student student3=new Student("3000", "전우치", 92, 80);
		Student student4=new Student("4000", "장길산", 76, 82);
		Student student5=new Student("5000", "홍경래", 84, 86);
		
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
		
		//인스턴스를 저장할 수 있는 참조요소가 여러개 존재하는 배열 생성
		// => 배열의 참조요소에는 null 자동 저장
		Student[] students=new Student[5];
		
		//인스턴스를 생성하여 배열의 참조요소에 저장
		students[0]=new Student("1000", "홍길동", 90, 96);
		students[1]=new Student("2000", "임꺽정", 94, 88);
		students[2]=new Student("3000", "전우치", 92, 80);
		students[3]=new Student("4000", "장길산", 76, 82);
		students[4]=new Student("5000", "홍경래", 84, 86);
		
		//일괄처리를 이용한 메소드 호출
		/*
		for(int i=0;i<students.length;i++) {
			//참조요소에 저장된 정보가 null이 아닌 경우
			if(students[i]!=null) {//NullPointerException 방지
				students[i].display();
			}
		}
		*/
		
		//int total=0;//학생 총점 합계를 저장하기 위한 변수
		
		for(Student student:students) {
			student.display();			
			//total+=student.getTot();
			//정적 메소드는 클래스를 이용하여 호출
			Student.setTotal(Student.getTotal()+student.getTot());
		}
		System.out.println("=======================================");
		//모든 학생들의 총점 합계 출력
		//System.out.println("총합계 = "+total);
		System.out.println("총합계 = "+Student.getTotal());
		System.out.println("=======================================");
	}
}













