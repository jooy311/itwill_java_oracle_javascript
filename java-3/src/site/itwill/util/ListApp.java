package site.itwill.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//List 인터페이스를 상속받는 자료구조 클래스 : ArrayList, Vector, LinkedList 등
//= > 저장순서가 존재하며, 첨자를 이용하여 처리
public class ListApp {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//list.add() : 요소를 추가하는 메소드
		list.add("홍길동");
		list.add("전우치");
		list.add("장길산");
		list.add("임꺽정");
		
		System.out.println(list);
		
		
		list.add("임꺽정");
		System.out.println(list);
		
		
		//list.size(); 
		System.out.println(list.size());
		
		//list.get(2) : 첨자위치의 요소를 반환하는 메소드
		System.out.println("list.get(2) = " + list.get(2));
		
		//list.add(int index, E element) : 원하는 요소를 원하는 위치에 삽입하는 메소드
		list.add(4, "홍경례");
		System.out.println(list);
		
		//일괄처리
		for(int i= 0; i< list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}System.out.println();
		
		//remove() : 전달된 요소의 동일한 요소를 제거하는 메소드
		//=> 동일한 요소가 여러개 저장된 경우, 앞에 위치한 요소만 제거된다.
		list.remove("임꺽정");
		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			
		}System.out.println();
		
		//list.set() : 원하는 위치의 요소를 변경하는 메소드
		list.set(1, "임걱정");
		
		for(String name : list) {
			System.out.print(name + " ");
		}System.out.println();
		
		
		System.out.println("정렬 후");
		//전달받은리스트 인스턴스 요소를 정렬하는 메소드
		Collections.sort(list);
		System.out.println(list);
		
		//clear() : list 인스턴스 모든 요소를 제거하는 메소드
		list.clear();
		
		//isEmpty() : 요소가 있는 경우 false, 없는 경우 true를 반환하는 메소드
		if(list.isEmpty()) {
			System.out.println("요소가 없습니다.");
		}
		
		//Arrays.asList() -일종의 초기화시켜주는 방법 : 요소를 전달받아, 배열을 list인스턴스로 변환하여 반환하는 메소드
		List<Integer> numList = Arrays.asList(10,20,30,40,50);
	}
}
