package enumerate;

//클래스(인터페이스)에서 상수필드를 선언할 경우의 단점
// => 상수필드를 이용하여 고유값(대표값)으로 사용하기 부적절
// => 상수필드가 의미있는 문자열로 표현하기 부적절
// => 상수필드가 선언된 클래스(인터페이스)가 무의미
//JDK 1.5에서는 클래스(인터페이스)의 상수필드 단점을 보완하기 위해 나열형(Enum Type) 추가
public class InterfaceApp {
	public static void main(String[] args) {
		//상수필드 출력 - 필드값 출력
		System.out.println("삽입 = "+InterfaceOne.INSERT);
		System.out.println("변경 = "+InterfaceOne.UPDATE);
		System.out.println("삭제 = "+InterfaceOne.DELETE);
		System.out.println("검색 = "+InterfaceOne.SELECT);
		System.out.println("=======================================");
		System.out.println("삽입 = "+InterfaceTwo.ADD);
		System.out.println("변경 = "+InterfaceTwo.MODIFY);
		System.out.println("삭제 = "+InterfaceTwo.REMOVE);
		System.out.println("검색 = "+InterfaceTwo.SEARCH);
		System.out.println("=======================================");
		//상수필드와 동일한 자료형의 변수에 필드값 저장 가능
		int choice=InterfaceOne.INSERT;
		System.out.println("선택 = "+choice);
		System.out.println("=======================================");
		//case 키워드에 값 대신 상수필드 사용 가능
		switch (choice) {
		case InterfaceOne.INSERT:
			System.out.println("# 학생정보를 저장합니다.");
			break;
		case InterfaceOne.UPDATE:
			System.out.println("# 학생정보를 변경합니다.");
			break;
		case InterfaceOne.DELETE:
			System.out.println("# 학생정보를 삭제합니다.");
			break;
		case InterfaceOne.SELECT:
			System.out.println("# 학생정보를 검색합니다.");
			break;
		}
		System.out.println("=======================================");
	}
}







