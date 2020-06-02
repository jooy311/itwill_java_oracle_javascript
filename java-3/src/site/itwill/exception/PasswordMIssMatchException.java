package site.itwill.exception;


//예외클래스 Exception클래스를 상속받아 작성.
public class PasswordMIssMatchException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public PasswordMIssMatchException() {
		// TODO Auto-generated constructor stub
	}
	
	//예외메세지를 전달받아 부모클래스의 필드에 초기값으로 저장하는 생성자
	public PasswordMIssMatchException(String message) {
		//부모클래스의 생성자를 호출하여 초기화 작업
		super(message);
	}
	
	
	
}
