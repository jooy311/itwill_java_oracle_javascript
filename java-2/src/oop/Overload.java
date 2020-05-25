package oop;

public class Overload {

	public void display(int param) {
		System.out.println("정수값 = " + param);
	}

	public void displayBoolean(boolean param) {
		System.out.println("논리값 = " + param);
	}

	public void displayString(String param) {
		System.out.println("문자열  = " + param);
	}
	
	//This is methodOverLoad!!!!
	// -> 동일한 기능을 제공하는 메소드가 
	// 매개변수에 의해 여러개 선언해야 될 경우메소드를 같게 여러개 선언하는 방법
	// 매개변수의 ★자료형, 갯수★ 가 같지 않아야함
	//-> 접근 지정자 또는 반환형은 오버로드 선언과 상관이없음(public int << 이부분은 상관이 없단말)
	public void display(double param) {
		//똑같은 메소드의 이름을 사용하도 되지만, 매개변수의 리터럴 타입은 다르게 만들어야함
		System.out.println("실수값 = " + param);
	}
	

}
