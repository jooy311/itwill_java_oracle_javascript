package oop;

//런타임 : java프로그램을 실행하는 JVM관련 정보를 저장하기 위한 클래스
//=>런타임 클래스는 인스턴스를 생성하지 못하고 반환받아 사용함
//프로그램에 하나의 인스턴스만을 제공할 목적으로 작성된 클래스
//이 클래스를 우리는 singletone class라고 한다.
//->싱글톤 디자인 패턴을 적용하여 작성된 클래스다

public class RuntimeApp {
	public static void main(String[] args) {
		//런타임 클래스의 생성자는 은닉화 선언되어 new연산자로 인스턴스 생성이 불가능함
		//Runtime runtime = new Runtime();
		
		//Runtime.getRuntime() : 런타임 인스턴스를 반환하는 메소드
		
		Runtime runtime = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		
		//출력해보면 메모리 주소가 같다.
		//만들어진 메모리 공간이 같다는 얘기임
		//일반 클래스의 객체를 여러개 생성하면 새롭게 생기는 것이기 때문에 주소값이 다르지만,
		//getRuntime메소드는 동일한 인스턴스를 반환한다 -> 즉 하나의 인스턴스만을 반환한다
		System.out.println("runtime = " + runtime);
		System.out.println("runtime2 = " + runtime2);
		
		
	}
}
