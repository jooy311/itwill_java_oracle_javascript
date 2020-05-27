package example;

import java.util.Scanner;

//컴퓨터로부터 제공된 정수난수를 키보드로 입력하여 맞추는 프로그램을 작성하세요.
// => 1~100 범위의 정수난수를 제공 받도록 작성
// => 난수를 맞출 수 있는 기회는 10번만 제공되도록 작성
// => 키보드 입력값이 1~100 범위가 아닌 경우 재입력(ok)

// => 난수와 입력값이 동일한 경우 입력횟수 출력 후 프로그램 종료
// => 난수와 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
// => 난수를 10번 안에 맞추지 못한 경우 난수 출력
public class UpAndDownExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int cnt; //난수를 맞출 수 있는 기회를 세기 위한 변수
		System.out.println("[GAME] 숫자를 맞춰주세요! 기회는 10번 입니다.");
		int computer = (int) (Math.random() * 100);
		// System.out.println(computer);

		for (int i = 1; i <= 10; i++) {
			int user;
			while (true) {
					System.out.println("[입력] 1~100범위의 정수를 입력해 주세요");
					user = sc.nextInt();// 사용자가 입력한 정수를 받는다
			
				if (user <= 100 && user >= 1) {
					break;// 제대로 입력한 경우
				}
				System.out.println("[에러] 범위를 벗어났습니다. 다시 입력해 주세요!");
			} //
			if (computer == user) { // 정답을 맞춘경우
				System.out.println("[정답] " + i + " 번 만에 정답을 맞추셨습니다.");
				break;
			} else if (computer > user) {
				System.out.println("[힌트] 조금 더 큰 값을 적어보세요");

			} else if (computer < user) {
				System.out.println("[힌트] 조금 더 작은 값을 적어보세요");
			}

		} // for문

		System.out.println("[종료] 주어진 기회 10번을 모두 사용하셨기 때문에 종료됩니다.");
	}
}
