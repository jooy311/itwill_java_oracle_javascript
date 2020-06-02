package site.itwill.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//�ڷᱸ�� Ŭ���� : �ټ��� �����͸� ȿ�������� ����(����, ����, ����)�ϴ� ����� �����ϴ� Ŭ����

//Set �������̽��� ��ӹ޴� �ڷᱸ�� Ŭ���� : hashSet, LinkedHashSet, TreeSet
//=> ��������� ������, ������ ������ �ν��Ͻ� ������ �Ұ�����
public class SetApp {
	public static void main(String[] args) {
		
		//���׸��� ������� �������, �⺻������ ������Ʈ Ÿ������ ������
		//=> ��� �ν��Ͻ��� ���޹޾� Set �ν��Ͻ��� ���尡��
		//HashSet set = new HashSet(); �̹���� ��κ� ������� ����
		
		//���׸��� ����Ͽ� �ν��Ͻ��� ������
		//=>���׸����� ���޵� Ŭ������ �ν��Ͻ��� ������ ������
		//=>���������� �������̽��� �̿��Ͽ� ����� ���� ������
		//=>�������̽��� ��ӹ��� ��� �ڽ��ν��Ͻ� ���尡��
		Set<String> set = new HashSet<String>();
		
		//Set.add(E element) : element�� �߰��ϴ� �޼ҵ�
		//=> E : ���׸��ν��Ͻ�
		set.add("ȫ�浿");
		
		//���׸� �ν��Ͻ��� �ƴѰ�쿡�� �����߻��Ѵ�.
		//set.add(100);
		
		set.add("�Ӳ���");
		set.add("����ġ");
		set.add("����");
		
		System.out.println("set = " + set);
		System.out.println("===========================================");
		
		//������ ���� ������ ���� ����
		set.add("ȫ�浿");
		System.out.println("set = " + set);
		System.out.println("===========================================");
		
		//set.remove() : �ش� ��Ҹ� �����ϴ� �޼ҵ� 
		set.remove("�Ӳ���");
		System.out.println("set = " + set);
		System.out.println("===========================================");
		
		//set.size() : ����� ����� ������ ��ȯ�ϴ� �޼ҵ�
		System.out.println("set size() = " + set.size());
		System.out.println("===========================================");
		
		//�ϰ� �ݺ�ó���� �ϰ� ������
		//Set.Iterator() : set �ν��Ͻ��� �ݺ�ó�� �ϱ� ���� Iterator�ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//Iterator : �ν��Ͻ� �ݺ������� => �ڷᱸ���� ��Ҹ� �ݺ�ó���ϱ� ���� �ν��Ͻ�
		//=>���������� Ŀ���� �������� ��Ҹ� �ϳ��ϳ� �о��. (�ڵ����� �̵�)
		Iterator<String> iterator = set.iterator();
		
		//��Ұ� ��մ��� �𸣱⶧���� while�� ��
		//Iterator �ν��Ͻ��� ó���� ����� ���������� �Ǵ�?
		//=> false : ������, true : ����

		while (iterator.hasNext()) {
			//=> ���� ��ġ�� ��Ҹ� ��ȯ�ϸ�, ������ġ�� ��ҷ� �̵��ϴ� �޼ҵ�
			System.out.print(iterator.next() + " ");
			
		}System.out.println();
		System.out.println("===========================================");
		
		//������ for������ ���������� iterator�ν��Ͻ��� �̿��ؼ� �ݺ�ó���Ѵ�. �׷��� �ַ� �̰��� ���� �̿�
		for(String name : set) {
			System.out.print(name + " ");
		}System.out.println();
		System.out.println("===========================================");
		
		
	}
}
