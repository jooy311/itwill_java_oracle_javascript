package basic;

public class ContinueApp {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			if(i == 3)continue;
			//continue 는 반복문의 명령을 처음부터 다시 실행하도록 하는 키워드임
			//키워드 아래의 명령문을 생략함
			System.out.println("i =  "+ i);
		}
		System.out.println("==================");
		loop : 
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==3) continue loop;
				System.out.println("i = " + i + " , j = " + j);
			}
			
		}
		System.out.println("==================");
	}
}
