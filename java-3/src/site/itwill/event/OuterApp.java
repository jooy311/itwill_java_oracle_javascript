package site.itwill.event;

import site.itwill.event.Outer.Inner;
import site.itwill.event.Outer.Nested;

public class OuterApp {
	
	
	public static void main(String[] args) {
		
		//내부클래스는 인스턴스를 만들 수 없음
		Outer outer = new Outer(100);
		outer.outerDisplay();
		System.out.println("========================================");
		
		//외부클래스로 생성된 인스턴스를 이용하여 내부클래스의 인스턴스
		Inner inner = outer.new Inner(200);
		inner.innerDisplay();
		System.out.println("========================================");
		
		//내부 정적 클래스는 직접 인스턴스 생성이 가능함
		Nested nested = new Nested(300);
		nested.nesteDisplay();
		System.out.println("========================================");
	}
}
