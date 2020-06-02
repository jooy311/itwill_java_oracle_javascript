package site.itwill.lang;

//String : ���ڿ��� �����ϱ� ���� Ŭ���� 
// => ���������� ���ڿ��� byte �迭�� ó��
// => ���ڿ� ���� �޼ҵ�(���) ����
public class StringApp {
	public static void main(String[] args) {
		//" " ��ȣ�� �̿��Ͽ� String �ν��Ͻ� ���� ����
		String str1="ABC";
		
		//String.toString() : String �ν��Ͻ��� ����� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println("str1.toString() = "+str1.toString());
		//�ν��Ͻ��� ����� ���������� ����� ��� �ڵ����� toString() �޼ҵ� ȣ��
		System.out.println("str1 = "+str1);
		System.out.println("=======================================");
		//" " ��ȣ�� �̿��Ͽ� String �ν��Ͻ��� ǥ���ϸ� String �ν��Ͻ���
		//���������� ���� String �ν��Ͻ� �߿� ���� ���ڿ��� �����ϰ�
		//�ִ� String �ν��Ͻ��� ������ ��� ���� String �ν��Ͻ��� ����
		String str2="ABC";
		
		//���������� ���� ��� ���������� ����� �ν��Ͻ��� ���Ͽ� ��� ����
		// => String �ν��Ͻ��� ����� ���ڿ��� ���ϴ� ���� �ƴ� �ν��Ͻ� ��ü�� ��
		// => String �ν��Ͻ��� ����� ���ڿ��� ���� �����ڸ� �̿��Ͽ� �� �Ұ���
		if(str1==str2) {
			System.out.println("str1�� str3�� ����� �ν��Ͻ��� �����ϴ�.");
		} else {
			System.out.println("str1�� str3�� ����� �ν��Ͻ��� �ٸ��ϴ�.");
		}
		System.out.println("=======================================");
		//new �����ڸ� �̿��ϸ� ������ ���ο� �ν��Ͻ� ����
		String str3=new String("ABC");
		
		if(str1==str3) {
			System.out.println("str1�� str3�� ����� �ν��Ͻ��� �����ϴ�.");
		} else {
			System.out.println("str1�� str3�� ����� �ν��Ͻ��� �ٸ��ϴ�.");
		}
		System.out.println("=======================================");
		//String.equals(String str) : ����� ���ڿ��� ���޹��� ���ڿ���
		//���Ͽ� �ٸ� ��� false, ���� ��� true�� ��ȯ�ϴ� �޼ҵ�
		if(str1.equals(str3)) {
			System.out.println("str1�� str3�� ����� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("str1�� str3�� ����� ���ڿ��� �ٸ��ϴ�.");
		}
		System.out.println("=======================================");
		String str4="abc";
		
		//equals() �޼ҵ�� ��ҹ��ڸ� �����Ͽ� ��
		if(str1.equals(str4)) {
			System.out.println("str1�� str4�� ����� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("str1�� str4�� ����� ���ڿ��� �ٸ��ϴ�.");
		}
		System.out.println("=======================================");
		//String.equalsIgnoreCase(String str) : ��ҹ��ڸ� �������� �ʰ� ���ڿ��� ���Ͽ� ����� ��ȯ�ϴ� �޼ҵ�
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("str1�� str4�� ����� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("str1�� str4�� ����� ���ڿ��� �ٸ��ϴ�.");
		}
		System.out.println("=======================================");
		//String.compareTo(String str) : ����� ���ڿ��� ���޹��� ���ڿ��� ���Ͽ�
		//����� ���ڿ��� ũ�� ���, ������ 0, ������ ������ ��ȯ�ϴ� �޼ҵ�
		if(str1.compareTo(str4) >= 0) {
			System.out.println("str1�� ����� ���ڿ��� str4�� ����� ���ڿ����� ũ�ų� �����ϴ�.");
		} else {
			System.out.println("str1�� ����� ���ڿ��� str4�� ����� ���ڿ����� �۽��ϴ�.");
		}
		System.out.println("=======================================");
		//���ڿ��� ���������� byte �迭�� ǥ���Ǿ� ÷�ڸ� �̿��Ͽ� ó���ϴ� �޼ҵ� ����
		String str5="ABCDEFG";

		//String.length() : ����� ���ڿ��� ���� ������ ��ȯ�ϴ� �޼ҵ�
		System.out.println("���ڿ��� ���� ���� = "+str5.length());
		System.out.println("=======================================");
		//String.charAt(int index) : ���޹��� ÷�� ��ġ�� ���ڸ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("�ι�° ��ġ�� ���� = "+str5.charAt(1));
		System.out.println("=======================================");
		//String.indexOf(char ch) �Ǵ� String.indexOf(String str) : ���޵�
		//����(���ڿ�)�� �˻��Ͽ� ����� ��ġ�� ����÷�ڸ� ��ȯ�ϴ� �޼ҵ�
		// => �˻� ����(���ڿ�)�� ���� ��� -1 ��ȯ
		//System.out.println("A ������ ������ġ(Index) = "+str5.indexOf('A'));
		System.out.println("A ���ڿ��� ������ġ(Index) = "+str5.indexOf("A"));
		System.out.println("EFG ���ڿ��� ������ġ(Index) = "+str5.indexOf("EFG"));
		System.out.println("X ���ڿ��� ������ġ(Index) = "+str5.indexOf("X"));
		System.out.println("=======================================");
		String str6="Java";
		//String.concat(String str) : ����� ���ڿ��� ���޵� ���ڿ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		//str6=str6.concat(" Programming");
		
		//concat() �޼ҵ� ��� + �Ǵ� += �����ڸ� �̿��Ͽ� ���� ó�� ����
		//str6=str6+" Programming";
		str6+=" Programming";
		System.out.println("str6 = "+str6);
		System.out.println("=======================================");
		//String.toUpperCase() : ����� ���ڿ��� �빮�ڷ� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("�빮�� = "+str6.toUpperCase());
		//String.toLowerCase() : ����� ���ڿ��� �ҹ��ڷ� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("�ҹ��� = "+str6.toLowerCase());
		System.out.println("=======================================");
		String str7="       ȫ�浿            ";
		System.out.println("�Էµ� �̸��� ["+str7+"]�Դϴ�.");
		//String.trim() : ����� ���ڿ� �հ� �ڿ� �����ϴ� ��� ������ �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("�Էµ� �̸��� ["+str7.trim()+"]�Դϴ�.");
		System.out.println("=======================================");
		String str8="   ��   ��      ��    ";
		System.out.println("�Էµ� �̸��� ["+str8+"]�Դϴ�.");
		//String.replace(String regEx, String replacement) : ����� ���ڿ����� 
		//�˻� ���ڿ�(����ǥ����)�� ã�� ġȯ ���ڿ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("�Էµ� �̸��� ["+str8.replace(" ", "")+"]�Դϴ�.");
		System.out.println("�Էµ� �̸��� ["
			+str8.replace(" ", "").replace("��", "��")+"]�Դϴ�.");
		System.out.println("=======================================");
		String str9="010-1234-5678";
		System.out.println("��ȭ��ȣ = "+str9);
		
		//String.split(String regEx) : ���ڿ��� ���޹��� ���� 
		//���ڿ�(����ǥ����)�� �и��Ͽ� ���ڿ� �迭�� ��ȯ�ϴ� �޼ҵ�
		// => ����ǥ������ ��Ÿ���ڴ� \\ �ڿ� Escape ���ڷ� ǥ�� 
		String[] array=str9.split("-");
		
		System.out.println("�պκ� ��ȭ��ȣ = "+array[0]);
		System.out.println("�߰��κ� ��ȭ��ȣ = "+array[1]);
		System.out.println("�޺κ� ��ȭ��ȣ = "+array[2]);
		System.out.println("=======================================");
		//String.substring(int beginIndex, int endIndex) : ����� ���ڿ�����
		//����÷��(���� ����)���� ����÷��(���� ������)������ ���ڿ��� �и��Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("�պκ� ��ȭ��ȣ = "+str9.substring(0, 3));
		System.out.println("�߰��κ� ��ȭ��ȣ = "+str9.substring(4, 8));
		//System.out.println("�޺κ� ��ȭ��ȣ = "+str9.substring(9, 13));
		//����÷�ڸ� ���޵� ��� ����÷���� ���ں��� ������ ���ڱ��� �и� ó��
		System.out.println("�޺κ� ��ȭ��ȣ = "+str9.substring(9));
		System.out.println("=======================================");
	}
}















