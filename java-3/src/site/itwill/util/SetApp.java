package site.itwill.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//자료구조 클래스 : 다수의 데이터를 효율적으로 관리(저장, 삭제, 변경)하는 기능을 제공하는 클래스

//Set 인터페이스를 상속받는 자료구조 클래스 : hashSet, LinkedHashSet, TreeSet
//=> 저장순서가 없으며, 동일한 정보의 인스턴스 저장이 불가능함
public class SetApp {
	public static void main(String[] args) {
		
		//제네릭을 사용하지 않을경우, 기본적으로 오브젝트 타입으로 설정됨
		//=> 모든 인스턴스를 전달받아 Set 인스턴스에 저장가능
		//HashSet set = new HashSet(); 이방법은 대부분 사용하지 않음
		
		//제네릭을 사용하여 인스턴스를 생성함
		//=>제네릭으로 전달된 클래스의 인스턴스만 저장이 가능함
		//=>참조변수는 인터페이스를 이용하여 만드는 것을 권장함
		//=>인터페이스를 상속받은 모든 자식인스턴스 저장가능
		Set<String> set = new HashSet<String>();
		
		//Set.add(E element) : element를 추가하는 메소드
		//=> E : 제네릭인스턴스
		set.add("홍길동");
		
		//제네릭 인스턴스가 아닌경우에는 에러발생한다.
		//set.add(100);
		
		set.add("임꺽정");
		set.add("전우치");
		set.add("장길산");
		
		System.out.println("set = " + set);
		System.out.println("===========================================");
		
		//동일한 값은 저장이 되지 않음
		set.add("홍길동");
		System.out.println("set = " + set);
		System.out.println("===========================================");
		
		//set.remove() : 해당 요소를 삭제하는 메소드 
		set.remove("임꺽정");
		System.out.println("set = " + set);
		System.out.println("===========================================");
		
		//set.size() : 저장된 요소의 갯수를 반환하는 메소드
		System.out.println("set size() = " + set.size());
		System.out.println("===========================================");
		
		//일괄 반복처리를 하고 싶을때
		//Set.Iterator() : set 인스턴스를 반복처리 하기 위한 Iterator인스턴스를 반환하는 메소드
		//Iterator : 인스턴스 반복지시자 => 자료구조의 요소를 반복처리하기 위한 인스턴스
		//=>내부적으로 커서를 만들어놓고 요소를 하나하나 읽어낸다. (자동으로 이동)
		Iterator<String> iterator = set.iterator();
		
		//요소가 몇개잇는지 모르기때문에 while문 씀
		//Iterator 인스턴스가 처리할 요소의 존재유무를 판단?
		//=> false : 미존재, true : 존재

		while (iterator.hasNext()) {
			//=> 현재 위치의 요소를 반환하며, 다음위치의 요소로 이동하는 메소드
			System.out.print(iterator.next() + " ");
			
		}System.out.println();
		System.out.println("===========================================");
		
		//변형된 for구문은 내부적으로 iterator인스턴스를 이용해서 반복처리한다. 그래서 주로 이것을 많이 이용
		for(String name : set) {
			System.out.print(name + " ");
		}System.out.println();
		System.out.println("===========================================");
		
		
	}
}
