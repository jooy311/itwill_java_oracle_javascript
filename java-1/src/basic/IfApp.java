package basic;

public class IfApp {
	public static void main(String[] args) {
		int su = 40;
		// 변수가 50이상인경우만 출력
		if (su > 50) {
			System.out.println("su = " + su);
		}
		System.out.println("===================================");

		// 점수가 60점 이상인 경우 합격메세지를 출력 , 미만인 경우는 불합 메세지출력
		int score = 80;
		
		if (score >= 60) {
			System.out.println("점수가 60점 이상이므로 합격입니다.");
		} else {
			System.out.println("점수가 60점 미만이므로 불합격입니다.");
		}
		System.out.println("===================================");
		
		int num = 9;
		//변수값을 홀수와 짝수로 구분하여 출력
		if(num % 3 == 0) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
		System.out.println("===================================");
		
		
		char ch = 'O';
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("영대문자 입니다.");
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("영소문자 입니다.");
		}else {
			System.out.println("영문자가 아닙니다.");		
			}
		System.out.println("===================================");
		
		int jumsu = 85;
		// 변수값이 0~100범위의 유효한 값인지를 검사하여 출력
		//유효값이 입력된 경우 학점을 계산하여 출력
		if(jumsu >= 0 && jumsu <=100) {
			//System.out.println("[결과] 정상적인 값이 입력되었습니다.");
			//점수에 따른 학점을 계산하여 출력
			//100~90 a , 80~90 : b, 10단위로 f까지
			char grade;
			
			if(jumsu >= 90) grade = 'A';
			else if(jumsu >= 80) grade = 'B';
			else if(jumsu >= 70) grade = 'C';
			else if(jumsu >= 60) grade = 'D';
			else grade = 'F';
			
			System.out.println("[결과] " +jumsu +"점 >> " + grade + "학점");
		
		}else {
			System.out.println("[결과] 범위를 벗어난 값이 입력되었습니다.");
						
		}
		System.out.println("===================================");
		
		int choice = 4;
		//제어문에서 변수에 값을 저장하는 명령을 작성할 경우 초기화 발생가능
		//모든 조건이 실행되지않을 수도 있으므로
		//무조건적인 값을 실행하여 값을 저장한다
		//->값을 저장하는 변수 선언시, 초기값을 설정해주는것이 가장 좋다
		//숫자형은 보통 0, 논리형은 false, 참조형은 null
		String name = "";
		if(choice == 1) {
			name = "홍길동";
		}else if(choice == 2) {
			name = "임꺽정";
		}//else name = "둘리";
		
		System.out.println("[결과] 당신이 선택한 사람은 " + name + "입니다.");
		System.out.println("===================================");
		
		boolean flag = false;
		
		if(flag == true) System.out.println("[결과]");
		
		
		
	}
}
