package inheritance;

//��ӽ� ���������� �ν��Ͻ��� ����
public class MemberCastApp {
	public static void main(String[] args) {
		//�θ�Ŭ���� ��������=new �θ�Ŭ����();
		// => �θ� �ν��Ͻ��� �����Ͽ� ���������� �θ� �ν��Ͻ� ���� ���� : ����
		Member member1=new Member();
		
		//���������� �̿��Ͽ� �θ� �ν��Ͻ��� �޼ҵ� ȣ��
		member1.setId("aaa");
		member1.setName("ȫ�浿");
		
		member1.display();
		System.out.println("=======================================");
		//�ڽ�Ŭ���� ��������=new �ڽ�Ŭ����();
		// => �θ� �ν��Ͻ��� �ڽ� �ν��Ͻ��� �����Ͽ� ���������� �ڽ� �ν��Ͻ� ���� ���� : ����
		MemberEvent member2=new MemberEvent();
		
		//���������� �̿��Ͽ� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
		// => �ڽ� �ν��Ͻ��� �θ� �ν��Ͻ��� ���� �����ϹǷ� ���������� �θ� �ν��Ͻ��� �޼ҵ� ȣ��
		member2.setId("bbb");
		member2.setName("�Ӳ���");
		member2.setEmail("bbb@daum.net");
		
		member2.display();
		System.out.println("=======================================");
		//�ڽ�Ŭ���� ��������=new �θ�Ŭ����();
		// => �����߻� : �θ� �ν��Ͻ��� �����Ͽ� ���������� ��������
		//    �ʴ� �ڽ� �ν��Ͻ� ���� ����
		//MemberEvent member3=new Member();
		System.out.println("=======================================");
		//�θ�Ŭ���� ��������=new �ڽ�Ŭ����();
		// => �θ� �ν��Ͻ��� �ڽ� �ν��Ͻ��� �����Ͽ� ���������� �θ� �ν��Ͻ� ���� ���� : ����
		Member member4=new MemberEvent();
		
		//���������� �̿��Ͽ� �θ� �ν��Ͻ��� �޼ҵ� ȣ��
		// => �⺻������ �ڽ� �ν��Ͻ��� �޼ҵ� ȣ�� �Ұ���
		member4.setId("ccc");
		member4.setName("����ġ");
		
		//��ü ����ȯ�� �̿��ϸ� ���������� �̿��� �ڽ� �ν��Ͻ� �޼ҵ� ȣ�� ����
		
		//������ ��ü ����ȯ(���� ����ȯ) : ���������� �ڷ����� �ڽ�Ŭ������
		//�Ͻ������� �����ϸ� ���������� �ڽ� �ν��Ͻ� ������ �ڵ����� ����
		//����) (�ڽ�Ŭ����)�������� => Cast ������ �̿�
		/*
		MemberEvent temp=(MemberEvent)member4;
		temp.setEmail("bbb@daum.net");
		*/
		((MemberEvent)member4).setEmail("bbb@daum.net");
		
		//������ ��ü ����ȯ(�ڵ� ����ȯ) : �ڽ�Ŭ������ �������̵� �����
		//�޼ҵ�� �θ�Ŭ������ �޼ҵ� ��� �ڽ�Ŭ������ �޼ҵ尡 ȣ��
		// => ���������� �ڷ����� �ڵ����� �θ�Ŭ������ ����Ǿ� �ڽ� �ν��Ͻ� ���� ����
		member4.display();
		System.out.println("=======================================");
	}
}











