package inheritance;

public class MemberApp {
	public static void main(String[] args) {
		
		Member m = new Member();//�⺻�����ڸ� ������ ���� �ν��Ͻ�
		
		m.setId("aaa");
		m.setName("ȫ�浿");
		m.display();
		System.out.println("==================================");
		
		Member mm = new Member("ad4545","�Ӳ���");
		mm.display();
		System.out.println("==================================");
	}
}
