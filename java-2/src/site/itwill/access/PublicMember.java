package site.itwill.access;

//public 접근지정자는 모든 클래스에서 접근이 가능하다
public class PublicMember {
	
	public int num;
	
	public void display() {
		System.out.println("num = " +num);
	}
}
