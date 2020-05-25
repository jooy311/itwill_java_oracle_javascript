package oop;

public class OverloadApp {
	
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.display(100);
		ol.displayBoolean(false);
		ol.displayString("홍길동");
		ol.display(12.43);
		System.out.println("==============================");
		//매개변수에 전달되는 값에 따라 다른 메소드가 호출됨
		//메소드 오버로드에 의한 다형성임
		// 다형성 : 같은 이름의 메소드를 호출해도 상태에 따라 다른 메소드가 호출되는 기능
		//->메소드 오버로드, 메소드 오버라이드 (오버라이드가 더 중요-상속과 관련이 있음)
		ol.display(200);
		ol.displayBoolean(false);
		ol.displayString("임꺽정");
		System.out.println("==============================");
		
	}
}
