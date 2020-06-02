package site.itwill.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Map �������̽��� ��ӹ޴� �ڷᱸ�� Ŭ���� : HashMap, Hashtable ��
//=> Ű(key)�� ��(value)�� �ϳ��� ��(entry)���� ��� �����ϴ� �ڷᱸ�� Ŭ����
//Ű�� �̿��Ͽ� ���� ������ �˻��ϱ� ���� ����Ѵ�.
//�˻��� �ָ����� �ڷᱸ���̴�.
public class MapApp {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//map.put(key,value) : ��Ʈ���� �߰��ϴ� �޼ҵ�
		//=> Ű�� set�������̽� Ÿ������ ����Ǹ�, ���� Collection�������̽� Ÿ������ ����ȴ�.
		//=> Ű�� �ߺ�������� ������ ��������� ����.
		map.put(1000,"ȫ�浿");
		map.put(2000,"����ġ");
		map.put(3000,"ȫ���");
		map.put(4000,"�Ӳ���");
		map.put(5000,"����");
		
		//map.toString() :Map �ν��Ͻ��� ����� ��� ��Ʈ���� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println(map.toString()); //�׳� mapȣ���ϴ°Ŷ� ����
		System.out.println("=================================================================");
		
		//put() : key�� �ߺ��� ��� ���� ����
		map.put(4000, "�Ӱ���");
		System.out.println(map);
		System.out.println("=================================================================");
		
		//remove() : key������ ��Ʈ���� �����ϴ� �޼ҵ�
		map.remove(4000);
		System.out.println(map);
		System.out.println("=================================================================");

		//key�� ���� ���� ��ȯ�ϴ� �޼ҵ�
		String name = map.get(1000);
		System.out.println(map);
		System.out.println("=================================================================");
		
		//�ʿ� ����� ��� ���� Coleections�ν��Ͻ��� ��ȯ(���� ������)
		Iterator<String> iteratorValue = map.values().iterator();
		while (iteratorValue.hasNext()) {
			System.out.print(iteratorValue.next()+" ");
			
		}System.out.println();
		System.out.println("=================================================================");
		
		for(String value : map.values()) {
			System.out.print(value + " ");
		}System.out.println();
		System.out.println("=================================================================");
		
		
		//keySet() : ��� Ű�� ���� set �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		Iterator<Integer> iteratorKey = map.keySet().iterator();//Ű�鸸 ����Ǿ� ����
		
		while (iteratorKey.hasNext()) {
			Integer key = iteratorKey.next();
			System.out.println("�̸� = " +map.get(key) + " �й� = " + key );	
		}System.out.println();
		System.out.println("=================================================================");
		
		for(int key : map.keySet()) {
			System.out.print(key + " ");
		}System.out.println();
		System.out.println("=================================================================");
		
		
	}
}
