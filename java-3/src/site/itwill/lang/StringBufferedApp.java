package site.itwill.lang;

//단일 스레드일때 사용(동기화 처리가 되어있음)
//=>다중 스레드 : StringBuilder를쓰면됨(동기화 처리가 되어있지 않기 때문)

//=>StringBuffer : 문자열을 저장하기 위한 클래스
//=>문자열을 변환하는 메소드 제공(반환하지 않음)

public class StringBufferedApp {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		//StringBuffer.append() : 전달값을 문자열에 추가하는 메소드
		//=> String 인스턴스에 저장된 문자열에 += 연산자를 사용한 효과와 동일함
		sb.append("ABC").append("DEF");
		
		//toString() : StringBuffer인스턴스의 문자열을 String인스턴스로 ★변환하여★ 변환하는 메소드
		System.out.println("sb.toString() = " + sb.toString());
		System.out.println("sb = " + sb);
		
		String str = sb.toString(); //String에 넣기 위해서 많이 씀.(StringBuffer가 String으로 바꾸기 위해서....!!!!!)
		System.out.println("str = " + str);
		System.out.println("==========================================");
		
		//StringBuffer.insert() : 저장된 문자열의 원하는 위치에 새로운 문자열을 삽입하는 메소드
		sb.insert(4, "X");
		System.out.println("sb = " + sb);
		System.out.println("==========================================");
		
		//deleteCharAt() : 저장된 문자열의 원하는 위치의 문자를 삭제하는 메소드
		sb.deleteCharAt(2);
		System.out.println("sb = " + sb);
		System.out.println("==========================================");
		
		//delete() : 저장된 문자열에서 원하는 범위의 문자들을 제거하는 메소드
		sb.delete(3, 5);
		System.out.println("sb = " + sb);
		System.out.println("==========================================");
		
		//reverse() : 저장된 문자열에서 원하는 범위의 문자들을 순서를 뒤바꾸어 주는 메소드
		sb.reverse();
		System.out.println("sb = " + sb);
		System.out.println("==========================================");
	}
}
