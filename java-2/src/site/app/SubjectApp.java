package site.app;

//다른 패키지의 클래스를 쉽게 표현하기 위해 import키워드를 사용하여 선언
//클래스명 입력후 ctrl space누르면 자동 import됨
//ctrl + shift + O import추가 또는 제거
import site.itwill.com.*;
import site.uniwill.subject.NetworkSubject;
//패키지가 다른 동일한 이름의 클래스는 import가 안된다
//import site.uniwill.subject.*;

public class SubjectApp {
	public static void main(String[] args) {
		//다른 패키지의 클래스를 사용하고자 할 경우 패키지 명을 포함하는 
		//클래스명으로 표현해야만 접근가능
		site.itwill.com.OracleSubject subject1 = 
				new site.itwill.com.OracleSubject();
		subject1.display();
		
		//import 선언된 클래스는 패키지명을 생략하고 클래스명으로만 표현해도 접근이 가능하다
		NetworkSubject subject2 = new NetworkSubject();
		subject2.display();
		
		//같은이름의 클래스가 다른 패키지에 각각 선언된 경우, import설정주의
		JavaSubject subject3 = new JavaSubject();
		subject3.display();
		
		//import 구현이 불가능한 클래스인 경우 패키지명을 포함한 클래스로 표현
		site.uniwill.subject.JavaSubject subject4 = new site.uniwill.subject.JavaSubject();
		subject4.display();
	}
}
