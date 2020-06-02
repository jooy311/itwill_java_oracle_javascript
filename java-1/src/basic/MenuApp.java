package basic;

import java.util.Scanner;

public class MenuApp {
	public static void main(String[] args) {
		// 키보드로 메뉴중 하나를 입력받아 선택메뉴에 대한 기능을 제공하는 프로그램을 작성하기
		// ->프로그램 종료 메뉴를 선택하기 전까지 사용자에게 원하는 기능을 계속 제공한다
		// 선택메뉴가 존재하지 않을 경우 에러메세지 출력 후 재입력

		Scanner sc = new Scanner(System.in);

		while (true) {
			// 메뉴 출력
			System.out.println();
			System.out.println("1. 학생 정보 입력 >> ");
			System.out.println("2. 학생 정보 변경 >> ");
			System.out.println("3. 학생 정보 삭제 >> ");
			System.out.println("4. 학생 정보 검색 >> ");
			System.out.println("5. 프로그램 종료>> ");

			System.out.println("[주의] 메뉴는 1~5 중에서 골라주세요 >> ");
			int ch = sc.nextInt();
			
			if(ch <1 || ch >5) {
				System.out.println("[Error] 선택한 메뉴는 존재하지 않습니다.");
				continue;
			}
			
			if (ch == 5) {
				System.out.println("[종료] 프로그램이 종료됩니다.");
				break;
			}

			switch (ch) {
			case 1:
				System.out.println("[처리 결과] 학생정보를 저장하였습니다.");
				break;
			case 2:
				System.out.println("[처리 결과] 학생정보를 변경하였습니다.");
				break;
			case 3:
				System.out.println("[처리 결과] 학생정보를 삭제하였습니다.");
				break;
			case 4:
				System.out.println("[처리 결과] 학생정보를 검색하였습니다.");
				break;

			}

		}
		sc.close();

	}
}
