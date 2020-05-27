package site.itwill.access;

//private 접근지정자 : 클래스 내부에서만 접근 가능(은닉화) - 필드, 메소드
// => 다른 클래스에서는 접근 불가능
public class PrivateMember {
	private int num;
	
	@SuppressWarnings("unused")
	private void display() {
		System.out.println("num = "+num);
	}
}
