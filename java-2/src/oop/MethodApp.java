package oop;

//실행이 목적인 클래스 : 프로그램 = 어플리케이션
//->데스크탑 어플리케이션에서는 main메소드 선언
public class MethodApp {
	public static void main(String[] args) {
		//객체를 생성하여 참조변수에 저장한다.
		//=>new 클래스명() : 생성자(constructor)를 이용하여 객체를 생성
		//->클래스명 참조 변수 : 객체를 저장하기 위한 변수 - 참조변수를 이용하여 객체요소에 접근
		
		//동일 패키지의 클래스는 패키지 표현없이 클래스접근이 가능하다.
		Method method = new Method();
		
		//메소드 호출 : 스레드가 메소드로 이동하여 메소드의 명령을 실행후 귀환
		//->메소드명과 전달값에 의해 메소드 호출 - 전달값이 잘못된
		method.displayOne();//기능을 필요할때마다 가져와서 사용가능
		method.displayTwo();
		System.out.println("===================================================");
		method.displayOne();
		method.displayTwo();
		method.printOne();
		
		//메소드의 매개변수 파라메터에 값을 정상적으로 전달해야만 메소드 호출이 가능함 
		method.printTwp(100);
		System.out.println("===================================================");
		
		int tot = method.printThree(55,80);
		System.out.println("printThree의 합계 >> " + tot);
		System.out.println("===================================================");
		
		//메소드를 호출하여 반환되는 값을 변수에 저장
		int result = method.returnTot(55,80);
		if(result != 0) 
			System.out.println("returnTot의 결과값은 >> "+result);
		System.out.println("===================================================");
		
		
		//조건식 대신 논리값을 반환하는 메소드 호출하여 선택문 작성
		boolean flag = method.isOdd(67);
		if(flag == true) System.out.println("반환값이 짝수입니다.");
		else System.out.println("반환값이 홀수입니다.");
		
		System.out.println("===================================================");

		String str = method.getHello("이주영");
		System.out.println(str);
		System.out.println(method.getHello("홍길동"));
		System.out.println("===================================================");
		
		//반환받은 배열을 참조변수에 저장한다
		int[] arr = method.getArray();
		for(int i =0 ; i<method.getArray().length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		System.out.println("===================================================");

		
		System.out.println("합계 >> " + method.sumOne(44,53,78));
		System.out.println("===================================================");
		
		int[] a = {30,55,20};
		System.out.println("합계 >> " + method.sumTwo(a));
		System.out.println("===================================================");
		
		System.out.println("파라미터 합계 >> " + method.sumThree(14,22,67,44));
		
		
		
	}
}
