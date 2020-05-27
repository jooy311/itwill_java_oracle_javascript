package enumerate;

public class EnumApp {
	public static void main(String[] args) {
		//상수필드 출력 - 필드명 출력
		// => 상수필드를 이용하여 고유값(대표값)으로 사용 가능
		// => 상수필드의 값 대신 의미 있는 문자열로 표현
		System.out.println("삽입 = "+EnumOne.INSERT);
		System.out.println("변경 = "+EnumOne.UPDATE);
		System.out.println("삭제 = "+EnumOne.DELETE);
		System.out.println("검색 = "+EnumOne.SELECT);
		System.out.println("=======================================");
		System.out.println("삽입 = "+EnumTwo.ADD);
		System.out.println("변경 = "+EnumTwo.MODIFY);
		System.out.println("삭제 = "+EnumTwo.REMOVE);
		System.out.println("검색 = "+EnumTwo.SEARCH);
		System.out.println("=======================================");
		//상수필드는 같은 자료형의 변수에 저장 불가능
		// => 상수필드는 나열형(Enum Type)으로 생성된 변수에만 저장 가능
		//int choice=EnumOne.INSERT;
		
		//나열형이 변수를 생성하기 위한 자료형으로 사용
		// => 나열형에서 선언된 상수필드만 변수에 저장 가능
		EnumOne choice=EnumOne.INSERT;
		System.out.println("=======================================");
		//switch 구문의 변수와 동일한 나열형의 상수필드만 비교 대상
		switch (choice) {
		case INSERT:
			System.out.println("# 학생정보를 저장합니다.");
			break;
		case UPDATE:
			System.out.println("# 학생정보를 변경합니다.");
			break;
		case DELETE:
			System.out.println("# 학생정보를 삭제합니다.");
			break;
		case SELECT:
			System.out.println("# 학생정보를 검색합니다.");
			break;
		}
		System.out.println("=======================================");
	}
}







