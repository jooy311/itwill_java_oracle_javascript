package inheritance;

public class MemberEventApp {
	public static void main(String[] args) {
		//�ڽ�Ŭ������ �����ڸ� �̿��Ͽ� �ν��Ͻ��� ������ ��� �θ�Ŭ������ ���� ȣ��Ǿ� ��
		//�����ڰ� ���� ȣ��Ǿ� �θ� �ν��Ͻ� ������ �ڽ� �ν��Ͻ� ������
		//->�ڽ� �ν��Ͻ��� �θ� �ν��Ͻ��� ��ӹ޾� ���� ����
		MemberEvent m = new MemberEvent();
		m.setId("adbb");
		m.setName("ȫ�浿");
		m.setEmail("abc@naver.com");
		m.display();
		System.out.println("===========================");
		
		MemberEvent mm = new MemberEvent("xxx123", "�Ӳ���", "xxx123@naver.com");
		mm.display();
		System.out.println("===========================");
		
	}
}
