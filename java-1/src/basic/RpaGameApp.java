package basic;

import java.util.Scanner;

//가위바위보 게임 프로그램을 작성하기오
//컴퓨터(난수)와 게이머(키보드)가위바위보 대결을 하도록 할것임
//게이머가 이길경우 대결을 반복실행하고, 질 경우에는 게임은 종료
//게임이 종료된 후 게이머가 이긴 횟수를 출력
public class RpaGameApp {
	public static void main(String[] args) {
		
		int cnt = 0;//이긴횟수를 출력하기 위한 변수
		
		Scanner sc = new Scanner(System.in);

		//가위바위보 대결을 반복실행
		while(true) {
			//컴퓨터에게 가위바위보 중 하나를 제공받아 저장 > 난수(1-3)
			//가위 :1, 바위:2, 보:3
			int computer = ((int) (Math.random()*10) % 3 +1);
			
			//게이머에게 가위바위보중 하나를 제공받아 저장 > 키보드로 입력
			//1-3정수값이 아닌경우 재입렬되도록 함
			int gamer;
			while(true) {
				System.out.println("가위바위보 입력 >> 가위=1, 바위=2, 보=3");
				gamer = sc.nextInt();
				
				if(gamer >=1 || gamer <= 3) break;
					System.out.println("[error] 범위 안의 값을 입력해주세요");
					
			}
			//컴퓨터와 게이머가 제공한 가위바위보를 출력
			System.out.print("[입력] 컴퓨터 : ");
			if(computer == 1) System.out.print("가위");
			else if(computer == 2) System.out.print("바위");
			else if(computer == 3) System.out.print("보");
			
			System.out.println();
			
			//컴퓨터와 게이머의 승패유무를 판단하여 결과를 출력
			//->게이머가 이긴경우 연승 횟수 증가 >> 재대결
			//->게이머가 진 경우 반복문 종료
			if(computer == gamer) {
				System.out.println("[결과] 컴퓨터와 게이머가 비겼습니다.");
			}else if((computer == 1 && gamer == 2) || (computer == 2 && gamer == 3) || (computer == 3 && gamer == 1)) {
				cnt++;
				System.out.println("게이머가 이겼습니다.");
			}else {
				System.out.println("게이머가 졌습니다.");
				break;
			}
			
		}
		System.out.println();
		if(cnt == 0) {
			System.out.println("게이머가 컴퓨터에게 한번도 이기지 못했습니다...");
		}else {
			System.out.println("게이머가 컴퓨터에게 " + cnt +" 번 이겼습니다.");
		}
	}
}
