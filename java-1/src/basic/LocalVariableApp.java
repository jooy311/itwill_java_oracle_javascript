package basic;
//자바는 전역변수라는게 아. 예. 없음
public class LocalVariableApp {
	int num; //필드변수(클래스의 요소)
	//자바는 무조건 클래스 안에 작성을 해주어야함
	//선언된 블럭 내부에서만 사용이 가능함
	//선언된 블럭이 종료될 경우 지역변수는 자동소멸됨
	public static void main(String[] args) {
		//지역변수 : 메소드 또는 제어문의 블럭내부에서 선언된 변수
		int num1 =100;
		
		{
			//임의 블럭
			int num2 = 200; //얘도 지역변수
			System.out.println("-----임의블럭 내부-----");
			System.out.println("num1 = " + num1);
			System.out.println("num2 = " + num2);
		}
		System.out.println("-----임의블럭 외부-----");
		System.out.println("num1 = " + num1);
		int num2 = 300;
		//임의블럭 종료시 num2변수가 자동 소멸되어 사용불가능
		System.out.println("num2 = " + num2);
		
	}
}
