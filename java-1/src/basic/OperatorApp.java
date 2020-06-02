package basic;

public class OperatorApp {
	public static void main(String[] args) {
		System.out.println(10+20*3);
		System.out.println((10+20) * 3);
		System.out.println("============");
		int a1 = 10;
		System.out.println("a1 = " + a1);
		System.out.println("-a1 = " + (-a1));

		System.out.println(20>10);
		System.out.println(!(20>10));
		
		int a2 = 10, a3 = 10;
		++a2;//연산식이 단독 명령일 경우 연산자의 위치는 아무런 영향을 주지 않음
		--a3;
		System.out.println(a2 +" " + a3);
		System.out.println("============");
		
		int a4 = 10;
		int a5 = 10;
		//연산식이 다른 명령과 같이 사용될 경우 연산자의 위치는 연산식에 영향을 줌
		int a6 = ++a4;//++명령 실행후 대입연산 명령실행
		int a7 = a5++;//대입명령 실행 후 ++명령실행
		System.out.println(a4 +" " + a5);
		System.out.println(a6 +" " + a7);
		System.out.println("============");
		
		int b1 = 20;
		int b2 =10;
		System.out.println(b1 % b2);
		System.out.println(b1 * b2);
		System.out.println(b1 - b2);
		System.out.println(b1 + b2);
		System.out.println("============");
		
		System.out.println(20 > 10);
		System.out.println(10 != 20);
		System.out.println(10 == 20);
		System.out.println(10 < 20);
		System.out.println(10 <= 20);
		System.out.println("============");
		
		int c = 20;
		System.out.println(c);
		System.out.println(c >= 10 && c <= 30);
		System.out.println(c < 10 || c > 30);
		System.out.println("============");

		int d = 20;
		int d1 = 10;
		//트루이면 ?뒤, false이면 : 뒤
		System.out.println(d >d1 ? d :d1);
		
		if(d > d1)
			System.out.println(d);
		else 
			System.out.println(d1);
		
		int e =10;
		System.out.println(e);
		System.out.println(e+=5);
		
		
		
		
	}
}
