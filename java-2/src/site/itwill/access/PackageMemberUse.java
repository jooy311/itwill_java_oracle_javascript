package site.itwill.access;

public class PackageMemberUse {
	public void run() {
		PackageMember member = new PackageMember();
		
		//필드와 메소드에 접근이 가능하다.
		member.num = 100;
		member.display();
	}
}
