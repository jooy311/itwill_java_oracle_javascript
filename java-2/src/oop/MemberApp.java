package oop;

public class MemberApp {
	public static void main(String[] args) {
		Member m = new Member(); //�ڿ� Member�� �⺻ ������~~//���Ŭ������ �ʵ尡 �޸𸮿� �Ҵ�ȴ�
		//�ν��Ͻ� �ʵ忡�� �⺻���� �ڵ�����
		
		System.out.println("�̸� >> " + m.getName());
		System.out.println("���̵� >> " + m.getId());
		System.out.println("�̸� >> " + m.getEmail());
		System.out.println("==========================================");
		
		m.setId("jooy11");
		m.setEmail("jooy311@naver.com");
		m.setName("���ֿ�");
		
		m.display();
		System.out.println("==========================================");
		
		//�ν��Ͻ� ������ ������ �Ű������� �̿��Ͽ� �ʵ忡 ����� ���� �����Ѵ�
		Member m2 = new Member("bbb", "ȫ�浿", "�̸���");	
		m2.display();
		
		System.out.println("==========================================");
		Member m3 = new Member("dfdf", "leejooyoun g");
		m3.display();
		System.out.println("==========================================");
		
				
	}
}
