package basic;

public class BreakApp {
	public static void main(String[] args) {
		
		//조건식이 거짓이 ㄴ경우 반복문 종료
		for(int i=1; i<=5; i++) {
			if(i==3) break;//반복문을 강제로 종료하는 명령
			System.out.println("i = " + i);
		}
		System.out.println("==================");
		//반복문의 라벨(식별자)부여 콜론으로!! 라벨은 브레이크 뒤에 가능
		loop : for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==3) break loop;
				System.out.println("i = " + i + " , j = " + j);
			}
		}
		System.out.println("==================");
		int cnt = 0;
		int gae = 1;
		while(true) {
			cnt++;
			gae*=2;
			if(gae > cnt) break;
		}
		
		while(true) {
			
		}
	}
}
