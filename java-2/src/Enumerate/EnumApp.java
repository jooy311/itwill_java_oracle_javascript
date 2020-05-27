package Enumerate;

public class EnumApp {
	public static void main(String[] args) {
		//상수필드 출력
		//=>필드값을 고유값으로 사용도 가능함
		//필드값 대신 의미있는 문자열로 출력됨
		System.out.println("삽입 = " + EnumOne.INSERT);
		System.out.println("삭제 = " + EnumOne.DELETE);
		System.out.println("변경 = " + EnumOne.UPDATE);
		System.out.println("검색 = " + EnumOne.SELECT);

		System.out.println("삽입 = " + EnumTwo.ADD);
		System.out.println("수정 = " + EnumTwo.MODIFY);
		System.out.println("삭제 = " + EnumTwo.REMOVE);
		System.out.println("검색 = " + EnumTwo.SEARCH);
		
		//상수필드는 같은 자료형의 변수에 저장불가능하다.
		//=>상수필드는 enum 타입으로 생성된 변수에만 저장이 가능하다.
		//=>enum 타입자체가 변수를 생성하기 위한 자료형으로 사용됨
		//=>나열형에서 선언된 상수필드만 변수에 저장가능하다.
		//int choice = EnumOne.DELETE;
		EnumOne choice = EnumOne.INSERT;
		
		switch(choice) {//변수를 EnumOne을 가지고 있으므로 EnumOne의 구성원만 가능
		case INSERT :
			System.out.println("#학생정보를 삽입합니다.");
			break;
		case DELETE :
			System.out.println("#학생정보를 삽입합니다.");
			break;
		case UPDATE :
			System.out.println("#학생정보를 삽입합니다.");
			break;
		}
	}
}
