package oop;

//참조가 목적인 클래스
public class Method {
	//식별자 변경 : Refactor >> Rename(Alt+Shift+R) >> 변경 처리 >> 엔터
	// => 프로그램의 모든 식별자를 동시에 변경 처리
	void displayOne() {
		System.out.println("Method 클래스의 displayOne() 메소드 호출");
	}
	
	void displayTwo() {
		System.out.println("Method 클래스의 displayTwo() 메소드 호출");
	}
	
	void printOne() {
		int tot=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
		}
		System.out.println("1~100 범위의 정수 합계 = "+tot);
	}
	
	void printTwo(int num) {
		int tot=0;
		for(int i=1;i<=num;i++) {
			tot+=i;
		}
		System.out.println("1~"+num+" 범위의 정수 합계 = "+tot);
	}
	
	void printThree(int num1, int num2) {
		//매개변수에 전달되어 저장된 값에 대한 유효성 검사
		if(num1>num2) {//비정상적인 값이 전달되어 저장된 경우 
			System.out.println("[에러]첫번째 전달값이 두번째 전달값보다 작아야 됩니다.");
			return;//메소드 강제 종료
		}
		
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		System.out.println(num1+"~"+num2+" 범위의 정수 합계 = "+tot);
	}
	
	int returnTot(int num1, int num2) {
		if(num1>num2) { 
			System.out.println("[에러]첫번째 전달값이 두번째 전달값보다 작아야 됩니다.");
			return 0;//임의의 정수값 반환
		}
		
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		//return 명령을 이용하여 메소드 명령의 실행 결과값을 반환 - 메소드 종료
		// => 반환되는 결과값의 자료형을 메소드 반환형으로 선언
		return tot;
	}
	
	//전달값이 홀수인 경우 false 반환, 짝수인 경우 true를 반환하는 메소드
	boolean isOddEven(int num) {
		if(num%2!=0) return false;
		else return true;
	}
	
	//객체를 전달받아 객체를 반환하는 메소드
	String getHello(String name) {
		return name+"님 안녕하세요.";
	}
	
	//배열을 반환하는 메소드 - 배열의 모든 요소값 반환
	int[] getArray() {
		/*
		int[] array={10,20,30,40,50};
		return array;
		*/

		//return {10,20,30,40,50};//에러 
		return new int[]{10,20,30,40,50};
	}
	
	//3개의 매개변수에 정수값을 전달받아 합계를 계산하여 반환하는 메소드
	// => 매개변수에 값이 정상적으로 전달되지 않은 경우 메소드 호출 불가능
	int sumOne(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	//배열을 전달받아 배열 요소값의 합계를 계산하여 반환하는 메소드 
	int sumTwo(int[] array) {
		int tot=0;
		for(int num:array) {
			tot+=num;
		}
		return tot;
	}
	
	//매개변수 생략 기호(...)를 사용한 경우 값을 0개 이상 전달받아 
	//배열 형식으로 사용 가능
	int sumThree(int... param) {
		int tot=0;
		for(int num:param) {
			tot+=num;
		}
		return tot;
	}
}









