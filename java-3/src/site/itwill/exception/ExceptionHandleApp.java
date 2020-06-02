package site.itwill.exception;

//예외(Exception) : 프로그램의 명령 실행에 의해 발생되는 오류
//예외가 발생되는 명령에대한 처리가 필요 = 예외처리
//=>심각한 예외인 경우 프로그램 실행 전 예외처리 하지 않는 경우, 에러 발생
//=>심각하지 않은 예외인 경우 JVM에 의해 자동 예외처리가 된다.
public class ExceptionHandleApp {
	
	public static void main(String[] args)  {
		int[] array = { 10, 20, 30, 40, 50 };

		// 예외가 발생되는 명령은 try영역에 작성
		// =>try영역의 명령이 실행될 때 예외가 발생되는지를 감시
		// =>예외가 발생된 경우 예외 클래스로 인스턴스를 자동 생성
		// => catch가 잡아낸다
		//=> 예외가 발생된 명령 하단에 작성된 명령 미실행 -> catch구문으로 이동
		
		try {

			// 배열에서는 첨자를 잘못사용할 경우 ArrayIndexOutOfBoundsException이 발생
			for (int i = 0; i <= array.length; i++) {
				System.out.println("array [" + i + "] = " + array[i]);
			}
			System.out.println("[메세지] 프로그램이 정상적으로 종료되었습니다.");
			
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외가 발생된 경우, catch영역의 명령 실행
			//catch 구문의 참조변수의 예외 클래스의 인스턴스를 전달받아 처리
			//예외 처리 : 프로그램 사용자에게 메세지를 제공하거나 개발자에게 에러로그를 제공하기 위해서
			System.out.println("[에러메세지] 프로그램 실행에 예기치 못한 오류가 발생되었습니다.");
			
			//e.getMessage() : 전달 받은 예외 인스턴스의 에러메세지를 반환
			System.out.println("[error Log] 에러메세지 = " +e.getMessage());
			
			//에러가 발생된 흐름을 추적해서 보여준다.
			e.printStackTrace();
			
		}finally {
			//예외와 상관없이 실행되는 명령을 작성
			System.out.println();
		}
	}
}
