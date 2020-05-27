package Enumerate;

public class StringEnumApp {
	public static void main(String[] args) {
		System.out.println("삽입 = " + StringEnum.INSERT);
		System.out.println("변경 = " + StringEnum.UPDATE);
		System.out.println("삭제 = " + StringEnum.DELETE);
		System.out.println("검색 = " + StringEnum.SELECT);
		
		System.out.println("삽입 = " + StringEnum.INSERT.getValue());
		System.out.println("변경 = " + StringEnum.UPDATE.getValue());
		System.out.println("삭제 = " + StringEnum.DELETE.getValue());
		System.out.println("검색 = " + StringEnum.SELECT.getValue());
		
		//StringEnum.values() : 상수필드를 나열형에 선언된 상수필드를 배열로 변환하여 반환
		for(StringEnum tmp : StringEnum.values()) {
			//tmp.ordinal() : 상수 필드를 구분하기 위한 고유값을 반환하는 메소드
			System.out.println(tmp + " = " + tmp.ordinal());
		}
	}
}
