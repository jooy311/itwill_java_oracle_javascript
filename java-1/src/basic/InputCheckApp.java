package basic;

import java.util.Scanner;

public class InputCheckApp {

	public static void main(String[] args) {
		// 키보드로 점수를 입력받아 학점을 계산하여 출력하는 프로그램을 작성하시오
		// 점수가 0-100범위의 정수값이 입력되지 않은 경우 메세지 출력 후 재입력을 받을 수 있도록 한다
		Scanner sc = new Scanner(System.in);
		
		
		int score ;//일단 점수를 받을 변수를 밖에다 선언한다
		while (true) {//무한 루프
			System.out.print("점수 입력 >> ");
			score = sc.nextInt();
			if (score < 0 || score > 100) {//범위 밖으로 나가게 된다면 오류 메세지 출력
				System.out.println("[Error : 범위오류] 0~100까지의 점수를 입력해주세요");
			}else {//범위안에 들어오면 break수행
				break;
			}
			
		}

		String grade;

		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";

		}

		System.out.println("[결과]" + score + "점 " + grade + "학점");
	}
}
