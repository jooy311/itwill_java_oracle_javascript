package basic;

import java.util.Scanner;

public class ScannerApp {
	public static void main(String[] args) {
		//Scanner 클래스 : 입력장치로부터(키보드, 파일등) 값을 입력받는 메소드가 선언된 클래스임
		//Scanner 객체 생성 : 키보드로부터 값을 입력받기 위한 객체를 생성
		Scanner sc = new Scanner(System.in);//스캐너로 입력받은 내용을 변수에 저장하겠다는 의미
		
		System.out.print("이름입력해주세요 : ");
		//키보드로 입력받은 문자열을 변수에 저장
		//sc.nextLine() : 입력값을 문자열을 입력받아 반환하는 메소드
		//입력값이 없는 경우 스레드가 일시중지
		//값을 입력한 후 엔터를 입력해야만 스레드가 재실행됨
		System.out.println();
		String str = sc.nextLine();
		System.out.print("태어난 년도 입력 : ");
		//카보드 입력값이 정수값이 아닌 경우 예외(Exception)
		int birth = sc.nextInt();
		
		System.out.println("이름 : " + str);
		System.out.println("태어난 년도 : " +birth);
		
		sc.close();//스캐너 객체를 제거하는 메소드(정확하게 말하면 객체가 가지고있는 스트림을 삭제)
		//즉, 키보드가 더이상 입력받지 못하게 하는 명령문
		//파일인 경우에는 꼭해주어야 함
	}
}
