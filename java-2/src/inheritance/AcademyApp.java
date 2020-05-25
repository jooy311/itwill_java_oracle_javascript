package inheritance;

//학원 인적 자원(학생, 강사, 직원)관리 프로그램
//오버라이드가 안된것은 명시적 객체 형변환을 해야함
public class AcademyApp {
	public static void main(String[] args) {
		//겹치는 정보가 많기 때문에 굳이 이렇게 선언하기보다,
		/*AcademyStudent[] student = new AcademyStudent[300];
		//객체를 생성한것이 아니라, 저장요소를 만든것
		AcademyInstructor[] instructor = new AcademyInstructor[50];
		AcademyStaff[] staff = new AcademyStaff[100];*/
		
		//학원의 인적자원정보(학생, 강사, 직원)을 저장할 수 있는 배열을 만든다.
		//부모클래스인 AcademyPerson의 자료형인 참조변수를 자식클래스의 인스턴스로 만들면
		AcademyPerson[] person = new AcademyPerson[5];//부모의 정보가 먼저 들어가게됨
		person[0] = new AcademyStudent(2500,"홍길동", "웹개발자 과정");
		person[1] = new AcademyStudent(2501,"장길산", "웹디자인 과정");
		person[2] = new AcademyStudent(2502,"김철수", "빅데이터 개발 과정");
		person[3] = new AcademyInstructor(3100,"임꺽정", "오라클 개발 과정");
		person[4] = new AcademyStaff(3000, "전우치", "영업관리직");
		
		
		for(AcademyPerson persons : person) {
			//instanceof라는 연산자 : 상속관계를 구분하기 위한 연산자
			//사용방법 : 참조변수 instanceof 클래스(자식클래스)
			//=>참조변수가 자식클래스로 형변환 가능한(상속관계에 있는) 경우 true로 제공
			//=>명시적 객체 형변환 하기 전에 사용하는 연산자
			
			//(상속관계가 아닐때 형변환을 할 경우) : ClasscastException Error가 발생한다
			
			if(persons instanceof AcademyStudent) {
				System.out.println(((AcademyStudent)persons).getCourse() + " 을 듣는 학생 정보 : ");
			}else if(persons instanceof AcademyInstructor) {
				System.out.println(((AcademyInstructor)persons).getSubject() +" 을 가르치는 강사 정보 : ");
			}else if(persons instanceof AcademyStaff) {
				System.out.println(((AcademyStaff)persons).getDepart() + " 을 근무하는 직원 정보 : ");
			}
			
			//메소드 오버라이드 선언에 의해 묵시적 객체 형변환이 일어남
			//묵시적 객체 형변환은 자동으로 부모 인스턴스의 관련된 자식 인스턴스로 변환되어,
			//자식의 메소드가 호출되어 진다.
			//★★이것이 오버라이드에 의한 다형성★★ : 상태에 따라 다른것이 호출되어지는것
			persons.display();
		}
	}
}
