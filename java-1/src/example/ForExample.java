package example;

public class ForExample {
	public static void main(String[] args) {
		// 본인 이름을 화면에 7번 출력하세요.
		// ex) 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동
		for (int i = 1; i <= 7; i++)
			System.out.print("이주영 ");
		System.out.println();
		System.out.println("============================================");

		// 1~10 범위의 정수 중 짝수를 화면에 출력하세요.
		// ex) 2 4 6 8 10
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("============================================");

		// 1~100 범위의 정수에서 3의 배수 합계와 5의 배수 합계를 계산하여
		// 3의 배수 합계에서 5의 배수 합계를 뺀 결과를 계산하여 출력하세요.
		// ex) 결과 = 633
		int sum = 0;
		int ans = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				ans += i;
			}
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(ans - sum);

		System.out.println("============================================");

		// 구구단 중 7단을 화면에 출력하세요.
		// ex) 7 * 1 = 7
		// 7 * 2 = 14
		// ...
		// 7 * 8 = 56
		// 7 * 9 = 63
		for (int i = 7; i <= 7; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);

			}
		}

		System.out.println("============================================");

		// 5!의 결과값을 계산하여 출력하세요.(5! = 5 * 4 * 3 * 2 * 1)
		// ex) 5! = 120
		int res = 1;
		for (int i = 5; i > 0; i--) {
			res *= i;
		}
		System.out.println(res);

		System.out.println("============================================");

		// 두 변수에 저장된 정수값 사이의 정수들을 화면에 출력하세요.
		// 단, 한 줄에 정수값이 7개씩 출력되도록 작성하세요.
		// ex) 
		// 36 37 38 39 40 41 42
		// 43 44 45 46 47 48 49
		// 50 51 52 53 54 55 56
		// 57
		int begin = 36, end = 55;
		int cnt=0;
		for(int i= begin; i<=end; i++) {
			System.out.print(i + "\t");
			cnt++;
			if(cnt==7) {
				System.out.println();
				cnt = 0;
			}
		}
		System.out.println();
/*
		for(int i=1; i<=4; i++) {
			for(int j = 1; j<=7; j++) {
				System.out.print(begin++ + "\t");
				if(begin > end) break;
			}
			System.out.println();
			
		}*/
		
		System.out.println("============================================");

	}
}