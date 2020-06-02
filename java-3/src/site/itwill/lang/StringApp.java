package site.itwill.lang;

//String : 문자열을 저장하기 위한 클래스 
// => 내부적으로 문자열은 byte 배열로 처리
// => 문자열 관련 메소드(기능) 제공
public class StringApp {
	public static void main(String[] args) {
		//" " 기호를 이용하여 String 인스턴스 생성 가능
		String str1="ABC";
		
		//String.toString() : String 인스턴스에 저장된 문자열을 반환하는 메소드
		System.out.println("str1.toString() = "+str1.toString());
		//인스턴스가 저장된 참조변수를 출력할 경우 자동으로 toString() 메소드 호출
		System.out.println("str1 = "+str1);
		System.out.println("=======================================");
		//" " 기호를 이용하여 String 인스턴스를 표현하면 String 인스턴스를
		//생성하지만 기존 String 인스턴스 중에 동일 문자열을 저장하고
		//있는 String 인스턴스가 존재할 경우 기존 String 인스턴스를 재사용
		String str2="ABC";
		
		//참조변수를 비교할 경우 참조변수에 저장된 인스턴스를 비교하여 결과 제공
		// => String 인스턴스에 저장된 문자열을 비교하는 것이 아닌 인스턴스 자체를 비교
		// => String 인스턴스에 저장된 문자열은 관계 연산자를 이용하여 비교 불가능
		if(str1==str2) {
			System.out.println("str1과 str3에 저장된 인스턴스가 같습니다.");
		} else {
			System.out.println("str1과 str3에 저장된 인스턴스가 다릅니다.");
		}
		System.out.println("=======================================");
		//new 연산자를 이용하면 무조건 새로운 인스턴스 생성
		String str3=new String("ABC");
		
		if(str1==str3) {
			System.out.println("str1과 str3에 저장된 인스턴스가 같습니다.");
		} else {
			System.out.println("str1과 str3에 저장된 인스턴스가 다릅니다.");
		}
		System.out.println("=======================================");
		//String.equals(String str) : 저장된 문자열과 전달받은 문자열을
		//비교하여 다른 경우 false, 같은 경우 true를 반환하는 메소드
		if(str1.equals(str3)) {
			System.out.println("str1과 str3에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1과 str3에 저장된 문자열이 다릅니다.");
		}
		System.out.println("=======================================");
		String str4="abc";
		
		//equals() 메소드는 대소문자를 구분하여 비교
		if(str1.equals(str4)) {
			System.out.println("str1과 str4에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1과 str4에 저장된 문자열이 다릅니다.");
		}
		System.out.println("=======================================");
		//String.equalsIgnoreCase(String str) : 대소문자를 구분하지 않고 문자열을 비교하여 결과를 반환하는 메소드
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("str1과 str4에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1과 str4에 저장된 문자열이 다릅니다.");
		}
		System.out.println("=======================================");
		//String.compareTo(String str) : 저장된 문자열과 전달받은 문자열을 비교하여
		//저장된 문자열이 크면 양수, 같으면 0, 작으면 음수를 반환하는 메소드
		if(str1.compareTo(str4) >= 0) {
			System.out.println("str1에 저장된 문자열이 str4에 저장된 문자열보다 크거나 같습니다.");
		} else {
			System.out.println("str1에 저장된 문자열이 str4에 저장된 문자열보다 작습니다.");
		}
		System.out.println("=======================================");
		//문자열은 내부적으로 byte 배열로 표현되어 첨자를 이용하여 처리하는 메소드 존재
		String str5="ABCDEFG";

		//String.length() : 저장된 문자열의 문자 갯수를 반환하는 메소드
		System.out.println("문자열의 문자 갯수 = "+str5.length());
		System.out.println("=======================================");
		//String.charAt(int index) : 전달받은 첨자 위치의 문자를 반환하는 메소드
		System.out.println("두번째 위치의 문자 = "+str5.charAt(1));
		System.out.println("=======================================");
		//String.indexOf(char ch) 또는 String.indexOf(String str) : 전달된
		//문자(문자열)을 검색하여 저장된 위치의 시작첨자를 반환하는 메소드
		// => 검색 문자(문자열)이 없는 경우 -1 반환
		//System.out.println("A 문자의 저장위치(Index) = "+str5.indexOf('A'));
		System.out.println("A 문자열의 저장위치(Index) = "+str5.indexOf("A"));
		System.out.println("EFG 문자열의 저장위치(Index) = "+str5.indexOf("EFG"));
		System.out.println("X 문자열의 저장위치(Index) = "+str5.indexOf("X"));
		System.out.println("=======================================");
		String str6="Java";
		//String.concat(String str) : 저장된 문자열에 전달된 문자열을 결합하여 반환하는 메소드
		//str6=str6.concat(" Programming");
		
		//concat() 메소드 대신 + 또는 += 연산자를 이용하여 결합 처리 가능
		//str6=str6+" Programming";
		str6+=" Programming";
		System.out.println("str6 = "+str6);
		System.out.println("=======================================");
		//String.toUpperCase() : 저장된 문자열을 대문자로 변환하여 반환하는 메소드
		System.out.println("대문자 = "+str6.toUpperCase());
		//String.toLowerCase() : 저장된 문자열을 소문자로 변환하여 반환하는 메소드
		System.out.println("소문자 = "+str6.toLowerCase());
		System.out.println("=======================================");
		String str7="       홍길동            ";
		System.out.println("입력된 이름은 ["+str7+"]입니다.");
		//String.trim() : 저장된 문자열 앞과 뒤에 존재하는 모든 공백을 제거하여 반환하는 메소드
		System.out.println("입력된 이름은 ["+str7.trim()+"]입니다.");
		System.out.println("=======================================");
		String str8="   임   꺽      정    ";
		System.out.println("입력된 이름은 ["+str8+"]입니다.");
		//String.replace(String regEx, String replacement) : 저장된 문자열에서 
		//검색 문자열(정규표현식)을 찾아 치환 문자열로 변경하여 반환하는 메소드
		System.out.println("입력된 이름은 ["+str8.replace(" ", "")+"]입니다.");
		System.out.println("입력된 이름은 ["
			+str8.replace(" ", "").replace("꺽", "걱")+"]입니다.");
		System.out.println("=======================================");
		String str9="010-1234-5678";
		System.out.println("전화번호 = "+str9);
		
		//String.split(String regEx) : 문자열을 전달받은 구분 
		//문자열(정규표현식)로 분리하여 문자열 배열로 반환하는 메소드
		// => 정규표현식의 메타문자는 \\ 뒤에 Escape 문자로 표현 
		String[] array=str9.split("-");
		
		System.out.println("앞부분 전화번호 = "+array[0]);
		System.out.println("중간부분 전화번호 = "+array[1]);
		System.out.println("뒷부분 전화번호 = "+array[2]);
		System.out.println("=======================================");
		//String.substring(int beginIndex, int endIndex) : 저장된 문자열에서
		//시작첨자(문자 포함)부터 종료첨자(문자 미포함)까지의 문자열을 분리하여 반환하는 메소드
		System.out.println("앞부분 전화번호 = "+str9.substring(0, 3));
		System.out.println("중간부분 전화번호 = "+str9.substring(4, 8));
		//System.out.println("뒷부분 전화번호 = "+str9.substring(9, 13));
		//시작첨자만 전달된 경우 시작첨자의 문자부터 마지막 문자까지 분리 처리
		System.out.println("뒷부분 전화번호 = "+str9.substring(9));
		System.out.println("=======================================");
	}
}















