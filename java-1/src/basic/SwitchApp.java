package basic;

public class SwitchApp {
	public static void main(String[] args) {
		int ch = 1;

		switch (ch) {
		case 1:
			System.out.println("수성으로 이동합니다");
		case 2:
			System.out.println("금성으로 이동합니다.");
		case 3:
			System.out.println("화성으로 이동합니다.");

		}
		System.out.println("============================");

		ch = 3;
		switch (ch) {
		case 1:
			System.out.println("수성으로 이동합니다");
			break;
		case 2:
			System.out.println("금성으로 이동합니다.");
			break;
		case 3:
			System.out.println("화성으로 이동합니다.");
			break;
		default:
			System.out.println("지구로 이동합니다.");// 무조건 실행되는 명령

		}
		System.out.println("============================");

		// 점수에 따른 학점을 출력
		int jumsu = 100;
		if (jumsu >= 0 && jumsu <= 100) {
			char grade;
			switch (jumsu / 10) {
			case 10:
				grade = 'A';
				break;
			case 9:
				grade = 'B';
			case 8:
				grade = 'C';
			case 7:
				grade = 'D';
			default:
				grade = 'F';

			}
			System.out.println(grade);
		}

		String kor = "둘";
		String eng = "";
		switch (kor) {
		case "하나":
			eng = "One";
			break;
		case "둘":
			eng = "Two";
			break;
		case "셋":
			eng = "Three";
			break;
		case "넷":
			eng = "Four";
			break;
		}
		System.out.println(kor + " " + eng);

	}
}
