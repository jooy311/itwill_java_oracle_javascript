package oop;

//자동차를 표현하기 위한 클래스
//클래스를 작성할 때 필드 또는 메소드에 접근 지정자를 선언하여 접근유무를 결정한다
//접근 지정자 : private, protected, public
//private : 클래스 내부에서만 접근 가능하며 클래스 외부에서는 접근 불가능
//->필드 선언시 사용하여 은닉화(숨긴다) 할때 주로 사용

public class Car {
	// 필드 : 대상의 속성을 표현
	//->클래스 안에 선언된 모든 메소드에서 사용가능함
	private String aliasName; // 이름 : 별칭
	private boolean engineStates;//예전상태 (시동유무)
	private int currentSpeed; //현재속도
	

	// 생성자- 생략(기본생성자가 존재하는 것으로 처리
	// ->객체를 생성하기 위한 특별한 메소드

	// 메소드 : 대상의 기능을 표현
	//필드를 이용하여 원하는 기능을 구현할 수 있음
	
	

	public void startEngine(boolean flag) {// 시동을 켜는 메소드
		engineStates = true;
		System.out.println(aliasName +" 의 시동을 켰습니다.");
	}

	public void stopEngine() {// 시동을 끄는 메소드
		
		if(currentSpeed != 0) {
			System.out.println("이미 주행중입니다.");
			currentSpeed = 0;
			System.out.println("시동이 꺼졌습니다.");
		}
		engineStates = false;
		System.out.println(aliasName +" 의 시동을 껐습니다.");
	}
	
	public void speedUp(int speed) {// 현재 속도를 증가시키는 메소드
		if(!engineStates) {
			System.out.println("엔진이 꺼져 있습니다.");
			return;
		}
		if(currentSpeed + speed >= 100) {
			System.out.println("더이상 속도를 높일 수 없습니다.");
			return;
		}
		currentSpeed += speed;
		
		System.out.println(aliasName +" 의 속도를 " +speed+ " km/h 증가시켰습니다.");
		System.out.println("현재 속도는 " + currentSpeed + " km/h  입니다.");
	}

	public void SpeedDown(int speed) {// 현재 속도를 감소시키는 메소드
		if(!engineStates) {
			System.out.println("엔진이 꺼져 있습니다.");
			return;
		}
		
		if(currentSpeed< speed) {
			System.out.println("속도를 " + speed + " 만큼 낮출 수없습니다.");
			speed = currentSpeed;
		}
		currentSpeed -= speed;
		
		System.out.println(aliasName +" 의 속도를 " +speed+ " km/h 감소시켰습니다.");
		System.out.println("현재 속도는 " + currentSpeed + " km/h  입니다.");
	}

	public void makeSpeedZero() {// 속도를 현재 속도를 0으로 변경하는 메소드
		currentSpeed = 0;
		System.out.println(aliasName +" 가 멈췄습니다.");
	}
	
	//은닉화 처리된 필드는 필드값을 반환하는 Getter메소드와 필드값을 변경하는 Setter메소드를 선언
	//->캡슐화(즉, 필드를 은닉화하고, 그것을 반환하는 Getter,Setter메소드를 따로 만드는것)
	//캡슐화 처리 단축기 : Getter메소드와 Setter메소드 자동 완성
	//Alt + shift + S -> R
	public String getAliasName() {
		return aliasName;//필드값을 반환하도록 만들면 됨
	}
	
	/*public void setAliasName(String name) {//매개변수에 전달되어 저장된 값을 이용하여 필드값을 변경
		//잘못된 값이 들어왔을때 필드값이 변경되지 않게 만들기
		//->매개변수에 전달된 값에 대한 유효성 검사 후, 변경작업을 할 수 있도록 한다
		
		aliasName = name;//필드값 변경
	}*/
	
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName; 
		//this.는 클래스를 의미함 즉, 이 클래스 안에서의 필드값인 aliasName을 의미함
	}
	
	public boolean isEngineStates() {
		return engineStates;
	}

	public void setEngineStates(boolean engineStates) {
		this.engineStates = engineStates;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

}
