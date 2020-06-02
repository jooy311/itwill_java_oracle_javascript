package site.itwill.util;

import java.util.Random;
import java.util.Scanner;

//숫자야구게임 : 정수난수(0~9)를 3개 생성하여 키보드로 입력해 맞추는 게임
// => 난수와 입력값은 3개 정수값으로 서로 틀리며 0으로 시작되서는 안된다.
// => 난수와 입력값에 같은 정수값이 존재할 때 위치가 같으면 스트라이크, 다르면 볼로 계산하여 출력
// => 스트라이크가 3개면 성공 메세지 출력 후 프로그램 종료
// => 입력기회는 15번을 제공하며 맞추지 못한 경우 정답(난수) 출력
// => 입력값이 형식에 맞지 않을 경우 재입력(입력횟수 미증가)
public class BaseBallApp {
	public static void main(String[] args) {
		//0~9 범위의 난수 3개를 저장하기 위한 배열 선언
		int[] dap=new int[3];
		
		Random random=new Random();
		//규칙에 맞는 난수를 배열 요소에 저장
		while(true) {
			for(int i=0;i<dap.length;i++) {
				dap[i]=random.nextInt(10);
			}
			if(dap[0]!=0 && dap[0]!=dap[1] && dap[1]!=dap[2] && dap[2]!=dap[0]) break;
		}
		
		Scanner scanner=new Scanner(System.in);
		
		//정답 상태 정보를 저장하기 위한 변수
		boolean result=false;
		
		//입력 기회 제공 - 입력에 대한 결과 출력
		for(int cnt=1;cnt<=15;cnt++) {
			//스트라이크와 볼을 저장하기 위한 변수 선언
			int strike=0,ball=0;
			
			//입력값을 저장하기 위한 배열 선언
			int[] num=new int[3];
			
			//규칙에 맞는 입력값을 배열에 저장
			loop:
			while(true) {
				System.out.print(cnt+"번째 입력 >> ");
				String input=scanner.nextLine();
				
				if(input.length()!=3) {
					System.out.println("[에러]3자리의 숫자만 입력 가능합니다.");
					continue;
				}
				
				for(int i=0;i<num.length;i++) {
					//Unicode - '0':48 ~ '9':57
					//ex) '4'-'0' >> 52-48 >> 4
					num[i]=input.charAt(i)-'0';
					
					if(num[i]<0 || num[i]>9) {
						System.out.println("[에러]숫자만 입력 가능합니다.");
						continue loop;
					}
				}
				
				if(num[0]!=0 && num[0]!=num[1] && num[1]!=num[2] && num[2]!=num[0]) break;
				
				System.out.println("[에러]0으로 시작되거나 중복된 숫자가 존재합니다.");	
			}//while문 끝
			
			//난수값과 입력값을 비교하여 스트라이크와 볼 계산
			for(int i=0;i<dap.length;i++) {//난수값에 대한 배열 요소의 첨자
				for(int j=0;j<num.length;j++) {//입력값에 대한 배열 요소의 첨자
					if(dap[i]==num[j]) {//난수값과 입력값이 같은 경우
						//요소의 첨자가 같은 경우 >> 위치가 같은 경우
						if(i==j) strike++;
						else ball++;
					}
				}
			}
			
			if(strike==3) {
				System.out.println("[메세지]축하합니다."+cnt+"번만에 맞췄습니다.");
				result=true;
				break;
			}
			
			System.out.println("[결과]"+strike+"스트라이크 "+ball+"볼");
		}//for문끝
		
		//정답을 맞추지 못한 경우
		if(!result) {
			System.out.print("정답을 못 맞췄군요. 바보!!! 정답은[");
			for(int su:dap) {
				System.out.print(su);
			}
			System.out.println("]입니다.");
		}
		
		scanner.close();
	}
}








