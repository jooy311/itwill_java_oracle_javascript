package oop;

public class Overload {
	public void displayInt(int param) {
		System.out.println("정수값 = "+param);
	}
	
	public void displayBoolean(boolean param) {
		System.out.println("논리값 = "+param);
	}
	
	public void displayString(String param) {
		System.out.println("문자열 = "+param);
	}
	
	//메소드 오버로드(Overload)
	// => 동일한 기능을 제공하는 메소드가 매개변수에 의해 여러 개 
	//    선언해야 될 경우 메소드 이름을 같게 선언하는 방법
	// => 매개변수의 갯수 또는 자료형이 같지 않도록 선언
	// => 접근지정자 또는 반환형은 오버로드 선언과 상관 없다.
	public void display(int param) {
		System.out.println("정수값 = "+param);
	}
	
	public void display(boolean param) {
		System.out.println("논리값 = "+param);
	}
	
	public void display(String param) {
		System.out.println("문자열 = "+param);
	}
}





