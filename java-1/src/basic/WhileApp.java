package basic;

public class WhileApp {
	public static void main(String[] args) {
		int i =1;
		while(i<=5) {
			System.out.println("Java Programming");
			i++;
		}
		System.out.println("=============================");
		
		int j=1, tot = 0;
		
		do {
			tot += j;
			j++;
		}while(j <=100);
		System.out.println(tot);
		
		System.out.println("=============================");
		
		//a4용지를 반으로 계속 접어 펼쳤을 경우 사각형 모양이 500개 이상이
		//만들어 지려면 몇번 접어야 하니? -> 몇번접으라는 말이 없으니, while하는게 낫다
		int cnt = 0;//접는 횟수를 저장하기 위한 변수
		int a4 = 1;
		while( a4 <=500) {
			a4 *=2;
			cnt++;
		}
		System.out.println(cnt + "번 접으면 " + a4 + "개의 사각형이 만들어짐");
		
		System.out.println("=============================");
		
		//x범위의 정수들의 합계가 300이상이 되려면 x가 얼마인지 출력하라
		int sum = 0; int x = 0;
		while(sum < 300) {
			x++;
			sum += x;
		}
		System.out.println("합계가 300이상 되려면 x는 "+ x + "가 되어야 합니다.");
	}
}
