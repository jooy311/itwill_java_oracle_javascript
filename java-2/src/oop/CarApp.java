package oop;

//Car 클래스를 이용한 프로그램 작성
public class CarApp {
	public static void main(String[] args) {
		//클래스를 이용하여 인스턴스를 생성해 참조변수 저장
		//클래스명 참조변수=new 클래스명();
		//인스턴스를 생성한 경우 인스턴스의 필드는 기본값으로 자동 초기화
		// => 숫자형 : 0, 논리형 : false, 참조형 : null
		Car carOne=new Car();
		Car carTwo=new Car();
		
		System.out.println("carOne = "+carOne);
		System.out.println("carTwo = "+carTwo);
		System.out.println("=======================================");
		//참조변수를 이용하여 인스턴스 참조 가능
		// => 참조된 인스턴스로 필드 또는 메소드 접근 가능 : . 연산자 사용
		//문제)인스턴스를 이용하여 필드에 접근 가능한 경우 비정상적인 값 저장에 의한 실행 오류 발생
		//해결)인스턴스를 이용하여 필드에 접근하지 못하도록 필드의 은닉화 처리
		// => 은닉화된 필드에 접근할 경우 에러 발생
		// => Getter 메소드 또는 Setter 메소드를 호출하여 필드 사용
		//carOne.aliasName="티코";
		carOne.setAliasName("티코");
		//carOne.engineStatus=false;
		carOne.setEngineStatus(false);
		//carOne.currentSpeed=0;
		carOne.setCurrentSpeed(0);
		
		//System.out.println("자동차 별칭 = "+carOne.aliasName);
		System.out.println("자동차 별칭 = "+carOne.getAliasName());
		//System.out.println("엔진상태 = "+carOne.engineStatus);
		System.out.println("엔진상태 = "+carOne.isEngineStatus());
		System.out.println("현재 속도 = "+carOne.getCurrentSpeed());
		System.out.println("=======================================");
		carTwo.setAliasName("쏘나타");
		
		System.out.println("자동차 별칭 = "+carTwo.getAliasName());
		System.out.println("엔진상태 = "+carTwo.isEngineStatus());
		System.out.println("현재 속도 = "+carTwo.getCurrentSpeed());
		System.out.println("=======================================");
		carOne.startEngine();
		carOne.speedUp(30);
		carOne.speedUp(50);
		carOne.speedDown(40);
		//carOne.speedZero();
		carOne.stopEngine();
		//System.out.println("현재 속도 = "+carOne.currentSpeed);
		System.out.println("=======================================");
	}
}






