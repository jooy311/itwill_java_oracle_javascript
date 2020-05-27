package site.itwill.access;

//public 접근지정자 : 모든 클래스에서 접근 가능 - 클래스, 필드, 메소드
// => public 접근지정자로 선언된 클래스는 다른 패키지에서 접근 가능

//소스파일에서는 클래스 여러 개 선언 가능
// => public 접근지정자를 사용한 클래스는 하나만 선언 가능
// => public 접근지정자를 사용한 클래스의 이름을 소스파일명으로 설정
public class PublicMember {
	public int num;
	
	public void display() {
		System.out.println("num = "+num);
	}
}




