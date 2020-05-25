package example;

import java.util.Scanner;

//키보드로 정수를 입력받아 1~9 범위의 정수를 곱한 결과를 출력하는 프로그램을 작성하세요.
//단, 입력된 정수는 2~9 범위의 정수만 허용하며 범위 밖의 정수를 입력한 경우 메세지 출력 후 재입력
//ex) 단 입력[2~9] >> 7
//    7 * 1 = 7
//    7 * 2 = 14
//    ...
//    7 * 9 = 63
public class GugudanExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		while (true) {
			System.out.print("단을 입력해 주세요[2~9범위에서 가능] >> ");
			dan = sc.nextInt();// 입력받는다
			if (dan <= 9 && dan >= 2) {
				break;// 제대로 입력한경우
			}
			System.out.println("[에러] 범위를 벗어났습니다. 다시 입력해 주세요!");

		}

		for (int j = 1; j <= 9; j++) {
			System.out.println(dan + " * " + j + " = " + dan * j);
		}

	}
}
