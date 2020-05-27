package site.itwill.access;

//private 접근지정자 : 클래스내부에서만 접근가능하다
//-> 은닉화 처리할때 자주 쓰임
//-> 필드, 메소드에다 사용한다.
//=>즉, 클래스 외부에서는 접근이 불가능
public class PrivateMember {
	private int num;
	
	
	@SuppressWarnings("unused")
	private void display() {
		System.out.println("num = " + num);
	}
}
