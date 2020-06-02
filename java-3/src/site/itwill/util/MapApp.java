package site.itwill.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Map 인터페이스를 상속받는 자료구조 클래스 : HashMap, Hashtable 등
//=> 키(key)와 값(value)을 하나의 쌍(entry)으로 묶어서 관리하는 자료구조 클래스
//키를 이용하여 값을 빠르게 검색하기 위해 사용한다.
//검색이 주목적인 자료구조이다.
public class MapApp {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//map.put(key,value) : 엔트리를 추가하는 메소드
		//=> 키는 set인터페이스 타입으로 저장되며, 값은 Collection인터페이스 타입으로 저장된다.
		//=> 키는 중복저장되지 않으며 저장순서가 없다.
		map.put(1000,"홍길동");
		map.put(2000,"전우치");
		map.put(3000,"홍경례");
		map.put(4000,"임꺽정");
		map.put(5000,"장길산");
		
		//map.toString() :Map 인스턴스에 저장된 모든 엔트리를 문자열로 반환하는 메소드
		System.out.println(map.toString()); //그냥 map호출하는거랑 같음
		System.out.println("=================================================================");
		
		//put() : key가 중복될 경우 값을 변경
		map.put(4000, "임걱정");
		System.out.println(map);
		System.out.println("=================================================================");
		
		//remove() : key에대한 엔트리를 제거하는 메소드
		map.remove(4000);
		System.out.println(map);
		System.out.println("=================================================================");

		//key에 대한 값을 반환하는 메소드
		String name = map.get(1000);
		System.out.println(map);
		System.out.println("=================================================================");
		
		//맵에 저장된 모든 값을 Coleections인스턴스를 반환(값만 가져옴)
		Iterator<String> iteratorValue = map.values().iterator();
		while (iteratorValue.hasNext()) {
			System.out.print(iteratorValue.next()+" ");
			
		}System.out.println();
		System.out.println("=================================================================");
		
		for(String value : map.values()) {
			System.out.print(value + " ");
		}System.out.println();
		System.out.println("=================================================================");
		
		
		//keySet() : 모든 키에 대한 set 인스턴스를 반환하는 메소드
		Iterator<Integer> iteratorKey = map.keySet().iterator();//키들만 저장되어 있음
		
		while (iteratorKey.hasNext()) {
			Integer key = iteratorKey.next();
			System.out.println("이름 = " +map.get(key) + " 학번 = " + key );	
		}System.out.println();
		System.out.println("=================================================================");
		
		for(int key : map.keySet()) {
			System.out.print(key + " ");
		}System.out.println();
		System.out.println("=================================================================");
		
		
	}
}
