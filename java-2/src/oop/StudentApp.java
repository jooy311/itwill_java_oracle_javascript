package oop;

public class StudentApp {
	//클래스를 만들면 클래스의 이름을 가지고 접근하는 메인메소드
	//
	public static void main(String[] args) {//클래스를 가지고 접근해야함해야함 
		/*
		Student st = new Student(90, 96, "이주영", "201585028");
		Student st1 = new Student(80, 88, "홍길동", "201585024");
		Student st2 = new Student(94, 74, "임꺽정", "201585022");
		Student st3 = new Student(77, 89, "전우치", "201585020");
		Student st4 = new Student(93, 98, "전우치", "201585018");

		// 이렇게 하기보다 생성자 자체에 메소드를 셋팅해 놓으면 이렇게 일일이 선언 엑스
		/*
		 * st.calcTot(); st1.calcTot(); st2.calcTot(); st3.calcTot(); st4.calcTot();
		 

		st.setKor(100); // 생성자에 caltot 호출을 해놓으면이렇게 점수가 바뀌어서 다시 set하면 갱신이 안됨
		// 따라서 set메소드에도 호출해 놓아야함

		st.display();
		st1.display();
		st2.display();
		st3.display();
		st4.display();
		System.out.println("=========================================");

		// 인스턴스를 저장할 수 있는 참조요소들이 존재하는 배열 생성
		// ->배열의 참조요소에는 null이 들어감
		Student[] sts = new Student[5];

		// 인스턴스를 생성하여 참조 요소에 저장
		sts[0] = new Student(90, 96, "이주영", "201585028");
		sts[1] = new Student(80, 88, "홍길동", "201585024");
		sts[2] = new Student(94, 74, "임꺽정", "201585022");
		sts[3] = new Student(77, 89, "전우치", "201585020");
		//sts[4] = new Student(93, 98, "전우치", "201585018");

		for (int i = 0; i < sts.length; i++) {
			if (sts[i] != null) {//nullpointerexception 에러를 방지하기 위함
				sts[i].display();
			}
		}
		System.out.println("=========================================");
		int sum = 0;
		
		for(Student a : sts ) {
			if (a != null) {//nullpointerexception 에러를 방지하기 위함
				a.display();
				//sum += a.getTot();
				//정적메소드는 클래스를 이용하여 호출
				Student.setTotal(Student.getTotal()+ a.getTot());
			}
		}
		System.out.println("=========================================");
		
		//모든 학생의 총점을 계산해서 출력하고 싶을 때
		System.out.println("총 합계 = " + Student.getTotal() );
		
		System.out.println("=========================================");
		*/
		
		
	}
}
