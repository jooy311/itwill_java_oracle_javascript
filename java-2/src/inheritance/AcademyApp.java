package inheritance;

//학원 인적자원(학생,강사,직원) 관리 프로그램 작성
public class AcademyApp {
	public static void main(String[] args) {
		/*
		//학생정보를 저장하기 위한 배열 선언
		AcademyStudent[] students=new AcademyStudent[300];
		//강사정보를 저장하기 위한 배열 선언
		AcademyInstructor[] instructors=new AcademyInstructor[50];
		//직원정보를 저장하기 위한 배열 선언
		AcademyStaff[] staffs=new AcademyStaff[100];
		*/
		
		//학원 인적자원정보(학생,강사,직원)을 저장하기 위한 배열 선언
		AcademyPerson[] persons=new AcademyPerson[5];
		
		//배열의 참조요소(AcademyPerson 클래스)에 자식 인스턴스(AcademyStudent 클래스
		//, AcademyInstructor 클래스, AcademyStaff 클래스)를 생성하여 저장
		persons[0]=new AcademyStudent(1000, "홍길동", "웹 개발자 과정");
		persons[1]=new AcademyInstructor(2000, "임꺽정", "JSP 과목");
		persons[2]=new AcademyStaff(3000, "전우치", "영업관리팀");
		persons[3]=new AcademyStudent(4000, "장길산", "웹 디자인 과정");
		persons[4]=new AcademyInstructor(5000, "홍경래", "HTML 과목");
	
		for(AcademyPerson person:persons) {
			//instanceof 연산자 : 클래스의 상속관계를 구분하기 위한 연산자
			//형식) 부모참조변수 instanceof 자식클래스
			// => 참조변수가 자식클래스로 형변환 가능한 경우 true 제공
			// => 명시적 객체 형변환 전에 사용하는 연산자
			//명시적 객체 형변환을 잘못할 경우 ClassCastException 발생
			// => 상속관계가 아닌 클래스로 형변환 할 경우
			if(person instanceof AcademyStudent) {
				System.out.println(((AcademyStudent)person).getCourse()
					+"의 학생정보 >> ");
			} else if(person instanceof AcademyInstructor) {
				System.out.println(((AcademyInstructor)person).getSubject()
					+"의 강사정보 >> ");
			} else if(person instanceof AcademyStaff) {
				System.out.println(((AcademyStaff)person).getDepart()
					+"의 직원정보 >> ");
			}
			
			//메소드 오버라이드 선언에 의해 묵시적 객체 형변환이 발생되어
			//부모 인스턴스의 메소드 대신 자식 인스턴스의 메소드 호출
			//묵시적 객체 형변환은 자동으로 부모 인스턴스와 상속 관계로
			//설정된 자식 인스턴스로 변환되어 메소드 호출 
			// => 오버라이드에 의한 다형성 구현
			person.display();
			System.out.println("===================================");
		}
	}
}













