package basic;

public class ForApp {
	public static void main(String[] args) {
		//java programming을 화면에 출력
		//System.out.println("java programming");
		for(int i = 0; i < 5; i++) {
			System.out.println("java programming");			
		}
		
		for(int i =1 ; i<10; i+=2) {
			System.out.print(i + "\n");
		}
		
		int sum = 0;
		
		for(int i=1; i <=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int begin = 80, end = 30;
//		if(begin > end) {
//			System.out.println("[에러] 시작값이 마지막값보다 작아야합니다.");
//			System.exit(0);
//		}
		
		//저장된 정수값을 서로 바꾸어 저장 = 치환 알고리즘
		int tmp;
		if(begin > end) {
			System.out.println("[경고!] 시작값이 마지막값보다 작아야하므로 서로 바꿉니다.");
			tmp = begin;
			begin = end;
			end = tmp;
		}
		
		int sum1 = 0;
		
		for(int i = begin; i<=end; i++) {
			sum1 += i;
		}
		
		for(int i=1,j=5; i<=3; i++,j--) {
			System.out.println("i= " + i + " , j = " + j);
		}
		System.out.println(sum1);
		
		int i = 1;
		for(; i<=4; i++) {
			System.out.println(i);
		}
		for(; i>=1; i--) {
			System.out.println(i);
		}
		//조건식이 생략된경우 무조건 참으로 처리가 됨->무한루프를 반복할때 사용함
		//무한 루프를 쓰고 밑에 명령문을 적으면 인식을 못함
		//for(;;) {
			
		//}
			
	}
}
