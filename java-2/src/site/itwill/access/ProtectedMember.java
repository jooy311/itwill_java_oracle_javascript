package site.itwill.access;

//protected 접근지정자 : 다른패키지의 클래스는 상속을 통해 접근가능 = 클래스, 필드, 메소드
//같은 패키지의 클래스에서 접근이 가능함
//=>다른 패키지의 클래스에서 접근은 불가능함
//=>
public class ProtectedMember {
	protected int num;
	
	protected void display() {
		System.out.println("num = " +num);
	}
}
