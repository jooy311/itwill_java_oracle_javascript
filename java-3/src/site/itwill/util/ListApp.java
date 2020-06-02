package site.itwill.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//List �������̽��� ��ӹ޴� �ڷᱸ�� Ŭ���� : ArrayList, Vector, LinkedList ��
//= > ��������� �����ϸ�, ÷�ڸ� �̿��Ͽ� ó��
public class ListApp {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//list.add() : ��Ҹ� �߰��ϴ� �޼ҵ�
		list.add("ȫ�浿");
		list.add("����ġ");
		list.add("����");
		list.add("�Ӳ���");
		
		System.out.println(list);
		
		
		list.add("�Ӳ���");
		System.out.println(list);
		
		
		//list.size(); 
		System.out.println(list.size());
		
		//list.get(2) : ÷����ġ�� ��Ҹ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("list.get(2) = " + list.get(2));
		
		//list.add(int index, E element) : ���ϴ� ��Ҹ� ���ϴ� ��ġ�� �����ϴ� �޼ҵ�
		list.add(4, "ȫ���");
		System.out.println(list);
		
		//�ϰ�ó��
		for(int i= 0; i< list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}System.out.println();
		
		//remove() : ���޵� ����� ������ ��Ҹ� �����ϴ� �޼ҵ�
		//=> ������ ��Ұ� ������ ����� ���, �տ� ��ġ�� ��Ҹ� ���ŵȴ�.
		list.remove("�Ӳ���");
		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			
		}System.out.println();
		
		//list.set() : ���ϴ� ��ġ�� ��Ҹ� �����ϴ� �޼ҵ�
		list.set(1, "�Ӱ���");
		
		for(String name : list) {
			System.out.print(name + " ");
		}System.out.println();
		
		
		System.out.println("���� ��");
		//���޹�������Ʈ �ν��Ͻ� ��Ҹ� �����ϴ� �޼ҵ�
		Collections.sort(list);
		System.out.println(list);
		
		//clear() : list �ν��Ͻ� ��� ��Ҹ� �����ϴ� �޼ҵ�
		list.clear();
		
		//isEmpty() : ��Ұ� �ִ� ��� false, ���� ��� true�� ��ȯ�ϴ� �޼ҵ�
		if(list.isEmpty()) {
			System.out.println("��Ұ� �����ϴ�.");
		}
		
		//Arrays.asList() -������ �ʱ�ȭ�����ִ� ��� : ��Ҹ� ���޹޾�, �迭�� list�ν��Ͻ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		List<Integer> numList = Arrays.asList(10,20,30,40,50);
	}
}
