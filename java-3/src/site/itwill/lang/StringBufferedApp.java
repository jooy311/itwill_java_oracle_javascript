package site.itwill.lang;

//���� �������϶� ���(����ȭ ó���� �Ǿ�����)
//=>���� ������ : StringBuilder�������(����ȭ ó���� �Ǿ����� �ʱ� ����)

//=>StringBuffer : ���ڿ��� �����ϱ� ���� Ŭ����
//=>���ڿ��� ��ȯ�ϴ� �޼ҵ� ����(��ȯ���� ����)

public class StringBufferedApp {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		//StringBuffer.append() : ���ް��� ���ڿ��� �߰��ϴ� �޼ҵ�
		//=> String �ν��Ͻ��� ����� ���ڿ��� += �����ڸ� ����� ȿ���� ������
		sb.append("ABC").append("DEF");
		
		//toString() : StringBuffer�ν��Ͻ��� ���ڿ��� String�ν��Ͻ��� �ں�ȯ�Ͽ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println("sb.toString() = " + sb.toString());
		System.out.println("sb = " + sb);
		
		String str = sb.toString(); //String�� �ֱ� ���ؼ� ���� ��.(StringBuffer�� String���� �ٲٱ� ���ؼ�....!!!!!)
		System.out.println("str = " + str);
		System.out.println("==========================================");
		
		//StringBuffer.insert() : ����� ���ڿ��� ���ϴ� ��ġ�� ���ο� ���ڿ��� �����ϴ� �޼ҵ�
		sb.insert(4, "X");
		System.out.println("sb = " + sb);
		System.out.println("==========================================");
		
		//deleteCharAt() : ����� ���ڿ��� ���ϴ� ��ġ�� ���ڸ� �����ϴ� �޼ҵ�
		sb.deleteCharAt(2);
		System.out.println("sb = " + sb);
		System.out.println("==========================================");
		
		//delete() : ����� ���ڿ����� ���ϴ� ������ ���ڵ��� �����ϴ� �޼ҵ�
		sb.delete(3, 5);
		System.out.println("sb = " + sb);
		System.out.println("==========================================");
		
		//reverse() : ����� ���ڿ����� ���ϴ� ������ ���ڵ��� ������ �ڹٲپ� �ִ� �޼ҵ�
		sb.reverse();
		System.out.println("sb = " + sb);
		System.out.println("==========================================");
	}
}
