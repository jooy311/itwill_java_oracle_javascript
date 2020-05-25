package oop;

import java.util.Scanner;

//carclass를 이용하여 프로그램을 작성할것
//캡슐화시켜줘야지만 오류가 없는 클래스가 됨
public class CarApp {
	public static void main(String[] args) {
		//클래스를 이용하여 인스턴스를 생성해 참조변수를 저장
		//클래스명 참조변수 new클래스명();
		//인스턴스를 생성한 경우 인스턴스의 필드는 기본값으로 자동초기화★
		//문제점 : 인스턴스를 이용하여 필드에 접근 가능한 경우 비정상적인 값이 저장될 수 있음
		// 해결 : 인스턴스를 이용하여 필드에 접근하지 못하도록 클래스를 설계(필드의 은닉화 처리)
		//->은닉화된 필드에 접근할 경우 에러 발생
		//->getter 메소드 또는 setter메소드를 호출하여 필드사용
		Car carOne = new Car();
		Car carTwo = new Car();
		
		//Scanner sc = new Scanner(System.in);
		//carOne.aliasName = sc.nextLine();
		//carTwo.aliasName = sc.nextLine();
		System.out.println("carOne = " + carOne);//메모리 주소를 보여준다
		System.out.println("carTwo = " + carTwo);
		System.out.println("===================================");
		
		//참조변수를 이용하여 인스턴스 참조가능
		// -> 참조된 인스턴스 필드 또는 메소드 접근가능
		carOne.setAliasName("티코");
		carTwo.setAliasName("소나타");
		//carOne.aliasName ="티코";
		//carTwo.aliasName ="소나타";
		carOne.setEngineStates(false);
		carTwo.setEngineStates(false);
		carOne.setCurrentSpeed(0);
		carTwo.setCurrentSpeed(0);
		
		System.out.println("자동차별칭 >> " + carOne.getAliasName());
		System.out.println("자동차 현재 속도 >> " + carOne.getCurrentSpeed());
		System.out.println("자동차별칭 >> " + carOne.isEngineStates());
		System.out.println("===================================");
		System.out.println("자동차별칭 >> " + carTwo.getAliasName());
		System.out.println("자동차별칭 >> " + carTwo.getCurrentSpeed());
		System.out.println("자동차별칭 >> " + carTwo.isEngineStates());
		
		carOne.startEngine(true);
		carOne.speedUp(50);
		carOne.speedUp(20);
		carOne.SpeedDown(80);
		//carOne.makeSpeedZero();
		carOne.stopEngine();

		
	}
}
