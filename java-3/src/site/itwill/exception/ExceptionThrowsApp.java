package site.itwill.exception;

//throws : 메소드의 명령 실행에 의해 발생되는 예외를 메소드를 호출한 명령어로 전달하는 방법
//, 기호를 이용하여 여러개의 예외전달을 할 수 있다.
public class ExceptionThrowsApp {
	
	public static void displayArray() /*throws ArrayIndexOutOfBoundsException*/ {
		int array[]  = {10,20,30,40,50};
		
		for(int i = 0 ; i<= array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	
	
	//JVM으로 예외가 전달될 경우 자동으로 예외처리가 된다.
	public static void main(String[] args) /*throws ArrayIndexOutOfBoundsException*/ { //displayArray()함수가 static함수이기 때문에 
		//ExceptionThrowsApp.displayArray(); : static함수가 아니면 이렇게 호출해야함
		
		try {
			//메소드를 호출한 경우 전달된 예외를 발생시킴
			displayArray();//이렇게 호출이 가능하다.

			
		} catch (Exception e) {
			System.out.println("[메세지] 프로그램에서 예기치못한 에러가 발생했습니다.");
		}
	}
}
