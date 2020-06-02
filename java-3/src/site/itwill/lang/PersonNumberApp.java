package site.itwill.lang;

import java.util.Scanner;

//키보드로 주민등록번호를 입력받아 생년원ㄹ일, 성별을 구분하여 출력하는 프로그램
// 입력 : 주민등록번호는 14자리, 7번째 위치에 - 문자가 존재해야함 ->유효성 검사해야함
//=> 잘못된 형식의 주민번호가 입력될 경우, 에러메세지 출력 후, 재입력 받도록 한다.
//950311-2111111
//몇년생, 생년월일
public class PersonNumberApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록 번호를 입력해 주세요( - 를 반드시 포함하여 주시기 바랍니다.)");

		while (true) {
			String per_num = sc.nextLine();

			if (per_num.length() == 14 && per_num.indexOf("-") == 6) {

				// -----------------결과 분석------------------

				String tmp = per_num.substring(7, 8);
				String gender = "";

				if (Integer.parseInt(tmp) == 1 || Integer.parseInt(tmp) == 3) {
					gender = "남자";
					// System.out.println("[결과] 성별은 남자입니다.");
				} else if (Integer.parseInt(tmp) == 2 || Integer.parseInt(tmp) == 4) {
					gender = "여자";
					// System.out.println("[결과] 성별은 여자입니다.");

				}

				String old;

				if (tmp.equals("1") || tmp.equals("2")) {
					old = "19" + per_num.substring(0, 2);
				} else {
					old = "20" + per_num.substring(0, 2);
				}

				System.out.println(
						"[결과] " + per_num.substring(0, 2) + " 년 생으로 " + (2020 - Integer.parseInt(old) + 1) + "살 입니다.");
				System.out.println("[결과] 생일은 " + per_num.substring(3, 4) + " 월 " + per_num.substring(4, 6) + " 일 입니다.");
				System.out.println("[결과] 성별은 " + gender + "입니다.");

				break;
			}

			if (per_num.length() > 14) {
				System.out.println("길이가 14자리보다 깁니다.. 다시 입력해 주세요");

			} else if (per_num.length() > 6 && per_num.indexOf("-") != 6) {
				System.out.println("다시 입력해 주세요 - 를 포함하여 입력해 주세요.");

			} else if (per_num.length() < 14) {
				System.out.println("길이가 너무 짧습니다. 다시 입력해 주세요");
			}
		}

	}
}
