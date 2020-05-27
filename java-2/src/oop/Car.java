package oop;

//자동차를 표현하기 위한 클래스
//클래스를 작성할 때 필드 또는 메소드에 접근 지정자를 선언하여 접근 유무 설정
//접근 지정자(Access Modifies) : private, protected, public 
//private : 클래스 내부에서만 접근 가능하며 클래스 외부에서는 접근 불가능하도록 설정하는 키워드
// => 필드 선언시 사용하여 은닉화 처리
//public : 모든 패키지의 클래스에서 접근 가능하도록 설정하는 키워드
// => 메소드 선언시 사용하여 접근 처리
public class Car {
	//필드(Filed) : 대상에 대한 속성 표현
	// => 클래스 안에 선언된 모든 메소드에서 접근 가능
	private String aliasName;//이름(별칭) - 고유값
	private boolean engineStatus;//엔진상태(시동유무) - false : Off, true : On
	private int currentSpeed;//현재속도
	
	//생성자(Constructor) : 객체를 생성하기 위한 특별한 메소드 
	// => 생략 가능 : 기본 생성자가 존재하는 것으로 처리
			
	//메소드(Method) : 대상에 대한 기능 표현
	// => 필드를 이용하여 원하는 기능 구현
	public void startEngine() {//시동을 켰는 메소드
		engineStatus=true;
		System.out.println(aliasName+"의 시동을 켰습니다.");
	}
	
	public void stopEngine() {//시동을 끄는 메소드
		if(currentSpeed!=0) {
			/*
			currentSpeed=0;
			System.out.println(aliasName+"이(가) 멈췄습니다.");
			*/
			
			//동일 클래스에 선언된 메소드는 서로 호출 가능
			speedZero();
		}
		
		engineStatus=false;
		System.out.println(aliasName+"의 시동을 껐습니다.");
	}
	
	public void speedUp(int speed) {//속도를 증가하는 메소드
		if(!engineStatus) {//엔진이 꺼져 있는 경우
			System.out.println(aliasName+"의 엔진이 꺼져 있습니다.");
			return;
		}
		
		//매개변수에 전달되어 저장된 값이 비정상적인 경우 
		if(currentSpeed+speed>150) {
			speed=150-currentSpeed;			
		}
		
		currentSpeed+=speed;
		System.out.println(aliasName+"의 속도가 "+speed
			+"Km/h 증가 되었습니다. 현재 속도는 "+currentSpeed+"Km/h입니다.");
	}
	
	public void speedDown(int speed) {//속도를 감소하는 메소드
		if(!engineStatus) {
			System.out.println(aliasName+"의 엔진이 꺼져 있습니다.");
			return;
		}
		
		if(speed>currentSpeed) {
			speed=currentSpeed;
		}
		
		currentSpeed-=speed;
		System.out.println(aliasName+"의 속도가 "+speed
			+"Km/h 감소 되었습니다. 현재 속도는 "+currentSpeed+"Km/h입니다.");
	}
	
	public void speedZero() {//속도를 0으로 변경하는 메소드
		currentSpeed=0;
		System.out.println(aliasName+"이(가) 멈췄습니다.");
	}
	
	//은닉화 처리된 필드는 필드값을 반환하는 Getter 메소드와 필드값을
	//변경하는 Setter 메소드 선언 => 캡슐화
	//캡슐화 처리 단축키 : Getter 메소드와 Setter 메소드 자동 완성
	// => [Alt]+[Shift]+[S] >> [R] >> 필드 선택 >> Generate
	public String getAliasName() {//Getter 메소드
		return aliasName;//필드값 반환
	}
	
	public void setAliasName(String aliasName) {
		//매개변수에 전달되어 저장된 값을 이용하여 필드값 변경
		// => 매개변수에 전달된 값에 대한 유효성 검사
		this.aliasName=aliasName;//필드값 변경
	}

	//필드의 자료형이 boolean인 경우 Getter 메소드 대신 is 메소드 생성
	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
}
