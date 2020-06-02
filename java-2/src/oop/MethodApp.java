package oop;

//실행이 목적인 클래스 : 프로그램 - 어플리케이션(Application)
// => 데스크탑 어플리케이션에서 main 메소드 선언 
public class MethodApp {
	public static void main(String[] args) {
		//객체를 생성하여 참조변수에 저장
		// => new 클래스명() : new 연산자와 생성자(Constructor)를 이용하여 객체를 생성
		// => 클래스명 참조변수 : 객체를 저장하기 하기 위한 변수 생성 - 참조변수를 이용하여 객체 요소에 접근
		//동일 패키지의 클래스는 패키지 표현없이 클래스 접근 가능
		Method method=new Method();
		
		//메소드 호출 : 스레드가 메소드로 이동하여 메소드의 명령을 실행 후 귀환
		// => 메소드명과 전달값에 의해 메소드 호출 - 전달값이 잘못된 경우 메소드 호출 실패
		method.displayOne();
		method.displayTwo();
		method.displayOne();
		System.out.println("=======================================");
		method.printOne();
		method.printOne();
	
		//메소드의 매개변수(Parameter)에 값을 정상적으로 전달해야만 메소드 호출 가능
		method.printTwo(50);
		method.printTwo(75);
		
		method.printThree(55,80);
		method.printThree(2,36);
		
		method.printThree(90,10);
		System.out.println("=======================================");
		//메소드를 호출하여 반환되는 값을 변수에 저장
		int total=method.returnTot(30, 60);
		System.out.println("합계 = "+total);
		
		System.out.println("합계 = "+method.returnTot(40, 80));
		
		total=method.returnTot(80, 40);
		if(total!=0) {//메소드의 반환값이 임의의 값이 아닌 경우
			System.out.println("합계 = "+total);
		}
		System.out.println("=======================================");
		boolean result=method.isOddEven(10);
		if(result) {
			System.out.println("[결과]짝수");
		} else {
			System.out.println("[결과]홀수");
		}
		
		//조건식 대신 논리값을 반환하는 메소드를 호출하여 선택문 작성
		if(method.isOddEven(11)) {
			System.out.println("[결과]짝수");
		} else {	
			System.out.println("[결과]홀수");
		}
		System.out.println("=======================================");
		System.out.println(method.getHello("홍길동"));
		System.out.println(method.getHello("임꺽정"));
		System.out.println("=======================================");
		//반환받은 배열을 참조변수에 저장
		int[] num=method.getArray();
		System.out.print("반환된 배열 요소값 = ");
		for(int temp:num) {
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("=======================================");
		System.out.println("합계 = "+method.sumOne(10, 20, 30));
		
		//메소드의 매개변수에 값을 잘못 전달한 경우 메소드 호출 불가능
		//System.out.println("합계 = "+method.sumOne(10));
		//System.out.println("합계 = "+method.sumOne(10,20,30,40,50));
		System.out.println("=======================================");
		int[] array={10,20,30};
		System.out.println("합계 = "+method.sumTwo(array));
		System.out.println("합계 = "+method.sumTwo(new int[]{10,20,30,40,50}));
		System.out.println("합계 = "+method.sumTwo(new int[]{10}));
		System.out.println("=======================================");
		System.out.println("합계 = "+method.sumThree());
		System.out.println("합계 = "+method.sumThree(10));
		System.out.println("합계 = "+method.sumThree(10,20,30));
		System.out.println("합계 = "+method.sumThree(10,20,30,40,50));
		System.out.println("=======================================");
	}
}










